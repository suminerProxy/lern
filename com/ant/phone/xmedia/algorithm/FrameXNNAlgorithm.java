package com.ant.phone.xmedia.algorithm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import h.c.a.a.a;
import h.c.a.a.e.a;
import h.c.a.a.j.a;
import h.c.a.a.j.b;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FrameXNNAlgorithm implements b {
    private static final int MSG_CLASSIFY_RGB = 4;
    private static final int MSG_CLASSIFY_YUV = 3;
    private static final int MSG_DETECT_RGB = 2;
    private static final int MSG_DETECT_YUV = 1;
    private static final int MSG_INIT = 0;
    private static final int MSG_QUIT = 6;
    private static final int MSG_UNINIT = 5;
    private static final String TAG = "FrameXNNAlgorithm";
    private int mAlgorithmType;
    private String mBizId;
    private a.InterfaceC0302a mCallback;
    private Classify mClassify;
    private Detect mDetect;
    private a.b mFilter;
    private h.c.a.a.b.b.b mFrameCapture;
    private int mFrameCount;
    private XNNHandler mHandler;
    private int mIndex;
    private volatile boolean mInited;
    private volatile boolean mIsBusy;
    private volatile boolean mIsRunning;
    private Object mLock;
    private String mModelId;
    private HashMap<String, Object> mOptions;
    private float[] mROI;
    private h.c.a.a.j.a mReceiver;
    private int mReportCount;
    private int mRotation;
    private HandlerThread mThread;
    private a.InterfaceC0297a mXMediaCallback;
    private byte[] mYuvBuffer;

    /* renamed from: com.ant.phone.xmedia.algorithm.FrameXNNAlgorithm$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements a.InterfaceC0302a {
        public final /* synthetic */ FrameXNNAlgorithm this$0;

        public AnonymousClass1(FrameXNNAlgorithm frameXNNAlgorithm) {
        }

        @Override // h.c.a.a.j.a.InterfaceC0302a
        public void onRgbFrameAvailable(byte[] bArr, int i2, int i3) {
        }

        @Override // h.c.a.a.j.a.InterfaceC0302a
        public void onYuvFrameAvailable(byte[] bArr, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.ant.phone.xmedia.algorithm.FrameXNNAlgorithm$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ FrameXNNAlgorithm this$0;

        public AnonymousClass2(FrameXNNAlgorithm frameXNNAlgorithm) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class XNNHandler extends Handler {
        private Looper mLooper;
        private WeakReference<FrameXNNAlgorithm> mWeakRef;
        public final /* synthetic */ FrameXNNAlgorithm this$0;

        public XNNHandler(FrameXNNAlgorithm frameXNNAlgorithm, FrameXNNAlgorithm frameXNNAlgorithm2, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ int access$004(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ h.c.a.a.b.b.b access$100(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ void access$1000(FrameXNNAlgorithm frameXNNAlgorithm, String str) {
    }

    public static /* synthetic */ h.c.a.a.b.b.b access$102(FrameXNNAlgorithm frameXNNAlgorithm, h.c.a.a.b.b.b bVar) {
    }

    public static /* synthetic */ void access$1100(FrameXNNAlgorithm frameXNNAlgorithm, int i2, int i3) {
    }

    public static /* synthetic */ void access$1200(FrameXNNAlgorithm frameXNNAlgorithm, int i2, int i3) {
    }

    public static /* synthetic */ void access$1300(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ Object access$1400(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ int access$202(FrameXNNAlgorithm frameXNNAlgorithm, int i2) {
    }

    public static /* synthetic */ boolean access$300(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ boolean access$400(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ boolean access$500(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ boolean access$502(FrameXNNAlgorithm frameXNNAlgorithm, boolean z) {
    }

    public static /* synthetic */ byte[] access$600(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ byte[] access$602(FrameXNNAlgorithm frameXNNAlgorithm, byte[] bArr) {
    }

    public static /* synthetic */ int access$700(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    public static /* synthetic */ boolean access$800(FrameXNNAlgorithm frameXNNAlgorithm, Message message) {
    }

    public static /* synthetic */ void access$900(FrameXNNAlgorithm frameXNNAlgorithm) {
    }

    private boolean doFilter(String str, float f2, a.b bVar) {
    }

    private void handleClassifyYuv(int i2, int i3) {
    }

    private void handleDetectYuv(int i2, int i3) {
    }

    private void handleInit(String str) {
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

    public void feedYuv(int i2, int i3, byte[] bArr, int i4) {
    }

    @Override // h.c.a.a.j.b
    public Object getReceiver() {
    }

    public void init(String str, String str2, int i2, String str3, float[] fArr, a.b bVar, HashMap<String, Object> hashMap, a.InterfaceC0297a interfaceC0297a) {
    }

    public void start() {
    }

    public void stop() {
    }
}
