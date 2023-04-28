package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FindVideoBean implements Parcelable {
    public static final Parcelable.Creator<FindVideoBean> CREATOR = null;
    private boolean alreadyPaid;
    private String authorName;
    private String avatar;
    private String channelId;
    private String channelImgBmp;
    private String channelImgUrl;
    private String channelName;
    private List<FindVideoChannelBean> channels;
    private int clickNum;
    private boolean collect;
    private boolean collectUser;
    private String describe;
    private String gifUrl;
    private List<FindVideoHotCommBean> hotLetterList;
    private int id;
    private List<String> latelyActivityIdList;
    private int letterNum;
    private String mediaName;
    private String mediaTime;
    private int mediaType;
    private boolean paid;
    private String payUrl;
    private String photo;
    private int praiseNum;
    private int quickType;
    public String realVideoUrl;
    private boolean recordPlayTwenty;
    private int relationship;
    private VideoSpecialBean special;
    private long tryWatchTime;
    private String userId;
    private int userType;
    private String videoClear;
    private int videoListType;
    private int videoSource;
    private int videoType;
    private String videoTypeStr;
    private String videoUrl;
    private List<FindVideoBean> wonderfulVideos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<FindVideoBean> {
        public FindVideoBean a(Parcel parcel) {
        }

        public FindVideoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindVideoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FindVideoBean[] newArray(int i2) {
        }
    }

    public FindVideoBean() {
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

    public List<FindVideoChannelBean> getChannels() {
    }

    public int getClickNum() {
    }

    public String getDescribe() {
    }

    public String getGifUrl() {
    }

    public List<FindVideoHotCommBean> getHotLetterList() {
    }

    public int getId() {
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

    public String getPayUrl() {
    }

    public String getPhoto() {
    }

    public int getPraiseNum() {
    }

    public int getQuickType() {
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

    public int getVideoListType() {
    }

    public int getVideoSource() {
    }

    public int getVideoType() {
    }

    public String getVideoTypeStr() {
    }

    public String getVideoUrl() {
    }

    public List<FindVideoBean> getWonderfulVideos() {
    }

    public boolean isAlreadyPaid() {
    }

    public boolean isCollect() {
    }

    public boolean isCollectUser() {
    }

    public boolean isPaid() {
    }

    public boolean isRecordPlayTwenty() {
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

    public void setChannels(List<FindVideoChannelBean> list) {
    }

    public void setClickNum(int i2) {
    }

    public void setCollect(boolean z) {
    }

    public void setCollectUser(boolean z) {
    }

    public void setDescribe(String str) {
    }

    public void setGifUrl(String str) {
    }

    public void setHotLetterList(List<FindVideoHotCommBean> list) {
    }

    public void setId(int i2) {
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

    public void setPaid(boolean z) {
    }

    public void setPayUrl(String str) {
    }

    public void setPhoto(String str) {
    }

    public void setPraiseNum(int i2) {
    }

    public void setQuickType(int i2) {
    }

    public void setRecordPlayTwenty(boolean z) {
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

    public void setVideoListType(int i2) {
    }

    public void setVideoSource(int i2) {
    }

    public void setVideoType(int i2) {
    }

    public void setVideoTypeStr(String str) {
    }

    public void setVideoUrl(String str) {
    }

    public void setWonderfulVideos(List<FindVideoBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public FindVideoBean(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, String str9, long j2, boolean z4) {
    }

    public FindVideoBean(Parcel parcel) {
    }
}
