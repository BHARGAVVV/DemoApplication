package giphy.demo.com.demoapplication.data.remote;

import giphy.demo.com.demoapplication.data.model.ApiResponce;
import io.reactivex.Single;

public interface ApiHelper {

    Single<ApiResponce> searchVideo(String apiKey,String query);
}
