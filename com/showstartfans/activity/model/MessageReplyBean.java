package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageReplyBean implements Parcelable {
    public static final Parcelable.Creator<MessageReplyBean> CREATOR = null;
    private String avatar;
    private String content;
    private String createTime;
    private String fromUserAvatar;
    private long fromUserId;
    private String fromUserName;
    private int fromUserType;
    private String letterId;
    private String mainId;
    private String mainLetterId;
    private int mainType;
    private String masterContent;
    private int masterDisplay;
    private List<String> masterPhotos;
    private List<String> photos;
    private int praiseNum;
    private boolean praised;
    private boolean sysManager;
    private String time;
    private String title;
    private long userId;
    private String userName;
    private int userType;
    private VideoDetailBean videoInfo;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageReplyBean> {
        public MessageReplyBean a(Parcel parcel) {
        }

        public MessageReplyBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageReplyBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageReplyBean[] newArray(int i2) {
        }
    }

    public MessageReplyBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getContent() {
    }

    public String getCreateTime() {
    }

    public String getFromUserAvatar() {
    }

    public long getFromUserId() {
    }

    public String getFromUserName() {
    }

    public int getFromUserType() {
    }

    public String getLetterId() {
    }

    public String getMainId() {
    }

    public String getMainLetterId() {
    }

    public int getMainType() {
    }

    public String getMasterContent() {
    }

    public int getMasterDisplay() {
    }

    public List<String> getMasterPhotos() {
    }

    public List<String> getPhotos() {
    }

    public int getPraiseNum() {
    }

    public String getTime() {
    }

    public String getTitle() {
    }

    public long getUserId() {
    }

    public String getUserName() {
    }

    public int getUserType() {
    }

    public VideoDetailBean getVideoInfo() {
    }

    public boolean isPraised() {
    }

    public boolean isSysManager() {
    }

    public void setAvatar(String str) {
    }

    public void setContent(String str) {
    }

    public void setCreateTime(String str) {
    }

    public void setFromUserAvatar(String str) {
    }

    public void setFromUserId(long j2) {
    }

    public void setFromUserName(String str) {
    }

    public void setFromUserType(int i2) {
    }

    public void setLetterId(String str) {
    }

    public void setMainId(String str) {
    }

    public void setMainLetterId(String str) {
    }

    public void setMainType(int i2) {
    }

    public void setMasterContent(String str) {
    }

    public void setMasterDisplay(int i2) {
    }

    public void setMasterPhotos(List<String> list) {
    }

    public void setPhotos(List<String> list) {
    }

    public void setPraiseNum(int i2) {
    }

    public void setPraised(boolean z) {
    }

    public void setSysManager(boolean z) {
    }

    public void setTime(String str) {
    }

    public void setTitle(String str) {
    }

    public void setUserId(long j2) {
    }

    public void setUserName(String str) {
    }

    public void setUserType(int i2) {
    }

    public void setVideoInfo(VideoDetailBean videoDetailBean) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageReplyBean(Parcel parcel) {
    }
}
