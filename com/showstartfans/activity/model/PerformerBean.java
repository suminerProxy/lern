package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PerformerBean implements Parcelable {
    public static final Parcelable.Creator<PerformerBean> CREATOR = null;
    private String documentNumber;
    private int documentType;
    private String documentTypeStr;
    private String id;
    private boolean isCheck;
    private int isSelf;
    private String name;
    private String showDocumentNumber;
    private int updateAuditStatus;
    private String userId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<PerformerBean> {
        public PerformerBean a(Parcel parcel) {
        }

        public PerformerBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PerformerBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PerformerBean[] newArray(int i2) {
        }
    }

    public PerformerBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public String getDocumentNumber() {
    }

    public int getDocumentType() {
    }

    public String getDocumentTypeStr() {
    }

    public String getId() {
    }

    public int getIsSelf() {
    }

    public String getName() {
    }

    public String getShowDocumentNumber() {
    }

    public int getUpdateAuditStatus() {
    }

    public String getUserId() {
    }

    public boolean isCheck() {
    }

    public void setCheck(boolean z) {
    }

    public void setDocumentNumber(String str) {
    }

    public void setDocumentType(int i2) {
    }

    public void setDocumentTypeStr(String str) {
    }

    public void setId(String str) {
    }

    public void setIsSelf(int i2) {
    }

    public void setName(String str) {
    }

    public void setShowDocumentNumber(String str) {
    }

    public void setUpdateAuditStatus(int i2) {
    }

    public void setUserId(String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public PerformerBean(Parcel parcel) {
    }
}
