package com.alipay.zoloz.toyger.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.alipay.security.mobile.face2d.LocalFaceManager;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.ToygerCallback;
import com.alipay.zoloz.toyger.ToygerState;
import com.alipay.zoloz.toyger.algorithm.IToygerDelegate;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.TGSensorFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerFaceService extends ToygerBaseService<ToygerFaceCallback, ToygerFaceState, ToygerFaceAttr, ToygerFaceInfo, ToygerFaceAlgorithmConfig> {
    public static final String KEY_TOYGER_ACTION_TYPE = "toyger_action";
    public static final String KEY_TOYGER_DEPTH_FRAME = "toyger_depth_frame";
    public static final String KEY_TOYGER_FRAME = "toyger_frame";
    public static final String KEY_TOYGER_TIME_CONSUMING = "toygerTimeConsuming";
    public static final String KEY_TOYGER_UID = "uid";
    private static final int QUEUE_LENGTH = 1;
    private static final String TOYGER_ACTION_DEREG = "dereg";
    private static final String TOYGER_ACTION_LOCAL_MATCHING = "local";
    private static final String TOYGER_ACTION_REGISTER = "register";
    private static final String TOYGER_ACTION_REMOTE_MATCHING = "remote";
    public static int TOYGER_CALLBACK_CODE_LOG = 0;
    public static int TOYGER_CALLBACK_CODE_UPDATE = 1;
    public static final int TOYGER_EVENT_INTERRUPT = 1;
    public static final int TOYGER_EVENT_RESUME = 2;
    private static final int TOYGER_LOGLEVEL_SAVE = 2;
    private static String licenses;
    private static byte[] model;
    private static long totalDropFrame;
    private static long totalFrame;
    private static long totalProcessFrame;
    private static Boolean toygerIsBusy;
    private FaceBlobManager blobManager;
    private String cacheCommand;
    private Context cacheContext;
    private float[] cacheGyroData;
    private String cacheIfaaMsg;
    private float[] cacheRotationData;
    private ToygerRunnable cacheRunnable;
    private long cacheTimeStamp;
    private String cacheToken;
    private String cacheUid;
    private HashMap<String, Object> callBackObject;
    private ByteBuffer depthImageBuffer;
    private ToygerFaceAlgorithmConfig faceAlgConfig;
    private String faceAttrSignature;
    private String faceStateSignature;
    private ToygerFaceAttr fppAttr;
    private HashMap<Integer, Double> frameSizeMap;
    public boolean initResult;
    private ByteBuffer irImageBuffer;
    private boolean isMirror;
    private boolean localMatching;
    private HandlerThread mCallbackThread;
    private Handler mCallbackThreadHandler;
    private final FrameProcessor mFrameProcessor;
    private final AtomicBoolean mImageProcessing;
    private LocalFaceManager mLocalFaceManager;
    private HandlerThread mProcessThread;
    private Handler mProcessThreadHandler;
    private final BlockingQueue<TGSensorFrame> mSensorQueue;
    private final AtomicBoolean mSensorRunning;
    private HandlerThread mSensorThread;
    private Handler mSensorThreadHandler;
    private ByteBuffer rgbImagebuffer;
    private final Semaphore semaphore;
    private String tgFrameSignature;

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ IToygerDelegate val$delegate;
        public final /* synthetic */ ToygerConfig val$toygerConfig;

        public AnonymousClass1(ToygerFaceService toygerFaceService, IToygerDelegate iToygerDelegate, ToygerConfig toygerConfig) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ CountDownLatch val$countDownLatch;
        public final /* synthetic */ long val$processHandleTime;

        public AnonymousClass10(ToygerFaceService toygerFaceService, CountDownLatch countDownLatch, long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ int val$eventCode;
        public final /* synthetic */ String val$message;

        public AnonymousClass11(ToygerFaceService toygerFaceService, int i2, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass12 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ ToygerDepthInfo val$depthInfo;

        public AnonymousClass12(ToygerFaceService toygerFaceService, ToygerDepthInfo toygerDepthInfo) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass13 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ TGFrame val$infraRedInfo;

        public AnonymousClass13(ToygerFaceService toygerFaceService, TGFrame tGFrame) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass14 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ ToygerFaceAttr val$attr;
        public final /* synthetic */ TGFrame val$frame;

        public AnonymousClass14(ToygerFaceService toygerFaceService, TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass15 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ Map val$extIno;
        public final /* synthetic */ List val$infos;
        public final /* synthetic */ int val$result;

        public AnonymousClass15(ToygerFaceService toygerFaceService, List list, Map map, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 extends Handler {
        public final /* synthetic */ ToygerFaceService this$0;

        public AnonymousClass5(ToygerFaceService toygerFaceService, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;
        public final /* synthetic */ TGSensorFrame val$sensorData;

        public AnonymousClass7(ToygerFaceService toygerFaceService, TGSensorFrame tGSensorFrame) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 extends ToygerRunnable {
        public final /* synthetic */ ToygerFaceService this$0;

        public AnonymousClass8(ToygerFaceService toygerFaceService, List list, TGDepthFrame tGDepthFrame, ToygerAttr toygerAttr) {
        }

        @Override // com.alipay.zoloz.toyger.face.ToygerRunnable, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.alipay.zoloz.toyger.face.ToygerFaceService$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ ToygerFaceService this$0;

        public AnonymousClass9(ToygerFaceService toygerFaceService) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ boolean access$000(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ Context access$100(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ AtomicBoolean access$1000(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ BlockingQueue access$1100(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ float[] access$1200(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ float[] access$1202(ToygerFaceService toygerFaceService, float[] fArr) {
    }

    public static /* synthetic */ long access$1300(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ long access$1302(ToygerFaceService toygerFaceService, long j2) {
    }

    public static /* synthetic */ float[] access$1400(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ float[] access$1402(ToygerFaceService toygerFaceService, float[] fArr) {
    }

    public static /* synthetic */ AtomicBoolean access$1500(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ long access$1600() {
    }

    public static /* synthetic */ long access$1602(long j2) {
    }

    public static /* synthetic */ long access$1700() {
    }

    public static /* synthetic */ long access$1702(long j2) {
    }

    public static /* synthetic */ long access$1800() {
    }

    public static /* synthetic */ long access$1802(long j2) {
    }

    public static /* synthetic */ String access$1900(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ boolean access$200(ToygerFaceService toygerFaceService, Context context) {
    }

    public static /* synthetic */ LocalFaceManager access$2000(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ByteBuffer access$2100(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ByteBuffer access$2102(ToygerFaceService toygerFaceService, ByteBuffer byteBuffer) {
    }

    public static /* synthetic */ ByteBuffer access$2200(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ByteBuffer access$2202(ToygerFaceService toygerFaceService, ByteBuffer byteBuffer) {
    }

    public static /* synthetic */ ByteBuffer access$2300(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ByteBuffer access$2302(ToygerFaceService toygerFaceService, ByteBuffer byteBuffer) {
    }

    public static /* synthetic */ void access$2401(ToygerFaceService toygerFaceService, int i2, String str) {
    }

    public static /* synthetic */ FaceBlobManager access$2500(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$2600(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$2700(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$2800(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$2900(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$300(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$3000(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$3100(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$400(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ byte[] access$502(byte[] bArr) {
    }

    public static /* synthetic */ boolean access$600(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ FrameProcessor access$700(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$800(ToygerFaceService toygerFaceService) {
    }

    public static /* synthetic */ ToygerCallback access$900(ToygerFaceService toygerFaceService) {
    }

    public static Bitmap bitmapFromTGFrame(TGFrame tGFrame, boolean z) {
    }

    private FaceBlobManager blobManagerByExtInfo(Map<String, Object> map, ToygerFaceBlobConfig toygerFaceBlobConfig) {
    }

    private double calculateNeedSize(TGFrame tGFrame, TGDepthFrame tGDepthFrame) {
    }

    private String collectionStringFromBlobConfig(ToygerFaceBlobConfig toygerFaceBlobConfig) {
    }

    private String combinationStringFromFaceAlgorithm(ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig) {
    }

    private void deepCopyIRFrame(TGFrame tGFrame) {
    }

    private void deepCopyRGBFrame(TGFrame tGFrame) {
    }

    private void deepCopyTGDepthFrame(TGDepthFrame tGDepthFrame) {
    }

    private void handleLocalMatchingResponse(String str, LocalFaceManager.FaceAuthResponse faceAuthResponse) {
    }

    private boolean initToygerNative(Context context) {
    }

    private static boolean load(Context context) {
    }

    private ToygerConfig parseToygerConfig(ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig, ToygerFaceBlobConfig toygerFaceBlobConfig, Map<String, Object> map) {
    }

    public static boolean preLoad(Context context) {
    }

    private static byte[] readFile(Context context, String str) {
    }

    private static byte[] readFileByPath(String str) {
    }

    private int setupWorkingThread() {
    }

    private void startGyroServiceWithFaceBlobConfig(ToygerFaceBlobConfig toygerFaceBlobConfig) {
    }

    private void startLocalMatching(Context context, Map<String, Object> map, ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig) {
    }

    public void addMonitorImage(TGFrame tGFrame) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean config(Map<String, Object> map) {
    }

    public Map<String, Object> generateBlob(Map<String, Object> map) {
    }

    public Map<String, Object> generateMonitorBlob() {
    }

    public Map<String, Object> generateVideoFileBlob(String str) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleCaptureCompleted(int i2, List<ToygerFaceInfo> list, Map<String, Object> map) {
    }

    public void handleDepthInfoReady(ToygerDepthInfo toygerDepthInfo) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleEventTriggered(int i2, String str) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public /* bridge */ /* synthetic */ void handleInfoReady(TGFrame tGFrame, ToygerAttr toygerAttr) {
    }

    public void handleInfraRedInfoReady(TGFrame tGFrame) {
    }

    public void handleLocalMatchingEvent(int i2) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleLog(int i2, HashMap<String, Object> hashMap) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleScanCompleted(int i2, List<ToygerFaceInfo> list, Map<String, Object> map) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService, com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public /* bridge */ /* synthetic */ void handleStateUpdated(ToygerState toygerState, ToygerAttr toygerAttr) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public /* bridge */ /* synthetic */ boolean init(Context context, ToygerFaceCallback toygerFaceCallback, String str, String str2, Map map) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public boolean processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame) {
    }

    public boolean processSensorData(TGSensorFrame tGSensorFrame) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public void release() {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public void reset() {
    }

    public void handleInfoReady(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
    }

    public void handleStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerBaseService
    public /* bridge */ /* synthetic */ boolean init(Context context, boolean z, ToygerFaceCallback toygerFaceCallback) {
    }

    /* renamed from: init  reason: avoid collision after fix types in other method */
    public boolean init2(Context context, ToygerFaceCallback toygerFaceCallback, String str, String str2, Map<String, Object> map) {
    }

    /* renamed from: init  reason: avoid collision after fix types in other method */
    public boolean init2(Context context, boolean z, ToygerFaceCallback toygerFaceCallback) {
    }
}
