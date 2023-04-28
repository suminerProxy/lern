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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = null;
    @Nullable
    private Long selectedItem;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends DateFormatTextWatcher {
        public final /* synthetic */ SingleDateSelector this$0;
        public final /* synthetic */ OnSelectionChangedListener val$listener;

        public AnonymousClass1(SingleDateSelector singleDateSelector, String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener) {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        public void onInvalidDate() {
        }

        @Override // com.google.android.material.datepicker.DateFormatTextWatcher
        public void onValidDate(@Nullable Long l2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public /* bridge */ /* synthetic */ SingleDateSelector[] newArray(int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector[] newArray(int i2) {
        }
    }

    public static /* synthetic */ void access$000(SingleDateSelector singleDateSelector) {
    }

    public static /* synthetic */ Long access$102(SingleDateSelector singleDateSelector, Long l2) {
    }

    private void clearSelection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
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
    @Nullable
    public /* bridge */ /* synthetic */ Long getSelection() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Long> onSelectionChangedListener) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j2) {
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(@Nullable Long l2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Long getSelection() {
    }

    /* renamed from: setSelection  reason: avoid collision after fix types in other method */
    public void setSelection2(@Nullable Long l2) {
    }
}
