package com.tai.danmuku.danmu.jni;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.lang.reflect.Field;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class NativeBitmapFactory {

    /* renamed from: a  reason: collision with root package name */
    public static Field f7786a;
    public static boolean b;
    public static boolean c;

    public static Bitmap a(int i2, int i3, Bitmap.Config config) {
    }

    public static synchronized Bitmap b(int i2, int i3, Bitmap.Config config, boolean z) {
    }

    private static Bitmap c(int i2, int i3, Bitmap.Config config, boolean z) {
    }

    private static native Bitmap createBitmap(int i2, int i3, int i4, boolean z);

    private static native Bitmap createBitmap19(int i2, int i3, int i4, boolean z);

    public static int d(Bitmap.Config config) {
    }

    public static void e() {
    }

    public static boolean f() {
    }

    public static void g() {
    }

    public static void h(Bitmap bitmap) {
    }

    public static synchronized void i() {
    }

    private static native boolean init();

    @SuppressLint({"NewApi"})
    private static boolean j() {
    }

    private static native boolean release();
}
