package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GroupNoticeBean extends BaseImMessageBean implements Parcelable {
    public static final Parcelable.Creator<GroupNoticeBean> CREATOR = null;
    public int confirmNum;
    public String groupId;
    public String id;
    public int isConfirm;
    public String notice;
    public String noticePhoto;
    public String noticeSeq;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<GroupNoticeBean> {
        public GroupNoticeBean a(Parcel parcel) {
        }

        public GroupNoticeBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupNoticeBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GroupNoticeBean[] newArray(int i2) {
        }
    }

    public GroupNoticeBean() {
    }

    @Override // com.showstartfans.activity.model.BaseImMessageBean, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.showstartfans.activity.model.BaseImMessageBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public GroupNoticeBean(Parcel parcel) {
    }
}
