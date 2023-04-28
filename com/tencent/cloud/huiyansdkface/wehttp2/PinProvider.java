package com.tencent.cloud.huiyansdkface.wehttp2;

import java.util.List;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface PinProvider {
    Set<String> getPinSet();

    void onPinVerifyFailed(String str, List<String> list);
}
