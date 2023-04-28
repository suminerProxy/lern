package com.umeng.commonsdk.framework;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMFrUtils {
    private static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    private static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    private static String mDefaultEnvelopeDir = "envelope";
    private static String mDefaultEnvelopeDirPath = null;
    private static Object mEnvelopeBuildTimeLock = null;
    private static Object mEnvelopeFileLock = null;
    private static String sCurrentProcessName = "";

    /* renamed from: com.umeng.commonsdk.framework.UMFrUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Comparator<File> {
        public int a(File file, File file2) {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(File file, File file2) {
        }
    }

    /* renamed from: com.umeng.commonsdk.framework.UMFrUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements Comparator<File> {
        public int a(File file, File file2) {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(File file, File file2) {
        }
    }

    private static boolean checkPermission(Context context, String str) {
    }

    public static int envelopeFileNumber(Context context) {
    }

    public static String getCurrentProcessName(Context context) {
    }

    private static long getDistanceDays(long j2, long j3) {
    }

    public static String getEnvelopeDirPath(Context context) {
    }

    public static File getEnvelopeFile(Context context) {
    }

    public static long getLastInstantBuildTime(Context context) {
    }

    public static long getLastSuccessfulBuildTime(Context context) {
    }

    public static String getLegacyEnvelopeDir(Context context) {
    }

    private static String getProcessName(int i2) {
    }

    public static String getSubProcessName(Context context) {
    }

    public static boolean hasEnvelopeFile(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
    }

    public static boolean isOnline(Context context) {
    }

    public static boolean removeEnvelopeFile(File file) {
    }

    public static void removeRedundantEnvelopeFiles(Context context, int i2) {
    }

    public static int saveEnvelopeFile(Context context, String str, byte[] bArr) {
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
    }

    public static byte[] toByteArray(String str) throws IOException {
    }

    private static void updateLastInstantBuildTime(Context context) {
    }

    private static void updateLastSuccessfulBuildTime(Context context) {
    }
}
