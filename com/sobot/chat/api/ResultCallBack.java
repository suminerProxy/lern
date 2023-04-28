package com.sobot.chat.api;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface ResultCallBack<T> {
    void onFailure(Exception exc, String str);

    void onLoading(long j2, long j3, boolean z);

    void onSuccess(T t);
}
