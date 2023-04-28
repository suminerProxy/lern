package com.showstartfans.activity.view.superplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.Letter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SceneVideoInfoBean implements Parcelable {
    public static final Parcelable.Creator<SceneVideoInfoBean> CREATOR = null;
    private int activityId;
    private String activityName;
    private String authorName;
    private String avatar;
    private int cityId;
    private String cityName;
    private int ding;
    private int dingCount;
    private int id;
    private int isCollect;
    private List<Letter> letter;
    private String photo;
    private int siteId;
    private String siteName;
    private String title;
    private int userId;
    private int userType;
    private String videoUrl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SceneVideoInfoBean> {
        public SceneVideoInfoBean a(Parcel parcel) {
        }

        public SceneVideoInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SceneVideoInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SceneVideoInfoBean[] newArray(int i2) {
        }
    }

    public SceneVideoInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityId() {
    }

    public String getActivityName() {
    }

    public String getAuthorName() {
    }

    public String getAvatar() {
    }

    public int getCityId() {
    }

    public String getCityName() {
    }

    public int getDing() {
    }

    public int getDingCount() {
    }

    public int getId() {
    }

    public int getIsCollect() {
    }

    public List<Letter> getLetter() {
    }

    public String getPhoto() {
    }

    public int getSiteId() {
    }

    public String getSiteName() {
    }

    public String getTitle() {
    }

    public int getUserId() {
    }

    public int getUserType() {
    }

    public String getVideoUrl() {
    }

    public void setActivityId(int i2) {
    }

    public void setActivityName(String str) {
    }

    public void setAuthorName(String str) {
    }

    public void setAvatar(String str) {
    }

    public void setCityId(int i2) {
    }

    public void setCityName(String str) {
    }

    public void setDing(int i2) {
    }

    public void setDingCount(int i2) {
    }

    public void setId(int i2) {
    }

    public void setIsCollect(int i2) {
    }

    public void setLetter(List<Letter> list) {
    }

    public void setPhoto(String str) {
    }

    public void setSiteId(int i2) {
    }

    public void setSiteName(String str) {
    }

    public void setTitle(String str) {
    }

    public void setUserId(int i2) {
    }

    public void setUserType(int i2) {
    }

    public void setVideoUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SceneVideoInfoBean(int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4, int i5, int i6, int i7) {
    }

    public SceneVideoInfoBean(Parcel parcel) {
    }
}
