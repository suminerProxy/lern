package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.view.Display;
import androidx.annotation.BinderThread;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class OrientationListener implements SensorEventListener {
    private final float[] angles;
    private final float[] deviceOrientationMatrix4x4;
    private final Display display;
    private final Listener[] listeners;
    private final float[] recenterMatrix4x4;
    private boolean recenterMatrixComputed;
    private final float[] tempMatrix4x4;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onOrientationChange(float[] deviceOrientationMatrix, float deviceRoll);
    }

    public OrientationListener(Display display, Listener... listeners) {
    }

    private float extractRoll(float[] matrix) {
    }

    private void notifyListeners(float[] deviceOrientationMatrix, float roll) {
    }

    private void recenter(float[] matrix) {
    }

    private void rotateAroundZ(float[] matrix, int rotation) {
    }

    private static void rotateYtoSky(float[] matrix) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent event) {
    }
}
