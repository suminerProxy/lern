package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SwitchCompat extends CompoundButton {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int[] CHECKED_STATE_SET = null;
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final Property<SwitchCompat, Float> THUMB_POS = null;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    public ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final AppCompatTextHelper mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    public float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Property<SwitchCompat, Float> {
        public AnonymousClass1(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(SwitchCompat switchCompat) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(SwitchCompat switchCompat, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(SwitchCompat switchCompat) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(SwitchCompat switchCompat, Float f2) {
        }
    }

    public SwitchCompat(@NonNull Context context) {
    }

    private void animateThumbToCheckedState(boolean z) {
    }

    private void applyThumbTint() {
    }

    private void applyTrackTint() {
    }

    private void cancelPositionAnimator() {
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
    }

    private static float constrain(float f2, float f3, float f4) {
    }

    private boolean getTargetCheckedState() {
    }

    private int getThumbOffset() {
    }

    private int getThumbScrollRange() {
    }

    private boolean hitThumb(float f2, float f3) {
    }

    private Layout makeLayout(CharSequence charSequence) {
    }

    private void setSwitchTypefaceByIndex(int i2, int i3) {
    }

    private void stopDrag(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
    }

    public boolean getShowText() {
    }

    public boolean getSplitTrack() {
    }

    public int getSwitchMinWidth() {
    }

    public int getSwitchPadding() {
    }

    public CharSequence getTextOff() {
    }

    public CharSequence getTextOn() {
    }

    public Drawable getThumbDrawable() {
    }

    public int getThumbTextPadding() {
    }

    @Nullable
    public ColorStateList getThumbTintList() {
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
    }

    public Drawable getTrackDrawable() {
    }

    @Nullable
    public ColorStateList getTrackTintList() {
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    public void setShowText(boolean z) {
    }

    public void setSplitTrack(boolean z) {
    }

    public void setSwitchMinWidth(int i2) {
    }

    public void setSwitchPadding(int i2) {
    }

    public void setSwitchTextAppearance(Context context, int i2) {
    }

    public void setSwitchTypeface(Typeface typeface, int i2) {
    }

    public void setTextOff(CharSequence charSequence) {
    }

    public void setTextOn(CharSequence charSequence) {
    }

    public void setThumbDrawable(Drawable drawable) {
    }

    public void setThumbPosition(float f2) {
    }

    public void setThumbResource(int i2) {
    }

    public void setThumbTextPadding(int i2) {
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public void setTrackDrawable(Drawable drawable) {
    }

    public void setTrackResource(int i2) {
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public void setSwitchTypeface(Typeface typeface) {
    }
}
