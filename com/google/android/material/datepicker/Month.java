package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = null;
    public final int daysInMonth;
    public final int daysInWeek;
    @NonNull
    private final Calendar firstOfMonth;
    @Nullable
    private String longName;
    public final int month;
    public final long timeInMillis;
    public final int year;

    /* renamed from: com.google.android.material.datepicker.Month$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ Month createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ Month[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month[] newArray(int i2) {
        }
    }

    private Month(@NonNull Calendar calendar) {
    }

    @NonNull
    public static Month create(long j2) {
    }

    @NonNull
    public static Month current() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull Month month) {
    }

    public int daysFromStartOfWeekToFirstOfMonth() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public long getDay(int i2) {
    }

    public int getDayOfMonth(long j2) {
    }

    @NonNull
    public String getLongName(Context context) {
    }

    public long getStableId() {
    }

    public int hashCode() {
    }

    @NonNull
    public Month monthsLater(int i2) {
    }

    public int monthsUntil(@NonNull Month month) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(@NonNull Month month) {
    }

    @NonNull
    public static Month create(int i2, int i3) {
    }
}
