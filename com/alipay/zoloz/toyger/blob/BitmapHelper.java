package com.alipay.zoloz.toyger.blob;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapHelper {
    public static final int FRAME_MODE_BGR = 2;
    public static final int FRAME_MODE_BGRA = 1;
    public static final int FRAME_MODE_GRAY_16 = 5;
    public static final int FRAME_MODE_GRAY_8 = 6;
    public static final int FRAME_MODE_NV21 = 0;
    public static final int FRAME_MODE_RGB = 4;
    public static final int FRAME_MODE_RGBA = 3;

    public static byte[] Bitmap2BytesEx(Bitmap bitmap) {
    }

    public static Bitmap RGBABytes2Bitmap(byte[] bArr, int i2, int i3) {
    }

    public static Bitmap RGBBytes2Bitmap(byte[] bArr, int i2, int i3) {
    }

    private static byte[] addBMP_RGB_888(int[] iArr, int i2, int i3) {
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, float f2) {
    }

    public static Bitmap bytes2Bitmap(byte[] bArr, int i2, int i3, int i4) {
    }

    public static byte[] compressRGBAImage(byte[] bArr, int i2, int i3, int i4, int i5) {
    }

    public static byte[] compressRGBImage(byte[] bArr, int i2, int i3, int i4, int i5) {
    }

    public static int convertByteToInt(byte b) {
    }

    public static int[] convertBytesToInts(byte[] bArr) {
    }

    public static Bitmap cropBitmap(Bitmap bitmap, Rect rect) {
    }

    public static Bitmap flipBitmap(Bitmap bitmap, int i2) {
    }

    public static Bitmap getBitmap(byte[] bArr, int i2, int i3) {
    }

    public static Bitmap getYUVBitmap(byte[] bArr, int i2, int i3) {
    }

    public static byte[] processImage(byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
    }

    public static Bitmap readBitMap(Context context, int i2) {
    }

    public static void recycle(Bitmap bitmap) {
    }

    public static Bitmap resize(Bitmap bitmap, int i2, int i3) {
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i2) {
    }

    private static byte[] rotateYUV420Degree180(byte[] bArr, int i2, int i3) {
    }

    public static byte[] rotateYUV420Degree270(byte[] bArr, int i2, int i3) {
    }

    private static byte[] rotateYUV420Degree90(byte[] bArr, int i2, int i3) {
    }

    public static byte[] rotateYUVImage(byte[] bArr, int i2, int i3, int i4, int i5) {
    }

    public static Bitmap zoomBitmap(Bitmap bitmap, int i2, int i3) {
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
    }

    public static Bitmap getYUVBitmap(byte[] bArr, int i2, int i3, int i4) {
    }

    public static Bitmap resize(Bitmap bitmap, int i2) {
    }
}
