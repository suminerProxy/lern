package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0202a f12290a;
    public Surface b;
    public SurfaceTexture c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final com.tencent.liteav.base.util.p f12291d;

    /* renamed from: e  reason: collision with root package name */
    public DisplayTarget f12292e;

    /* renamed from: f  reason: collision with root package name */
    private final b f12293f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final com.tencent.liteav.base.util.b f12294g;

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface InterfaceC0202a {
        void a();

        void a(Surface surface, int i2, int i3, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12295a;

        private b(a aVar) {
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

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        public /* synthetic */ b(a aVar, byte b) {
        }
    }

    public a(InterfaceC0202a interfaceC0202a) {
    }

    public final boolean a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(DisplayTarget displayTarget) {
    }

    public final void a(SurfaceView surfaceView) {
    }

    public final void a(TextureView textureView) {
    }

    public final void a(Surface surface) {
    }

    public final void a(int i2, int i3) {
    }

    public static /* synthetic */ void a(a aVar, SurfaceTexture surfaceTexture, int i2, int i3) {
    }
}
