package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = null;
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    public final int format;
    public int hour;
    private final MaxInputValidator hourInputValidator;
    public int minute;
    private final MaxInputValidator minuteInputValidator;
    public int period;
    public int selection;

    /* renamed from: com.google.android.material.timepicker.TimeModel$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeModel createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeModel[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i2) {
        }
    }

    public TimeModel() {
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
    }

    private static int getPeriod(int i2) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public int getHourForDisplay() {
    }

    public MaxInputValidator getHourInputValidator() {
    }

    public MaxInputValidator getMinuteInputValidator() {
    }

    public int hashCode() {
    }

    public void setHour(int i2) {
    }

    public void setHourOfDay(int i2) {
    }

    public void setMinute(@IntRange(from = 0, to = 60) int i2) {
    }

    public void setPeriod(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TimeModel(int i2) {
    }

    public static String formatText(Resources resources, CharSequence charSequence, String str) {
    }

    public TimeModel(int i2, int i3, int i4, int i5) {
    }

    public TimeModel(Parcel parcel) {
    }
}
