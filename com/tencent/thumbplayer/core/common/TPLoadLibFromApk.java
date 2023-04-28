package com.tencent.thumbplayer.core.common;

import android.content.Context;
import java.io.File;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class TPLoadLibFromApk {
    private static Context mContext;
    private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LibraryBrokenHandler implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler mParent;

        public LibraryBrokenHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    private TPLoadLibFromApk() {
    }

    public static /* synthetic */ Context access$000() {
    }

    public static /* synthetic */ void access$100(Context context) {
    }

    private static void extractAllLibraries(Context context) {
    }

    private static boolean extractLibrary(ZipFile zipFile, String str, List<String> list, File file) {
    }

    public static String find(String str, Context context) {
    }

    private static List<String> generateAbiList() {
    }

    public static boolean load(String str, ClassLoader classLoader, Context context) {
    }

    private static boolean loadFromApk(String str, ClassLoader classLoader, Context context, File file, UnsatisfiedLinkError unsatisfiedLinkError) {
    }

    private static UnsatisfiedLinkError loadFromRecovery(String str, ClassLoader classLoader, Context context, File file) {
    }

    private static void reflectSystemLoad(String str, ClassLoader classLoader) {
    }

    private static void reflectSystemLoadLibrary(String str, ClassLoader classLoader) {
    }

    public static void setupBrokenLibraryHandler() {
    }
}
