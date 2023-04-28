package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderDetailsEntity implements Parcelable {
    public static final Parcelable.Creator<OrderDetailsEntity> CREATOR = null;
    private int activityId;
    private int buyGroupType;
    private String cityName;
    private String expressNo;
    private String expressUrl;
    private int isAlternateOrder;
    private int isDelivery;
    private boolean isOrderListTitle;
    private long leftTime;
    private List<OrderExpressBean> logisticsList;
    private int num;
    private String orderId;
    private String orderSn;
    private int orderStatus;
    private String orderStatusView;
    private String poster;
    private double price;
    private int showAlternateCancelBtn;
    private String showTime;
    private String siteName;
    private String ticketName;
    private int ticketType;
    private String title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderDetailsEntity> {
        public OrderDetailsEntity a(Parcel parcel) {
        }

        public OrderDetailsEntity[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderDetailsEntity createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderDetailsEntity[] newArray(int i2) {
        }
    }

    public OrderDetailsEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityId() {
    }

    public int getBuyGroupType() {
    }

    public String getCityName() {
    }

    public String getExpressNo() {
    }

    public String getExpressUrl() {
    }

    public int getIsAlternateOrder() {
    }

    public int getIsDelivery() {
    }

    public long getLeftTime() {
    }

    public List<OrderExpressBean> getLogisticsList() {
    }

    public int getNum() {
    }

    public String getOrderId() {
    }

    public String getOrderSn() {
    }

    public int getOrderStatus() {
    }

    public String getOrderStatusView() {
    }

    public String getPoster() {
    }

    public double getPrice() {
    }

    public int getShowAlternateCancelBtn() {
    }

    public String getShowTime() {
    }

    public String getSiteName() {
    }

    public String getTicketName() {
    }

    public int getTicketType() {
    }

    public String getTitle() {
    }

    public boolean isOrderListTitle() {
    }

    public void setActivityId(int i2) {
    }

    public void setBuyGroupType(int i2) {
    }

    public void setCityName(String str) {
    }

    public void setExpressNo(String str) {
    }

    public void setExpressUrl(String str) {
    }

    public void setIsAlternateOrder(int i2) {
    }

    public void setIsDelivery(int i2) {
    }

    public void setLeftTime(long j2) {
    }

    public void setLogisticsList(List<OrderExpressBean> list) {
    }

    public void setNum(int i2) {
    }

    public void setOrderId(String str) {
    }

    public void setOrderListTitle(boolean z) {
    }

    public void setOrderSn(String str) {
    }

    public void setOrderStatus(int i2) {
    }

    public void setOrderStatusView(String str) {
    }

    public void setPoster(String str) {
    }

    public void setPrice(double d2) {
    }

    public void setShowAlternateCancelBtn(int i2) {
    }

    public void setShowTime(String str) {
    }

    public void setSiteName(String str) {
    }

    public void setTicketName(String str) {
    }

    public void setTicketType(int i2) {
    }

    public void setTitle(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderDetailsEntity(Parcel parcel) {
    }
}
