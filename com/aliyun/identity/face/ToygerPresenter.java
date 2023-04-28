package com.aliyun.identity.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.alipay.zoloz.toyger.face.ToygerFaceCallback;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.alipay.zoloz.toyger.face.ToygerFaceState;
import com.aliyun.identity.platform.camera.CameraData;
import com.aliyun.identity.platform.camera.ICameraCallback;
import com.aliyun.identity.platform.camera.ICameraInterface;
import com.aliyun.identity.platform.config.AndroidClientConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerPresenter implements ToygerFaceCallback, ICameraCallback {
    private static ToygerPresenter s_instance;
    private Context ctx;
    private ToygerFaceAttr highQualityFaceAttr;
    private Bitmap highQualityFaceImage;
    private boolean isMsgBoxPopuped;
    private AtomicBoolean isProcessingImage;
    private boolean isToygerCameraInited;
    private ICameraInterface mCameraInterface;
    private ToygerFaceService mToygerFaceService;
    private WorkState mWorkState;
    private Map<String, Object> toygerParams;
    private Handler uiHandler;
    private int videoFrameIdx;
    private List<Bitmap> videoFrames;

    private int calcAlgorithAngle() {
    }

    private void clear() {
    }

    public static ToygerPresenter getInstance() {
    }

    private String getPublicKey() {
    }

    private void initToygerCameraParams(CameraData cameraData) {
    }

    private void initToygerFaceService(AndroidClientConfig androidClientConfig) {
    }

    private boolean isBackCamera() {
    }

    private void saveVideoFrame(CameraData cameraData, int i2) {
    }

    private void sendError(String str) {
    }

    public ToygerFaceAttr getHighQualityFaceAttr() {
    }

    public Bitmap getHighQualityFaceImage() {
    }

    public WorkState getWorkState() {
    }

    public boolean init(Context context, Handler handler, ICameraInterface iCameraInterface) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public PointF onAlignDepthPoint(PointF pointF) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public void onAsyncUpload(int i2, byte[] bArr, byte[] bArr2, boolean z) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onComplete(int i2, byte[] bArr, byte[] bArr2, boolean z) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onError(int i2) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onEvent(int i2, Map<String, Object> map) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public /* bridge */ /* synthetic */ boolean onHighQualityFrame(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraCallback
    public void onPreviewFrame(CameraData cameraData) {
    }

    public void onRelease() {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public /* bridge */ /* synthetic */ boolean onStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr, Map map) {
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

    public void setHighQualityFaceAttr(ToygerFaceAttr toygerFaceAttr) {
    }

    public void setHighQualityFaceImage(Bitmap bitmap) {
    }

    public void setMsgBoxPopuped(boolean z) {
    }

    public WorkState setWorkState(WorkState workState) {
    }

    /* renamed from: onHighQualityFrame  reason: avoid collision after fix types in other method */
    public boolean onHighQualityFrame2(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
    }

    /* renamed from: onStateUpdated  reason: avoid collision after fix types in other method */
    public boolean onStateUpdated2(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr, Map<String, Object> map) {
    }
}
