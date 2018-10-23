package giphy.demo.com.demoapplication.di.module;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import giphy.demo.com.demoapplication.data.AppDataManager;
import giphy.demo.com.demoapplication.data.DataManger;
import giphy.demo.com.demoapplication.data.local.AppDbHelper;
import giphy.demo.com.demoapplication.data.local.DbHelper;
import giphy.demo.com.demoapplication.data.model.MyObjectBox;
import giphy.demo.com.demoapplication.data.remote.ApiCall;
import giphy.demo.com.demoapplication.data.remote.ApiHelper;
import giphy.demo.com.demoapplication.data.remote.AppApiHelper;
import io.objectbox.BoxStore;

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManger provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    ApiCall provideApiCall() {
        return ApiCall.Factory.create();
    }

    @Provides
    @Singleton
    BoxStore provideBox(Context context){
        return  MyObjectBox.builder().androidContext(context).build();
    }
}
