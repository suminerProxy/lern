package com.tencent.qcloud.tuicore.interfaces;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TUICallback {
    public static void onError(TUICallback tUICallback, int i2, String str) {
    }

    public static void onSuccess(TUICallback tUICallback) {
    }

    public abstract void onError(int i2, String str);

    public abstract void onSuccess();
}
