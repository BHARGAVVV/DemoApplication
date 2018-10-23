package giphy.demo.com.demoapplication.mainClass;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import giphy.demo.com.demoapplication.R;
import giphy.demo.com.demoapplication.baseActivity.BaseActivity;
import giphy.demo.com.demoapplication.data.model.ApiResponce;
import giphy.demo.com.demoapplication.mainClass.adapters.VideoListAdapter;

public class MainActivity extends BaseActivity<MainActivityPresenter> implements MainNavigator {

    @Inject
    MainActivityPresenter mMainPresenter;

    @BindView(R.id.edt_search)
    EditText edtSearch;
    @BindView(R.id.btn_search)
    Button btnSearch;
    @BindView(R.id.rv_video_list)
    RecyclerView rvVideoList;

    LinearLayoutManager manager;
    StaggeredGridLayoutManager mGridLayoutManager;
    VideoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        mMainPresenter.setNavigator(this);

       // manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rvVideoList.setLayoutManager(mGridLayoutManager);
        adapter = new VideoListAdapter(this);
        rvVideoList.setAdapter(adapter);
    }

    @OnClick(R.id.btn_search)
    void submitButton(View view) {
        if (!edtSearch.getText().toString().equals(""))
            mMainPresenter.searchVideo(edtSearch.getText().toString());
        else
            Toast.makeText(this, "Please Enter Query", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainActivityPresenter getPresenter() {
        return mMainPresenter;
    }

    @Override
    public void showLoading() {
        super.showLoadingDialog();
    }

    @Override
    public void hideLoading() {
        super.hideLoading();
    }

    @Override
    public void showData(ApiResponce mApiResponce) {
        if(mApiResponce.getData().isEmpty()){
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
            return;
        }
        adapter.setData(mApiResponce.getData());
    }
}
