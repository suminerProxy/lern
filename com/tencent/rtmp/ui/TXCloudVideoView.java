package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCloudVideoView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    private static final int FOCUS_AREA_SIZE_IN_DP = 70;
    private static final String TAG = "TXCloudVideoView";
    private WeakReference<b> mCallback;
    private final DashBoard mDashBoard;
    private final Rect mDashMargin;
    private final a mDelayedTapRunnable;
    private boolean mEnableShowLog;
    private boolean mEnableTouchToFocus;
    private boolean mEnableZoom;
    private FocusIndicatorView mFocusIndicatorView;
    public Object mGLContext;
    private final Runnable mHideIndicatorViewRunnable;
    private float mLastScaleFactor;
    private float mScaleFactor;
    private final ScaleGestureDetector mScaleGestureDetector;
    private SurfaceView mSurfaceView;
    private com.tencent.rtmp.ui.a mTapListener;
    private String mUserId;
    private TextureView mVideoView;
    private com.tencent.rtmp.ui.b mZoomListener;

    /* renamed from: com.tencent.rtmp.ui.TXCloudVideoView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f12938a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f12939d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ TXCloudVideoView f12940e;

        public AnonymousClass1(TXCloudVideoView tXCloudVideoView, float f2, float f3, float f4, float f5) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void onShowLog(boolean z);
    }

    public TXCloudVideoView(Context context) {
    }

    public static /* synthetic */ com.tencent.rtmp.ui.a access$100(TXCloudVideoView tXCloudVideoView) {
    }

    public static /* synthetic */ void access$lambda$0(TXCloudVideoView tXCloudVideoView) {
    }

    private void hideIndicatorView() {
    }

    private boolean isShowLogEnabled() {
    }

    public static /* synthetic */ void lambda$showFocusView$0(TXCloudVideoView tXCloudVideoView, int i2, int i3, int i4, int i5) {
    }

    private static int px2dip(Context context, float f2) {
    }

    private void repositionDashBoard() {
    }

    private void setShowLogCallback(WeakReference<b> weakReference) {
    }

    private void showFocusViewInternal(int i2, int i3, int i4, int i5) {
    }

    public void addVideoView(TextureView textureView) {
    }

    public void clearLastFrame(boolean z) {
    }

    public void clearLog() {
    }

    public void disableLog(boolean z) {
    }

    public TextureView getHWVideoView() {
    }

    public Object getOpenGLContext() {
    }

    public SurfaceView getSurfaceView() {
    }

    public String getUserId() {
    }

    public TextureView getVideoView() {
    }

    public void onDestroy() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void onPause() {
    }

    public void onResume() {
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

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void removeVideoView() {
    }

    public void setDashBoardMarginInPx(int i2, int i3, int i4, int i5) {
    }

    public void setDashBoardMarginInRatio(float f2, float f3, float f4, float f5) {
    }

    public void setLogMargin(float f2, float f3, float f4, float f5) {
    }

    public void setOpenGLContext(Object obj) {
    }

    public void setTouchToFocusEnabled(boolean z, com.tencent.rtmp.ui.a aVar) {
    }

    public void setUserId(String str) {
    }

    public void setZoomEnabled(boolean z, com.tencent.rtmp.ui.b bVar) {
    }

    public void showFocusView(int i2, int i3, int i4, int i5) {
    }

    public void showLog(boolean z) {
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Point f12941a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TXCloudVideoView f12942d;

        private a(TXCloudVideoView tXCloudVideoView) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public /* synthetic */ a(TXCloudVideoView tXCloudVideoView, byte b) {
        }
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView) {
    }
}
