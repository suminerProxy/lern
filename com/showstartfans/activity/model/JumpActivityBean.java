package com.showstartfans.activity.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class JumpActivityBean implements Parcelable {
    public static final Parcelable.Creator<JumpActivityBean> CREATOR = new a();
    public boolean isNeedLogin;
    public String jumpClass;
    public Bundle parameter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<JumpActivityBean> {
        public JumpActivityBean a(Parcel parcel) {
        }

        public JumpActivityBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ JumpActivityBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ JumpActivityBean[] newArray(int i2) {
        }
    }

    public JumpActivityBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.jumpClass);
        parcel.writeByte(this.isNeedLogin ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.parameter);
    }

    public JumpActivityBean(Parcel parcel) {
        this.jumpClass = parcel.readString();
        this.isNeedLogin = parcel.readByte() != 0;
        this.parameter = parcel.readBundle();
    }
}
