package com.tencent.liteav.base;

import android.annotation.SuppressLint;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.MainDex;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

@MainDex
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class PathUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int LOG_DIRECTORY = 3;
    private static final int NUM_DIRECTORIES = 4;
    private static final String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static String sCacheSubDirectory;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f11416a = null;

        public static /* synthetic */ String[] a() {
        }
    }

    private PathUtils() {
    }

    public static /* synthetic */ String[] access$000() {
    }

    public static /* synthetic */ String[] access$lambda$0() {
    }

    @SuppressLint({"NewApi"})
    private static void chmod(String str, int i2) {
    }

    @CalledByNative
    public static String getCacheDirectory() {
    }

    @CalledByNative
    public static String getDataDirectory() {
    }

    private static String getDirectoryPath(int i2) {
    }

    @CalledByNative
    public static String getLogDirectory() {
    }

    private static String[] getOrComputeDirectoryPaths() {
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
    }

    public static void setPrivateDataDirectorySuffix(String str, String str2) {
    }

    private static String[] setPrivateDataDirectorySuffixInternal() {
    }

    public static void setPrivateDataDirectorySuffix(String str) {
    }
}
