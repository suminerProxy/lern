package com.tencent.liteav.txcvodplayer.renderer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcvodplayer.renderer.a;
import java.lang.ref.WeakReference;
import java.util.Map;

@TargetApi(14)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TextureRenderView extends TextureView implements com.tencent.liteav.txcvodplayer.renderer.a {

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.renderer.b f11820a;
    private b b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements TextureView.SurfaceTextureListener, com.tencent.liteav.txcplayer.c {

        /* renamed from: a  reason: collision with root package name */
        public SurfaceTexture f11823a;
        public boolean b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f11824d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11825e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11826f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11827g;

        /* renamed from: h  reason: collision with root package name */
        public WeakReference<TextureRenderView> f11828h;

        /* renamed from: i  reason: collision with root package name */
        public Map<a.InterfaceC0199a, Object> f11829i;

        public b(TextureRenderView textureRenderView) {
        }

        public static /* synthetic */ SurfaceTexture a(b bVar) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.tencent.liteav.txcplayer.c
        public final void a(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureRenderView(Context context) {
    }

    public static /* synthetic */ b a(TextureRenderView textureRenderView) {
    }

    private void b() {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final boolean a() {
    }

    public a.b getSurfaceHolder() {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public View getView() {
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setAspectRatio(int i2) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public void setVideoRotation(int i2) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(int i2, int i3) {
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void a(a.InterfaceC0199a interfaceC0199a) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(int i2, int i3) {
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.a
    public final void b(a.InterfaceC0199a interfaceC0199a) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private TextureRenderView f11821a;
        private SurfaceTexture b;
        private com.tencent.liteav.txcplayer.c c;

        /* renamed from: d  reason: collision with root package name */
        private Surface f11822d;

        public a(TextureRenderView textureRenderView, SurfaceTexture surfaceTexture, com.tencent.liteav.txcplayer.c cVar) {
        }

        @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
        @TargetApi(16)
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
}
