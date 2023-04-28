package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private volatile int defaultStereoMode;
    private final AtomicBoolean frameAvailable;
    private final FrameRotationQueue frameRotationQueue;
    @Nullable
    private byte[] lastProjectionData;
    private int lastStereoMode;
    private final TimedValueQueue<Projection> projectionQueue;
    private final ProjectionRenderer projectionRenderer;
    private final AtomicBoolean resetRotationAtNextFrame;
    private final float[] rotationMatrix;
    private final TimedValueQueue<Long> sampleTimestampQueue;
    private SurfaceTexture surfaceTexture;
    private final float[] tempMatrix;
    private int textureId;

    private /* synthetic */ void a(SurfaceTexture surfaceTexture) {
    }

    private void setProjection(@Nullable byte[] projectionData, int stereoMode, long timeNs) {
    }

    public /* synthetic */ void b(SurfaceTexture surfaceTexture) {
    }

    public void drawFrame(float[] viewProjectionMatrix, boolean rightEye) {
    }

    public SurfaceTexture init() {
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long timeUs, float[] rotation) {
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long presentationTimeUs, long releaseTimeNs, Format format, @Nullable MediaFormat mediaFormat) {
    }

    public void setDefaultStereoMode(int stereoMode) {
    }

    public void shutdown() {
    }
}
