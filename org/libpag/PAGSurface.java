package org.libpag;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGSurface {

    /* renamed from: a  reason: collision with root package name */
    private Surface f29836a;
    private boolean b;
    private int c;
    public long nativeSurface;

    private PAGSurface(long j2) {
    }

    public static PAGSurface FromSurface(Surface surface) {
    }

    public static PAGSurface FromSurfaceTexture(SurfaceTexture surfaceTexture) {
    }

    public static PAGSurface FromTexture(int i2, int i3, int i4) {
    }

    public static PAGSurface FromTextureForAsyncThread(int i2, int i3, int i4) {
    }

    public static PAGSurface MakeOffscreen(int i2, int i3) {
    }

    private static native long SetupFromSurfaceWithGLContext(Surface surface, long j2);

    public static native long SetupFromTexture(int i2, int i3, int i4, boolean z, boolean z2);

    private static native long SetupOffscreen(int i2, int i3);

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    public native boolean clearAll();

    public native boolean copyPixelsTo(Bitmap bitmap);

    public void finalize() {
    }

    public native void freeCache();

    public native int height();

    public native Bitmap makeSnapshot();

    public void release() {
    }

    public native void updateSize();

    public native int width();

    public static PAGSurface FromSurface(Surface surface, EGLContext eGLContext) {
    }

    public static PAGSurface FromSurfaceTexture(SurfaceTexture surfaceTexture, EGLContext eGLContext) {
    }

    public static PAGSurface FromTexture(int i2, int i3, int i4, boolean z) {
    }

    public static PAGSurface FromTextureForAsyncThread(int i2, int i3, int i4, boolean z) {
    }
}
