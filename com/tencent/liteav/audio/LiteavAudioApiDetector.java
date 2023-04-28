package com.tencent.liteav.audio;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LiteavAudioApiDetector {
    private static final boolean DEBUG = true;
    private static final String TAG = "LiteavAudioApiDetector";
    private boolean mIsAAudioSupported;
    private boolean mIsOboeSupported;
    private boolean mIsOpenSLSupported;

    @CalledByNative
    public LiteavAudioApiDetector(long j2) {
    }

    private boolean isAAudioSupported() {
    }

    private boolean isOboeSupported() {
    }

    private boolean isOpenSLSupported() {
    }

    private static native void nativeCacheAudioParameters(long j2, boolean z, boolean z2);

    private void storeAudioParameters() {
    }
}
