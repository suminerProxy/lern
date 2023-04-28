package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommentCrowdBean implements Parcelable {
    public static final Parcelable.Creator<CommentCrowdBean> CREATOR = null;
    private String avatar;
    private String cityName;
    private String id;
    private int isEnd;
    private int isTour;
    private String name;
    private String notice;
    private String showTimeFormat;
    private String site;
    private List<String> style;
    private String type;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CommentCrowdBean> {
        public CommentCrowdBean a(Parcel parcel) {
        }

        public CommentCrowdBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CommentCrowdBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CommentCrowdBean[] newArray(int i2) {
        }
    }

    public CommentCrowdBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAvatar() {
    }

    public String getCityName() {
    }

    public String getId() {
    }

    public int getIsEnd() {
    }

    public int getIsTour() {
    }

    public String getName() {
    }

    public String getNotice() {
    }

    public String getShowTimeFormat() {
    }

    public String getSite() {
    }

    public List<String> getStyle() {
    }

    public String getType() {
    }

    public void setAvatar(String str) {
    }

    public void setCityName(String str) {
    }

    public void setId(String str) {
    }

    public void setIsEnd(int i2) {
    }

    public void setIsTour(int i2) {
    }

    public void setName(String str) {
    }

    public void setNotice(String str) {
    }

    public void setShowTimeFormat(String str) {
    }

    public void setSite(String str) {
    }

    public void setStyle(List<String> list) {
    }

    public void setType(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CommentCrowdBean(Parcel parcel) {
    }
}
