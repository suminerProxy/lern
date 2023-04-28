package com.showstartfans.activity.crop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import h.u.a.f.b.f;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GestureCropImageView extends CropImageView {
    private static final int Q = 200;
    private ScaleGestureDetector H;
    private f I;
    private b J;
    private GestureDetector K;
    private float L;
    private float M;
    private boolean N;
    private boolean O;
    private int P;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        private TouchOverlayView b;
        public final /* synthetic */ GestureCropImageView c;

        private b(GestureCropImageView gestureCropImageView) {
        }

        public boolean a(MotionEvent motionEvent) {
        }

        public void b(TouchOverlayView touchOverlayView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }

        public /* synthetic */ b(GestureCropImageView gestureCropImageView, a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends f.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GestureCropImageView f6512a;

        private c(GestureCropImageView gestureCropImageView) {
        }

        @Override // h.u.a.f.b.f.b, h.u.a.f.b.f.a
        public boolean a(f fVar) {
        }

        public /* synthetic */ c(GestureCropImageView gestureCropImageView, a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public final /* synthetic */ GestureCropImageView b;

        private d(GestureCropImageView gestureCropImageView) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        }

        public /* synthetic */ d(GestureCropImageView gestureCropImageView, a aVar) {
        }
    }

    public GestureCropImageView(Context context) {
    }

    public static /* synthetic */ float C(GestureCropImageView gestureCropImageView) {
    }

    public static /* synthetic */ float D(GestureCropImageView gestureCropImageView) {
    }

    private void G() {
    }

    public boolean E() {
    }

    public boolean F() {
    }

    @Override // com.showstartfans.activity.crop.view.TransformImageView
    public void f() {
    }

    public int getDoubleTapScaleSteps() {
    }

    public float getDoubleTapTargetScale() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setDoubleTapScaleSteps(int i2) {
    }

    public void setInnerGestureListener(TouchOverlayView touchOverlayView) {
    }

    public void setRotateEnabled(boolean z) {
    }

    public void setScaleEnabled(boolean z) {
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i2) {
    }
}
