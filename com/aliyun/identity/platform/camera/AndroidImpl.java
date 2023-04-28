package com.aliyun.identity.platform.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.aliyun.identity.platform.config.DeviceSetting;
import java.util.Map;

@SuppressLint({"InlinedApi"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AndroidImpl implements ICameraInterface {
    private static AndroidImpl mCameraInterface;
    private boolean isCameraOpen;
    private boolean isCameraStart;
    private boolean isPreviewing;
    private Camera mCamera;
    private ICameraCallback mCameraCallback;
    private int mCameraID;
    private int mCameraNumber;
    private int mCameraViewRotationAngle;
    private Context mContext;
    private DeviceSetting mDeviceSetting;
    private boolean mFront;
    private int mHeight;
    private final Object mLock;
    private Camera.Parameters mParams;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private int mWidth;

    /* renamed from: com.aliyun.identity.platform.camera.AndroidImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Camera.PreviewCallback {
        public final /* synthetic */ AndroidImpl this$0;

        public AnonymousClass1(AndroidImpl androidImpl) {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.camera.AndroidImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Camera.PictureCallback {
        public final /* synthetic */ AndroidImpl this$0;
        public final /* synthetic */ ICameraTakePicture val$cameraTakePicture;

        public AnonymousClass2(AndroidImpl androidImpl, ICameraTakePicture iCameraTakePicture) {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    private AndroidImpl() {
    }

    public static /* synthetic */ ICameraCallback access$000(AndroidImpl androidImpl) {
    }

    public static /* synthetic */ int access$100(AndroidImpl androidImpl) {
    }

    public static /* synthetic */ int access$200(AndroidImpl androidImpl) {
    }

    public static /* synthetic */ int access$300(AndroidImpl androidImpl) {
    }

    public static /* synthetic */ int access$400(AndroidImpl androidImpl) {
    }

    public static /* synthetic */ DeviceSetting access$500(AndroidImpl androidImpl) {
    }

    public static /* synthetic */ AndroidImpl access$600() {
    }

    public static /* synthetic */ int access$700(AndroidImpl androidImpl, DeviceSetting deviceSetting) {
    }

    public static /* synthetic */ Camera access$800(AndroidImpl androidImpl) {
    }

    private void adjustCameraParams() {
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
    }

    private int getCameraAutoAngle(DeviceSetting deviceSetting) {
    }

    public static synchronized AndroidImpl getInstance() {
    }

    private void initContext(Context context) {
    }

    private boolean realStartCamera(int i2) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public boolean beautifyAvatar(Bitmap bitmap) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void closeCamera() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public PointF colorToDepth(PointF pointF) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public PointF depthToColor(PointF pointF) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public Camera getCamera() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public CameraParams getCameraParams() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getCameraPictureAngle() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public String getCameraSN() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getCameraViewRotation() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getColorHeight() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getColorMode() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getColorWidth() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getDepthHeight() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getDepthWidth() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public String getFirmwareVersion() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getPreviewHeight() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public int getPreviewWidth() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public Rect getROI() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public Object getUVCCamera() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void initCamera(Context context, boolean z, DeviceSetting deviceSetting) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public boolean isMirror() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void lockCameraWhiteBalanceAndExposure() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void openCamera(DeviceSetting deviceSetting) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void releaseCamera() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void setCallback(ICameraCallback iCameraCallback) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public boolean setDrawCapturing(boolean z) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void setFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void setGLSurfaceViewListener(IGLSurfaceViewListener iGLSurfaceViewListener) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void setRenderLayers(Map<String, Object> map) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void startCamera() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void startFpsCheck() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void startPreview(SurfaceHolder surfaceHolder, float f2, int i2, int i3) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void stopCamera() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void stopFpsCheck() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void stopPreview() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void takePhoto(ICameraTakePicture iCameraTakePicture) {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void turnOffTakePhotoFlash() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void turnOnTakePhotoFlash() {
    }

    @Override // com.aliyun.identity.platform.camera.ICameraInterface
    public void unlockCameraWhiteBalanceAndExposure() {
    }

    private int getCameraAutoAngle(int i2) {
    }
}
