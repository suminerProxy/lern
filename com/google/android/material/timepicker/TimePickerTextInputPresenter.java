package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.timepicker.TimePickerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final ChipTextInputComboView hourTextInput;
    private final TextWatcher hourTextWatcher;
    private final EditText minuteEditText;
    private final ChipTextInputComboView minuteTextInput;
    private final TextWatcher minuteTextWatcher;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TextWatcherAdapter {
        public final /* synthetic */ TimePickerTextInputPresenter this$0;

        public AnonymousClass1(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends TextWatcherAdapter {
        public final /* synthetic */ TimePickerTextInputPresenter this$0;

        public AnonymousClass2(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ TimePickerTextInputPresenter this$0;

        public AnonymousClass3(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements MaterialButtonToggleGroup.OnButtonCheckedListener {
        public final /* synthetic */ TimePickerTextInputPresenter this$0;

        public AnonymousClass4(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
        public void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
        }
    }

    public TimePickerTextInputPresenter(LinearLayout linearLayout, TimeModel timeModel) {
    }

    public static /* synthetic */ TimeModel access$000(TimePickerTextInputPresenter timePickerTextInputPresenter) {
    }

    private void addTextWatchers() {
    }

    private void removeTextWatchers() {
    }

    private static void setCursorDrawableColor(EditText editText, @ColorInt int i2) {
    }

    private void setTime(TimeModel timeModel) {
    }

    private void setupPeriodToggle() {
    }

    private void updateSelection() {
    }

    public void clearCheck() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i2) {
    }

    public void resetChecked() {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
    }
}
