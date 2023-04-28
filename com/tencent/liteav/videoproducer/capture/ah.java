package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.capture.VirtualCamera;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ah implements CaptureSourceInterface {

    /* renamed from: a  reason: collision with root package name */
    public VirtualCamera f12394a;
    public VirtualCamera.VirtualCameraParams b;
    public CaptureSourceInterface c;

    /* renamed from: d  reason: collision with root package name */
    public CaptureSourceInterface.CaptureParams f12395d;

    /* renamed from: e  reason: collision with root package name */
    public CaptureSourceInterface.a f12396e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f12397f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f12398g;

    /* renamed from: h  reason: collision with root package name */
    public final IVideoReporter f12399h;

    /* renamed from: i  reason: collision with root package name */
    public Object f12400i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12401j;

    /* renamed from: k  reason: collision with root package name */
    public a f12402k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12403l;

    /* renamed from: m  reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.g f12404m;

    /* renamed from: n  reason: collision with root package name */
    public final CaptureSourceInterface.a f12405n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final com.tencent.liteav.base.util.b f12406o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12408a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a[] f12409d = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public ah(@NonNull Context context, @NonNull Looper looper, @NonNull IVideoReporter iVideoReporter) {
    }

    public final void a(Bitmap bitmap, int i2, int i3, int i4) {
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

    /* renamed from: com.tencent.liteav.videoproducer.capture.ah$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements CaptureSourceInterface.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ah f12407a;

        public AnonymousClass1(ah ahVar) {
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

    public static /* synthetic */ void a(ah ahVar) {
    }

    public final void a(Runnable runnable) {
    }
}
