package com.sobot.chat.camera;

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
import com.sobot.chat.camera.CameraInterface;
import com.sobot.chat.camera.listener.StCameraListener;
import com.sobot.chat.camera.listener.StCaptureListener;
import com.sobot.chat.camera.listener.StClickListener;
import com.sobot.chat.camera.listener.StErrorListener;
import com.sobot.chat.camera.listener.StTypeListener;
import com.sobot.chat.camera.state.CameraMachine;
import com.sobot.chat.camera.view.StICameraView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StCameraView extends FrameLayout implements CameraInterface.CameraOpenOverCallback, SurfaceHolder.Callback, StICameraView {
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
    public static final int TYPE_DEFAULT = 4;
    private static final int TYPE_FLASH_AUTO = 33;
    private static final int TYPE_FLASH_OFF = 35;
    private static final int TYPE_FLASH_ON = 34;
    public static final int TYPE_PICTURE = 1;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_VIDEO = 2;
    private Bitmap captureBitmap;
    private int duration;
    private StErrorListener errorLisenter;
    private Bitmap firstFrame;
    private boolean firstTouch;
    private float firstTouchLength;
    private int iconLeft;
    private int iconMargin;
    private int iconRight;
    private int iconSize;
    private int iconSrc;
    private StCameraListener jCameraLisenter;
    private int layout_width;
    private StClickListener leftClickListener;
    private CaptureLayout mCaptureLayout;
    private StFoucsView mFoucsView;
    private MediaPlayer mMediaPlayer;
    private ImageView mPhoto;
    private ImageView mSwitchCamera;
    private VideoView mVideoView;
    private CameraMachine machine;
    private StClickListener rightClickListener;
    private float screenProp;
    private int type_flash;
    private String videoUrl;
    private int zoomGradient;

    /* renamed from: com.sobot.chat.camera.StCameraView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass1(StCameraView stCameraView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StCaptureListener {
        public final /* synthetic */ StCameraView this$0;

        /* renamed from: com.sobot.chat.camera.StCameraView$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ long val$time;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, long j2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(StCameraView stCameraView) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordEnd(long j2) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordError() {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordShort(long j2) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordStart() {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void recordZoom(float f2) {
        }

        @Override // com.sobot.chat.camera.listener.StCaptureListener
        public void takePictures() {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StTypeListener {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass3(StCameraView stCameraView) {
        }

        @Override // com.sobot.chat.camera.listener.StTypeListener
        public void cancel() {
        }

        @Override // com.sobot.chat.camera.listener.StTypeListener
        public void confirm() {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements StClickListener {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass4(StCameraView stCameraView) {
        }

        @Override // com.sobot.chat.camera.listener.StClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements StClickListener {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass5(StCameraView stCameraView) {
        }

        @Override // com.sobot.chat.camera.listener.StClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 extends Thread {
        public final /* synthetic */ StCameraView this$0;

        /* renamed from: com.sobot.chat.camera.StCameraView$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass6 this$1;

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass6(StCameraView stCameraView) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements CameraInterface.FocusCallback {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass7(StCameraView stCameraView) {
        }

        @Override // com.sobot.chat.camera.CameraInterface.FocusCallback
        public void focusSuccess() {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements MediaPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass8(StCameraView stCameraView) {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.sobot.chat.camera.StCameraView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass9 implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ StCameraView this$0;

        public AnonymousClass9(StCameraView stCameraView) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    public StCameraView(Context context) {
    }

    public static /* synthetic */ VideoView access$000(StCameraView stCameraView) {
    }

    public static /* synthetic */ float access$100(StCameraView stCameraView) {
    }

    public static /* synthetic */ StFoucsView access$1000(StCameraView stCameraView) {
    }

    public static /* synthetic */ MediaPlayer access$1100(StCameraView stCameraView) {
    }

    public static /* synthetic */ void access$1200(StCameraView stCameraView, float f2, float f3) {
    }

    public static /* synthetic */ CameraMachine access$200(StCameraView stCameraView) {
    }

    public static /* synthetic */ ImageView access$300(StCameraView stCameraView) {
    }

    public static /* synthetic */ CaptureLayout access$400(StCameraView stCameraView) {
    }

    public static /* synthetic */ StErrorListener access$500(StCameraView stCameraView) {
    }

    public static /* synthetic */ void access$600(StCameraView stCameraView) {
    }

    public static /* synthetic */ StClickListener access$700(StCameraView stCameraView) {
    }

    public static /* synthetic */ StClickListener access$800(StCameraView stCameraView) {
    }

    public static /* synthetic */ void access$900(StCameraView stCameraView, float f2, float f3) {
    }

    private void initAttrs() {
    }

    private void initData() {
    }

    private void initView() {
    }

    private void recycleBitmap() {
    }

    private void setFocusViewWidthAnimation(float f2, float f3) {
    }

    private void updateVideoViewSize(float f2, float f3) {
    }

    @Override // com.sobot.chat.camera.CameraInterface.CameraOpenOverCallback
    public void cameraHasOpened() {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
    public void confirmState(int i2) {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
    public boolean handlerFoucs(float f2, float f3) {
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

    @Override // com.sobot.chat.camera.view.StICameraView
    public void playVideo(Bitmap bitmap, String str) {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
    public void resetState(int i2) {
    }

    public void setErrorLisenter(StErrorListener stErrorListener) {
    }

    public void setFeatures(int i2) {
    }

    public void setJCameraLisenter(StCameraListener stCameraListener) {
    }

    public void setLeftClickListener(StClickListener stClickListener) {
    }

    public void setMediaQuality(int i2) {
    }

    public void setRightClickListener(StClickListener stClickListener) {
    }

    public void setSaveVideoPath(String str) {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
    public void setTip(String str) {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
    public void showPicture(Bitmap bitmap, boolean z) {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
    public void startPreviewCallback() {
    }

    @Override // com.sobot.chat.camera.view.StICameraView
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

    public StCameraView(Context context, AttributeSet attributeSet) {
    }

    public StCameraView(Context context, AttributeSet attributeSet, int i2) {
    }
}
