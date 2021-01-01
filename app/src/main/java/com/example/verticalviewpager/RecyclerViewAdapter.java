package com.example.verticalviewpager;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<ShortsModel> shortsModels;
    public RecyclerViewAdapter(Context context, ArrayList<ShortsModel> shortsModels)
    {
        this.context=context;
        this.shortsModels=shortsModels;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.text_show,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.setData(shortsModels.get(position));
    }

    @Override
    public int getItemCount() {
        return shortsModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //////////////////////////////////////////////init variable
        VideoView videoView;
        TextView headline;
        AppCompatImageView like;
        AppCompatImageView dislike;
        AppCompatImageView message;
        AppCompatImageView share;
        AppCompatImageView more;
        AppCompatImageView backPressed;
        ProgressBar progressBar;
        ////////////////////////////////////////////////

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            init();
        }

        public void init()
        {
            videoView=itemView.findViewById(R.id.videoView);
            headline=itemView.findViewById(R.id.videoText);
            like=itemView.findViewById(R.id.like);
            dislike=itemView.findViewById(R.id.dislike);
            message=itemView.findViewById(R.id.message);
            share=itemView.findViewById(R.id.share);
            more=itemView.findViewById(R.id.more);
            backPressed=itemView.findViewById(R.id.backPressed);
            progressBar=itemView.findViewById(R.id.videoPogressbar);
        }

        public void setData(ShortsModel model)
        {
            videoView.setVideoURI(model.getVideoUrl());
            headline.setText(model.getVideoHeadline());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.GONE);
                    mp.start();

                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                }
            });

        }
    }
}
