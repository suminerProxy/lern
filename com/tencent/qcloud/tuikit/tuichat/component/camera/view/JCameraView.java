package com.tencent.qcloud.tuikit.tuichat.component.camera.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ErrorListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.JCameraListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.TypeListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.state.CameraMachine;
import com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class JCameraView extends FrameLayout implements CameraInterface.CameraOpenOverCallback, SurfaceHolder.Callback, CameraView {
    public static final int BUTTON_STATE_BOTH = 259;
    public static final int BUTTON_STATE_ONLY_CAPTURE = 257;
    public static final int BUTTON_STATE_ONLY_RECORDER = 258;
    public static final int MEDIA_QUALITY_DESPAIR = 200000;
    public static final int MEDIA_QUALITY_FUNNY = 400000;
    public static final int MEDIA_QUALITY_HIGH = 2000000;
    public static final int MEDIA_QUALITY_LOW = 1200000;
    public static final int MEDIA_QUALITY_MIDDLE = 1600000;
    public static final int MEDIA_QUALITY_POOR = 800000;
    public static final int MEDIA_QUALITY_SORRY = 80000;
    private static final String TAG = null;
    public static final int TYPE_DEFAULT = 4;
    private static final int TYPE_FLASH_AUTO = 33;
    private static final int TYPE_FLASH_OFF = 35;
    private static final int TYPE_FLASH_ON = 34;
    public static final int TYPE_PICTURE = 1;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_VIDEO = 2;
    private Bitmap captureBitmap;
    private int duration;
    private ErrorListener errorLisenter;
    private Bitmap firstFrame;
    private boolean firstTouch;
    private float firstTouchLength;
    private int iconLeft;
    private int iconMargin;
    private int iconRight;
    private int iconSize;
    private int iconSrc;
    private JCameraListener jCameraLisenter;
    private int layout_width;
    private ClickListener leftClickListener;
    private CaptureLayout mCaptureLayout;
    private Context mContext;
    private FoucsView mFoucsView;
    private MediaPlayer mMediaPlayer;
    private ImageView mPhoto;
    private ImageView mSwitchCamera;
    private VideoView mVideoView;
    private CameraMachine machine;
    private long recordTime;
    private ClickListener rightClickListener;
    private float screenProp;
    private int type_flash;
    private String videoUrl;
    private int zoomGradient;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass1(JCameraView jCameraView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements CaptureListener {
        public final /* synthetic */ JCameraView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ long val$time;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, long j2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(JCameraView jCameraView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordEnd(long j2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordError() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordShort(long j2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordStart() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void recordZoom(float f2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.CaptureListener
        public void takePictures() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements TypeListener {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass3(JCameraView jCameraView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.TypeListener
        public void cancel() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.TypeListener
        public void confirm() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ClickListener {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass4(JCameraView jCameraView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements ClickListener {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass5(JCameraView jCameraView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends Thread {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass6(JCameraView jCameraView) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements CameraInterface.FocusCallback {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass7(JCameraView jCameraView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraInterface.FocusCallback
        public void focusSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements MediaPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass8(JCameraView jCameraView) {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ JCameraView this$0;

        public AnonymousClass9(JCameraView jCameraView) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    public JCameraView(Context context) {
    }

    public static /* synthetic */ VideoView access$000(JCameraView jCameraView) {
    }

    public static /* synthetic */ float access$100(JCameraView jCameraView) {
    }

    public static /* synthetic */ FoucsView access$1000(JCameraView jCameraView) {
    }

    public static /* synthetic */ MediaPlayer access$1100(JCameraView jCameraView) {
    }

    public static /* synthetic */ void access$1200(JCameraView jCameraView, float f2, float f3) {
    }

    public static /* synthetic */ CameraMachine access$200(JCameraView jCameraView) {
    }

    public static /* synthetic */ ImageView access$300(JCameraView jCameraView) {
    }

    public static /* synthetic */ CaptureLayout access$400(JCameraView jCameraView) {
    }

    public static /* synthetic */ long access$502(JCameraView jCameraView, long j2) {
    }

    public static /* synthetic */ String access$600() {
    }

    public static /* synthetic */ ErrorListener access$700(JCameraView jCameraView) {
    }

    public static /* synthetic */ ClickListener access$800(JCameraView jCameraView) {
    }

    public static /* synthetic */ ClickListener access$900(JCameraView jCameraView) {
    }

    private void initData() {
    }

    private void initView() {
    }

    private void setFlashRes() {
    }

    private void setFocusViewWidthAnimation(float f2, float f3) {
    }

    private void updateVideoViewSize(float f2, float f3) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraInterface.CameraOpenOverCallback
    public void cameraHasOpened() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void confirmState(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public boolean handlerFoucs(float f2, float f3) {
    }

    public void onDestroy() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void playVideo(Bitmap bitmap, String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void resetState(int i2) {
    }

    public void setErrorLisenter(ErrorListener errorListener) {
    }

    public void setFeatures(int i2) {
    }

    public void setJCameraLisenter(JCameraListener jCameraListener) {
    }

    public void setLeftClickListener(ClickListener clickListener) {
    }

    public void setMediaQuality(int i2) {
    }

    public void setRightClickListener(ClickListener clickListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void setTip(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void showPicture(Bitmap bitmap, boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void startPreviewCallback() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView
    public void stopVideo() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public JCameraView(Context context, AttributeSet attributeSet) {
    }

    public JCameraView(Context context, AttributeSet attributeSet, int i2) {
    }
}
