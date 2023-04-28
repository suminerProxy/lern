package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = null;
    @NonNull
    private final Month end;
    private final int monthSpan;
    @Nullable
    private Month openAt;
    @NonNull
    private final Month start;
    @NonNull
    private final DateValidator validator;
    private final int yearSpan;

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ CalendarConstraints[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j2);
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Month access$100(CalendarConstraints calendarConstraints) {
    }

    public static /* synthetic */ Month access$200(CalendarConstraints calendarConstraints) {
    }

    public static /* synthetic */ Month access$300(CalendarConstraints calendarConstraints) {
    }

    public static /* synthetic */ DateValidator access$400(CalendarConstraints calendarConstraints) {
    }

    public Month clamp(Month month) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(Object obj) {
    }

    public DateValidator getDateValidator() {
    }

    @NonNull
    public Month getEnd() {
    }

    public int getMonthSpan() {
    }

    @Nullable
    public Month getOpenAt() {
    }

    @NonNull
    public Month getStart() {
    }

    public int getYearSpan() {
    }

    public int hashCode() {
    }

    public boolean isWithinBounds(long j2) {
    }

    public void setOpenAt(@Nullable Month month) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    private CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        public static final long DEFAULT_END = 0;
        public static final long DEFAULT_START = 0;
        private long end;
        private Long openAt;
        private long start;
        private DateValidator validator;

        public Builder() {
        }

        @NonNull
        public CalendarConstraints build() {
        }

        @NonNull
        public Builder setEnd(long j2) {
        }

        @NonNull
        public Builder setOpenAt(long j2) {
        }

        @NonNull
        public Builder setStart(long j2) {
        }

        @NonNull
        public Builder setValidator(@NonNull DateValidator dateValidator) {
        }

        public Builder(@NonNull CalendarConstraints calendarConstraints) {
        }
    }
}
