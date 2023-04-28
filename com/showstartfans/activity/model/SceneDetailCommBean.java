package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SceneDetailCommBean implements Parcelable {
    public static final Parcelable.Creator<SceneDetailCommBean> CREATOR = null;
    private int articleId;
    private String content;
    private String createTimeStr;
    private int createUser;
    private String createUserAvatar;
    public int createUserLevel;
    private String createUserName;
    private int createUserType;
    private int dingCount;
    private String dingCountStr;
    private int hadSubReview;
    private int id;
    private int isDinged;
    private int reviewCount;
    private String reviewCountStr;
    private int reviewedId;
    private int reviewedUser;
    private String reviewedUserName;
    private int status;
    private int styleType;
    private List<SceneDetailCommBean> subReviews;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<SceneDetailCommBean> {
        public SceneDetailCommBean a(Parcel parcel) {
        }

        public SceneDetailCommBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SceneDetailCommBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SceneDetailCommBean[] newArray(int i2) {
        }
    }

    public SceneDetailCommBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getArticleId() {
    }

    public String getContent() {
    }

    public String getCreateTimeStr() {
    }

    public int getCreateUser() {
    }

    public String getCreateUserAvatar() {
    }

    public UserInfoBean getCreateUserInfo() {
    }

    public String getCreateUserName() {
    }

    public int getCreateUserType() {
    }

    public int getDingCount() {
    }

    public String getDingCountStr() {
    }

    public int getHadSubReview() {
    }

    public int getId() {
    }

    public int getIsDinged() {
    }

    public int getReviewCount() {
    }

    public String getReviewCountStr() {
    }

    public int getReviewedId() {
    }

    public int getReviewedUser() {
    }

    public String getReviewedUserName() {
    }

    public int getStatus() {
    }

    public int getStyleType() {
    }

    public List<SceneDetailCommBean> getSubReviews() {
    }

    public void setArticleId(int i2) {
    }

    public void setContent(String str) {
    }

    public void setCreateTimeStr(String str) {
    }

    public void setCreateUser(int i2) {
    }

    public void setCreateUserAvatar(String str) {
    }

    public void setCreateUserName(String str) {
    }

    public void setCreateUserType(int i2) {
    }

    public void setDingCount(int i2) {
    }

    public void setDingCountStr(String str) {
    }

    public void setHadSubReview(int i2) {
    }

    public void setId(int i2) {
    }

    public void setIsDinged(int i2) {
    }

    public void setReviewCount(int i2) {
    }

    public void setReviewCountStr(String str) {
    }

    public void setReviewedId(int i2) {
    }

    public void setReviewedUser(int i2) {
    }

    public void setReviewedUserName(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setStyleType(int i2) {
    }

    public void setSubReviews(List<SceneDetailCommBean> list) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public SceneDetailCommBean(int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4, int i6, int i7, String str5) {
    }

    public SceneDetailCommBean(int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4, int i6, int i7, int i8, String str5) {
    }

    public SceneDetailCommBean(int i2, String str, int i3, String str2, int i4, String str3, int i5, int i6, String str4, int i7, int i8, String str5) {
    }

    public SceneDetailCommBean(Parcel parcel) {
    }
}
