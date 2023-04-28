package com.google.android.material.timepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RadialViewGroup extends ConstraintLayout {
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    /* renamed from: com.google.android.material.timepicker.RadialViewGroup$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ RadialViewGroup this$0;

        public AnonymousClass1(RadialViewGroup radialViewGroup) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public RadialViewGroup(@NonNull Context context) {
    }

    private Drawable createBackground() {
    }

    private static boolean shouldSkipView(View view) {
    }

    private void updateLayoutParamsAsync() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
    }

    @Dimension
    public int getRadius() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
    }

    public void setRadius(@Dimension int i2) {
    }

    public void updateLayoutParams() {
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
