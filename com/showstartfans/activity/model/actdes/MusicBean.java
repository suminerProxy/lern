package com.showstartfans.activity.model.actdes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MusicBean implements Parcelable {
    public static final Parcelable.Creator<MusicBean> CREATOR = null;
    private String authorId;
    private String authorName;
    private int clickNum;
    private String id;
    private String musicLink;
    private String musicName;
    private String performerId;
    private int performerType;
    private String playState;
    private String singerAvatar;
    private String singerName;
    private String time;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MusicBean> {
        public MusicBean a(Parcel parcel) {
        }

        public MusicBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MusicBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MusicBean[] newArray(int i2) {
        }
    }

    public MusicBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAuthorId() {
    }

    public String getAuthorName() {
    }

    public int getClickNum() {
    }

    public String getId() {
    }

    public String getMusicLink() {
    }

    public String getMusicName() {
    }

    public String getPerformerId() {
    }

    public int getPerformerType() {
    }

    public String getPlayState() {
    }

    public String getSingerAvatar() {
    }

    public String getSingerName() {
    }

    public String getTime() {
    }

    public void setAuthorId(String str) {
    }

    public void setAuthorName(String str) {
    }

    public void setClickNum(int i2) {
    }

    public void setId(String str) {
    }

    public void setMusicLink(String str) {
    }

    public void setMusicName(String str) {
    }

    public void setPerformerId(String str) {
    }

    public void setPerformerType(int i2) {
    }

    public void setPlayState(String str) {
    }

    public void setSingerAvatar(String str) {
    }

    public void setSingerName(String str) {
    }

    public void setTime(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MusicBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, int i3, String str10) {
    }

    public MusicBean(Parcel parcel) {
    }
}
