package giphy.demo.com.demoapplication.VideoPlayer;

import dagger.Module;
import dagger.Provides;
import giphy.demo.com.demoapplication.data.DataManger;
import giphy.demo.com.demoapplication.mainClass.MainActivityPresenter;

@Module
public class VideoActivityModule {

    @Provides
    VideoActivityPresenter provideVideoPresenter(DataManger dataManager) {
        return new VideoActivityPresenter(dataManager);
    }
}
