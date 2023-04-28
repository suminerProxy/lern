package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final Operator ALL_OPERATOR = null;
    private static final Operator ANY_OPERATOR = null;
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = null;
    @NonNull
    private final Operator operator;
    @NonNull
    private final List<CalendarConstraints.DateValidator> validators;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Operator {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CompositeDateValidator[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Operator {
        int getId();

        boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j2);
    }

    public /* synthetic */ CompositeDateValidator(List list, Operator operator, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Operator access$000() {
    }

    public static /* synthetic */ Operator access$100() {
    }

    @NonNull
    public static CalendarConstraints.DateValidator allOf(@NonNull List<CalendarConstraints.DateValidator> list) {
    }

    @NonNull
    public static CalendarConstraints.DateValidator anyOf(@NonNull List<CalendarConstraints.DateValidator> list) {
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

    private CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, Operator operator) {
    }
}
