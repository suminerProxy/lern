package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = null;
    public static final int DEVICE_CHARGING = 8;
    public static final int DEVICE_IDLE = 4;
    public static final int DEVICE_STORAGE_NOT_LOW = 16;
    public static final int NETWORK = 1;
    public static final int NETWORK_UNMETERED = 2;
    private final int requirements;

    /* renamed from: com.google.android.exoplayer2.scheduler.Requirements$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Requirements createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Requirements[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Requirements[] newArray(int size) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface RequirementFlags {
    }

    public Requirements(int requirements) {
    }

    private int getNotMetNetworkRequirements(Context context) {
    }

    private boolean isDeviceCharging(Context context) {
    }

    private boolean isDeviceIdle(Context context) {
    }

    private static boolean isInternetConnectivityValidated(ConnectivityManager connectivityManager) {
    }

    private boolean isStorageNotLow(Context context) {
    }

    public boolean checkRequirements(Context context) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public Requirements filterRequirements(int requirementsFilter) {
    }

    public int getNotMetRequirements(Context context) {
    }

    public int getRequirements() {
    }

    public int hashCode() {
    }

    public boolean isChargingRequired() {
    }

    public boolean isIdleRequired() {
    }

    public boolean isNetworkRequired() {
    }

    public boolean isStorageNotLowRequired() {
    }

    public boolean isUnmeteredNetworkRequired() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }
}
