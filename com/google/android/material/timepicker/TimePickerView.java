package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TimePickerView extends ConstraintLayout implements TimePickerControls {
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private OnDoubleTapListener onDoubleTapListener;
    private OnPeriodChangeListener onPeriodChangeListener;
    private OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TimePickerView this$0;

        public AnonymousClass1(TimePickerView timePickerView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements MaterialButtonToggleGroup.OnButtonCheckedListener {
        public final /* synthetic */ TimePickerView this$0;

        public AnonymousClass2(TimePickerView timePickerView) {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
        public void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ TimePickerView this$0;

        public AnonymousClass3(TimePickerView timePickerView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements View.OnTouchListener {
        public final /* synthetic */ TimePickerView this$0;
        public final /* synthetic */ GestureDetector val$gestureDetector;

        public AnonymousClass4(TimePickerView timePickerView, GestureDetector gestureDetector) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnDoubleTapListener {
        void onDoubleTap();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnPeriodChangeListener {
        void onPeriodChange(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnSelectionChange {
        void onSelectionChanged(int i2);
    }

    public TimePickerView(Context context) {
    }

    public static /* synthetic */ OnSelectionChange access$000(TimePickerView timePickerView) {
    }

    public static /* synthetic */ OnPeriodChangeListener access$100(TimePickerView timePickerView) {
    }

    public static /* synthetic */ OnDoubleTapListener access$200(TimePickerView timePickerView) {
    }

    private void setUpDisplay() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
    }

    private void updateToggleConstraints() {
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i2) {
    }

    public void setAnimateOnTouchUp(boolean z) {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f2) {
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
    }

    public void setOnDoubleTapListener(@Nullable OnDoubleTapListener onDoubleTapListener) {
    }

    public void setOnPeriodChangeListener(OnPeriodChangeListener onPeriodChangeListener) {
    }

    public void setOnSelectionChangeListener(OnSelectionChange onSelectionChange) {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, @StringRes int i2) {
    }

    public void showToggle() {
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i2, int i3, int i4) {
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public void setHandRotation(float f2, boolean z) {
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
