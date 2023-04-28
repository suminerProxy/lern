package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ServerVideoConsumerConfig {
    public boolean enableVui;
    public int hwDecoderMaxCacheForHighRes;
    public int hwDecoderMaxCacheForLowRes;

    public static boolean isHWHevcDecodeAllowed() {
    }

    private static native boolean nativeIsHardwareHevcDecodeAllowed();

    @CalledByNative
    public void setEnableVui(boolean z) {
    }

    @CalledByNative
    public void setHardwareDecoderMaxCache(int i2, int i3) {
    }

    public String toString() {
    }
}
