package com.ant.phone.xmedia.algorithm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import h.c.a.a.a;
import h.c.a.a.h.f;
import h.c.a.a.j.a;
import h.c.a.a.j.b;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DamageDetectAlgorithm implements b {
    private static final int MSG_DAMAGE_DETECT = 1;
    private static final int MSG_INIT = 0;
    private static final int MSG_QUIT = 3;
    private static final int MSG_UNINIT = 2;
    private static final String TAG = "DamageDetectAlgorithm";
    private static final int TIME_INTERVAL = 400;
    private String mBizId;
    private a.InterfaceC0302a mCallback;
    private DamageDetect mDamageDetect;
    private String[] mExtraModels;
    private f mFrame;
    private h.c.a.a.b.b.b mFrameCapture;
    private int mFrameCount;
    private WorkHandler mHandler;
    private int mIndex;
    private volatile boolean mInited;
    private volatile boolean mIsBusy;
    private volatile boolean mIsRunning;
    private Object mLock;
    private int mMode;
    private String mModelId;
    private String mModelPath;
    private HashMap<String, Object> mOptions;
    private float[] mROI;
    private a mReceiver;
    private int mRotation;
    private HandlerThread mThread;
    private a.InterfaceC0297a mXMediaCallback;

    /* renamed from: com.ant.phone.xmedia.algorithm.DamageDetectAlgorithm$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements a.InterfaceC0302a {
        public final /* synthetic */ DamageDetectAlgorithm this$0;

        public AnonymousClass1(DamageDetectAlgorithm damageDetectAlgorithm) {
        }

        @Override // h.c.a.a.j.a.InterfaceC0302a
        public void onRgbFrameAvailable(byte[] bArr, int i2, int i3) {
        }

        @Override // h.c.a.a.j.a.InterfaceC0302a
        public void onYuvFrameAvailable(byte[] bArr, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.ant.phone.xmedia.algorithm.DamageDetectAlgorithm$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ DamageDetectAlgorithm this$0;

        public AnonymousClass2(DamageDetectAlgorithm damageDetectAlgorithm) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class WorkHandler extends Handler {
        private WeakReference<DamageDetectAlgorithm> mWeakRef;
        public final /* synthetic */ DamageDetectAlgorithm this$0;

        public WorkHandler(DamageDetectAlgorithm damageDetectAlgorithm, DamageDetectAlgorithm damageDetectAlgorithm2, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ int access$004(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ h.c.a.a.b.b.b access$100(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ void access$1000(DamageDetectAlgorithm damageDetectAlgorithm, int i2, int i3) {
    }

    public static /* synthetic */ h.c.a.a.b.b.b access$102(DamageDetectAlgorithm damageDetectAlgorithm, h.c.a.a.b.b.b bVar) {
    }

    public static /* synthetic */ void access$1100(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ void access$1200(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ int access$202(DamageDetectAlgorithm damageDetectAlgorithm, int i2) {
    }

    public static /* synthetic */ boolean access$300(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ boolean access$400(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ boolean access$500(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ boolean access$502(DamageDetectAlgorithm damageDetectAlgorithm, boolean z) {
    }

    public static /* synthetic */ f access$600(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ boolean access$700(DamageDetectAlgorithm damageDetectAlgorithm, Message message) {
    }

    public static /* synthetic */ void access$800(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    public static /* synthetic */ void access$900(DamageDetectAlgorithm damageDetectAlgorithm) {
    }

    private void handleDamageDetect(int i2, int i3) {
    }

    private void handleInit() {
    }

    private void handleQuit() {
    }

    private void handleUninit() {
    }

    private synchronized void initHandler() {
    }

    private void removeMsg(int i2) {
    }

    private boolean sendMsg(Message message) {
    }

    private void setExceptionHandler() {
    }

    @Override // h.c.a.a.j.b
    public Object getReceiver() {
    }

    public void init(String str, int i2, String str2, String str3, String[] strArr, float[] fArr, HashMap<String, Object> hashMap, a.InterfaceC0297a interfaceC0297a) {
    }

    public void start() {
    }

    public void stop() {
    }
}
