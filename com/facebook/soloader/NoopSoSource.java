package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NoopSoSource extends SoSource {
    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return 1;
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) {
        throw new UnsupportedOperationException("unpacking not supported in test mode");
    }
}
