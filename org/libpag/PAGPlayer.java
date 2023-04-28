package org.libpag;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGPlayer {

    /* renamed from: a  reason: collision with root package name */
    private PAGSurface f29835a;
    private long nativeContext;

    private native void nativeFinalize();

    private native void nativeGetMatrix(float[] fArr);

    private static final native void nativeInit();

    private final native void nativeRelease();

    private native void nativeSetMatrix(float f2, float f3, float f4, float f5, float f6, float f7);

    private native void nativeSetSurface(long j2);

    private final native void nativeSetup();

    public native boolean cacheEnabled();

    public native float cacheScale();

    public native long currentFrame();

    public native long duration();

    public void finalize() {
    }

    public boolean flush() {
    }

    public native boolean flushAndFenceSync(long[] jArr);

    public native RectF getBounds(PAGLayer pAGLayer);

    public native PAGComposition getComposition();

    public native PAGLayer[] getLayersUnderPoint(float f2, float f3);

    public native double getProgress();

    public PAGSurface getSurface() {
    }

    public native boolean hitTestPoint(PAGLayer pAGLayer, float f2, float f3, boolean z);

    public Matrix matrix() {
    }

    public native float maxFrameRate();

    public native void prepare();

    public void release() {
    }

    public native int scaleMode();

    public native void setCacheEnabled(boolean z);

    public native void setCacheScale(float f2);

    public native void setComposition(PAGComposition pAGComposition);

    public void setMatrix(Matrix matrix) {
    }

    public native void setMaxFrameRate(float f2);

    public native void setProgress(double d2);

    public native void setScaleMode(int i2);

    public void setSurface(PAGSurface pAGSurface) {
    }

    public native void setVideoEnabled(boolean z);

    public native boolean videoEnabled();

    public native boolean waitSync(long j2);
}
