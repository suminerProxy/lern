package com.google.android.material.timepicker;

import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private static final String[] HOUR_CLOCK_24_VALUES = null;
    private static final String[] HOUR_CLOCK_VALUES = null;
    private static final String[] MINUTE_CLOCK_VALUES = null;
    private boolean broadcasting;
    private float hourRotation;
    private float minuteRotation;
    private TimeModel time;
    private TimePickerView timePickerView;

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
    }

    private int getDegreesPerHour() {
    }

    private String[] getHourClockValues() {
    }

    private void performHapticFeedback(int i2, int i3) {
    }

    private void updateTime() {
    }

    private void updateValues() {
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

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f2, boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i2) {
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f2, boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i2) {
    }

    public void setSelection(int i2, boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
    }

    private void updateValues(String[] strArr, String str) {
    }
}
