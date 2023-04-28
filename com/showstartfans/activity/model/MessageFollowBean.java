package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageFollowBean extends BaseImMessageBean implements Parcelable {
    public static final Parcelable.Creator<MessageFollowBean> CREATOR = null;
    private ActivityBean activity;
    private ArrayList<MessageFollowListBean> activityList;
    private String activityStyleName;
    private String avatar;
    private String content;
    private String createTime;
    private int followStatus;
    public String isTour;
    private VideoDetailBean mediaDetailVo;
    private String messageId;
    private int messageType;
    private String playState;
    private String poster;
    private String pushRecordId;
    private boolean read;
    private int relationship;
    private String sortTime;
    private String source;
    private String title;
    private String url;
    private String userAvatar;
    private String userId;
    private String userName;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageFollowBean> {
        public MessageFollowBean a(Parcel parcel) {
        }

        public MessageFollowBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageFollowBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageFollowBean[] newArray(int i2) {
        }
    }

    public MessageFollowBean() {
    }

    @Override // com.showstartfans.activity.model.BaseImMessageBean, android.os.Parcelable
    public int describeContents() {
    }

    public ActivityBean getActivity() {
    }

    public ArrayList<MessageFollowListBean> getActivityList() {
    }

    public String getActivityStyleName() {
    }

    public String getAvatar() {
    }

    public String getContent() {
    }

    public String getCreateTime() {
    }

    public int getFollowStatus() {
    }

    public VideoDetailBean getMediaDetailVo() {
    }

    public String getMessageId() {
    }

    public int getMessageType() {
    }

    public String getPlayState() {
    }

    public String getPoster() {
    }

    public String getPushRecordId() {
    }

    public int getRelationship() {
    }

    public String getSortTime() {
    }

    public String getSource() {
    }

    public String getTitle() {
    }

    public String getUrl() {
    }

    public String getUserAvatar() {
    }

    public String getUserId() {
    }

    public String getUserName() {
    }

    public int getUserType() {
    }

    public boolean isRead() {
    }

    public boolean isTour() {
    }

    public void setActivity(ActivityBean activityBean) {
    }

    public void setActivityList(ArrayList<MessageFollowListBean> arrayList) {
    }

    public void setActivityStyleName(String str) {
    }

    public void setAvatar(String str) {
    }

    public void setContent(String str) {
    }

    public void setCreateTime(String str) {
    }

    public void setFollowStatus(int i2) {
    }

    public void setMediaDetailVo(VideoDetailBean videoDetailBean) {
    }

    public void setMessageId(String str) {
    }

    public void setMessageType(int i2) {
    }

    public void setPlayState(String str) {
    }

    public void setPoster(String str) {
    }

    public void setPushRecordId(String str) {
    }

    public void setRead(boolean z) {
    }

    public void setRelationship(int i2) {
    }

    public void setSortTime(String str) {
    }

    public void setSource(String str) {
    }

    public void setTitle(String str) {
    }

    public void setUrl(String str) {
    }

    public void setUserAvatar(String str) {
    }

    public void setUserId(String str) {
    }

    public void setUserName(String str) {
    }

    public void setUserType(int i2) {
    }

    @Override // com.showstartfans.activity.model.BaseImMessageBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageFollowBean(Parcel parcel) {
    }
}
