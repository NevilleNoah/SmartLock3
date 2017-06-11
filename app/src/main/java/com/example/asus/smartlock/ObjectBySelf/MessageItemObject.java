package com.example.asus.smartlock.ObjectBySelf;

/**
 * Created by asus on 2017/6/11/011.
 */

public class MessageItemObject {
    private int user;
    private int messageTime;
    private int messageStatus;
    private int messageImage;

    public MessageItemObject(int user,int messageTime,int messageStatus,int messageImage){
        this.user=user;
        this.messageTime=messageTime;
        this.messageStatus=messageStatus;
        this.messageImage=messageImage;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(int messageTime) {
        this.messageTime = messageTime;
    }

    public int getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(int messageStatus) {
        this.messageStatus = messageStatus;
    }

    public int getMessageImage() {
        return messageImage;
    }

    public void setMessageImage(int messageImage) {
        this.messageImage = messageImage;
    }
}
