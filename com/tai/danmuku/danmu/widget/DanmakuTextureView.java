package com.tai.danmuku.danmu.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import h.w.a.e.a.c;
import h.w.a.e.a.f;
import h.w.a.e.a.g;
import h.w.a.e.b.b.d;
import h.w.a.e.b.b.m;
import h.w.a.e.d.a;
import java.util.LinkedList;

@SuppressLint({"NewApi"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DanmakuTextureView extends TextureView implements f, g, TextureView.SurfaceTextureListener {

    /* renamed from: o  reason: collision with root package name */
    public static final String f7800o = "DanmakuTextureView";

    /* renamed from: p  reason: collision with root package name */
    private static final int f7801p = 50;
    private static final int q = 1000;
    private c.d b;
    private HandlerThread c;

    /* renamed from: d  reason: collision with root package name */
    private c f7802d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7803e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7804f;

    /* renamed from: g  reason: collision with root package name */
    private f.a f7805g;

    /* renamed from: h  reason: collision with root package name */
    private float f7806h;

    /* renamed from: i  reason: collision with root package name */
    private float f7807i;

    /* renamed from: j  reason: collision with root package name */
    private a f7808j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7809k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7810l;

    /* renamed from: m  reason: collision with root package name */
    public int f7811m;

    /* renamed from: n  reason: collision with root package name */
    private LinkedList<Long> f7812n;

    public DanmakuTextureView(Context context) {
    }

    private float a() {
    }

    @TargetApi(11)
    private void c() {
    }

    private void d() {
    }

    private synchronized void f() {
    }

    @Override // h.w.a.e.a.f
    public void addDanmaku(d dVar) {
    }

    public synchronized Looper b(int i2) {
    }

    @Override // h.w.a.e.a.g
    public synchronized void clear() {
    }

    @Override // h.w.a.e.a.f
    public void clearDanmakusOnScreen() {
    }

    @Override // h.w.a.e.a.g
    public synchronized long drawDanmakus() {
    }

    public void e() {
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

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public synchronized boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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

    @Override // h.w.a.e.a.f
    public void toggle() {
    }

    @Override // h.w.a.e.a.f
    public void setOnDanmakuClickListener(f.a aVar, float f2, float f3) {
    }

    @Override // h.w.a.e.a.f
    public void start(long j2) {
    }

    public DanmakuTextureView(Context context, AttributeSet attributeSet) {
    }

    public DanmakuTextureView(Context context, AttributeSet attributeSet, int i2) {
    }
}
