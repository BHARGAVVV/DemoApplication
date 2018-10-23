package giphy.demo.com.demoapplication.mainClass.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import giphy.demo.com.demoapplication.R;
import giphy.demo.com.demoapplication.VideoPlayer.VideoPlayerActivity;
import giphy.demo.com.demoapplication.data.model.Datum;

public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.ViewHolder> {

    public Context context;

    private List<Datum> list = new ArrayList<>();

    public VideoListAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Datum> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void reset() {
        this.list.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_video, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(list.get(i).getImages().get480wStill().getUrl()).into(viewHolder.ivAdapterVimg);
        viewHolder.tvVideoTitle.setText(list.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_adapter_vimg)
        ImageView ivAdapterVimg;
        @BindView(R.id.tv_video_title)
        TextView tvVideoTitle;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,VideoPlayerActivity.class);
                    intent.putExtra("vUrl",list.get(getAdapterPosition()).getImages().getOriginalMp4().getMp4());
                    intent.putExtra("vId",list.get(getAdapterPosition()).getId());
                    context.startActivity(intent);
                }
            });
        }
    }
}
