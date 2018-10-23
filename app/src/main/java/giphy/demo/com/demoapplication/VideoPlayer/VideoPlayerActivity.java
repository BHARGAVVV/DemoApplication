package giphy.demo.com.demoapplication.VideoPlayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import giphy.demo.com.demoapplication.R;
import giphy.demo.com.demoapplication.baseActivity.BaseActivity;

public class VideoPlayerActivity extends BaseActivity<VideoActivityPresenter> implements VideoActivityNavigator {

    @Inject
    VideoActivityPresenter mVideoPresenter;

    @BindView(R.id.player)
    PlayerView playerView;
    @BindView(R.id.btnUp)
    Button btnUp;
    @BindView(R.id.btnDown)
    Button btnDown;

    //For Video
    private SimpleExoPlayer player;
    private long playbackPosition;
    private int currentWindow;
    private boolean playWhenReady = true;
    MediaSource mediaSource;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        mVideoPresenter.setNavigator(this);

        btnUp.setText("Upvote ( "+mVideoPresenter.getUpVots(getIntent().getExtras().getString("vId"))+" )");
        btnDown.setText("DownVote ("+mVideoPresenter.getDownVots(getIntent().getExtras().getString("vId"))+" )");

        initializePlayer();
    }

    @OnClick(R.id.btnUp)
    void upBtnClicl(View view) {
        btnUp.setText("Upvote ( "+mVideoPresenter.insertVote(1,getIntent().getExtras().getString("vId"))+" )");

    }

    @OnClick(R.id.btnDown)
    void downBtnClicl(View view) {
        btnDown.setText("DownVote ("+mVideoPresenter.insertVote(0,getIntent().getExtras().getString("vId"))+" )");
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_ads_feature;
    }

    @Override
    public VideoActivityPresenter getPresenter() {
        return mVideoPresenter;
    }

    private void initializePlayer() {

        if (player == null) {

            player = ExoPlayerFactory.newSimpleInstance(
                    new DefaultRenderersFactory(this),
                    new DefaultTrackSelector(), new DefaultLoadControl());

            playerView.setPlayer(player);
            player.setPlayWhenReady(playWhenReady);
            player.seekTo(currentWindow, playbackPosition);
        }
        mediaSource = buildMediaSource(Uri.parse(getIntent().getExtras().getString("vUrl")));
        player.prepare(mediaSource, true, false);
    }

    private void releasePlayer() {
        if (player != null) {
            playbackPosition = player.getCurrentPosition();
            currentWindow = player.getCurrentWindowIndex();
            playWhenReady = player.getPlayWhenReady();
            player.release();
            player = null;
        }
    }

    private MediaSource buildMediaSource(Uri uri) {
        return new ExtractorMediaSource.Factory(
                new DefaultHttpDataSourceFactory("exoplayer-codelab")).
                createMediaSource(uri);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (player != null && !player.getPlayWhenReady()) {
            player.setPlayWhenReady(playWhenReady);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (player != null) player.setPlayWhenReady(!player.getPlayWhenReady());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            releasePlayer();
        }
    }

}
