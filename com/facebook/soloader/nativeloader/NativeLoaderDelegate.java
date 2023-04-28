package com.facebook.soloader.nativeloader;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface NativeLoaderDelegate {
    public static final int SKIP_MERGED_JNI_ONLOAD = 1;

    String getLibraryPath(String str) throws IOException;

    int getSoSourcesVersion();

    boolean loadLibrary(String str, int i2);
}
