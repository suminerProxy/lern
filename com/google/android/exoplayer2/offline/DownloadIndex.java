package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.IOException;

@WorkerThread
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface DownloadIndex {
    @Nullable
    Download getDownload(String id) throws IOException;

    DownloadCursor getDownloads(int... states) throws IOException;
}
