package com.tencent.ugc;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.List;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class RemuxJoiner {
    private static final String TAG = "RemuxJoiner";
    private RemuxJoinerListener mListener;
    private long mNativeHandle;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface RemuxJoinerListener {
        void onRemuxJoinerComplete(int i2, String str);

        void onRemuxJoinerProgress(float f2);
    }

    public static boolean isConcatableWithoutReencode(List<String> list) {
    }

    private static native long nativeCreate(RemuxJoiner remuxJoiner);

    private static native void nativeDestroy(long j2);

    private static native boolean nativeIsConcatableWithoutReencode(String str, String str2);

    private static native boolean nativeSetSourcePaths(long j2, Object[] objArr);

    private static native boolean nativeSetTargetPath(long j2, String str);

    private static native boolean nativeStart(long j2);

    private static native void nativeStop(long j2);

    @CalledByNative
    private void onComplete(int i2, String str) {
    }

    @CalledByNative
    private void onProgress(float f2) {
    }

    public void initialize() {
    }

    public boolean setSourcePaths(List<String> list) {
    }

    public boolean setTargetPath(String str) {
    }

    public void setVideoJoinerListener(RemuxJoinerListener remuxJoinerListener) {
    }

    public boolean start() {
    }

    public void stop() {
    }

    public void uninitialize() {
    }
}
