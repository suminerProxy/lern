package com.baidu.platform.comjni.map.commonmemcache;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NACommonMemCache extends NativeComponent {
    private static native long nativeCreate();

    private static native String nativeDecodeUsync(long j2, String str);

    private static native String nativeEnCrypt(long j2, String str);

    private static native String nativeEnCryptWithType(long j2, String str, String str2);

    private static native String nativeEnCryptWithUsync(long j2, String str);

    private static native String nativeGetKeyString(long j2, String str);

    private static native String nativeGetPhoneInfoBundle(long j2, boolean z);

    private static native String nativeGetPhoneInfoUrl(long j2);

    private static native String nativeGetSataInfo(long j2, boolean z, int i2, int i3);

    private static native void nativeInit(long j2, String str);

    private static native int nativeRelease(long j2);

    private static native void nativeSetKeyBundle(long j2, String str, String str2);

    private static native void nativeSetKeyDouble(long j2, String str, double d2);

    private static native void nativeSetKeyFloat(long j2, String str, float f2);

    private static native void nativeSetKeyInt(long j2, String str, int i2);

    private static native void nativeSetKeyString(long j2, String str, String str2);

    public void a(String str) {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }

    public void a(String str, String str2) {
    }
}
