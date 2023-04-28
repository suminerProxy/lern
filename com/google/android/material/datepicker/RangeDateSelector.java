package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = null;
    private final String invalidRangeEndError;
    private String invalidRangeStartError;
    @Nullable
    private Long proposedTextEnd;
    @Nullable
    private Long proposedTextStart;
    @Nullable
    private Long selectedEndItem;
    @Nullable
    private Long selectedStartItem;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends DateFormatTextWatcher {
        public final /* synthetic */ RangeDateSelector this$0;
        public final /* synthetic */ TextInputLayout val$endTextInput;
        public final /* synthetic */ OnSelectionChangedListener val$listener;
        public final /* synthetic */ TextInputLayout val$startTextInput;

        public AnonymousClass1(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        public void onInvalidDate() {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        public void onValidDate(@Nullable Long l2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends DateFormatTextWatcher {
        public final /* synthetic */ RangeDateSelector this$0;
        public final /* synthetic */ TextInputLayout val$endTextInput;
        public final /* synthetic */ OnSelectionChangedListener val$listener;
        public final /* synthetic */ TextInputLayout val$startTextInput;

        public AnonymousClass2(RangeDateSelector rangeDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        public void onInvalidDate() {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        public void onValidDate(@Nullable Long l2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ RangeDateSelector[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i2) {
        }
    }

    public static /* synthetic */ Long access$002(RangeDateSelector rangeDateSelector, Long l2) {
    }

    public static /* synthetic */ void access$100(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
    }

    public static /* synthetic */ Long access$202(RangeDateSelector rangeDateSelector, Long l2) {
    }

    public static /* synthetic */ Long access$302(RangeDateSelector rangeDateSelector, Long l2) {
    }

    public static /* synthetic */ Long access$402(RangeDateSelector rangeDateSelector, Long l2) {
    }

    private void clearInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
    }

    private boolean isValidRange(long j2, long j3) {
    }

    private void setInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
    }

    private void updateIfValidTextProposal(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public /* bridge */ /* synthetic */ Pair<Long, Long> getSelection() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j2) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(@NonNull Pair<Long, Long> pair) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Pair<Long, Long> getSelection() {
    }

    /* renamed from: setSelection  reason: avoid collision after fix types in other method */
    public void setSelection2(@NonNull Pair<Long, Long> pair) {
    }
}
