package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SoSource {
    public static final int LOAD_FLAG_ALLOW_IMPLICIT_PROVISION = 1;
    @Deprecated
    public static final int LOAD_FLAG_ALLOW_SOURCE_CHANGE = 2;
    public static final int LOAD_FLAG_MIN_CUSTOM_FLAG = 4;
    public static final int LOAD_RESULT_CORRUPTED_LIB_FILE = 3;
    public static final int LOAD_RESULT_IMPLICITLY_PROVIDED = 2;
    public static final int LOAD_RESULT_LOADED = 1;
    public static final int LOAD_RESULT_NOT_FOUND = 0;
    public static final int PREPARE_FLAG_ALLOW_ASYNC_INIT = 1;
    public static final int PREPARE_FLAG_FORCE_REFRESH = 2;

    public void addToLdLibraryPath(Collection<String> collection) {
    }

    @Nullable
    public String[] getLibraryDependencies(String str) throws IOException {
        return null;
    }

    @Nullable
    public String getLibraryPath(String str) throws IOException {
        return null;
    }

    public String[] getSoSourceAbis() {
        return SysUtil.getSupportedAbis();
    }

    public abstract int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException;

    public void prepare(int i2) throws IOException {
    }

    public String toString() {
        return getClass().getName();
    }

    @Nullable
    public abstract File unpackLibrary(String str) throws IOException;
}
