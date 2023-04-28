package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    @Nullable
    private CalendarConstraints calendarConstraints;
    @Nullable
    private DateSelector<S> dateSelector;
    @StyleRes
    private int themeResId;

    /* renamed from: com.google.android.material.datepicker.MaterialTextInputPicker$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends OnSelectionChangedListener<S> {
        public final /* synthetic */ MaterialTextInputPicker this$0;

        public AnonymousClass1(MaterialTextInputPicker materialTextInputPicker) {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onIncompleteSelectionChanged() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onSelectionChanged(S s) {
        }
    }

    @NonNull
    public static <T> MaterialTextInputPicker<T> newInstance(DateSelector<T> dateSelector, @StyleRes int i2, @NonNull CalendarConstraints calendarConstraints) {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @NonNull
    public DateSelector<S> getDateSelector() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }
}
