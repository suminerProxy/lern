package com.tencent.liteav.videoproducer.capture;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ar implements CaptureSourceInterface {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final Handler f12422a;
    @NonNull
    public final IVideoReporter b;
    public com.tencent.liteav.videobase.b.e c;

    /* renamed from: d  reason: collision with root package name */
    public CaptureSourceInterface.a f12423d;

    /* renamed from: e  reason: collision with root package name */
    public com.tencent.liteav.videobase.frame.e f12424e;

    public ar(@NonNull Looper looper, @NonNull IVideoReporter iVideoReporter) {
    }

    public static /* synthetic */ void a(ar arVar, CaptureSourceInterface.a aVar, Object obj, CaptureSourceInterface.CaptureParams captureParams) {
    }

    public abstract void a(CaptureSourceInterface.CaptureParams captureParams);

    public abstract void b();

    public final boolean c() {
    }

    public final void d() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public void stop() {
    }

    public static /* synthetic */ void a(ar arVar) {
    }

    public final void a(Runnable runnable) {
    }
}
