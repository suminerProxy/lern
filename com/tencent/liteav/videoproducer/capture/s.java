package com.tencent.liteav.videoproducer.capture;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s implements CaptureSourceInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IVideoReporter f12502a;
    @NonNull
    public final Handler b;
    public CaptureSourceInterface.a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12503d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12504e;

    /* renamed from: f  reason: collision with root package name */
    public CameraCaptureParams f12505f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12506g;

    /* renamed from: h  reason: collision with root package name */
    public final CaptureSourceInterface.a f12507h;

    /* renamed from: com.tencent.liteav.videoproducer.capture.s$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements CaptureSourceInterface.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f12508a;

        public AnonymousClass1(s sVar) {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
        public final void a(boolean z) {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
        public final void b(boolean z) {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
        public final void a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
        public final void a() {
        }
    }

    public s(@NonNull IVideoReporter iVideoReporter, @NonNull Looper looper) {
    }

    public final void a(Runnable runnable) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void pause() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void resume() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void start(Object obj, CaptureSourceInterface.CaptureParams captureParams, CaptureSourceInterface.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void stop() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface
    public final void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
    }

    public final void a(int i2, int i3) {
    }

    public final void a(float f2) {
    }
}
