package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NetworkCache {
    private final Context appContext;

    public NetworkCache(Context context) {
    }

    private static String filenameForUrl(String str, FileExtension fileExtension, boolean z) {
    }

    @Nullable
    private File getCachedFile(String str) throws FileNotFoundException {
    }

    private File parentDir() {
    }

    public void clear() {
    }

    @Nullable
    @WorkerThread
    public Pair<FileExtension, InputStream> fetch(String str) {
    }

    public void renameTempFile(String str, FileExtension fileExtension) {
    }

    public File writeTempCacheFile(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
    }
}
