package com.baidu.platform.comjni.util;

import com.baidu.platform.comjni.JNIBaseApi;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JNIMD5 extends JNIBaseApi {
    public static native String EncodeUrlParamsValue(String str);

    public static native String GetSignMD5String(String str);

    public static native String GetWebSignMD5String(String str);

    public static native String SignOpra(String str);
}
