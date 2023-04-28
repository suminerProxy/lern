package org.libpag;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class VideoSurface implements SurfaceTexture.OnFrameAvailableListener {
    public long nativeContext;

    private VideoSurface(int i2, int i3) {
    }

    public static VideoSurface a(int i2, int i3) {
    }

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    private native void nativeSetup(int i2, int i3);

    private native void notifyFrameAvailable();

    public void finalize() {
    }

    public native Surface getInputSurface();

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    public void a() {
    }
}
