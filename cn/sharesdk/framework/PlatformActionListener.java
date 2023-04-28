package cn.sharesdk.framework;

import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface PlatformActionListener {
    void onCancel(Platform platform, int i2);

    void onComplete(Platform platform, int i2, HashMap<String, Object> hashMap);

    void onError(Platform platform, int i2, Throwable th);
}
