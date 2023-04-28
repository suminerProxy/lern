package com.tencent.liteav.videoproducer.capture.b;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.util.Range;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.p;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.ad;
import com.tencent.liteav.videoproducer.capture.ae;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a implements ad {
    private static final HashMap<String, CameraCharacteristics> b = null;
    private static boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static String f12435d;

    /* renamed from: e  reason: collision with root package name */
    private static String f12436e;
    private final CameraDevice.StateCallback A;
    private final CameraCaptureSession.StateCallback B;
    private final CameraManager.AvailabilityCallback C;
    private final CameraCaptureSession.CaptureCallback D;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12437a;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f12438f;

    /* renamed from: g  reason: collision with root package name */
    private final l f12439g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f12440h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<CameraDevice> f12441i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f12442j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicReference<CameraCaptureSession> f12443k;

    /* renamed from: l  reason: collision with root package name */
    private CaptureRequest f12444l;

    /* renamed from: m  reason: collision with root package name */
    private CaptureRequest.Builder f12445m;

    /* renamed from: n  reason: collision with root package name */
    private p f12446n;

    /* renamed from: o  reason: collision with root package name */
    private Rotation f12447o;

    /* renamed from: p  reason: collision with root package name */
    private SurfaceTexture f12448p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private EnumC0203a u;
    private boolean v;
    private CountDownLatch w;
    private CountDownLatch x;
    private ae y;
    private float z;

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12449a;

        public AnonymousClass1(a aVar) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i2) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12450a;

        public AnonymousClass2(a aVar) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends CameraManager.AvailabilityCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12451a;

        public AnonymousClass3(a aVar) {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull String str) {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class EnumC0203a {

        /* renamed from: a  reason: collision with root package name */
        public static final EnumC0203a f12453a = null;
        public static final EnumC0203a b = null;
        private static final /* synthetic */ EnumC0203a[] c = null;

        private EnumC0203a(String str, int i2) {
        }

        public static EnumC0203a valueOf(String str) {
        }

        public static EnumC0203a[] values() {
        }
    }

    public a(l lVar) {
    }

    public static /* synthetic */ void a(a aVar, boolean z, CameraCaptureSession cameraCaptureSession) {
    }

    public static /* synthetic */ String c(boolean z) {
    }

    public static /* synthetic */ boolean d(a aVar) {
    }

    public static /* synthetic */ AtomicBoolean e(a aVar) {
    }

    public static /* synthetic */ AtomicReference f(a aVar) {
    }

    public static /* synthetic */ boolean g(a aVar) {
    }

    public static /* synthetic */ CaptureRequest.Builder h(a aVar) {
    }

    public static /* synthetic */ l i(a aVar) {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    private List<p> m() {
    }

    private List<int[]> n() {
    }

    private boolean o() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void b(float f2) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final int c() {
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.b.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12452a;

        public AnonymousClass4(a aVar) {
        }

        private static boolean a(CaptureRequest captureRequest) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        }

        private void a(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, boolean z) {
        }

        public static /* synthetic */ void a(@NonNull AnonymousClass4 anonymousClass4, @NonNull CaptureRequest captureRequest, CameraCaptureSession cameraCaptureSession) {
        }

        public static /* synthetic */ void a(@NonNull AnonymousClass4 anonymousClass4, @NonNull TotalCaptureResult totalCaptureResult, @NonNull CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest) {
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z, CameraDevice cameraDevice) {
    }

    public static /* synthetic */ boolean c(a aVar) {
    }

    private CameraCharacteristics i() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final p d() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean e() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean f() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean g() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean h() {
    }

    private static String d(boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean a(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, ae aeVar) {
    }

    private void e(boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final Rotation b() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void b(boolean z) {
    }

    private boolean b(int i2, int i3) {
    }

    public static /* synthetic */ void b(a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(float f2) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean a(int i2, int i3, boolean z) {
    }

    public static /* synthetic */ void a(a aVar) {
    }

    private void a(boolean z, CameraDevice cameraDevice) {
    }

    private void a(boolean z, CameraCaptureSession cameraCaptureSession) {
    }

    private boolean a(SurfaceTexture surfaceTexture) {
    }

    private Range<Integer> a(int i2) {
    }

    public static /* synthetic */ int a(int[] iArr, int[] iArr2) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a() {
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
    }
}
