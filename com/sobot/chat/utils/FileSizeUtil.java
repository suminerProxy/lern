package com.sobot.chat.utils;

import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FileSizeUtil {
    public static final int SIZETYPE_B = 1;
    public static final int SIZETYPE_GB = 4;
    public static final int SIZETYPE_KB = 2;
    public static final int SIZETYPE_MB = 3;

    /* renamed from: com.sobot.chat.utils.FileSizeUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ CallBack val$back;
        public final /* synthetic */ String val$fileUrl;

        public AnonymousClass1(String str, CallBack callBack) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface CallBack<T> {
        void call(T t);
    }

    private static String FormetFileSize(long j2) {
    }

    public static /* synthetic */ String access$000(long j2) {
    }

    public static double getAutoFileOrFilesSize(File file) {
    }

    public static double getFileOrFilesSize(String str, int i2) {
    }

    private static long getFileSize(File file) {
    }

    private static long getFileSizes(File file) throws Exception {
    }

    public static void getFileUrlSize(String str, CallBack<String> callBack) {
    }

    private static double FormetFileSize(long j2, int i2) {
    }
}
