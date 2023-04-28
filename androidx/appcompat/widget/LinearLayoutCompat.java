package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
    }

    private void forceUniformHeight(int i2, int i3) {
    }

    private void forceUniformWidth(int i2, int i3) {
    }

    private void setChildFrame(View view, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void drawDividersHorizontal(Canvas canvas) {
    }

    public void drawDividersVertical(Canvas canvas) {
    }

    public void drawHorizontalDivider(Canvas canvas, int i2) {
    }

    public void drawVerticalDivider(Canvas canvas, int i2) {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.View
    public int getBaseline() {
    }

    public int getBaselineAlignedChildIndex() {
    }

    public int getChildrenSkipCount(View view, int i2) {
    }

    public Drawable getDividerDrawable() {
    }

    public int getDividerPadding() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
    }

    public int getGravity() {
    }

    public int getLocationOffset(View view) {
    }

    public int getNextLocationOffset(View view) {
    }

    public int getOrientation() {
    }

    public int getShowDividers() {
    }

    public View getVirtualChildAt(int i2) {
    }

    public int getVirtualChildCount() {
    }

    public float getWeightSum() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i2) {
    }

    public boolean isBaselineAligned() {
    }

    public boolean isMeasureWithLargestChildEnabled() {
    }

    public void layoutHorizontal(int i2, int i3, int i4, int i5) {
    }

    public void layoutVertical(int i2, int i3, int i4, int i5) {
    }

    public void measureChildBeforeLayout(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public void measureHorizontal(int i2, int i3) {
    }

    public int measureNullChild(int i2) {
    }

    public void measureVertical(int i2, int i3) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setBaselineAligned(boolean z) {
    }

    public void setBaselineAlignedChildIndex(int i2) {
    }

    public void setDividerDrawable(Drawable drawable) {
    }

    public void setDividerPadding(int i2) {
    }

    public void setGravity(int i2) {
    }

    public void setHorizontalGravity(int i2) {
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
    }

    public void setOrientation(int i2) {
    }

    public void setShowDividers(int i2) {
    }

    public void setVerticalGravity(int i2) {
    }

    public void setWeightSum(float f2) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        public LayoutParams(int i2, int i3) {
        }

        public LayoutParams(int i2, int i3, float f2) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public LayoutParams(LayoutParams layoutParams) {
        }
    }
}
