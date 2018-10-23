package giphy.demo.com.demoapplication.baseActivity;

import giphy.demo.com.demoapplication.data.DataManger;
import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter<N> {

    private final DataManger mDataManager;

    private CompositeDisposable mCompositeDisposable;

    private N mNavigator;

    public BasePresenter(DataManger dataManager) {
        this.mDataManager = dataManager;
        this.mCompositeDisposable = new CompositeDisposable();
    }

    public DataManger getDataManager() {
        return mDataManager;
    }

    public N getNavigator() {
        return mNavigator;
    }

    public void setNavigator(N navigator) {
        this.mNavigator = navigator;
    }

}
