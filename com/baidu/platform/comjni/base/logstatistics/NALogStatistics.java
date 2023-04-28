package com.baidu.platform.comjni.base.logstatistics;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NALogStatistics extends NativeComponent {
    public static native boolean nativeAddLog(long j2, int i2, int i3, String str, String str2, String str3);

    public static native long nativeCreate();

    public static native int nativeRelease(long j2);

    public static native boolean nativeSave(long j2);

    public boolean a(int i2, int i3, String str, String str2, String str3) {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }
}
