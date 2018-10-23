package giphy.demo.com.demoapplication.data.remote;

import javax.inject.Inject;

import giphy.demo.com.demoapplication.data.model.ApiResponce;
import io.reactivex.Single;

public class AppApiHelper implements ApiHelper {

    private ApiCall mApiCall;

    @Inject
    public AppApiHelper(ApiCall apiCall) {
        mApiCall = apiCall;
    }

    @Override
    public Single<ApiResponce> searchVideo(String apiKey, String query) {
        return mApiCall.searchVideo(apiKey,query);
    }
}
