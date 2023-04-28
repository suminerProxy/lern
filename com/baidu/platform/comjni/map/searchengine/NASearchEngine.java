package com.baidu.platform.comjni.map.searchengine;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NASearchEngine extends NativeComponent {
    private static native boolean nativeCancelRequest(long j2, int i2);

    private static native long nativeCreate();

    private static native String nativeGetJsonResult(long j2, int i2);

    private static native byte[] nativeGetProtobufResult(long j2, int i2);

    private static native boolean nativeInit(long j2, int i2);

    private static native boolean nativeInitWithBundle(long j2, String str);

    private static native int nativeRelease(long j2);

    private static native int nativeRequest(long j2, String str);

    private static native boolean nativeRequestData(long j2, byte[] bArr);

    private static native void nativeUpdateOfflineSearchPath(long j2, String str);

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }
}
