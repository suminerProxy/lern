package com.baidu.platform.comjni.map.msgcenter;

import com.baidu.platform.comjni.JNIBaseApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NAMsgCenter extends JNIBaseApi {

    /* renamed from: a  reason: collision with root package name */
    private long f2878a;

    private native boolean nativeCancelRequest(long j2);

    private native long nativeCreate();

    private native boolean nativeFetchAccessToken(long j2);

    private native String nativeGetCenterParam(long j2, String str);

    private native boolean nativeMSGCStartup(long j2);

    private native boolean nativeRegMsgCenter(long j2, String str);

    private native int nativeRelease(long j2);

    private native boolean nativeSetCenterParam(long j2, String str);
}
