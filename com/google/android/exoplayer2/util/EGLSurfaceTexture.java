package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(17)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = null;
    private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
    private static final int EGL_SURFACE_HEIGHT = 1;
    private static final int EGL_SURFACE_WIDTH = 1;
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;
    @Nullable
    private final TextureImageListener callback;
    @Nullable
    private EGLContext context;
    @Nullable
    private EGLDisplay display;
    private final Handler handler;
    @Nullable
    private EGLSurface surface;
    @Nullable
    private SurfaceTexture texture;
    private final int[] textureIdHolder;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class GlException extends RuntimeException {
        public /* synthetic */ GlException(String str, AnonymousClass1 anonymousClass1) {
        }

        private GlException(String msg) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface SecureMode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TextureImageListener {
        void onFrameAvailable();
    }

    public EGLSurfaceTexture(Handler handler) {
    }

    private static EGLConfig chooseEGLConfig(EGLDisplay display) {
    }

    private static EGLContext createEGLContext(EGLDisplay display, EGLConfig config, int secureMode) {
    }

    private static EGLSurface createEGLSurface(EGLDisplay display, EGLConfig config, EGLContext context, int secureMode) {
    }

    private void dispatchOnFrameAvailable() {
    }

    private static void generateTextureIds(int[] textureIdHolder) {
    }

    private static EGLDisplay getDefaultDisplay() {
    }

    public SurfaceTexture getSurfaceTexture() {
    }

    public void init(int secureMode) {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    public void release() {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public EGLSurfaceTexture(Handler handler, @Nullable TextureImageListener callback) {
    }
}
