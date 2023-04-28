package com.tencent.qcloud.tuikit.tuichat.component.photoview.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import com.tencent.qcloud.tuikit.tuichat.component.photoview.listener.OnGestureListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomGestureDetector {
    private static final int INVALID_POINTER_ID = -1;
    private int mActivePointerId;
    private int mActivePointerIndex;
    private final ScaleGestureDetector mDetector;
    private boolean mIsDragging;
    private float mLastTouchX;
    private float mLastTouchY;
    private OnGestureListener mListener;
    private final float mMinimumVelocity;
    private final float mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.photoview.view.CustomGestureDetector$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ScaleGestureDetector.OnScaleGestureListener {
        public final /* synthetic */ CustomGestureDetector this$0;

        public AnonymousClass1(CustomGestureDetector customGestureDetector) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public CustomGestureDetector(Context context, OnGestureListener onGestureListener) {
    }

    public static /* synthetic */ OnGestureListener access$000(CustomGestureDetector customGestureDetector) {
    }

    private float getActiveX(MotionEvent motionEvent) {
    }

    private float getActiveY(MotionEvent motionEvent) {
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
    }

    public boolean isDragging() {
    }

    public boolean isScaling() {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
    }
}
