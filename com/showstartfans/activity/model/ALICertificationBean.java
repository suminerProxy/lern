package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ALICertificationBean implements Parcelable {
    public static final Parcelable.Creator<ALICertificationBean> CREATOR = null;
    private String apiSign;
    private String authResult;
    private String certifyId;
    private String content;
    private String nonce;
    private int num;
    private String orderNo;
    private String platform;
    private List<String> promptContent;
    private int status;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ALICertificationBean> {
        public ALICertificationBean a(Parcel parcel) {
        }

        public ALICertificationBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ALICertificationBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ALICertificationBean[] newArray(int i2) {
        }
    }

    public ALICertificationBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getApiSign() {
    }

    public String getAuthResult() {
    }

    public String getCertifyId() {
    }

    public String getContent() {
    }

    public String getNonce() {
    }

    public int getNum() {
    }

    public String getOrderNo() {
    }

    public String getPlatform() {
    }

    public List<String> getPromptContent() {
    }

    public int getStatus() {
    }

    public void setApiSign(String str) {
    }

    public void setAuthResult(String str) {
    }

    public void setCertifyId(String str) {
    }

    public void setContent(String str) {
    }

    public void setNonce(String str) {
    }

    public void setNum(int i2) {
    }

    public void setOrderNo(String str) {
    }

    public void setPlatform(String str) {
    }

    public void setPromptContent(List<String> list) {
    }

    public void setStatus(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ALICertificationBean(Parcel parcel) {
    }
}
