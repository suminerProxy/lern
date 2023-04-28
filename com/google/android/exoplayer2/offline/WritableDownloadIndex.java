package com.google.android.exoplayer2.offline;

import androidx.annotation.WorkerThread;
import java.io.IOException;

@WorkerThread
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download) throws IOException;

    void removeDownload(String id) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int stopReason) throws IOException;

    void setStopReason(String id, int stopReason) throws IOException;
}
