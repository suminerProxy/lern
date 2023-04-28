package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageDetailUserInfoBean implements Parcelable {
    public static final Parcelable.Creator<MessageDetailUserInfoBean> CREATOR = null;
    private String address;
    private String avatar;
    private String cityName;
    private long id;
    private String name;
    private ArrayList<String> style;
    private int userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageDetailUserInfoBean> {
        public MessageDetailUserInfoBean a(Parcel parcel) {
        }

        public MessageDetailUserInfoBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageDetailUserInfoBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageDetailUserInfoBean[] newArray(int i2) {
        }
    }

    public MessageDetailUserInfoBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getAddress() {
    }

    public String getAvatar() {
    }

    public String getCityName() {
    }

    public long getId() {
    }

    public String getName() {
    }

    public ArrayList<String> getStyle() {
    }

    public int getUserType() {
    }

    public void setAddress(String str) {
    }

    public void setAvatar(String str) {
    }

    public void setCityName(String str) {
    }

    public void setId(long j2) {
    }

    public void setName(String str) {
    }

    public void setStyle(ArrayList<String> arrayList) {
    }

    public void setUserType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageDetailUserInfoBean(Parcel parcel) {
    }
}
