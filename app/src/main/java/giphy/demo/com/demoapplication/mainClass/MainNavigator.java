package giphy.demo.com.demoapplication.mainClass;

import giphy.demo.com.demoapplication.data.model.ApiResponce;

public interface MainNavigator {

    public void showLoading();

    public void hideLoading();

    public void showData(ApiResponce mApiResponce);
}
