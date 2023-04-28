package com.tai.danmuku.danmu.widget;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import h.w.a.e.a.c;
import h.w.a.e.a.f;
import h.w.a.e.a.g;
import h.w.a.e.b.b.d;
import h.w.a.e.b.b.m;
import h.w.a.e.d.a;
import java.util.LinkedList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DanmakuSurfaceView extends SurfaceView implements f, g, SurfaceHolder.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final String f7787p = "DanmakuSurfaceView";
    private static final int q = 50;
    private static final int r = 1000;
    private c.d b;
    private SurfaceHolder c;

    /* renamed from: d  reason: collision with root package name */
    private HandlerThread f7788d;

    /* renamed from: e  reason: collision with root package name */
    private c f7789e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7790f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7791g;

    /* renamed from: h  reason: collision with root package name */
    private f.a f7792h;

    /* renamed from: i  reason: collision with root package name */
    private float f7793i;

    /* renamed from: j  reason: collision with root package name */
    private float f7794j;

    /* renamed from: k  reason: collision with root package name */
    private a f7795k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7796l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7797m;

    /* renamed from: n  reason: collision with root package name */
    public int f7798n;

    /* renamed from: o  reason: collision with root package name */
    private LinkedList<Long> f7799o;

    public DanmakuSurfaceView(Context context) {
    }

    private float a() {
    }

    private void d() {
    }

    private void m() {
    }

    private synchronized void o() {
    }

    @Override // h.w.a.e.a.f
    public void addDanmaku(d dVar) {
    }

    public synchronized Looper c(int i2) {
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

    @Override // h.w.a.e.a.f
    public f.a getOnDanmakuClickListener() {
    }

    @Override // h.w.a.e.a.f
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

    public void n() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // h.w.a.e.a.f
    public void pause() {
    }

    @Override // h.w.a.e.a.f
    public void prepare(h.w.a.e.b.c.a aVar, h.w.a.e.b.b.s.d dVar) {
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

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
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

    public DanmakuSurfaceView(Context context, AttributeSet attributeSet) {
    }

    public DanmakuSurfaceView(Context context, AttributeSet attributeSet, int i2) {
    }
}
