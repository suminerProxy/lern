package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ActionFileUpgradeUtil {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DownloadIdProvider {
        String getId(DownloadRequest downloadRequest);
    }

    private ActionFileUpgradeUtil() {
    }

    public static void mergeRequest(DownloadRequest request, DefaultDownloadIndex downloadIndex, boolean addNewDownloadAsCompleted, long nowMs) throws IOException {
    }

    @WorkerThread
    public static void upgradeAndDelete(File actionFilePath, @Nullable DownloadIdProvider downloadIdProvider, DefaultDownloadIndex downloadIndex, boolean deleteOnFailure, boolean addNewDownloadsAsCompleted) throws IOException {
    }
}
