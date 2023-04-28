package com.tencent.cloud.huiyansdkface.facelight.process;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.tencent.cloud.huiyansdkface.facelight.b.b.c;
import com.tencent.cloud.huiyansdkface.facelight.process.b;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private long F;
    private long G;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private long P;
    private b.a Q;
    private String R;
    private com.tencent.cloud.huiyansdkface.facelight.a.a.b S;

    /* renamed from: a  reason: collision with root package name */
    public com.tencent.cloud.huiyansdkface.facelight.ui.a.d f10298a;
    private YTFaceTracker b;
    private YTFaceTracker.TrackedFace[] c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f10299d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f10300e;

    /* renamed from: f  reason: collision with root package name */
    private Context f10301f;

    /* renamed from: g  reason: collision with root package name */
    private d f10302g;

    /* renamed from: h  reason: collision with root package name */
    private FaceVerifyStatus f10303h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f10304i;

    /* renamed from: j  reason: collision with root package name */
    private float f10305j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10306k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10307l;

    /* renamed from: m  reason: collision with root package name */
    private int f10308m;

    /* renamed from: n  reason: collision with root package name */
    private int f10309n;

    /* renamed from: o  reason: collision with root package name */
    private long f10310o;

    /* renamed from: p  reason: collision with root package name */
    private String f10311p;
    private com.tencent.cloud.huiyansdkface.facelight.process.b.b q;
    private int r;
    private int s;
    private int t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10312a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC01731 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f10313a;
            public final /* synthetic */ AnonymousClass1 b;

            /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C01741 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ RunnableC01731 f10314a;

                public C01741(RunnableC01731 runnableC01731, long j2, long j3) {
                }

                @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
                public void a() {
                }

                @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
                public void a(long j2) {
                }
            }

            public RunnableC01731(AnonymousClass1 anonymousClass1, int i2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f10315a;

            public AnonymousClass2(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(a aVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.a
        @WorkerThread
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.a
        @WorkerThread
        public void a(int i2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.a
        @WorkerThread
        public void a(int i2, String str, String str2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.a
        @WorkerThread
        public void a(byte[][] bArr, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10316a;
        public final /* synthetic */ a b;

        public AnonymousClass10(a aVar, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10317a;

        public AnonymousClass11(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10318a;

        public AnonymousClass12(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10319a;

        public AnonymousClass2(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements Callable<YTActRefData> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.a.a.b f10320a;
        public final /* synthetic */ a b;

        public AnonymousClass3(a aVar, com.tencent.cloud.huiyansdkface.facelight.a.a.b bVar) {
        }

        public YTActRefData a() {
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ YTActRefData call() throws Exception {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements c.a<YTActRefData> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.process.b.d f10321a;
        public final /* synthetic */ a b;

        public AnonymousClass4(a aVar, com.tencent.cloud.huiyansdkface.facelight.process.b.d dVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(YTActRefData yTActRefData) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.c.a
        public /* bridge */ /* synthetic */ void a(YTActRefData yTActRefData) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements Callable<com.tencent.cloud.huiyansdkface.facelight.a.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f10322a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f10323d;

        public AnonymousClass5(a aVar, byte[] bArr, int i2, int i3) {
        }

        public com.tencent.cloud.huiyansdkface.facelight.a.a.b a() {
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.a.a.b call() throws Exception {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements c.a<com.tencent.cloud.huiyansdkface.facelight.a.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10324a;

        public AnonymousClass6(a aVar) {
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.tencent.cloud.huiyansdkface.facelight.a.a.b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.c.a
        public /* bridge */ /* synthetic */ void a(com.tencent.cloud.huiyansdkface.facelight.a.a.b bVar) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ YTFaceTracker.TrackedFace[] f10325a;
        public final /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.a.a.b b;
        public final /* synthetic */ a c;

        public AnonymousClass7(a aVar, YTFaceTracker.TrackedFace[] trackedFaceArr, com.tencent.cloud.huiyansdkface.facelight.a.a.b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f10326a;

        public AnonymousClass8(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.a$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10327a;
        public final /* synthetic */ a b;

        public AnonymousClass9(a aVar, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public a(Context context, YTFaceTracker yTFaceTracker, com.tencent.cloud.huiyansdkface.facelight.process.b.b bVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.a.a.b a(a aVar, byte[] bArr, int i2, int i3) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.b.b.b a(a aVar, com.tencent.cloud.huiyansdkface.facelight.b.b.b bVar) {
    }

    public static /* synthetic */ YTFaceTracker a(a aVar, YTFaceTracker yTFaceTracker) {
    }

    public static /* synthetic */ String a(a aVar) {
    }

    @UiThread
    private void a(int i2) {
    }

    @UiThread
    private void a(com.tencent.cloud.huiyansdkface.facelight.a.a.b bVar) {
    }

    public static /* synthetic */ void a(a aVar, com.tencent.cloud.huiyansdkface.facelight.a.a.b bVar) {
    }

    private void a(String str) {
    }

    private void a(String str, String str2) {
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
    }

    private boolean a(YTFaceTracker.TrackedFace trackedFace) {
    }

    private Rect b(YTFaceTracker.TrackedFace trackedFace) {
    }

    @WorkerThread
    private com.tencent.cloud.huiyansdkface.facelight.a.a.b b(byte[] bArr, int i2, int i3) {
    }

    public static /* synthetic */ FaceVerifyStatus b(a aVar) {
    }

    private void b() {
    }

    private boolean b(int i2, int i3) {
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
    }

    public static /* synthetic */ d c(a aVar) {
    }

    private void c() {
    }

    public static /* synthetic */ boolean c(a aVar, boolean z) {
    }

    public static /* synthetic */ long d(a aVar) {
    }

    private void d() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.b.b.b e(a aVar) {
    }

    private void e() {
    }

    @UiThread
    private void f() {
    }

    public static /* synthetic */ boolean f(a aVar) {
    }

    private void g() {
    }

    public static /* synthetic */ boolean g(a aVar) {
    }

    public static /* synthetic */ boolean h(a aVar) {
    }

    public static /* synthetic */ b.a i(a aVar) {
    }

    public static /* synthetic */ Context j(a aVar) {
    }

    public static /* synthetic */ YTFaceTracker k(a aVar) {
    }

    public void a() {
    }

    public void a(int i2, int i3) {
    }

    public void a(FaceVerifyStatus faceVerifyStatus) {
    }

    public void a(com.tencent.cloud.huiyansdkface.facelight.process.b.d dVar) {
    }

    public void a(com.tencent.cloud.huiyansdkface.facelight.ui.a.d dVar) {
    }

    public void a(boolean z) {
    }

    public void a(byte[] bArr, int i2, int i3) {
    }
}
