package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LiveTopUserBean implements Parcelable {
    public static final Parcelable.Creator<LiveTopUserBean> CREATOR = null;
    private List<LiveTopGoodsClaBean> goodsList;
    private int goodsNum;
    private int rank;
    private int totalAmount;
    private String totalAmountFormat;
    private String userAvatar;
    private String userId;
    private String userName;
    private String userType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<LiveTopUserBean> {
        public LiveTopUserBean a(Parcel parcel) {
        }

        public LiveTopUserBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveTopUserBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LiveTopUserBean[] newArray(int i2) {
        }
    }

    public LiveTopUserBean() {
    }

    public static /* synthetic */ String access$002(LiveTopUserBean liveTopUserBean, String str) {
    }

    public static /* synthetic */ String access$102(LiveTopUserBean liveTopUserBean, String str) {
    }

    public static /* synthetic */ String access$202(LiveTopUserBean liveTopUserBean, String str) {
    }

    public static /* synthetic */ String access$302(LiveTopUserBean liveTopUserBean, String str) {
    }

    public static /* synthetic */ int access$402(LiveTopUserBean liveTopUserBean, int i2) {
    }

    public static /* synthetic */ int access$502(LiveTopUserBean liveTopUserBean, int i2) {
    }

    public static /* synthetic */ List access$602(LiveTopUserBean liveTopUserBean, List list) {
    }

    public static /* synthetic */ String access$702(LiveTopUserBean liveTopUserBean, String str) {
    }

    public static /* synthetic */ int access$802(LiveTopUserBean liveTopUserBean, int i2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<LiveTopGoodsClaBean> getGoodsList() {
    }

    public int getGoodsNum() {
    }

    public int getRank() {
    }

    public int getTotalAmount() {
    }

    public String getTotalAmountFormat() {
    }

    public String getUserAvatar() {
    }

    public String getUserId() {
    }

    public String getUserName() {
    }

    public String getUserType() {
    }

    public void setGoodsList(List<LiveTopGoodsClaBean> list) {
    }

    public void setGoodsNum(int i2) {
    }

    public void setRank(int i2) {
    }

    public void setTotalAmount(int i2) {
    }

    public void setTotalAmountFormat(String str) {
    }

    public void setUserAvatar(String str) {
    }

    public void setUserId(String str) {
    }

    public void setUserName(String str) {
    }

    public void setUserType(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public LiveTopUserBean(String str, String str2) {
    }
}
