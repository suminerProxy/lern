package com.mob.tools.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.mob.tools.network.HttpConnection;
import com.mob.tools.network.HttpResponseCallback;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BitmapHelper implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static int f4465a;
    private static int b;

    /* renamed from: com.mob.tools.utils.BitmapHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements HttpResponseCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4466a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HashMap c;

        /* renamed from: com.mob.tools.utils.BitmapHelper$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C01111 extends FilterInputStream {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass1 f4467a;

            public C01111(AnonymousClass1 anonymousClass1, InputStream inputStream) {
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
            }
        }

        public AnonymousClass1(String str, String str2, HashMap hashMap) {
        }

        @Override // com.mob.tools.network.HttpResponseCallback
        public void onResponse(HttpConnection httpConnection) throws Throwable {
        }
    }

    public static /* synthetic */ String a(HttpConnection httpConnection, String str) throws Throwable {
    }

    private static String b(HttpConnection httpConnection, String str) throws Throwable {
    }

    public static Bitmap blur(Bitmap bitmap, int i2, int i3) {
    }

    public static Bitmap captureView(View view, int i2, int i3) throws Throwable {
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i2) {
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i2, int i3, int i4, int i5) throws Throwable {
    }

    public static String downloadBitmap(Context context, String str) throws Throwable {
    }

    public static int[] fixRect(int[] iArr, int[] iArr2) {
    }

    public static int[] fixRect_2(int[] iArr, int[] iArr2) {
    }

    public static Bitmap getBitmap(String str, int i2) throws Throwable {
    }

    public static Bitmap getBitmapByCompressQuality(String str, int i2, int i3, int i4, long j2) throws Throwable {
    }

    public static Bitmap getBitmapByCompressSize(String str, int i2, int i3) throws Throwable {
    }

    public static Bitmap.CompressFormat getBmpFormat(byte[] bArr) {
    }

    public static String getMime(String str) {
    }

    public static boolean isBlackBitmap(Bitmap bitmap) throws Throwable {
    }

    public static int mixAlpha(int i2, int i3) {
    }

    public static Bitmap roundBitmap(Bitmap bitmap, int i2, int i3, float f2, float f3, float f4, float f5) throws Throwable {
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
    }

    public static String saveBitmap(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i2) throws Throwable {
    }

    public static String saveBitmapByCompress(String str, int i2, int i3, int i4) throws Throwable {
    }

    public static String saveViewToImage(View view) throws Throwable {
    }

    public static Bitmap scaleBitmapByHeight(Context context, int i2, int i3) throws Throwable {
    }

    private static Bitmap a(Bitmap bitmap, int i2, boolean z) {
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i2, boolean z) {
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z) {
    }

    public static Bitmap getBitmap(File file, int i2) throws Throwable {
    }

    public static String saveViewToImage(View view, int i2, int i3) throws Throwable {
    }

    public static Bitmap.CompressFormat getBmpFormat(String str) {
    }

    public static Bitmap scaleBitmapByHeight(Bitmap bitmap, int i2) throws Throwable {
    }

    public static Bitmap getBitmap(InputStream inputStream, int i2) {
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j2) {
    }

    public static String saveBitmap(Context context, Bitmap bitmap) throws Throwable {
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j2, boolean z) {
    }

    public static Bitmap getBitmap(String str) throws Throwable {
    }

    public static Bitmap getBitmap(Context context, String str) throws Throwable {
    }

    private static String a(byte[] bArr) {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
    }

    private static boolean a(Bitmap bitmap) {
    }
}
