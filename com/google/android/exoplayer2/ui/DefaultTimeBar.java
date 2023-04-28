package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ui.TimeBar;
import java.util.Formatter;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultTimeBar extends View implements TimeBar {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;
    @Nullable
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;
    @Nullable
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;
    @Nullable
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final Paint scrubberPaint;
    private float scrubberScale;
    private ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private final Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public DefaultTimeBar(Context context) {
    }

    private /* synthetic */ void a() {
    }

    private /* synthetic */ void c(ValueAnimator valueAnimator) {
    }

    private static int dpToPx(float density, int dps) {
    }

    private void drawPlayhead(Canvas canvas) {
    }

    private void drawTimeBar(Canvas canvas) {
    }

    private long getPositionIncrement() {
    }

    private String getProgressText() {
    }

    private long getScrubberPosition() {
    }

    private boolean isInSeekBar(float x, float y) {
    }

    private void positionScrubber(float xPosition) {
    }

    private static int pxToDp(float density, int px) {
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
    }

    private boolean scrubIncrementally(long positionChange) {
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
    }

    @RequiresApi(29)
    private void setSystemGestureExclusionRectsV29(int width, int height) {
    }

    private void startScrubbing(long scrubPosition) {
    }

    private void stopScrubbing(boolean canceled) {
    }

    private void update() {
    }

    private void updateDrawableState() {
    }

    private void updateScrubbing(long scrubPosition) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void addListener(TimeBar.OnScrubListener listener) {
    }

    public /* synthetic */ void b() {
    }

    public /* synthetic */ void d(ValueAnimator valueAnimator) {
    }

    @Override // android.view.View
    public void drawableStateChanged() {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public long getPreferredUpdateDelay() {
    }

    public void hideScrubber(boolean disableScrubberPadding) {
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int action, @Nullable Bundle args) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener listener) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] adGroupTimesMs, @Nullable boolean[] playedAdGroups, int adGroupCount) {
    }

    public void setAdMarkerColor(@ColorInt int adMarkerColor) {
    }

    public void setBufferedColor(@ColorInt int bufferedColor) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setBufferedPosition(long bufferedPosition) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setDuration(long duration) {
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.TimeBar
    public void setEnabled(boolean enabled) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyCountIncrement(int count) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyTimeIncrement(long time) {
    }

    public void setPlayedAdMarkerColor(@ColorInt int playedAdMarkerColor) {
    }

    public void setPlayedColor(@ColorInt int playedColor) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setPosition(long position) {
    }

    public void setScrubberColor(@ColorInt int scrubberColor) {
    }

    public void setUnplayedColor(@ColorInt int unplayedColor) {
    }

    public void showScrubber() {
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs) {
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int layoutDirection) {
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet timebarAttrs) {
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet timebarAttrs, int defStyleRes) {
    }

    public void hideScrubber(long hideAnimationDurationMs) {
    }

    public void showScrubber(long showAnimationDurationMs) {
    }
}
