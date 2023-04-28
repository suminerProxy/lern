package com.tai.danmuku.danmu.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import h.w.a.e.a.c;
import h.w.a.e.a.f;
import h.w.a.e.a.g;
import h.w.a.e.b.b.d;
import h.w.a.e.b.b.m;
import java.util.LinkedList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DanmakuView extends View implements f, g {
    private static final int MAX_RECORD_SIZE = 50;
    private static final int ONE_SECOND = 1000;
    public static final String TAG = "DanmakuView";
    public volatile c handler;
    private boolean isSurfaceCreated;
    private c.d mCallback;
    public boolean mClearFlag;
    private boolean mDanmakuVisible;
    private boolean mDrawFinished;
    private Object mDrawMonitor;
    private LinkedList<Long> mDrawTimes;
    public int mDrawingThreadType;
    private boolean mEnableDanmakuDrwaingCache;
    private HandlerThread mHandlerThread;
    private View.OnClickListener mOnClickListener;
    private f.a mOnDanmakuClickListener;
    public boolean mRequestRender;
    private Runnable mResumeRunnable;
    private int mResumeTryCount;
    private boolean mShowFps;
    private h.w.a.e.d.a mTouchHelper;
    private long mUiThreadId;
    private float mXOff;
    private float mYOff;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ DanmakuView b;

        public a(DanmakuView danmakuView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public DanmakuView(Context context) {
    }

    public static /* synthetic */ int access$000(DanmakuView danmakuView) {
    }

    public static /* synthetic */ int access$008(DanmakuView danmakuView) {
    }

    public static /* synthetic */ boolean access$101(DanmakuView danmakuView) {
    }

    private float fps() {
    }

    private void init() {
    }

    private void lockCanvasAndClear() {
    }

    @SuppressLint({"NewApi"})
    private void postInvalidateCompat() {
    }

    private void prepare() {
    }

    private synchronized void stopDraw() {
    }

    private void unlockCanvasAndPost() {
    }

    @Override // h.w.a.e.a.f
    public void addDanmaku(d dVar) {
    }

    @Override // h.w.a.e.a.g
    public void clear() {
    }

    @Override // h.w.a.e.a.f
    public void clearDanmakusOnScreen() {
    }

    @Override // h.w.a.e.a.g
    public long drawDanmakus() {
    }

    @Override // h.w.a.e.a.f
    public void enableDanmakuDrawingCache(boolean z) {
    }

    @Override // h.w.a.e.a.f
    public void forceRender() {
    }

    @Override // h.w.a.e.a.f
    public h.w.a.e.b.b.s.d getConfig() {
    }

    @Override // h.w.a.e.a.f
    public long getCurrentTime() {
    }

    @Override // h.w.a.e.a.f
    public m getCurrentVisibleDanmakus() {
    }

    public synchronized Looper getLooper(int i2) {
    }

    @Override // h.w.a.e.a.f
    public f.a getOnDanmakuClickListener() {
    }

    public View getView() {
    }

    @Override // h.w.a.e.a.g
    public int getViewHeight() {
    }

    @Override // h.w.a.e.a.g
    public int getViewWidth() {
    }

    @Override // h.w.a.e.a.f
    public float getXOff() {
    }

    @Override // h.w.a.e.a.f
    public float getYOff() {
    }

    @Override // h.w.a.e.a.f
    public void hide() {
    }

    @Override // h.w.a.e.a.f
    public long hideAndPauseDrawTask() {
    }

    @Override // h.w.a.e.a.f
    public void invalidateDanmaku(d dVar, boolean z) {
    }

    @Override // h.w.a.e.a.f, h.w.a.e.a.g
    public boolean isDanmakuDrawingCacheEnabled() {
    }

    @Override // android.view.View, h.w.a.e.a.f, h.w.a.e.a.g
    @SuppressLint({"NewApi"})
    public boolean isHardwareAccelerated() {
    }

    @Override // h.w.a.e.a.f
    public boolean isPaused() {
    }

    @Override // h.w.a.e.a.f
    public boolean isPrepared() {
    }

    @Override // android.view.View, h.w.a.e.a.f
    public boolean isShown() {
    }

    @Override // h.w.a.e.a.g
    public boolean isViewReady() {
    }

    public void lockCanvas() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // h.w.a.e.a.f
    public void pause() {
    }

    @Override // h.w.a.e.a.f
    public void release() {
    }

    @Override // h.w.a.e.a.f
    public void removeAllDanmakus(boolean z) {
    }

    @Override // h.w.a.e.a.f
    public void removeAllLiveDanmakus() {
    }

    public void restart() {
    }

    @Override // h.w.a.e.a.f
    public void resume() {
    }

    @Override // h.w.a.e.a.f
    public void seekTo(Long l2) {
    }

    @Override // h.w.a.e.a.f
    public void setCallback(c.d dVar) {
    }

    @Override // h.w.a.e.a.f
    public void setDrawingThreadType(int i2) {
    }

    @Override // h.w.a.e.a.f
    public void setOnDanmakuClickListener(f.a aVar) {
    }

    @Override // h.w.a.e.a.f
    public void show() {
    }

    @Override // h.w.a.e.a.f
    public void showAndResumeDrawTask(Long l2) {
    }

    @Override // h.w.a.e.a.f
    public void showFPS(boolean z) {
    }

    @Override // h.w.a.e.a.f
    public void start() {
    }

    @Override // h.w.a.e.a.f
    public void stop() {
    }

    @Override // h.w.a.e.a.f
    public void toggle() {
    }

    @Override // h.w.a.e.a.f
    public void setOnDanmakuClickListener(f.a aVar, float f2, float f3) {
    }

    @Override // h.w.a.e.a.f
    public void start(long j2) {
    }

    @Override // h.w.a.e.a.f
    public void prepare(h.w.a.e.b.c.a aVar, h.w.a.e.b.b.s.d dVar) {
    }

    public DanmakuView(Context context, AttributeSet attributeSet) {
    }

    public DanmakuView(Context context, AttributeSet attributeSet, int i2) {
    }
}
