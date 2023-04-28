package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MessageSystemBean implements Parcelable {
    public static final Parcelable.Creator<MessageSystemBean> CREATOR = null;
    private ActivityBean activity;
    private String content;
    private String createTime;
    private String id;
    private String messageId;
    private int messageType;
    private String orderId;
    private String orderSn;
    private String poster;
    private String pushRecordId;
    private boolean read;
    private String showTime;
    private String sortTime;
    private String title;
    private int type;
    private String url;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<MessageSystemBean> {
        public MessageSystemBean a(Parcel parcel) {
        }

        public MessageSystemBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageSystemBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageSystemBean[] newArray(int i2) {
        }
    }

    public MessageSystemBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public ActivityBean getActivity() {
    }

    public String getContent() {
    }

    public String getCreateTime() {
    }

    public String getId() {
    }

    public String getMessageId() {
    }

    public int getMessageType() {
    }

    public String getOrderId() {
    }

    public String getOrderSn() {
    }

    public String getPoster() {
    }

    public String getPushRecordId() {
    }

    public String getShowTime() {
    }

    public String getSortTime() {
    }

    public String getTitle() {
    }

    public int getType() {
    }

    public String getUrl() {
    }

    public boolean isRead() {
    }

    public void setActivity(ActivityBean activityBean) {
    }

    public void setContent(String str) {
    }

    public void setCreateTime(String str) {
    }

    public void setId(String str) {
    }

    public void setMessageId(String str) {
    }

    public void setMessageType(int i2) {
    }

    public void setOrderId(String str) {
    }

    public void setOrderSn(String str) {
    }

    public void setPoster(String str) {
    }

    public void setPushRecordId(String str) {
    }

    public void setRead(boolean z) {
    }

    public void setShowTime(String str) {
    }

    public void setSortTime(String str) {
    }

    public void setTitle(String str) {
    }

    public void setType(int i2) {
    }

    public void setUrl(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MessageSystemBean(Parcel parcel) {
    }
}
