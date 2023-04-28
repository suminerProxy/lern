package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.timepicker.ClockHandView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final RectF scratch;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final AccessibilityDelegateCompat valueAccessibilityDelegate;
    private String[] values;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ ClockFaceView this$0;

        public AnonymousClass1(ClockFaceView clockFaceView) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AccessibilityDelegateCompat {
        public final /* synthetic */ ClockFaceView this$0;

        public AnonymousClass2(ClockFaceView clockFaceView) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    public ClockFaceView(@NonNull Context context) {
    }

    public static /* synthetic */ ClockHandView access$000(ClockFaceView clockFaceView) {
    }

    public static /* synthetic */ int access$100(ClockFaceView clockFaceView) {
    }

    public static /* synthetic */ SparseArray access$200(ClockFaceView clockFaceView) {
    }

    private void findIntersectingTextView() {
    }

    private RadialGradient getGradientForTextView(RectF rectF, RectF rectF2) {
    }

    private void updateTextViews(@StringRes int i2) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f2, boolean z) {
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f2) {
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i2) {
    }

    public void setValues(String[] strArr, @StringRes int i2) {
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
