package giphy.demo.com.demoapplication.data;

import android.content.Context;

import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;

import giphy.demo.com.demoapplication.data.local.DbHelper;
import giphy.demo.com.demoapplication.data.model.ApiResponce;
import giphy.demo.com.demoapplication.data.model.VideoDbEntity;
import giphy.demo.com.demoapplication.data.remote.ApiHelper;
import io.reactivex.Single;

public class AppDataManager implements DataManger {

    private final ApiHelper mApiHelper;

    private final DbHelper mDbHelper;

    private final Context mContext;

    private final Gson mGson;


    @Inject
    public AppDataManager(Context context, ApiHelper apiHelper, Gson gson, DbHelper mDbHelper) {
        mContext = context;
        mApiHelper = apiHelper;
        mGson = gson;
        this.mDbHelper=mDbHelper;
    }

    @Override
    public Single<ApiResponce> searchVideo(String apiKey, String query) {
        return mApiHelper.searchVideo(apiKey,query);
    }

    @Override
    public void insertVideo(VideoDbEntity entity) {
        mDbHelper.insertVideo(entity);
    }

    @Override
    public long getListOfUpVots(String vId) {
        return mDbHelper.getListOfUpVots(vId);
    }

    @Override
    public long getListOfDownVots(String vId) {
        return mDbHelper.getListOfDownVots(vId);
    }

    @Override
    public List<VideoDbEntity> list() {
        return mDbHelper.list();
    }
}
