package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.google.android.exoplayer2.video.spherical.OrientationListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    public static final float MAX_PITCH_DEGREES = 45.0f;
    private final PointF accumulatedTouchOffsetDegrees;
    private final GestureDetector gestureDetector;
    private final Listener listener;
    private final PointF previousTouchPointPx;
    private final float pxPerDegrees;
    private volatile float roll;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onScrollChange(PointF scrollOffsetDegrees);

        boolean onSingleTapUp(MotionEvent event);
    }

    public TouchTracker(Context context, Listener listener, float pxPerDegrees) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e2) {
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    @BinderThread
    public void onOrientationChange(float[] deviceOrientationMatrix, float roll) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e2) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
    }
}
