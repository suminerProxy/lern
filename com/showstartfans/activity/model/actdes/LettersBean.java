package com.showstartfans.activity.model.actdes;

import android.os.Parcel;
import android.os.Parcelable;
import h.u.a.o.e0.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LettersBean implements Parcelable {
    public static final Parcelable.Creator<LettersBean> CREATOR = null;
    private String activityName;
    private String activityPoster;
    private String cityName;
    private int commentNum;
    private String content;
    private boolean display;
    private c fromUser;
    private String id;
    private ArrayList<String> photos;
    private int praiseNum;
    private boolean praised;
    private boolean read;
    private List<LettersBean> reply;
    private String showStartTime;
    private boolean sysManager;
    private String time;
    private c toUser;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LettersBean> {
        public LettersBean a(Parcel parcel) {
        }

        public LettersBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LettersBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LettersBean[] newArray(int i2) {
        }
    }

    public LettersBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getActivityName() {
    }

    public String getActivityPoster() {
    }

    public String getCityName() {
    }

    public int getCommentNum() {
    }

    public String getContent() {
    }

    public c getFromUser() {
    }

    public String getId() {
    }

    public ArrayList<String> getPhotos() {
    }

    public int getPraiseNum() {
    }

    public List<LettersBean> getReply() {
    }

    public String getShowStartTime() {
    }

    public String getTime() {
    }

    public c getToUser() {
    }

    public boolean isDisplay() {
    }

    public boolean isPraised() {
    }

    public boolean isRead() {
    }

    public boolean isSysManager() {
    }

    public void setActivityName(String str) {
    }

    public void setActivityPoster(String str) {
    }

    public void setCityName(String str) {
    }

    public void setCommentNum(int i2) {
    }

    public void setContent(String str) {
    }

    public void setDisplay(boolean z) {
    }

    public void setFromUser(c cVar) {
    }

    public void setId(String str) {
    }

    public void setPhotos(ArrayList<String> arrayList) {
    }

    public void setPraiseNum(int i2) {
    }

    public void setPraised(boolean z) {
    }

    public void setRead(boolean z) {
    }

    public void setReply(List<LettersBean> list) {
    }

    public void setShowStartTime(String str) {
    }

    public void setSysManager(boolean z) {
    }

    public void setTime(String str) {
    }

    public void setToUser(c cVar) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LettersBean(Parcel parcel) {
    }
}
