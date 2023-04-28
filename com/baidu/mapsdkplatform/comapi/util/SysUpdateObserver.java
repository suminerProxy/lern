package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface SysUpdateObserver {
    void init(String str);

    void updateNetworkInfo(Context context);

    void updateNetworkProxy(Context context);

    void updatePhoneInfo(String str);
}
