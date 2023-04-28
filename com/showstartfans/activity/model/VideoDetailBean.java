package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VideoDetailBean implements Parcelable {
    public static final Parcelable.Creator<VideoDetailBean> CREATOR = null;
    private boolean alreadyPaid;
    private String authorName;
    private String avatar;
    private String channelId;
    private String channelImgBmp;
    private String channelImgUrl;
    private String channelName;
    private int clickNum;
    private boolean collect;
    private boolean collectUser;
    private String gifUrl;
    private int id;
    private List<LastActivityBean> lastActivityVos;
    private List<String> latelyActivityIdList;
    private int letterNum;
    private String mediaName;
    private String mediaTime;
    private int mediaType;
    private List<MoreMultimeBean> moreMultimediaVos;
    private boolean paid;
    private String payUrl;
    private String photo;
    private int praiseNum;
    private int relationship;
    private VideoSpecialBean special;
    private long tryWatchTime;
    private String userId;
    private int userType;
    private String videoClear;
    private int videoSource;
    private int videoType;
    private String videoTypeStr;
    private String videoUrl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<VideoDetailBean> {
        public VideoDetailBean a(Parcel parcel) {
        }

        public VideoDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VideoDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ VideoDetailBean[] newArray(int i2) {
        }
    }

    public VideoDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAuthorName() {
    }

    public String getAvatar() {
    }

    public String getChannelId() {
    }

    public String getChannelImgBmp() {
    }

    public String getChannelImgUrl() {
    }

    public String getChannelName() {
    }

    public int getClickNum() {
    }

    public String getGifUrl() {
    }

    public int getId() {
    }

    public List<LastActivityBean> getLastActivityVos() {
    }

    public List<String> getLatelyActivityIdList() {
    }

    public int getLetterNum() {
    }

    public String getMediaName() {
    }

    public String getMediaTime() {
    }

    public int getMediaType() {
    }

    public List<MoreMultimeBean> getMoreMultimediaVos() {
    }

    public String getPayUrl() {
    }

    public String getPhoto() {
    }

    public int getPraiseNum() {
    }

    public int getRelationship() {
    }

    public VideoSpecialBean getSpecial() {
    }

    public long getTryWatchTime() {
    }

    public String getUserId() {
    }

    public int getUserType() {
    }

    public String getVideoClear() {
    }

    public int getVideoSource() {
    }

    public int getVideoType() {
    }

    public String getVideoTypeStr() {
    }

    public String getVideoUrl() {
    }

    public boolean isAlreadyPaid() {
    }

    public boolean isCollect() {
    }

    public boolean isCollectUser() {
    }

    public boolean isPaid() {
    }

    public void setAlreadyPaid(boolean z) {
    }

    public void setAuthorName(String str) {
    }

    public void setAvatar(String str) {
    }

    public void setChannelId(String str) {
    }

    public void setChannelImgBmp(String str) {
    }

    public void setChannelImgUrl(String str) {
    }

    public void setChannelName(String str) {
    }

    public void setClickNum(int i2) {
    }

    public void setCollect(boolean z) {
    }

    public void setCollectUser(boolean z) {
    }

    public void setGifUrl(String str) {
    }

    public void setId(int i2) {
    }

    public void setLastActivityVos(List<LastActivityBean> list) {
    }

    public void setLatelyActivityIdList(List<String> list) {
    }

    public void setLetterNum(int i2) {
    }

    public void setMediaName(String str) {
    }

    public void setMediaTime(String str) {
    }

    public void setMediaType(int i2) {
    }

    public void setMoreMultimediaVos(List<MoreMultimeBean> list) {
    }

    public void setPaid(boolean z) {
    }

    public void setPayUrl(String str) {
    }

    public void setPhoto(String str) {
    }

    public void setPraiseNum(int i2) {
    }

    public void setRelationship(int i2) {
    }

    public void setSpecial(VideoSpecialBean videoSpecialBean) {
    }

    public void setTryWatchTime(long j2) {
    }

    public void setUserId(String str) {
    }

    public void setUserType(int i2) {
    }

    public void setVideoClear(String str) {
    }

    public void setVideoSource(int i2) {
    }

    public void setVideoType(int i2) {
    }

    public void setVideoTypeStr(String str) {
    }

    public void setVideoUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public VideoDetailBean(Parcel parcel) {
    }
}
