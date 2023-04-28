package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AutoRotateDrawable extends ForwardingDrawable implements Runnable, CloneableDrawable {
    private static final int DEGREES_IN_FULL_ROTATION = 360;
    private static final int FRAME_INTERVAL_MS = 20;
    private boolean mClockwise;
    private int mInterval;
    private boolean mIsScheduled;
    @VisibleForTesting
    public float mRotationAngle;

    public AutoRotateDrawable(Drawable drawable, int interval) {
    }

    private int getIncrement() {
    }

    private void scheduleNextFrame() {
    }

    @Override // com.facebook.drawee.drawable.CloneableDrawable
    public /* bridge */ /* synthetic */ Drawable cloneDrawable() {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public void reset() {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void setClockwise(boolean clockwise) {
    }

    public AutoRotateDrawable(Drawable drawable, int interval, boolean clockwise) {
    }

    @Override // com.facebook.drawee.drawable.CloneableDrawable
    public AutoRotateDrawable cloneDrawable() {
    }
}
