package com.tencent.youtu.ytagreflectlivecheck;

import android.content.Context;
import android.hardware.Camera;
import android.os.CountDownTimer;
import com.tencent.cloud.huiyansdkface.facelight.b.b.d;
import com.tencent.cloud.huiyansdkface.facelight.net.model.request.actlight.LiveStyleReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawYuvData;
import java.util.concurrent.locks.Lock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class YTAGReflectLiveCheckInterface {

    /* renamed from: a  reason: collision with root package name */
    public static com.tencent.cloud.huiyansdkface.facelight.process.b.a f14509a = null;
    public static String b = null;
    private static final String c = "YTAGReflectLiveCheckInterface";

    /* renamed from: d  reason: collision with root package name */
    private static int f14510d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static int f14511e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static int f14512f = 2;

    /* renamed from: g  reason: collision with root package name */
    private static int f14513g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static int f14514h = 4;

    /* renamed from: i  reason: collision with root package name */
    private static int f14515i;

    /* renamed from: j  reason: collision with root package name */
    private static Lock f14516j;

    /* renamed from: k  reason: collision with root package name */
    private static b f14517k;

    /* renamed from: l  reason: collision with root package name */
    private static int f14518l;

    /* renamed from: m  reason: collision with root package name */
    private static CountDownTimer f14519m;

    /* renamed from: n  reason: collision with root package name */
    private static c f14520n;

    /* renamed from: o  reason: collision with root package name */
    private static a f14521o;

    /* renamed from: p  reason: collision with root package name */
    private static int f14522p;
    private static Camera q;
    private static int r;
    private static String s;
    private static int t;

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements d.b {
        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.d.b
        public void a(float f2) {
        }
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 extends CountDownTimer {
        public AnonymousClass2(long j2, long j3) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(int i2, String str, String str2);

        void a(LiveStyleReq liveStyleReq);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        float a();

        void a(int i2, float f2);

        void a(long j2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface c {
        void a(int i2, String str, String str2);

        void a(FullPack fullPack);
    }

    public static /* synthetic */ int a() {
    }

    public static /* synthetic */ CountDownTimer a(CountDownTimer countDownTimer) {
    }

    public static /* synthetic */ a a(a aVar) {
    }

    public static /* synthetic */ String b() {
    }

    public static /* synthetic */ int c() {
    }

    public static void cancel() {
    }

    public static /* synthetic */ CountDownTimer d() {
    }

    public static /* synthetic */ a e() {
    }

    public static int getLiveCheckType(Context context, a aVar) {
    }

    public static RawYuvData[] getRawYuvDatas() {
    }

    public static b getReflectListener() {
    }

    public static synchronized int initModel(String str) {
    }

    public static void onCameraChanged(int i2) {
    }

    public static int[] onFetchCameraInfo() {
    }

    public static void onFinish() {
    }

    public static void onScreenChanged(int i2, int i3, int i4, int i5, float f2) {
    }

    public static void onStateChanged(int i2) {
    }

    public static void pushImageData(byte[] bArr, int i2, int i3, long j2, int i4, float[] fArr, float f2, float f3, float f4) {
    }

    public static synchronized void releaseModel() {
    }

    public static void setReflectListener(b bVar) {
    }

    public static void setReflectNotice(com.tencent.cloud.huiyansdkface.facelight.process.b.a aVar) {
    }

    public static void setSafetyLevel(int i2) {
    }

    public static void setupConfig(String str, String str2) {
    }

    public static void start(Context context, Camera camera, int i2, String str, c cVar) {
    }
}
