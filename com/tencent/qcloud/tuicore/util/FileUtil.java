package com.tencent.qcloud.tuicore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FileUtil {
    public static final String DOCUMENTS_DIR = "documents";
    public static final int SIZETYPE_B = 1;
    public static final int SIZETYPE_GB = 4;
    public static final int SIZETYPE_KB = 2;
    public static final int SIZETYPE_MB = 3;

    public static boolean deleteFile(String str) {
    }

    public static String formatFileSize(long j2) {
    }

    @Nullable
    public static File generateFileName(@Nullable String str, File file) {
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
    }

    public static File getDocumentCacheDir(@NonNull Context context) {
    }

    public static String getFileExtensionFromUrl(String str) {
    }

    public static String getFileName(@NonNull Context context, Uri uri) {
    }

    public static long getFileSize(String str) {
    }

    private static String getName(String str) {
    }

    public static String getPath(Context context, Uri uri) {
    }

    private static String getPathByCopyFile(Context context, Uri uri) {
    }

    public static String getPathFromUri(Uri uri) {
    }

    public static String getRealFilePath(Uri uri) {
    }

    public static Uri getUriFromPath(String str) {
    }

    public static boolean isDownloadsDocument(Uri uri) {
    }

    public static boolean isExternalStorageDocument(Uri uri) {
    }

    public static boolean isMediaDocument(Uri uri) {
    }

    public static void openFile(String str, String str2) {
    }

    public static String saveBitmap(String str, Bitmap bitmap) {
    }

    private static boolean saveFileFromUri(Context context, Uri uri, String str) {
    }
}
