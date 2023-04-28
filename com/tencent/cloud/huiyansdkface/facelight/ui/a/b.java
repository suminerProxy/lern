package com.tencent.cloud.huiyansdkface.facelight.ui.a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import com.tencent.cloud.huiyansdkface.a.c.a.i;
import com.tencent.cloud.huiyansdkface.a.f;
import com.tencent.cloud.huiyansdkface.facelight.api.result.WbFaceVerifyResult;
import com.tencent.cloud.huiyansdkface.facelight.b.b.e;
import com.tencent.cloud.huiyansdkface.facelight.b.b.g;
import com.tencent.cloud.huiyansdkface.facelight.net.GetFaceActiveCompareType;
import com.tencent.cloud.huiyansdkface.facelight.net.GetGradeFaceCompareResult;
import com.tencent.cloud.huiyansdkface.facelight.net.QueryFaceResultRequest;
import com.tencent.cloud.huiyansdkface.facelight.net.model.request.actlight.FlashReq;
import com.tencent.cloud.huiyansdkface.facelight.net.model.request.actlight.SelectData;
import com.tencent.cloud.huiyansdkface.facelight.net.model.result.RiskInfo;
import com.tencent.cloud.huiyansdkface.facelight.process.FaceVerifyStatus;
import com.tencent.cloud.huiyansdkface.facelight.process.b;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.HeadBorderView;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.PreviewFrameLayout;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.PreviewMask;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.a;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.b;
import com.tencent.cloud.huiyansdkface.record.VideoEncoder;
import com.tencent.cloud.huiyansdkface.record.WbRecordFinishListener;
import com.tencent.cloud.huiyansdkface.wehttp2.BaseCallback;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b extends com.tencent.cloud.huiyansdkface.facelight.ui.a.a implements com.tencent.cloud.huiyansdkface.facelight.process.a.a, com.tencent.cloud.huiyansdkface.facelight.process.a.b, com.tencent.cloud.huiyansdkface.facelight.process.a.c, d, com.tencent.cloud.huiyansdkface.facelight.ui.widget.a.b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10408a = null;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private RiskInfo H;
    private Bundle I;
    private boolean J;
    private boolean K;
    private com.tencent.cloud.huiyansdkface.facelight.a.b L;
    private com.tencent.cloud.huiyansdkface.a.g.c M;
    private com.tencent.cloud.huiyansdkface.a.c N;
    private f O;
    private int P;
    private com.tencent.cloud.huiyansdkface.a.a Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private com.tencent.cloud.huiyansdkface.facelight.b.d.b V;
    private com.tencent.cloud.huiyansdkface.facelight.b.a.f W;
    private com.tencent.cloud.huiyansdkface.facelight.b.a.b X;
    private boolean Y;
    private boolean Z;
    private boolean aA;
    private boolean aB;
    private ByteArrayOutputStream aC;
    private VideoEncoder aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private byte[][] aI;
    private float aJ;
    private Context aK;
    private int aL;
    private int aM;
    private boolean aN;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b aO;
    private g aP;
    private Handler aQ;
    private TimerTask aR;
    private SensorEventListener aS;
    private boolean aa;
    private TextView ab;
    private TextView ac;
    private Properties ad;
    private YTImageInfo ae;
    private YTImageInfo af;
    private YTImageInfo ag;
    private ImageView ah;
    private com.tencent.cloud.huiyansdkface.facelight.ui.widget.a ai;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b aj;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b ak;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b al;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b am;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b an;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b ao;
    private boolean ap;
    private SensorManager aq;
    private Sensor ar;
    private String as;
    private int at;
    private PreviewMask au;
    private SelectData av;
    private ReflectColorData aw;
    private Camera ax;
    private boolean ay;
    private int az;
    private e b;
    private com.tencent.cloud.huiyansdkface.facelight.ui.widget.c c;

    /* renamed from: d  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.facelight.process.d f10409d;

    /* renamed from: e  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.facelight.config.a.a f10410e;

    /* renamed from: f  reason: collision with root package name */
    private String f10411f;

    /* renamed from: g  reason: collision with root package name */
    private FaceVerifyStatus f10412g;

    /* renamed from: h  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.facelight.process.a f10413h;

    /* renamed from: i  reason: collision with root package name */
    private YTFaceTracker f10414i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10415j;

    /* renamed from: k  reason: collision with root package name */
    private SoundPool f10416k;

    /* renamed from: l  reason: collision with root package name */
    private int f10417l;

    /* renamed from: m  reason: collision with root package name */
    private View f10418m;

    /* renamed from: n  reason: collision with root package name */
    private View f10419n;

    /* renamed from: o  reason: collision with root package name */
    private View f10420o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f10421p;
    private TextView q;
    private RelativeLayout r;
    private TextView s;
    private ImageView t;
    private TextView u;
    private PreviewFrameLayout v;
    private HeadBorderView w;
    private com.tencent.cloud.huiyansdkface.facelight.ui.widget.a x;
    private ExecutorService y;
    private ExecutorService z;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10422a;

        public AnonymousClass1(b bVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f10423a;
        public final /* synthetic */ b b;

        public AnonymousClass10(b bVar, Bitmap bitmap) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements b.InterfaceC0175b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10424a;

        public AnonymousClass11(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.InterfaceC0175b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.InterfaceC0175b
        public void a(int i2, String str, String str2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10425a;

        public AnonymousClass12(b bVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements com.tencent.cloud.huiyansdkface.facelight.process.b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10426a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$13$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass13 f10427a;

            public AnonymousClass1(AnonymousClass13 anonymousClass13) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass13(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.a
        public void a() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements YTAGReflectLiveCheckInterface.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10428a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$14$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f10429a;
            public final /* synthetic */ AnonymousClass14 b;

            public AnonymousClass1(AnonymousClass14 anonymousClass14, int i2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass14(b bVar) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.b
        public float a() {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.b
        public void a(int i2, float f2) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements YTAGReflectLiveCheckJNIInterface.IYtLoggerListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10430a;

        public AnonymousClass15(b bVar) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10431a;

        public AnonymousClass16(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 implements YTAGReflectLiveCheckInterface.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10432a;

        public AnonymousClass17(b bVar) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.c
        public void a(int i2, String str, String str2) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.c
        public void a(FullPack fullPack) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10433a;
        public final /* synthetic */ int b;
        public final /* synthetic */ b c;

        public AnonymousClass18(b bVar, boolean z, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10434a;

        public AnonymousClass19(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10435a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements f.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass2 f10436a;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.tencent.cloud.huiyansdkface.a.f.a
            public void a() {
            }
        }

        public AnonymousClass2(b bVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10437a;

        public AnonymousClass20(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10438a;
        public final /* synthetic */ b b;

        public AnonymousClass21(b bVar, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10439a;

        public AnonymousClass22(b bVar, long j2, long j3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 implements YTFaceTracker.IYtLoggerListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10440a;

        public AnonymousClass23(b bVar) {
        }

        @Override // com.tencent.youtu.liveness.YTFaceTracker.IYtLoggerListener
        public void log(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10441a;

        public AnonymousClass24(b bVar, long j2, long j3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10442a;

        public AnonymousClass25(b bVar, long j2, long j3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10443a;

        public AnonymousClass26(b bVar, long j2, long j3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass27 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10444a;

        public AnonymousClass27(b bVar, long j2, long j3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass28 implements WbRecordFinishListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10445a;

        public AnonymousClass28(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.record.WbRecordFinishListener
        public void onRecordFinish() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass29 extends BaseCallback<GetFaceActiveCompareType.GetFaceCompareTypeResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10446a;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public AnonymousClass29(b bVar, String str, String str2) {
        }

        public void a(WeReq weReq, GetFaceActiveCompareType.GetFaceCompareTypeResponse getFaceCompareTypeResponse) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements com.tencent.cloud.huiyansdkface.facelight.process.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10447a;

        public AnonymousClass3(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.b
        public void a() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass30 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WbFaceVerifyResult f10448a;
        public final /* synthetic */ b b;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$30$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements b.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass30 f10449a;

            public AnonymousClass1(AnonymousClass30 anonymousClass30) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.b.a
            public void a() {
            }
        }

        public AnonymousClass30(b bVar, WbFaceVerifyResult wbFaceVerifyResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass31 implements WeReq.Callback<GetGradeFaceCompareResult.GetResultReflectModeResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10450a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ byte[] c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f10451d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f10452e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f10453f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ FlashReq f10454g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f10455h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f10456i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f10457j;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$31$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f10458a;
            public final /* synthetic */ AnonymousClass31 b;

            public AnonymousClass1(AnonymousClass31 anonymousClass31, long j2, long j3, long j4) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
            public void a() {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
            public void a(long j2) {
            }
        }

        public AnonymousClass31(b bVar, String str, byte[] bArr, byte[] bArr2, String str2, String str3, String str4, FlashReq flashReq, String str5, String str6) {
        }

        public void a(WeReq weReq, GetGradeFaceCompareResult.GetResultReflectModeResponse getResultReflectModeResponse) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFinish() {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onStart(WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass32 implements WeReq.Callback<QueryFaceResultRequest.QueryResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10459a;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public AnonymousClass32(b bVar, String str, String str2) {
        }

        public void a(WeReq weReq, QueryFaceResultRequest.QueryResponse queryResponse) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFinish() {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onStart(WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass33 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WbFaceVerifyResult f10460a;
        public final /* synthetic */ b b;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$33$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements b.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass33 f10461a;

            public AnonymousClass1(AnonymousClass33 anonymousClass33) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.b.a
            public void a() {
            }
        }

        public AnonymousClass33(b bVar, WbFaceVerifyResult wbFaceVerifyResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass34 implements YTPoseDetectJNIInterface.IYtLoggerListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10462a;

        public AnonymousClass34(b bVar) {
        }

        @Override // com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass35 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10463a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f10464d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f10465e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f10466f;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$35$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements a.InterfaceC0177a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass35 f10467a;

            public AnonymousClass1(AnonymousClass35 anonymousClass35) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.a.InterfaceC0177a
            public void a() {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.a.InterfaceC0177a
            public void b() {
            }
        }

        public AnonymousClass35(b bVar, String str, String str2, String str3, String str4, String str5) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass36 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10468a;
        public final /* synthetic */ b b;

        public AnonymousClass36(b bVar, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$37  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass37 implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10469a;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        public AnonymousClass37(b bVar, boolean z, String str) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.b.a
        public void a() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$38  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass38 implements a.InterfaceC0177a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10470a;
        public final /* synthetic */ b b;

        public AnonymousClass38(b bVar, String str) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.a.InterfaceC0177a
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.a.InterfaceC0177a
        public void b() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$39  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass39 implements SensorEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10471a;

        public AnonymousClass39(b bVar) {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements com.tencent.cloud.huiyansdkface.a.e.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10472a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.tencent.cloud.huiyansdkface.a.e.a f10473a;
            public final /* synthetic */ AnonymousClass4 b;

            public AnonymousClass1(AnonymousClass4 anonymousClass4, com.tencent.cloud.huiyansdkface.a.e.a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass4(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.a.e.d
        public void a(com.tencent.cloud.huiyansdkface.a.e.a aVar) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$40  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass40 implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10474a;

        public AnonymousClass40(b bVar) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$41  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass41 implements com.tencent.cloud.huiyansdkface.facelight.process.b.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10475a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$41$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements com.tencent.cloud.huiyansdkface.facelight.process.b.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass41 f10476a;

            public AnonymousClass1(AnonymousClass41 anonymousClass41) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.d
            public void a(YTActRefData yTActRefData) {
            }
        }

        public AnonymousClass41(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.e
        public void a(byte[][] bArr) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$42  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass42 implements com.tencent.cloud.huiyansdkface.facelight.process.b.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10477a;

        public AnonymousClass42(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.d
        public void a(YTActRefData yTActRefData) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$43  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass43 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10478a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$43$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements com.tencent.cloud.huiyansdkface.facelight.process.b.c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass43 f10479a;

            public AnonymousClass1(AnonymousClass43 anonymousClass43) {
            }

            @Override // com.tencent.cloud.huiyansdkface.facelight.process.b.c
            public void a() {
            }
        }

        public AnonymousClass43(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$44  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass44 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10480a;

        public AnonymousClass44(b bVar, long j2, long j3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$45  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass45 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10481a;
        public final /* synthetic */ b b;

        public AnonymousClass45(b bVar, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$46  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass46 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10482a;
        public final /* synthetic */ int b;
        public final /* synthetic */ b c;

        public AnonymousClass46(b bVar, int i2, int i3) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$47  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass47 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10483a;
        public final /* synthetic */ b b;

        public AnonymousClass47(b bVar, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$48  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass48 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10484a;
        public final /* synthetic */ b b;

        public AnonymousClass48(b bVar, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$49  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass49 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10485a;
        public final /* synthetic */ b b;

        public AnonymousClass49(b bVar, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements com.tencent.cloud.huiyansdkface.a.b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10486a;

        public AnonymousClass5(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.a.b.a
        public void a(com.tencent.cloud.huiyansdkface.a.b.c cVar) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$50  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass50 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10487a;
        public final /* synthetic */ b b;

        public AnonymousClass50(b bVar, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$51  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass51 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10488a;

        public AnonymousClass51(b bVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10489a;

        public AnonymousClass6(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.a.c.a.i
        public void a(Camera.Parameters parameters, com.tencent.cloud.huiyansdkface.a.c.a.a aVar) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends com.tencent.cloud.huiyansdkface.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10490a;
        private Camera b;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$7$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass7 f10491a;

            public AnonymousClass1(AnonymousClass7 anonymousClass7) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass7(b bVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.a.a, com.tencent.cloud.huiyansdkface.a.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.a.a, com.tencent.cloud.huiyansdkface.a.b
        public void a(com.tencent.cloud.huiyansdkface.a.c.a aVar) {
        }

        @Override // com.tencent.cloud.huiyansdkface.a.a, com.tencent.cloud.huiyansdkface.a.b
        public void a(com.tencent.cloud.huiyansdkface.a.c.a aVar, com.tencent.cloud.huiyansdkface.a.c.d dVar, com.tencent.cloud.huiyansdkface.a.a.a aVar2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10492a;

        /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$8$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements f.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass8 f10493a;

            public AnonymousClass1(AnonymousClass8 anonymousClass8) {
            }

            @Override // com.tencent.cloud.huiyansdkface.a.f.a
            public void a() {
            }
        }

        public AnonymousClass8(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.a.b$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10494a;

        public AnonymousClass9(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements SoundPool.OnLoadCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        private int f10495a;

        public a(int i2) {
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i2, int i3) {
        }
    }

    public static /* synthetic */ int A(b bVar) {
    }

    private boolean A() {
    }

    public static /* synthetic */ int B(b bVar) {
    }

    private void B() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.b.a.b C(b bVar) {
    }

    private void C() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.process.a D(b bVar) {
    }

    private void D() {
    }

    private void E() {
    }

    public static /* synthetic */ void E(b bVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.a.b F(b bVar) {
    }

    private void F() {
    }

    public static /* synthetic */ int G(b bVar) {
    }

    private void G() {
    }

    public static /* synthetic */ float H(b bVar) {
    }

    private void H() {
    }

    private void I() {
    }

    public static /* synthetic */ void I(b bVar) {
    }

    public static /* synthetic */ YTFaceTracker J(b bVar) {
    }

    private void J() {
    }

    private void K() {
    }

    public static /* synthetic */ boolean K(b bVar) {
    }

    public static /* synthetic */ int L(b bVar) {
    }

    @UiThread
    private void L() {
    }

    private void M() {
    }

    public static /* synthetic */ void M(b bVar) {
    }

    public static /* synthetic */ ImageView N(b bVar) {
    }

    private void N() {
    }

    private void O() {
    }

    public static /* synthetic */ void O(b bVar) {
    }

    public static /* synthetic */ int P(b bVar) {
    }

    private void P() {
    }

    private void Q() {
    }

    public static /* synthetic */ boolean Q(b bVar) {
    }

    public static /* synthetic */ TimerTask R(b bVar) {
    }

    private void R() {
    }

    private float S() {
    }

    public static /* synthetic */ g S(b bVar) {
    }

    public static /* synthetic */ ByteArrayOutputStream T(b bVar) {
    }

    private void T() {
    }

    public static /* synthetic */ int U(b bVar) {
    }

    private void U() {
    }

    public static /* synthetic */ TextView V(b bVar) {
    }

    private void V() {
    }

    public static /* synthetic */ String W(b bVar) {
    }

    private void W() {
    }

    public static /* synthetic */ String X(b bVar) {
    }

    private void X() {
    }

    public static /* synthetic */ String Y(b bVar) {
    }

    private void Y() {
    }

    public static /* synthetic */ String Z(b bVar) {
    }

    private void Z() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.b.b.b a(b bVar, com.tencent.cloud.huiyansdkface.facelight.b.b.b bVar2) {
    }

    public static /* synthetic */ RiskInfo a(b bVar, RiskInfo riskInfo) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.ui.widget.a a(b bVar, com.tencent.cloud.huiyansdkface.facelight.ui.widget.a aVar) {
    }

    public static /* synthetic */ YTFaceTracker a(b bVar, YTFaceTracker yTFaceTracker) {
    }

    public static /* synthetic */ ReflectColorData a(b bVar, ReflectColorData reflectColorData) {
    }

    private String a(String str, String str2) {
    }

    private void a(float f2) {
    }

    private void a(int i2, String str) {
    }

    private void a(int i2, String str, String str2, String str3) {
    }

    private void a(Camera camera, int i2) {
    }

    private void a(com.tencent.cloud.huiyansdkface.a.a.a.a aVar) {
    }

    private void a(com.tencent.cloud.huiyansdkface.a.e.a aVar) {
    }

    public static /* synthetic */ void a(b bVar) {
    }

    public static /* synthetic */ void a(b bVar, int i2) {
    }

    public static /* synthetic */ void a(b bVar, int i2, String str) {
    }

    public static /* synthetic */ void a(b bVar, Camera camera, int i2) {
    }

    public static /* synthetic */ void a(b bVar, com.tencent.cloud.huiyansdkface.a.a.a.a aVar) {
    }

    public static /* synthetic */ void a(b bVar, com.tencent.cloud.huiyansdkface.a.e.a aVar) {
    }

    public static /* synthetic */ void a(b bVar, YTActRefData yTActRefData) {
    }

    public static /* synthetic */ void a(b bVar, String str) {
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, String str3, String str4) {
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, String str3, String str4, String str5) {
    }

    public static /* synthetic */ void a(b bVar, String str, byte[] bArr, byte[] bArr2, String str2, String str3, String str4, FlashReq flashReq) {
    }

    public static /* synthetic */ void a(b bVar, boolean z, int i2) {
    }

    public static /* synthetic */ void a(b bVar, boolean z, String str) {
    }

    private void a(YTActRefData yTActRefData) {
    }

    private void a(String str, String str2, String str3, String str4) {
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
    }

    private void a(String str, byte[] bArr, byte[] bArr2, String str2, String str3, String str4, FlashReq flashReq) {
    }

    @UiThread
    private void a(boolean z, int i2) {
    }

    private void a(boolean z, String str) {
    }

    private void a(byte[] bArr) {
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
    }

    public static /* synthetic */ byte[][] a(b bVar, byte[][] bArr) {
    }

    private void aa() {
    }

    public static /* synthetic */ void aa(b bVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.ui.widget.a ab(b bVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.ui.widget.a ac(b bVar) {
    }

    public static /* synthetic */ void ad(b bVar) {
    }

    public static /* synthetic */ void ae(b bVar) {
    }

    public static /* synthetic */ byte[][] af(b bVar) {
    }

    public static /* synthetic */ void ag(b bVar) {
    }

    public static /* synthetic */ int ah(b bVar) {
    }

    public static /* synthetic */ int ai(b bVar) {
    }

    public static /* synthetic */ int aj(b bVar) {
    }

    public static /* synthetic */ VideoEncoder ak(b bVar) {
    }

    public static /* synthetic */ int b(b bVar, int i2) {
    }

    public static /* synthetic */ Handler b(b bVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.ui.widget.a b(b bVar, com.tencent.cloud.huiyansdkface.facelight.ui.widget.a aVar) {
    }

    public static /* synthetic */ String b(b bVar, String str) {
    }

    public static /* synthetic */ String b(b bVar, String str, String str2) {
    }

    private void b(int i2, String str) {
    }

    private void b(String str, String str2) {
    }

    private void b(boolean z) {
    }

    private void b(byte[] bArr) {
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
    }

    public static /* synthetic */ int c(b bVar, int i2) {
    }

    private Bitmap c(byte[] bArr) {
    }

    public static /* synthetic */ TextView c(b bVar) {
    }

    public static /* synthetic */ String c(b bVar, String str) {
    }

    private void c(boolean z) {
    }

    public static /* synthetic */ boolean c(b bVar, boolean z) {
    }

    public static /* synthetic */ int d(b bVar, int i2) {
    }

    public static /* synthetic */ TextView d(b bVar) {
    }

    public static /* synthetic */ String d(b bVar, String str) {
    }

    public static /* synthetic */ void d(b bVar, boolean z) {
    }

    private void d(boolean z) {
    }

    private boolean d(String str) {
    }

    public static /* synthetic */ int e(b bVar, int i2) {
    }

    public static /* synthetic */ String e(b bVar, String str) {
    }

    public static /* synthetic */ Properties e(b bVar) {
    }

    private void e(boolean z) {
    }

    private boolean e(String str) {
    }

    public static /* synthetic */ int f(b bVar, int i2) {
    }

    public static /* synthetic */ HeadBorderView f(b bVar) {
    }

    public static /* synthetic */ String f(b bVar, String str) {
    }

    private void f(String str) {
    }

    private void f(boolean z) {
    }

    public static /* synthetic */ ImageView g(b bVar) {
    }

    public static /* synthetic */ String g(b bVar, String str) {
    }

    public static /* synthetic */ void g(b bVar, int i2) {
    }

    private void g(String str) {
    }

    public static /* synthetic */ String h(b bVar, String str) {
    }

    public static /* synthetic */ void h(b bVar) {
    }

    private void h(String str) {
    }

    public static /* synthetic */ boolean h(b bVar, int i2) {
    }

    public static /* synthetic */ FaceVerifyStatus i(b bVar) {
    }

    private void i(int i2) {
    }

    public static /* synthetic */ void i(b bVar, int i2) {
    }

    public static /* synthetic */ void i(b bVar, String str) {
    }

    private void i(String str) {
    }

    public static /* synthetic */ f j(b bVar) {
    }

    public static /* synthetic */ String j(b bVar, String str) {
    }

    private void j(int i2) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.a.c k(b bVar) {
    }

    private void k(int i2) {
    }

    public static /* synthetic */ int l(b bVar) {
    }

    private boolean l(int i2) {
    }

    public static /* synthetic */ String m(b bVar) {
    }

    private void m(int i2) {
    }

    public static /* synthetic */ PreviewMask n(b bVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.config.a.a o(b bVar) {
    }

    public static /* synthetic */ RelativeLayout p(b bVar) {
    }

    public static /* synthetic */ TextView q(b bVar) {
    }

    public static /* synthetic */ TextView r(b bVar) {
    }

    public static /* synthetic */ PreviewFrameLayout s(b bVar) {
    }

    public static /* synthetic */ boolean t(b bVar) {
    }

    public static /* synthetic */ String u() {
    }

    public static /* synthetic */ ExecutorService u(b bVar) {
    }

    private int v() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.process.d v(b bVar) {
    }

    private int w() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.b.d.b w(b bVar) {
    }

    public static /* synthetic */ int x(b bVar) {
    }

    private void x() {
    }

    public static /* synthetic */ int y(b bVar) {
    }

    private void y() {
    }

    public static /* synthetic */ Context z(b bVar) {
    }

    private boolean z() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public RectF a(Rect rect) {
    }

    public void a(int i2, int i3, int i4, int i5) {
    }

    public void a(Bitmap bitmap) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public void a(RectF rectF) {
    }

    public void a(com.tencent.cloud.huiyansdkface.facelight.a.b bVar) {
    }

    public void a(com.tencent.cloud.huiyansdkface.facelight.process.b.c cVar) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public void a(String str) {
    }

    public void a(boolean z) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.a
    public boolean a() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public void b(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.a
    public boolean b() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public void c(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.a
    public boolean c() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.a
    public boolean d() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.b
    public boolean e() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public void f(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.b
    public boolean f() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public void g(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.b
    public boolean g() {
    }

    public void h(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean h() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean i() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean j() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean k() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean l() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean m() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean n() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.process.a.c
    public boolean o() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.a, android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Fragment
    public void onDestroy() {
    }

    @Override // android.app.Fragment
    public void onPause() {
    }

    @Override // android.app.Fragment
    public void onResume() {
    }

    @Override // android.app.Fragment
    public void onStart() {
    }

    @Override // android.app.Fragment
    public void onStop() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.a
    public void p() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.a.d
    public RectF r() {
    }

    @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.a.b
    public void s() {
    }

    public void t() {
    }
}
