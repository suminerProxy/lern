package com.sobot.network.http.upload;

import com.sobot.network.http.model.SobotProgress;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface ProgressListener<T> {
    void onError(SobotProgress sobotProgress);

    void onFinish(T t, SobotProgress sobotProgress);

    void onProgress(SobotProgress sobotProgress);

    void onRemove(SobotProgress sobotProgress);

    void onStart(SobotProgress sobotProgress);
}
