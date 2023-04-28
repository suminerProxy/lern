package com.mob.tools.network;

import com.mob.tools.proguard.EverythingKeeper;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class FileDownloadListener implements EverythingKeeper {
    private boolean isCanceled;

    public void cancel() {
    }

    public boolean isCanceled() {
    }

    public abstract void onProgress(int i2, long j2, long j3);
}
