package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = null;
    private final long point;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<DateValidatorPointBackward> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ DateValidatorPointBackward createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ DateValidatorPointBackward[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public DateValidatorPointBackward createFromParcel(@NonNull Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public DateValidatorPointBackward[] newArray(int i2) {
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j2, AnonymousClass1 anonymousClass1) {
    }

    @NonNull
    public static DateValidatorPointBackward before(long j2) {
    }

    @NonNull
    public static DateValidatorPointBackward now() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
    }

    private DateValidatorPointBackward(long j2) {
    }
}
