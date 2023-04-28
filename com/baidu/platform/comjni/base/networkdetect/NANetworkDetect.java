package com.baidu.platform.comjni.base.networkdetect;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NANetworkDetect extends NativeComponent {
    private native long nativeCreate();

    private native boolean nativeNetworkDetect(long j2, String str);

    private native int nativeRelease(long j2);

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }
}
