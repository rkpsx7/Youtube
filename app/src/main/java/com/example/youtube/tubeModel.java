package com.example.youtube;

public class tubeModel {
    private int mIvThumbnail;
    private String mTvVideoTitle;
    private String VideoLink;

    public tubeModel(int mIvThumbnail,String mTvVideoTitle,String VideoLink){
        this.mIvThumbnail = mIvThumbnail;
        this.mTvVideoTitle = mTvVideoTitle;
        this.VideoLink = VideoLink;
    }


    public int getmIvThumbnail() {
        return mIvThumbnail;
    }

    public String getVideoLink() {
        return VideoLink;
    }

    public String getmTvVideoTitle() {
        return mTvVideoTitle;
    }
}
