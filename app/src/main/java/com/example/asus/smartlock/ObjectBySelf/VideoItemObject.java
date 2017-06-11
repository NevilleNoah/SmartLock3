package com.example.asus.smartlock.ObjectBySelf;

/**
 * Created by asus on 2017/6/8/008.
 */

public class VideoItemObject {
    private int videoTime;
    private int videoImage;
    private int videoNoDisplay;

    public VideoItemObject(int videoTime, int videoImage, int videoNoDisplay){
        this.videoTime=videoTime;
        this.videoImage=videoImage;
        this.videoNoDisplay=videoNoDisplay;
    }

    public int getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(int videoTime) {
        this.videoTime = videoTime;
    }

    public int getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(int videoImage) {
        this.videoImage = videoImage;
    }

    public int getVideoNoDisplay() {
        return videoNoDisplay;
    }

    public void setVideoNoDisplay(int videoNoDisplay) {
        this.videoNoDisplay = videoNoDisplay;
    }
}
