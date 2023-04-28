package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;

@RequiresApi(17)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DummySurface extends Surface {
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        @Nullable
        private Error initError;
        @Nullable
        private RuntimeException initException;
        @Nullable
        private DummySurface surface;

        private void initInternal(int secureMode) {
        }

        private void releaseInternal() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
        }

        public DummySurface init(int secureMode) {
        }

        public void release() {
        }
    }

    public /* synthetic */ DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z, AnonymousClass1 anonymousClass1) {
    }

    private static int getSecureMode(Context context) {
    }

    public static synchronized boolean isSecureSupported(Context context) {
    }

    public static DummySurface newInstanceV17(Context context, boolean secure) {
    }

    @Override // android.view.Surface
    public void release() {
    }

    private DummySurface(DummySurfaceThread thread, SurfaceTexture surfaceTexture, boolean secure) {
    }
}
