package com.sobot.chat.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ImageUtils {
    public static int computeInitialSampleSize(BitmapFactory.Options options, int i2, int i3) {
    }

    public static int computeSampleSize(BitmapFactory.Options options, int i2, int i3) {
    }

    public static Bitmap getBitmapFromUri(Context context, Uri uri) {
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
    }

    public static Uri getImageContentUri(Context context, String str) {
    }

    public static Uri getImageUrlWithAuthority(Context context, Uri uri) {
    }

    public static Uri getMediaUriFromPath(Context context, String str) {
    }

    @TargetApi(19)
    public static String getPath(Context context, Uri uri) {
    }

    public static Uri getUri(Intent intent, Context context) {
    }

    public static boolean isDownloadsDocument(Uri uri) {
    }

    public static boolean isExternalStorageDocument(Uri uri) {
    }

    public static boolean isGooglePhotosUri(Uri uri) {
    }

    public static boolean isMediaDocument(Uri uri) {
    }

    public static boolean isNewGooglePhotosUri(Uri uri) {
    }

    public static int readPictureDegree(String str) {
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i2) {
    }

    private static String uriToFileApiQ(Context context, Uri uri) {
    }

    public static Uri writeToTempImageAndGetPathUri(Context context, Bitmap bitmap) {
    }
}
