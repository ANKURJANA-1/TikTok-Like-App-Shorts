package com.example.verticalviewpager;

import android.net.Uri;

public class ShortsModel {

    private int like;
    private int dislike;
    private String videoUrl;
    private String videoHeadline;

    public ShortsModel(int like, int dislike, String videoUrl, String videoHeadline) {
        this.like = like;
        this.dislike = dislike;
        this.videoUrl = videoUrl;
        this.videoHeadline = videoHeadline;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public Uri getVideoUrl() {
        return Uri.parse(videoUrl);
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoHeadline() {
        return videoHeadline;
    }

    public void setVideoHeadline(String videoHeadline) {
        this.videoHeadline = videoHeadline;
    }
}
