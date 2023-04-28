package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class YUVReadTools {
    public static native void nativeReadYUVPlanesForByteArray(int i2, int i3, byte[] bArr);

    public static native void nativeReadYUVPlanesForByteBuffer(int i2, int i3, ByteBuffer byteBuffer);
}
