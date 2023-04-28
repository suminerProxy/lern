package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import androidx.annotation.AnyThread;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.spherical.OrientationListener;
import com.google.android.exoplayer2.video.spherical.TouchTracker;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    public static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final Handler mainHandler;
    private final OrientationListener orientationListener;
    @Nullable
    private final Sensor orientationSensor;
    private final SceneRenderer scene;
    private final SensorManager sensorManager;
    @Nullable
    private Surface surface;
    @Nullable
    private SurfaceTexture surfaceTexture;
    private final TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final CopyOnWriteArrayList<VideoSurfaceListener> videoSurfaceListeners;

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        private final float[] deviceOrientationMatrix;
        private float deviceRoll;
        private final float[] projectionMatrix;
        private final SceneRenderer scene;
        private final float[] tempMatrix;
        public final /* synthetic */ SphericalGLSurfaceView this$0;
        private float touchPitch;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] viewMatrix;
        private final float[] viewProjectionMatrix;

        public Renderer(final SphericalGLSurfaceView this$0, SceneRenderer scene) {
        }

        private float calculateFieldOfViewInYDirection(float aspect) {
        }

        @AnyThread
        private void updatePitchMatrix() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
        @BinderThread
        public synchronized void onOrientationChange(float[] matrix, float deviceRoll) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @UiThread
        public synchronized void onScrollChange(PointF scrollOffsetDegrees) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        @UiThread
        public boolean onSingleTapUp(MotionEvent event) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl, int width, int height) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl, EGLConfig config) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
    }

    private /* synthetic */ void a() {
    }

    public static /* synthetic */ void access$000(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
    }

    private /* synthetic */ void d(SurfaceTexture surfaceTexture) {
    }

    private void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture) {
    }

    private static void releaseSurface(@Nullable SurfaceTexture oldSurfaceTexture, @Nullable Surface oldSurface) {
    }

    private void updateOrientationListenerRegistration() {
    }

    public void addVideoSurfaceListener(VideoSurfaceListener listener) {
    }

    public /* synthetic */ void c() {
    }

    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
    }

    public CameraMotionListener getCameraMotionListener() {
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
    }

    @Nullable
    public Surface getVideoSurface() {
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
    }

    public void removeVideoSurfaceListener(VideoSurfaceListener listener) {
    }

    public void setDefaultStereoMode(int stereoMode) {
    }

    public void setUseSensorRotation(boolean useSensorRotation) {
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
    }
}
