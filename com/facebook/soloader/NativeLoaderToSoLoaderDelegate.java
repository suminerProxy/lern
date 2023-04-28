package com.facebook.soloader;

import com.facebook.soloader.nativeloader.NativeLoaderDelegate;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NativeLoaderToSoLoaderDelegate implements NativeLoaderDelegate {
    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public String getLibraryPath(String str) throws IOException {
        return SoLoader.getLibraryPath(str);
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public int getSoSourcesVersion() {
        return SoLoader.getSoSourcesVersion();
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public boolean loadLibrary(String str, int i2) {
        return SoLoader.loadLibrary(str, ((i2 & 1) != 0 ? 16 : 0) | 0);
    }
}
