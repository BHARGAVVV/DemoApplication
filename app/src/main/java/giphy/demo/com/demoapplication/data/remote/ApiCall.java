package giphy.demo.com.demoapplication.data.remote;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import giphy.demo.com.demoapplication.data.model.ApiResponce;
import io.reactivex.Single;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCall {

    @GET("v1/gifs/search")
    Single<ApiResponce> searchVideo(@Query("api_key") String apiKey,@Query("q") String query);

    class Factory {

        private static final int NETWORK_CALL_TIMEOUT = 60;

        public static ApiCall create() {

            OkHttpClient.Builder builder = new OkHttpClient.Builder();

            builder.readTimeout(NETWORK_CALL_TIMEOUT, TimeUnit.SECONDS);

            builder.writeTimeout(NETWORK_CALL_TIMEOUT, TimeUnit.SECONDS);

            OkHttpClient httpClient = builder.build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.giphy.com/")
                    .client(httpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

            return retrofit.create(ApiCall.class);
        }
    }
}
