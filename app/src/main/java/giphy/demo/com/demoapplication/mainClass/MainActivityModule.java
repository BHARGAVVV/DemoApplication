package giphy.demo.com.demoapplication.mainClass;

import dagger.Module;
import dagger.Provides;
import giphy.demo.com.demoapplication.data.DataManger;

@Module
public class MainActivityModule {
    @Provides
    MainActivityPresenter provideMainPresenter(DataManger dataManager) {
        return new MainActivityPresenter(dataManager);
    }
}
