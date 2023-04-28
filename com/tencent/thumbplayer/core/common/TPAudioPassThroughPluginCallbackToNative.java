package com.tencent.thumbplayer.core.common;

import com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPAudioPassThroughPluginCallbackToNative implements TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener {
    private static final String TAG = "TPAudioPassThroughPluginCallback";
    private long mNativeContext;

    private TPAudioPassThroughPluginCallbackToNative(long j2) {
    }

    private native void _onAudioPassThroughStateChanged(boolean z);

    @TPMethodCalledByNative
    private long getNativeContext() {
    }

    @TPMethodCalledByNative
    private void registerCallback() {
    }

    @TPMethodCalledByNative
    private void unregisterCallback() {
    }

    @Override // com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener
    public void onAudioPassThroughPlugin(boolean z) {
    }
}
