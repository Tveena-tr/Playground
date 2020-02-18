package com.example.jsondynamic;

public class MovieDetails {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    private String mComments;

    public MovieDetails(String mImageUrl, String mCreator, int mLikes, String mComments) {
        this.mImageUrl = mImageUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;
        this.mComments = mComments;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public void setmCreator(String mCreator) {
        this.mCreator = mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }

    public void setmLikes(int mLikes) {
        this.mLikes = mLikes;
    }

    public String getmComments() {
        return mComments;
    }

    public void setmComments(String mComments) {
        this.mComments = mComments;
    }
}
