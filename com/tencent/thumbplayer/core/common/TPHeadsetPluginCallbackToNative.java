package com.tencent.thumbplayer.core.common;

import com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPHeadsetPluginCallbackToNative implements TPHeadsetPluginDetector.HeadsetPluginListener {
    private static final String TAG = "TPHeadsetPluginCallback";
    private long mNativeContext;

    private TPHeadsetPluginCallbackToNative(long j2) {
    }

    private native void _onAudioRouteChanged(Set<Integer> set, Set<Integer> set2);

    @TPMethodCalledByNative
    private long getNativeContext() {
    }

    @TPMethodCalledByNative
    private void registerCallback() {
    }

    @TPMethodCalledByNative
    private void unregisterCallback() {
    }

    @Override // com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener
    public void onHeadsetPlugin(Set<Integer> set, Set<Integer> set2) {
    }
}
