package com.sobot.chat.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaRecorder;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.ImageView;
import com.sobot.chat.camera.listener.StErrorListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CameraInterface implements Camera.PreviewCallback {
    private static final String TAG = "CJT";
    public static final int TYPE_CAPTURE = 145;
    public static final int TYPE_RECORDER = 144;
    private static volatile CameraInterface mCameraInterface;
    private int CAMERA_FRONT_POSITION;
    private int CAMERA_POST_POSITION;
    private int SELECTED_CAMERA;
    private int angle;
    private int cameraAngle;
    private StErrorListener errorLisenter;
    private byte[] firstFrame_data;
    public int handlerTime;
    private boolean isPreviewing;
    private boolean isRecorder;
    private Camera mCamera;
    private Context mContext;
    private SurfaceHolder mHolder;
    private Camera.Parameters mParams;
    private ImageView mSwitchView;
    private int mediaQuality;
    private MediaRecorder mediaRecorder;
    private int nowAngle;
    private int nowScaleRate;
    private int preview_height;
    private int preview_width;
    private int recordScleRate;
    private int rotation;
    private String saveVideoPath;
    private float screenProp;
    private SensorEventListener sensorEventListener;
    private SensorManager sm;
    private String videoFileAbsPath;
    private String videoFileName;
    private Bitmap videoFirstFrame;

    /* renamed from: com.sobot.chat.camera.CameraInterface$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements SensorEventListener {
        public final /* synthetic */ CameraInterface this$0;

        public AnonymousClass1(CameraInterface cameraInterface) {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CameraInterface$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Camera.PictureCallback {
        public final /* synthetic */ CameraInterface this$0;
        public final /* synthetic */ TakePictureCallback val$callback;

        public AnonymousClass2(CameraInterface cameraInterface, TakePictureCallback takePictureCallback) {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    /* renamed from: com.sobot.chat.camera.CameraInterface$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Camera.AutoFocusCallback {
        public final /* synthetic */ CameraInterface this$0;
        public final /* synthetic */ FocusCallback val$callback;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$currentFocusMode;
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        public AnonymousClass3(CameraInterface cameraInterface, String str, FocusCallback focusCallback, Context context, float f2, float f3) {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface CameraOpenOverCallback {
        void cameraHasOpened();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface DestoryLinsten {
        void onDestory();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface ErrorCallback {
        void onError();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface FocusCallback {
        void focusSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface StopRecordCallback {
        void recordResult(String str, Bitmap bitmap);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface TakePictureCallback {
        void captureResult(Bitmap bitmap, boolean z);
    }

    private CameraInterface() {
    }

    public static /* synthetic */ int access$002(CameraInterface cameraInterface, int i2) {
    }

    public static /* synthetic */ void access$100(CameraInterface cameraInterface) {
    }

    public static /* synthetic */ Context access$200(CameraInterface cameraInterface) {
    }

    public static /* synthetic */ Bitmap access$300(CameraInterface cameraInterface, byte[] bArr, Context context) {
    }

    public static /* synthetic */ int access$400(CameraInterface cameraInterface) {
    }

    public static /* synthetic */ int access$500(CameraInterface cameraInterface) {
    }

    public static /* synthetic */ int access$600(CameraInterface cameraInterface) {
    }

    public static /* synthetic */ int access$700(CameraInterface cameraInterface) {
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
    }

    private static Rect calculateTapArea(float f2, float f3, float f4, Context context) {
    }

    private static int clamp(int i2, int i3, int i4) {
    }

    private Bitmap compressBitmap(byte[] bArr, Context context) {
    }

    public static void destroyCameraInterface() {
    }

    private void findAvailableCameras() {
    }

    public static synchronized CameraInterface getInstance() {
    }

    private synchronized void openCamera(int i2) {
    }

    private void rotationAnimation() {
    }

    private void setFlashModel() {
    }

    public void doDestroyCamera() {
    }

    public void doOpenCamera(CameraOpenOverCallback cameraOpenOverCallback) {
    }

    public void doStartPreview(SurfaceHolder surfaceHolder, float f2) {
    }

    public void doStopPreview() {
    }

    public void handleFocus(Context context, float f2, float f3, FocusCallback focusCallback) {
    }

    public void isPreview(boolean z) {
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
    }

    public void registerSensorManager(Context context) {
    }

    public void setContext(Context context) {
    }

    public void setErrorLinsenter(StErrorListener stErrorListener) {
    }

    public void setFlashMode(String str) {
    }

    public void setMediaQuality(int i2) {
    }

    public void setSaveVideoPath(String str) {
    }

    public void setSwitchView(ImageView imageView) {
    }

    public void setZoom(float f2, int i2) {
    }

    public void startRecord(Surface surface, float f2, ErrorCallback errorCallback) {
    }

    public void stopRecord(boolean z, StopRecordCallback stopRecordCallback) {
    }

    public synchronized void switchCamera(SurfaceHolder surfaceHolder, float f2) {
    }

    public void takePicture(TakePictureCallback takePictureCallback) {
    }

    public void unregisterSensorManager(Context context) {
    }
}
