package com.tencent.liteav.videoconsumer.renderer;

import android.os.Looper;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.renderer.a;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h implements a.InterfaceC0202a, f {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final IVideoReporter f12309a;
    @NonNull
    public final a b;
    public DisplayTarget c;

    /* renamed from: d  reason: collision with root package name */
    public Surface f12310d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final com.tencent.liteav.base.util.p f12311e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12312f;

    /* renamed from: g  reason: collision with root package name */
    public Object f12313g;

    /* renamed from: h  reason: collision with root package name */
    public com.tencent.liteav.videobase.b.e f12314h;

    /* renamed from: i  reason: collision with root package name */
    public final com.tencent.liteav.videobase.frame.c f12315i;

    /* renamed from: j  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.j f12316j;

    /* renamed from: k  reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.k f12317k;

    /* renamed from: l  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.e f12318l;

    /* renamed from: m  reason: collision with root package name */
    public GLConstants.GLScaleType f12319m;

    /* renamed from: n  reason: collision with root package name */
    public Rotation f12320n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12321o;

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f12322p;
    public boolean q;
    public TakeSnapshotListener r;
    public ExecutorService s;
    public VideoRenderListener t;
    public boolean u;
    @NonNull
    private final com.tencent.liteav.base.util.b v;

    public h(@NonNull Looper looper, @NonNull IVideoReporter iVideoReporter) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(VideoRenderListener videoRenderListener) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void b(boolean z) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(boolean z) {
    }

    public final void b() {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(DisplayTarget displayTarget, boolean z) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(TakeSnapshotListener takeSnapshotListener) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(GLConstants.GLScaleType gLScaleType) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(Rotation rotation) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(PixelFrame pixelFrame) {
    }

    private void a(Runnable runnable) {
    }

    public final void a(PixelFrame pixelFrame, com.tencent.liteav.videobase.frame.d dVar, boolean z, Rotation rotation, GLConstants.GLScaleType gLScaleType) {
    }

    public final void b(Surface surface, int i2, int i3, boolean z) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.a.InterfaceC0202a
    public final void a(Surface surface, int i2, int i3, boolean z) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.a.InterfaceC0202a
    public final void a() {
    }
}
