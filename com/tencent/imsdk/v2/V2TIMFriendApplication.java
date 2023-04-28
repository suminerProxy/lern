package com.tencent.imsdk.v2;

import com.tencent.imsdk.relationship.FriendApplication;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMFriendApplication implements Serializable {
    public static final int V2TIM_FRIEND_ACCEPT_AGREE = 0;
    public static final int V2TIM_FRIEND_ACCEPT_AGREE_AND_ADD = 1;
    public static final int V2TIM_FRIEND_APPLICATION_BOTH = 3;
    public static final int V2TIM_FRIEND_APPLICATION_COME_IN = 1;
    public static final int V2TIM_FRIEND_APPLICATION_SEND_OUT = 2;
    private FriendApplication friendApplication = new FriendApplication();

    public String getAddSource() {
        return this.friendApplication.getAddSource();
    }

    public long getAddTime() {
        return this.friendApplication.getAddTime();
    }

    public String getAddWording() {
        return this.friendApplication.getAddWording();
    }

    public String getFaceUrl() {
        return this.friendApplication.getFaceUrl();
    }

    public String getNickname() {
        return this.friendApplication.getNickName();
    }

    public int getType() {
        return this.friendApplication.getApplicationType();
    }

    public String getUserID() {
        return this.friendApplication.getUserID();
    }

    public void setFriendApplication(FriendApplication friendApplication) {
        this.friendApplication = friendApplication;
    }

    public String toString() {
        return "V2TIMFriendApplication--->userID:" + getUserID() + ", nickName:" + getNickname() + ", faceUrl:" + getFaceUrl() + ", addSource:" + getAddSource() + ", addWording:" + getAddWording() + ", addTime:" + getAddTime() + ", type:" + getType() + "(1:comeIn, 2:sendOut, 3:both)";
    }
}
