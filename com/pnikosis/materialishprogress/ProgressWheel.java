package com.pnikosis.materialishprogress;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ProgressWheel extends View {
    private static final String TAG = null;
    private int barColor;
    private float barExtraLength;
    private boolean barGrowingFromFront;
    private final int barLength;
    private final int barMaxLength;
    private Paint barPaint;
    private double barSpinCycleTime;
    private int barWidth;
    private ProgressCallback callback;
    private RectF circleBounds;
    private int circleRadius;
    private boolean fillRadius;
    private boolean isSpinning;
    private long lastTimeAnimated;
    private boolean linearProgress;
    private float mProgress;
    private float mTargetProgress;
    private final long pauseGrowingTime;
    private long pausedTimeWithoutGrowing;
    private int rimColor;
    private Paint rimPaint;
    private int rimWidth;
    private boolean shouldAnimate;
    private float spinSpeed;
    private double timeStartGrowing;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ProgressCallback {
        void onProgressUpdate(float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = null;
        public int barColor;
        public int barWidth;
        public int circleRadius;
        public boolean fillRadius;
        public boolean isSpinning;
        public boolean linearProgress;
        public float mProgress;
        public float mTargetProgress;
        public int rimColor;
        public int rimWidth;
        public float spinSpeed;

        /* renamed from: com.pnikosis.materialishprogress.ProgressWheel$WheelSavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Parcelable.Creator<WheelSavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ WheelSavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ WheelSavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WheelSavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WheelSavedState[] newArray(int i2) {
            }
        }

        public /* synthetic */ WheelSavedState(Parcel parcel, AnonymousClass1 anonymousClass1) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public WheelSavedState(Parcelable parcelable) {
        }

        private WheelSavedState(Parcel parcel) {
        }
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
    }

    private void parseAttributes(TypedArray typedArray) {
    }

    private void runCallback(float f2) {
    }

    @TargetApi(17)
    private void setAnimationEnabled() {
    }

    private void setupBounds(int i2, int i3) {
    }

    private void setupPaints() {
    }

    private void updateBarLength(long j2) {
    }

    public int getBarColor() {
    }

    public int getBarWidth() {
    }

    public int getCircleRadius() {
    }

    public float getProgress() {
    }

    public int getRimColor() {
    }

    public int getRimWidth() {
    }

    public float getSpinSpeed() {
    }

    public boolean isSpinning() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
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
    public void onVisibilityChanged(View view, int i2) {
    }

    public void resetCount() {
    }

    public void setBarColor(int i2) {
    }

    public void setBarWidth(int i2) {
    }

    public void setCallback(ProgressCallback progressCallback) {
    }

    public void setCircleRadius(int i2) {
    }

    public void setInstantProgress(float f2) {
    }

    public void setLinearProgress(boolean z) {
    }

    public void setProgress(float f2) {
    }

    public void setRimColor(int i2) {
    }

    public void setRimWidth(int i2) {
    }

    public void setSpinSpeed(float f2) {
    }

    public void spin() {
    }

    public void stopSpinning() {
    }

    private void runCallback() {
    }

    public ProgressWheel(Context context) {
    }
}
