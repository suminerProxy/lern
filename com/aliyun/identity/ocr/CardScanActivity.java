package com.aliyun.identity.ocr;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.aliyun.identity.ocr.algorithm.AlgorithmAdaptor;
import com.aliyun.identity.ocr.model.AlgorithmOcrResult;
import com.aliyun.identity.ocr.takephoto.app.TakePhotoActivity;
import com.aliyun.identity.ocr.takephoto.model.TResult;
import com.aliyun.identity.platform.IdentityAlertOverlay;
import com.aliyun.identity.platform.IdentityLoadingOverlay;
import com.aliyun.identity.platform.SystemLoadingOverlay;
import com.aliyun.identity.platform.ThreadHandler;
import com.aliyun.identity.platform.api.IdentityOcrInfo;
import com.aliyun.identity.platform.camera.CameraData;
import com.aliyun.identity.platform.camera.CameraSurfaceView;
import com.aliyun.identity.platform.camera.ICameraCallback;
import com.aliyun.identity.platform.camera.ICameraTakePicture;
import com.aliyun.identity.platform.network.IdentityOcrCallback;
import com.aliyun.identity.platform.network.OssClientHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CardScanActivity extends TakePhotoActivity implements ICameraCallback, ThreadHandler.ThreadHandlerCallback {
    private static final int DEFAULT_MAX_ERROR_TIMES = 10;
    private final String OSS_FILE_TYPE_BANKCARD;
    private final String OSS_FILE_TYPE_FACE;
    private final String OSS_FILE_TYPE_OCRIDBACK;
    private final String OSS_FILE_TYPE_OCRIDFACE;
    public final int THREAD_CARD_INIT_ALGORITHM;
    private final int THREAD_CARD_MSG_BASE;
    public final int THREAD_CARD_PROCESS_FRAME;
    public final int THREAD_RELEASE_ALGORITHM;
    private final int UI_CARD_MSG_BASE;
    private final int UI_OCR_ERROR_CODE;
    private final int UI_OCR_IDCARD_OUT_DATE;
    private final int UI_OCR_PHOTO_IDENTITY_OCR_ERROR;
    private final int UI_OCR_PHOTO_IDENTITY_OCR_NET_ERROR;
    private final int UI_OCR_PHOTO_IDENTITY_OCR_SUCCESS;
    private final int UI_OCR_PHOTO_OSS_UPLOAD_ERROR;
    private final int UI_OCR_PHOTO_OSS_UPLOAD_SUCCESS;
    private final int UI_OCR_SCAN_ALGRITHM_INIT_FAIL;
    private final int UI_OCR_SCAN_ALGRITHM_INIT_SUCCESS;
    private final int UI_OCR_SCAN_BLINK;
    private final int UI_OCR_SCAN_BLINK_POST;
    private final int UI_OCR_SCAN_SUCCESS;
    private final int UI_OCR_SDK_MAX_TIME_OUT;
    private boolean bInitAlgorithm;
    private int idCardHeight;
    private int idCardLeft;
    private int idCardTop;
    private int idCardWidth;
    public IdentityLoadingOverlay identityLoadingOverlay;
    private IdentityScanView identityScanView;
    private boolean isVerifyAlbumPhoto;
    public FrameLayout loadingFrame;
    private CameraSurfaceView mCameraSurfaceView;
    private AtomicBoolean mIsOcrAlgorithmBusy;
    private ProcessImageParam mOcrImageParam;
    private AlgorithmAdaptor ocrBackAlgorithm;
    private AlgorithmAdaptor ocrBankAlgorithm;
    private Bitmap ocrCropBitmap;
    private AlgorithmAdaptor ocrFrontAlgorithm;
    private Bitmap ocrPhotoTakenPicture;
    private int ocrRetryCnt;
    private Bitmap ocrScanTakenPicture;
    private OcrState ocrState;
    private ThreadHandler ocrThreadHandler;
    private OcrType ocrType;
    private long scanStartTime;
    private long sdkStartTime;
    private long startTime;
    public SystemLoadingOverlay systemLoadingOverlay;
    public Handler uiHandler;

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass1(CardScanActivity cardScanActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass10(CardScanActivity cardScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass11 implements View.OnClickListener {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass11(CardScanActivity cardScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass12 implements View.OnClickListener {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass12(CardScanActivity cardScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass13 implements View.OnClickListener {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass13(CardScanActivity cardScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass14 implements View.OnClickListener {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass14(CardScanActivity cardScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass15 implements View.OnClickListener {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass15(CardScanActivity cardScanActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass16(CardScanActivity cardScanActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass17 implements ICameraTakePicture {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass17(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.platform.camera.ICameraTakePicture
        public void onTakenPicture(Bitmap bitmap) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass18 implements OssClientHelper.OssClientUploadListener {
        public final /* synthetic */ CardScanActivity this$0;
        public final /* synthetic */ long val$time;

        public AnonymousClass18(CardScanActivity cardScanActivity, long j2) {
        }

        @Override // com.aliyun.identity.platform.network.OssClientHelper.OssClientUploadListener
        public void onFinish(int i2, int i3) {
        }

        @Override // com.aliyun.identity.platform.network.OssClientHelper.OssClientUploadListener
        public boolean onUploadError(int i2, String str, String str2, String str3) {
        }

        @Override // com.aliyun.identity.platform.network.OssClientHelper.OssClientUploadListener
        public boolean onUploadSuccess(int i2, String str, String str2) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass19 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass19(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass2(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass20 implements IdentityAlertOverlay.CommAlertOverlayListener {
        public final /* synthetic */ CardScanActivity this$0;
        public final /* synthetic */ MessageBoxCB val$messageBoxCB;
        public final /* synthetic */ OcrState val$prevState;

        public AnonymousClass20(CardScanActivity cardScanActivity, OcrState ocrState, MessageBoxCB messageBoxCB) {
        }

        @Override // com.aliyun.identity.platform.IdentityAlertOverlay.CommAlertOverlayListener
        public void onCancel() {
        }

        @Override // com.aliyun.identity.platform.IdentityAlertOverlay.CommAlertOverlayListener
        public void onConfirm() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass3(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass4(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements IdentityOcrCallback {
        public final /* synthetic */ CardScanActivity this$0;
        public final /* synthetic */ String val$finalSideType;
        public final /* synthetic */ long val$time;

        public AnonymousClass5(CardScanActivity cardScanActivity, long j2, String str) {
        }

        @Override // com.aliyun.identity.platform.network.IdentityOcrCallback
        public void onError(String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.IdentityOcrCallback
        public void onServerError(String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.IdentityOcrCallback
        public void onSuccess(IdentityOcrInfo identityOcrInfo) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass6(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass7(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass8(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.CardScanActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements MessageBoxCB {
        public final /* synthetic */ CardScanActivity this$0;

        public AnonymousClass9(CardScanActivity cardScanActivity) {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.CardScanActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MessageBoxCB {
        void onCancel();

        void onOK();
    }

    public static /* synthetic */ int access$000(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ int access$002(CardScanActivity cardScanActivity, int i2) {
    }

    public static /* synthetic */ int access$010(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$100(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ boolean access$1000(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ boolean access$1002(CardScanActivity cardScanActivity, boolean z) {
    }

    public static /* synthetic */ Bitmap access$1100(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ Bitmap access$1200(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$1300(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$1400(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$1500(CardScanActivity cardScanActivity, boolean z) {
    }

    public static /* synthetic */ void access$1600(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$1700(CardScanActivity cardScanActivity, boolean z) {
    }

    public static /* synthetic */ void access$1800(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ boolean access$1900(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$200(CardScanActivity cardScanActivity, Message message) {
    }

    public static /* synthetic */ IdentityScanView access$2000(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$2100(CardScanActivity cardScanActivity, Bitmap bitmap) {
    }

    public static /* synthetic */ void access$2200(CardScanActivity cardScanActivity, OcrState ocrState) {
    }

    public static /* synthetic */ void access$300(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$400(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$500(CardScanActivity cardScanActivity, String str) {
    }

    public static /* synthetic */ void access$600(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ OcrType access$700(CardScanActivity cardScanActivity) {
    }

    public static /* synthetic */ void access$800(CardScanActivity cardScanActivity, OcrType ocrType) {
    }

    public static /* synthetic */ void access$900(CardScanActivity cardScanActivity) {
    }

    private float[] calcROI(int i2, int i3, int i4) {
    }

    private void disableButtons() {
    }

    private void enableSelectPhotoButton(boolean z) {
    }

    private void enableSubmitButton(boolean z) {
    }

    private void enableTakePhotoButton(boolean z) {
    }

    private AlgorithmAdaptor getOCRAlgrithm() {
    }

    private void init() {
    }

    private boolean initOCRAlgorithm() {
    }

    private void initUI() {
    }

    private boolean isScanType() {
    }

    private void onClickCloseBtn() {
    }

    private void onClickSubmitPhoto() {
    }

    private void onClickSwitch() {
    }

    private void onClickTakePhoto() {
    }

    private void onMessageBlink() {
    }

    private void onMessageBlinkPost() {
    }

    private void onMessageOCRScanSuccess(Message message) {
    }

    private void onOcrIdentityFinish() {
    }

    private void onPickImage() {
    }

    private void onPictureTaked(Bitmap bitmap) {
    }

    private AlgorithmOcrResult processCameraFrame() {
    }

    private void recoverStatus(OcrState ocrState) {
    }

    private void sendErrorCode(String str) {
    }

    private void setIdentityOcrUIState(boolean z) {
    }

    private OcrState setOcrState(OcrState ocrState) {
    }

    private void showMessageBox(String str, String str2, String str3, String str4, MessageBoxCB messageBoxCB) {
    }

    private void showOutTimeMsgBox() {
    }

    private void startScan() {
    }

    private void switchOCRType(OcrType ocrType) {
    }

    public void enableBarButtons(boolean z) {
    }

    public String[] getOCRBankModels() {
    }

    public String[] getOCRIDCardModels() {
    }

    public String getOCRSuccessTipText() {
    }

    public Drawable getScanMaskPicture() {
    }

    public String getScanMaskTips() {
    }

    public void handleOCRScanTimeOut() {
    }

    public boolean isOCRResultValid(AlgorithmOcrResult algorithmOcrResult) {
    }

    public <T> void navigatePage(Class<T> cls) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhotoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onError(int i2) {
    }

    @Override // com.aliyun.identity.platform.ThreadHandler.ThreadHandlerCallback
    public void onMessage(Message message) {
    }

    public void onMessageErrorCode(Message message) {
    }

    public void onMessageIdCardOutDate() {
    }

    public void onMessageInitOCRResult(boolean z) {
    }

    public void onMessageOCRError() {
    }

    public void onMessageOCRNetError() {
    }

    public void onMessageOCRSuccess() {
    }

    public void onMessageOSSError() {
    }

    public void onMessageOSSSuccess() {
    }

    public void onMessageSdkMaxTimeout() {
    }

    public void onOCRScanSuccess(Bitmap bitmap, Bitmap bitmap2, AlgorithmOcrResult algorithmOcrResult) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onPreviewFrame(CameraData cameraData) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onSurfaceChanged(double d2, double d3) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onSurfaceCreated() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onSurfaceDestroyed() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }

    public int readPictureDegree(String str) {
    }

    public Bitmap rotaingImageView(int i2, Bitmap bitmap) {
    }

    public void showLoadingOverlay(boolean z) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhotoActivity, com.aliyun.identity.ocr.takephoto.app.TakePhoto.TakeResultListener
    public void takeCancel() {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhotoActivity, com.aliyun.identity.ocr.takephoto.app.TakePhoto.TakeResultListener
    public void takeFail(TResult tResult, String str) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhotoActivity, com.aliyun.identity.ocr.takephoto.app.TakePhoto.TakeResultListener
    public void takeSuccess(TResult tResult) {
    }
}
