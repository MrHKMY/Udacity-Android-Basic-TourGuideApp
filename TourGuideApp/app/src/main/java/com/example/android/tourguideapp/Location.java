package com.example.android.tourguideapp;

public class Location {

    private int mTopText;
    private int mBelowText;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(int topText, int belowText) {
        mTopText = topText;
        mBelowText = belowText;
    }

    public Location(int topText, int belowText, int imageResourceId) {
        mTopText = topText;
        mBelowText = belowText;
        mImageResourceId = imageResourceId;
    }

    public int gettopText() {
        return mTopText;
    }

    public int getbelowText() {
        return mBelowText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return
                mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Details(" +
                "mtopText" + mTopText + '\'' +
                ", mbelowText='" + mBelowText + '\'' +
                ", mImageResourceId=" + mImageResourceId + ')';
    }
}
