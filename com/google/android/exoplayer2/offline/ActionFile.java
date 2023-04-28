package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.AtomicFile;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ActionFile {
    private static final String DOWNLOAD_TYPE_DASH = "dash";
    private static final String DOWNLOAD_TYPE_HLS = "hls";
    private static final String DOWNLOAD_TYPE_PROGRESSIVE = "progressive";
    private static final String DOWNLOAD_TYPE_SS = "ss";
    private static final int VERSION = 0;
    private final AtomicFile atomicFile;

    public ActionFile(File actionFile) {
    }

    private static String generateDownloadId(Uri uri, @Nullable String customCacheKey) {
    }

    private static String inferMimeType(String downloadType) {
    }

    private static DownloadRequest readDownloadRequest(DataInputStream input) throws IOException {
    }

    private static StreamKey readKey(String type, int version, DataInputStream input) throws IOException {
    }

    public void delete() {
    }

    public boolean exists() {
    }

    public DownloadRequest[] load() throws IOException {
    }
}
