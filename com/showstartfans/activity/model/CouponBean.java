package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CouponBean implements Parcelable {
    public static final Parcelable.Creator<CouponBean> CREATOR = null;
    public ArrayList<String> activityIds;
    private long beginTime;
    public ArrayList<String> businessActivityIds;
    private String canntUseMsg;
    private int category;
    public String code;
    public int couponType;
    public String desc;
    public String description;
    private long endTime;
    public ArrayList<String> goodsIds;
    private long id;
    public boolean isReceive;
    public String limit;
    private String name;
    private String price;
    public ArrayList<String> raiseIds;
    private String showName;
    private int status;
    private String statusDesc;
    private String subtractPrice;
    private String terminal;
    private String terminalView;
    public ArrayList<String> ticketIds;
    private String timeRange;
    private int type;
    public int useTerminal;
    public String wapUrl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<CouponBean> {
        public CouponBean a(Parcel parcel) {
        }

        public CouponBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CouponBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CouponBean[] newArray(int i2) {
        }
    }

    public CouponBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public long getBeginTime() {
    }

    public ArrayList<String> getBusinessActivityIds() {
    }

    public String getCanntUseMsg() {
    }

    public int getCategory() {
    }

    public long getEndTime() {
    }

    public long getId() {
    }

    public String getName() {
    }

    public String getPrice() {
    }

    public String getShowName() {
    }

    public int getStatus() {
    }

    public String getStatusDesc() {
    }

    public String getSubtractPrice() {
    }

    public String getTerminal() {
    }

    public String getTerminalView() {
    }

    public String getTimeRange() {
    }

    public int getType() {
    }

    public void setBeginTime(long j2) {
    }

    public void setBusinessActivityIds(ArrayList<String> arrayList) {
    }

    public void setCanntUseMsg(String str) {
    }

    public void setCategory(int i2) {
    }

    public void setEndTime(long j2) {
    }

    public void setId(long j2) {
    }

    public void setName(String str) {
    }

    public void setPrice(String str) {
    }

    public void setShowName(String str) {
    }

    public void setStatus(int i2) {
    }

    public void setStatusDesc(String str) {
    }

    public void setSubtractPrice(String str) {
    }

    public void setTerminal(String str) {
    }

    public void setTerminalView(String str) {
    }

    public void setTimeRange(String str) {
    }

    public void setType(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public CouponBean(Parcel parcel) {
    }
}
