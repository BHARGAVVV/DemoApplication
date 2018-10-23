package giphy.demo.com.demoapplication.mainClass;

import android.util.Log;

import giphy.demo.com.demoapplication.baseActivity.BasePresenter;
import giphy.demo.com.demoapplication.data.DataManger;
import giphy.demo.com.demoapplication.data.model.ApiResponce;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivityPresenter extends BasePresenter<MainNavigator> {

    public MainActivityPresenter(DataManger dataManager) {
        super(dataManager);
    }

    public void searchVideo(String query){
        getNavigator().showLoading();
        getDataManager().searchVideo("2Q4d9sOTtcuWWtOKj7JIvlDPEvdcY2sl",query).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new SingleObserver<ApiResponce>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(ApiResponce apiResponce) {
                        getNavigator().hideLoading();
                        getNavigator().showData(apiResponce);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("Erroe",e.toString());
                    }
                });
    }
}
