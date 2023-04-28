package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tooltip.TooltipDrawable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    public static final int DEF_STYLE_RES = 0;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final long LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final long LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String TAG = null;
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    public static final int UNIT_PX = 0;
    public static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERRROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    @NonNull
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    @NonNull
    private final Paint activeTicksPaint;
    @NonNull
    private final Paint activeTrackPaint;
    @NonNull
    private final List<L> changeListeners;
    private int defaultThumbRadius;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    @NonNull
    private ColorStateList haloColor;
    @NonNull
    private final Paint haloPaint;
    private int haloRadius;
    @NonNull
    private final Paint inactiveTicksPaint;
    @NonNull
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    @NonNull
    private final TooltipDrawableFactory labelMaker;
    private int labelPadding;
    @NonNull
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTrackSidePadding;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    @NonNull
    private final MaterialShapeDrawable thumbDrawable;
    private boolean thumbIsPressed;
    @NonNull
    private final Paint thumbPaint;
    private int thumbRadius;
    @NonNull
    private ColorStateList tickColorActive;
    @NonNull
    private ColorStateList tickColorInactive;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;
    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;
    @NonNull
    private ColorStateList trackColorActive;
    @NonNull
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackTop;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;

    /* renamed from: com.google.android.material.slider.BaseSlider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements TooltipDrawableFactory {
        public final /* synthetic */ BaseSlider this$0;
        public final /* synthetic */ AttributeSet val$attrs;
        public final /* synthetic */ int val$defStyleAttr;

        public AnonymousClass1(BaseSlider baseSlider, AttributeSet attributeSet, int i2) {
        }

        @Override // com.google.android.material.slider.BaseSlider.TooltipDrawableFactory
        public TooltipDrawable createTooltipDrawable() {
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ BaseSlider this$0;

        public AnonymousClass2(BaseSlider baseSlider) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        public final /* synthetic */ BaseSlider this$0;

        public AnonymousClass3(BaseSlider baseSlider) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        public Rect virtualViewBounds;

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
        }

        @NonNull
        private String startOrEndDescription(int i2) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f2, float f3) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = null;
        public boolean hasFocus;
        public float stepSize;
        public float valueFrom;
        public float valueTo;
        public ArrayList<Float> values;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ SliderState createFromParcel(@NonNull Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ SliderState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i2) {
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, AnonymousClass1 anonymousClass1) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
        }

        public SliderState(Parcelable parcelable) {
        }

        private SliderState(@NonNull Parcel parcel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TooltipDrawableFactory {
        TooltipDrawable createTooltipDrawable();
    }

    public BaseSlider(@NonNull Context context) {
    }

    public static /* synthetic */ TooltipDrawable access$000(Context context, TypedArray typedArray) {
    }

    public static /* synthetic */ List access$100(BaseSlider baseSlider) {
    }

    public static /* synthetic */ AccessibilityHelper access$300(BaseSlider baseSlider) {
    }

    public static /* synthetic */ String access$500(BaseSlider baseSlider, float f2) {
    }

    public static /* synthetic */ boolean access$600(BaseSlider baseSlider, int i2, float f2) {
    }

    public static /* synthetic */ void access$700(BaseSlider baseSlider) {
    }

    public static /* synthetic */ float access$800(BaseSlider baseSlider, int i2) {
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
    }

    private Float calculateIncrementForKey(int i2) {
    }

    private float calculateStepIncrement() {
    }

    private int calculateTop() {
    }

    private ValueAnimator createLabelAnimator(boolean z) {
    }

    private void createLabelPool() {
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
    }

    private float dimenToValue(float f2) {
    }

    private void dispatchOnChangedFromUser(int i2) {
    }

    private void dispatchOnChangedProgramatically() {
    }

    private void drawActiveTrack(@NonNull Canvas canvas, int i2, int i3) {
    }

    private void drawInactiveTrack(@NonNull Canvas canvas, int i2, int i3) {
    }

    private void drawThumbs(@NonNull Canvas canvas, int i2, int i3) {
    }

    private void ensureLabelsAdded() {
    }

    private void ensureLabelsRemoved() {
    }

    private void focusThumbOnFocusGained(int i2) {
    }

    private String formatValue(float f2) {
    }

    private float[] getActiveRange() {
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f2) {
    }

    private float getClampedValue(int i2, float f2) {
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
    }

    private float getValueOfTouchPosition() {
    }

    private float getValueOfTouchPositionAbsolute() {
    }

    private void invalidateTrack() {
    }

    private boolean isInVerticalScrollingContainer() {
    }

    private void loadResources(@NonNull Resources resources) {
    }

    private void maybeCalculateTicksCoordinates() {
    }

    private void maybeDrawHalo(@NonNull Canvas canvas, int i2, int i3) {
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
    }

    private void maybeIncreaseTrackSidePadding() {
    }

    private boolean moveFocus(int i2) {
    }

    private boolean moveFocusInAbsoluteDirection(int i2) {
    }

    private float normalizeValue(float f2) {
    }

    private Boolean onKeyDownNoActiveThumb(int i2, @NonNull KeyEvent keyEvent) {
    }

    private void onStartTrackingTouch() {
    }

    private void onStopTrackingTouch() {
    }

    @NonNull
    private static TooltipDrawable parseLabelDrawable(@NonNull Context context, @NonNull TypedArray typedArray) {
    }

    private static int pivotIndex(float[] fArr, float f2) {
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i2) {
    }

    private void scheduleAccessibilityEventSender(int i2) {
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f2) {
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
    }

    private boolean shouldDrawCompatHalo() {
    }

    private boolean snapActiveThumbToValue(float f2) {
    }

    private double snapPosition(float f2) {
    }

    private boolean snapThumbToValue(int i2, float f2) {
    }

    private boolean snapTouchPosition() {
    }

    private void updateHaloHotspot() {
    }

    private void updateTrackWidth(int i2) {
    }

    private void validateConfigurationIfDirty() {
    }

    private void validateStepSize() {
    }

    private void validateValueFrom() {
    }

    private void validateValueTo() {
    }

    private void validateValues() {
    }

    private boolean valueLandsOnTick(float f2) {
    }

    private float valueToX(float f2) {
    }

    private void warnAboutFloatingPointError() {
    }

    public void addOnChangeListener(@Nullable L l2) {
    }

    public void addOnSliderTouchListener(@NonNull T t) {
    }

    public void clearOnChangeListeners() {
    }

    public void clearOnSliderTouchListeners() {
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public void drawableStateChanged() {
    }

    @VisibleForTesting
    public void forceDrawCompatHalo(boolean z) {
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
    }

    public int getActiveThumbIndex() {
    }

    public int getFocusedThumbIndex() {
    }

    @Dimension
    public int getHaloRadius() {
    }

    @NonNull
    public ColorStateList getHaloTintList() {
    }

    public int getLabelBehavior() {
    }

    public float getMinSeparation() {
    }

    public float getStepSize() {
    }

    public float getThumbElevation() {
    }

    @Dimension
    public int getThumbRadius() {
    }

    public ColorStateList getThumbStrokeColor() {
    }

    public float getThumbStrokeWidth() {
    }

    @NonNull
    public ColorStateList getThumbTintList() {
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
    }

    @NonNull
    public ColorStateList getTickTintList() {
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
    }

    @Dimension
    public int getTrackHeight() {
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
    }

    @Dimension
    public int getTrackSidePadding() {
    }

    @NonNull
    public ColorStateList getTrackTintList() {
    }

    @Dimension
    public int getTrackWidth() {
    }

    public float getValueFrom() {
    }

    public float getValueTo() {
    }

    @NonNull
    public List<Float> getValues() {
    }

    public boolean hasLabelFormatter() {
    }

    public final boolean isRtl() {
    }

    public boolean isTickVisible() {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, @NonNull KeyEvent keyEvent) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    public boolean pickActiveThumb() {
    }

    public void removeOnChangeListener(@NonNull L l2) {
    }

    public void removeOnSliderTouchListener(@NonNull T t) {
    }

    public void setActiveThumbIndex(int i2) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setFocusedThumbIndex(int i2) {
    }

    public void setHaloRadius(@IntRange(from = 0) @Dimension int i2) {
    }

    public void setHaloRadiusResource(@DimenRes int i2) {
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setLabelBehavior(int i2) {
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
    }

    public void setSeparationUnit(int i2) {
    }

    public void setStepSize(float f2) {
    }

    public void setThumbElevation(float f2) {
    }

    public void setThumbElevationResource(@DimenRes int i2) {
    }

    public void setThumbRadius(@IntRange(from = 0) @Dimension int i2) {
    }

    public void setThumbRadiusResource(@DimenRes int i2) {
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
    }

    public void setThumbStrokeColorResource(@ColorRes int i2) {
    }

    public void setThumbStrokeWidth(float f2) {
    }

    public void setThumbStrokeWidthResource(@DimenRes int i2) {
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setTickVisible(boolean z) {
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setTrackHeight(@IntRange(from = 0) @Dimension int i2) {
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
    }

    public void setValueFrom(float f2) {
    }

    public void setValueTo(float f2) {
    }

    public void setValues(@NonNull Float... fArr) {
    }

    public void updateBoundsForVirturalViewId(int i2, Rect rect) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AccessibilityEventSender implements Runnable {
        public final /* synthetic */ BaseSlider this$0;
        public int virtualViewId;

        private AccessibilityEventSender(BaseSlider baseSlider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setVirtualViewId(int i2) {
        }

        public /* synthetic */ AccessibilityEventSender(BaseSlider baseSlider, AnonymousClass1 anonymousClass1) {
        }
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    private float calculateStepIncrement(int i2) {
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    public void setValues(@NonNull List<Float> list) {
    }
}
