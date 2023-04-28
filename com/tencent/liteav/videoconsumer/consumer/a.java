package com.tencent.liteav.videoconsumer.consumer;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.e;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a implements e.a, com.tencent.liteav.videoconsumer.renderer.f {

    /* renamed from: a  reason: collision with root package name */
    public com.tencent.liteav.videobase.b.e f12093a;
    public volatile boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public GLConstants.PixelFormatType f12094d;

    /* renamed from: e  reason: collision with root package name */
    public GLConstants.PixelBufferType f12095e;

    /* renamed from: f  reason: collision with root package name */
    public com.tencent.liteav.videobase.videobase.e f12096f;

    /* renamed from: g  reason: collision with root package name */
    public VideoRenderListener f12097g;

    /* renamed from: h  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.j f12098h;

    /* renamed from: i  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.e f12099i;

    /* renamed from: j  reason: collision with root package name */
    public int f12100j;

    /* renamed from: k  reason: collision with root package name */
    public int f12101k;

    /* renamed from: l  reason: collision with root package name */
    public Object f12102l;

    /* renamed from: m  reason: collision with root package name */
    public Rotation f12103m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12104n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final com.tencent.liteav.base.util.b f12105o;

    public a(@NonNull Looper looper) {
    }

    public final void a(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void b(boolean z) {
    }

    @Override // com.tencent.liteav.videobase.videobase.e.a
    public final void onFrameConverted(int i2, PixelFrame pixelFrame) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(VideoRenderListener videoRenderListener) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(boolean z) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(GLConstants.GLScaleType gLScaleType) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(Rotation rotation) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(DisplayTarget displayTarget, boolean z) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(PixelFrame pixelFrame) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.f
    public final void a(TakeSnapshotListener takeSnapshotListener) {
    }

    public final void a() {
    }

    private boolean a(Runnable runnable) {
    }
}
