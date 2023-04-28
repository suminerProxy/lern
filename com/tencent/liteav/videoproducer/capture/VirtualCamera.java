package com.tencent.liteav.videoproducer.capture;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.liteav.base.util.t;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class VirtualCamera extends ar {

    /* renamed from: f  reason: collision with root package name */
    public PixelFrame f12361f;

    /* renamed from: g  reason: collision with root package name */
    private com.tencent.liteav.base.util.t f12362g;

    /* renamed from: h  reason: collision with root package name */
    private VirtualCameraParams f12363h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12364i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12365j;

    /* renamed from: k  reason: collision with root package name */
    private final t.a f12366k;

    /* renamed from: com.tencent.liteav.videoproducer.capture.VirtualCamera$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements t.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VirtualCamera f12367a;

        public AnonymousClass1(VirtualCamera virtualCamera) {
        }

        @Override // com.tencent.liteav.base.util.t.a
        public final void a_() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class VirtualCameraParams extends CaptureSourceInterface.CaptureParams {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f12368a;

        public VirtualCameraParams() {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
        public boolean equals(@Nullable Object obj) {
        }

        @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
        @NonNull
        public String toString() {
        }

        public VirtualCameraParams(VirtualCameraParams virtualCameraParams) {
        }
    }

    public VirtualCamera(@NonNull Looper looper, @NonNull IVideoReporter iVideoReporter) {
    }

    private void e() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ar
    public final void a(CaptureSourceInterface.CaptureParams captureParams) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ar
    public final void b() {
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

    private void a() {
    }
}
