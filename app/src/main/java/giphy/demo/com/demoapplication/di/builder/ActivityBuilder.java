package giphy.demo.com.demoapplication.di.builder;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import giphy.demo.com.demoapplication.VideoPlayer.VideoActivityModule;
import giphy.demo.com.demoapplication.VideoPlayer.VideoPlayerActivity;
import giphy.demo.com.demoapplication.mainClass.MainActivity;
import giphy.demo.com.demoapplication.mainClass.MainActivityModule;


@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = VideoActivityModule.class)
    abstract VideoPlayerActivity bindVideoActivity();
}
