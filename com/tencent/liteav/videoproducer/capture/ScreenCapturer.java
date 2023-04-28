package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.projection.MediaProjection;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.liteav.base.util.t;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.bd;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ScreenCapturer extends ar implements SurfaceTexture.OnFrameAvailableListener, t.a, bd.b {

    /* renamed from: f  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.l f12348f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f12349g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    private final IVideoReporter f12350h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    private final com.tencent.liteav.base.util.b f12351i;

    /* renamed from: j  reason: collision with root package name */
    private int f12352j;

    /* renamed from: k  reason: collision with root package name */
    private int f12353k;

    /* renamed from: l  reason: collision with root package name */
    private ScreenCaptureParams f12354l;

    /* renamed from: m  reason: collision with root package name */
    private int f12355m;

    /* renamed from: n  reason: collision with root package name */
    private SurfaceTexture f12356n;

    /* renamed from: o  reason: collision with root package name */
    private Surface f12357o;

    /* renamed from: p  reason: collision with root package name */
    private PixelFrame f12358p;
    private com.tencent.liteav.videobase.frame.j q;
    private int r;
    private int s;
    private boolean t;
    private com.tencent.liteav.videobase.utils.h u;
    private com.tencent.liteav.base.util.t v;
    private boolean w;
    private MediaProjection x;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ScreenCaptureParams extends CaptureSourceInterface.CaptureParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12359a;

        /* renamed from: f  reason: collision with root package name */
        public MediaProjection f12360f;

        public ScreenCaptureParams() {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
        public boolean equals(@Nullable Object obj) {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
        @NonNull
        public String toString() {
        }

        public ScreenCaptureParams(ScreenCaptureParams screenCaptureParams) {
        }
    }

    public ScreenCapturer(@NonNull Context context, @NonNull Looper looper, @NonNull IVideoReporter iVideoReporter) {
    }

    public static /* synthetic */ void c(ScreenCapturer screenCapturer) {
    }

    public static /* synthetic */ void d(ScreenCapturer screenCapturer) {
    }

    private void f() {
    }

    private void g() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ar
    public final void a(CaptureSourceInterface.CaptureParams captureParams) {
    }

    @Override // com.tencent.liteav.base.util.t.a
    public final void a_() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ar
    public final void b() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.bd.b
    public final void e() {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void pause() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void resume() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
    }

    public static /* synthetic */ void b(ScreenCapturer screenCapturer) {
    }

    public static /* synthetic */ void a(ScreenCapturer screenCapturer, CaptureSourceInterface.CaptureParams captureParams) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.bd.b
    public final void a(boolean z, boolean z2) {
    }

    public static /* synthetic */ void a(ScreenCapturer screenCapturer, boolean z, boolean z2) {
    }

    public static /* synthetic */ void a(ScreenCapturer screenCapturer) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.bd.b
    public final void a(boolean z) {
    }

    public static /* synthetic */ void a(ScreenCapturer screenCapturer, boolean z) {
    }
}
