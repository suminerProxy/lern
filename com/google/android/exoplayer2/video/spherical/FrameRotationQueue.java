package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.TimedValueQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FrameRotationQueue {
    private final float[] recenterMatrix;
    private boolean recenterMatrixComputed;
    private final float[] rotationMatrix;
    private final TimedValueQueue<float[]> rotations;

    public static void computeRecenterMatrix(float[] recenterMatrix, float[] rotationMatrix) {
    }

    private static void getRotationMatrixFromAngleAxis(float[] matrix, float[] angleAxis) {
    }

    public boolean pollRotationMatrix(float[] matrix, long timestampUs) {
    }

    public void reset() {
    }

    public void setRotation(long timestampUs, float[] angleAxis) {
    }
}
