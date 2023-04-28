package com.tencent.liteav.txcvodplayer.renderer;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcvodplayer.renderer.a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SurfaceRenderView extends SurfaceView implements com.tencent.liteav.txcvodplayer.renderer.a {

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.renderer.b f11813a;
    private b b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        public SurfaceHolder f11815a;
        public boolean b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f11816d;

        /* renamed from: e  reason: collision with root package name */
        public WeakReference<SurfaceRenderView> f11817e;

        /* renamed from: f  reason: collision with root package name */
        public Map<a.InterfaceC0199a, Object> f11818f;

        /* renamed from: g  reason: collision with root package name */
        private int f11819g;

        public b(SurfaceRenderView surfaceRenderView) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    public SurfaceRenderView(Context context) {
    }

    private void b() {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(int i2, int i3) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final boolean a() {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public View getView() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setAspectRatio(int i2) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setVideoRotation(int i2) {
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private SurfaceRenderView f11814a;
        private SurfaceHolder b;

        public a(SurfaceRenderView surfaceRenderView, SurfaceHolder surfaceHolder) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final void a(ITXVCubePlayer iTXVCubePlayer) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface b() {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final Surface c() {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        public final com.tencent.liteav.txcvodplayer.renderer.a a() {
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(a.InterfaceC0199a interfaceC0199a) {
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(int i2, int i3) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(a.InterfaceC0199a interfaceC0199a) {
    }
}
