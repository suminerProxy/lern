package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.showstartfans.activity.model.actdes.AnnouncementBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderDetailBean implements Parcelable {
    public static final Parcelable.Creator<OrderDetailBean> CREATOR = null;
    private OrderActivityBean activity;
    private String alternateContent;
    private int isAlternateOrder;
    private int isDelivery;
    private long leftTime;
    private List<OrderExpressBean> logisticsList;
    private List<AnnouncementBean> notices;
    private OrderPayDetailBean orderDetail;
    private long orderId;
    private int orderStatus;
    private OrderPaymentBean paymentInfo;
    private int paymentStatus;
    private int refundStatus;
    private int showAlternateCancelBtn;
    private String sn;
    private String statusView;
    private String ticketCode;
    private OrderTicketInfoBean ticketPrice;
    private String ticketShowContent;
    private int ticketType;
    private String ticketURL;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<OrderDetailBean> {
        public OrderDetailBean a(Parcel parcel) {
        }

        public OrderDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ OrderDetailBean[] newArray(int i2) {
        }
    }

    public OrderDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public OrderActivityBean getActivity() {
    }

    public String getAlternateContent() {
    }

    public int getIsAlternateOrder() {
    }

    public int getIsDelivery() {
    }

    public long getLeftTime() {
    }

    public List<OrderExpressBean> getLogisticsList() {
    }

    public List<AnnouncementBean> getNotices() {
    }

    public OrderPayDetailBean getOrderDetail() {
    }

    public long getOrderId() {
    }

    public int getOrderStatus() {
    }

    public OrderPaymentBean getPaymentInfo() {
    }

    public int getPaymentStatus() {
    }

    public int getRefundStatus() {
    }

    public int getShowAlternateCancelBtn() {
    }

    public String getSn() {
    }

    public String getStatusView() {
    }

    public String getTicketCode() {
    }

    public OrderTicketInfoBean getTicketPrice() {
    }

    public String getTicketShowContent() {
    }

    public int getTicketType() {
    }

    public String getTicketURL() {
    }

    public void setActivity(OrderActivityBean orderActivityBean) {
    }

    public void setAlternateContent(String str) {
    }

    public void setIsAlternateOrder(int i2) {
    }

    public void setIsDelivery(int i2) {
    }

    public void setLeftTime(long j2) {
    }

    public void setLogisticsList(List<OrderExpressBean> list) {
    }

    public void setNotices(List<AnnouncementBean> list) {
    }

    public void setOrderDetail(OrderPayDetailBean orderPayDetailBean) {
    }

    public void setOrderId(long j2) {
    }

    public void setOrderStatus(int i2) {
    }

    public void setPaymentInfo(OrderPaymentBean orderPaymentBean) {
    }

    public void setPaymentStatus(int i2) {
    }

    public void setRefundStatus(int i2) {
    }

    public void setShowAlternateCancelBtn(int i2) {
    }

    public void setSn(String str) {
    }

    public void setStatusView(String str) {
    }

    public void setTicketCode(String str) {
    }

    public void setTicketPrice(OrderTicketInfoBean orderTicketInfoBean) {
    }

    public void setTicketShowContent(String str) {
    }

    public void setTicketType(int i2) {
    }

    public void setTicketURL(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public OrderDetailBean(Parcel parcel) {
    }
}
