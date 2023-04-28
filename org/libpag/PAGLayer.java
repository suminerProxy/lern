package org.libpag;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGLayer {
    public static final int LayerTypeImage = 5;
    public static final int LayerTypeNull = 1;
    public static final int LayerTypePreCompose = 6;
    public static final int LayerTypeShape = 4;
    public static final int LayerTypeSolid = 2;
    public static final int LayerTypeText = 3;
    public static final int LayerTypeUnknown = 0;
    public long nativeContext;

    public PAGLayer(long j2) {
    }

    private native void getTotalMatrix(float[] fArr);

    private native void matrix(float[] fArr);

    private native boolean nativeEquals(PAGLayer pAGLayer);

    private static native void nativeInit();

    private native void nativeRelease();

    private native void setMatrix(float[] fArr);

    public native long currentTime();

    public native long duration();

    public native int editableIndex();

    public boolean equals(Object obj) {
    }

    public native boolean excludedFromTimeline();

    public void finalize() {
    }

    public native float frameRate();

    public native RectF getBounds();

    public native double getProgress();

    public Matrix getTotalMatrix() {
    }

    public native long globalToLocalTime(long j2);

    public int hashCode() {
    }

    public native String layerName();

    public native int layerType();

    public native long localTimeToGlobal(long j2);

    public native PAGMarker[] markers();

    public Matrix matrix() {
    }

    public native PAGComposition parent();

    public native void resetMatrix();

    public native void setCurrentTime(long j2);

    public native void setExcludedFromTimeline(boolean z);

    public void setMatrix(Matrix matrix) {
    }

    public native void setProgress(double d2);

    public native void setStartTime(long j2);

    public native void setVisible(boolean z);

    public native long startTime();

    public native PAGLayer trackMatteLayer();

    public native boolean visible();
}
