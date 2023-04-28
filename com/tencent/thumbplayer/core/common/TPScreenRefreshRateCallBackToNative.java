package com.tencent.thumbplayer.core.common;

import com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPScreenRefreshRateCallBackToNative implements TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener {
    private static final String TAG = "TPScreenRefreshRateCallBack";
    private long mNativeContext;

    private TPScreenRefreshRateCallBackToNative(long j2) {
    }

    private native void _onScreenRefreshRateChanged(float f2);

    @TPMethodCalledByNative
    private long getNativeContext() {
    }

    @TPMethodCalledByNative
    private void registerCallback() {
    }

    @TPMethodCalledByNative
    private void unregisterCallback() {
    }

    @Override // com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener
    public void onScreenRefreshRateChanged(float f2) {
    }
}
