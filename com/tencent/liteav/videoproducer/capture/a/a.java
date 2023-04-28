package com.tencent.liteav.videoproducer.capture.a;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.liteav.base.util.p;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.capture.CameraCaptureParams;
import com.tencent.liteav.videoproducer.capture.ad;
import com.tencent.liteav.videoproducer.capture.ae;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a implements Camera.ErrorCallback, ad {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12369a;
    private Camera b;
    private Rotation c;

    /* renamed from: d  reason: collision with root package name */
    private SurfaceTexture f12370d;

    /* renamed from: e  reason: collision with root package name */
    private p f12371e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12372f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12373g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12374h;

    /* renamed from: i  reason: collision with root package name */
    private int f12375i;

    /* renamed from: j  reason: collision with root package name */
    private ae f12376j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12377k;

    /* renamed from: l  reason: collision with root package name */
    private float f12378l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12379m;

    /* renamed from: n  reason: collision with root package name */
    private float f12380n;

    /* renamed from: o  reason: collision with root package name */
    private ServerVideoProducerConfig f12381o;

    /* renamed from: p  reason: collision with root package name */
    private final Camera.AutoFocusCallback f12382p;

    public static /* synthetic */ void c(boolean z) {
    }

    private Camera.Parameters i() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean a(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, ae aeVar) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void b(boolean z) {
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

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i2, Camera camera) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final int c() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void b(float f2) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final Rotation b() {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final boolean a(int i2, int i3, boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a(float f2) {
    }

    private Rect a(float f2, float f3, float f4) {
    }

    private static int a(Camera.Parameters parameters, float f2) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.ad
    public final void a() {
    }

    private static int a(boolean z, Camera.CameraInfo cameraInfo) {
    }

    private static p a(Camera.Parameters parameters, Rotation rotation, int i2, int i3) {
    }

    private static void a(Camera.Parameters parameters, boolean z) {
    }

    private int a(int i2) {
    }

    private static int[] a(Camera.Parameters parameters, int i2) {
    }

    public static /* synthetic */ int a(int[] iArr, int[] iArr2) {
    }
}
