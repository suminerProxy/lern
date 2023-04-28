package org.libpag;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class CacheManager {

    /* renamed from: a  reason: collision with root package name */
    public static CacheManager f29804a;
    private String b;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap<String, a> f29805d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public long f29807a;
        public File b;

        public b(File file) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
        }
    }

    private CacheManager() {
    }

    public static native int ContentVersion(PAGComposition pAGComposition);

    public static CacheManager a(Context context) {
    }

    public void b(String str) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private ImageCache f29806a;
        public ReentrantReadWriteLock b;

        public static a a(String str, int i2, int i3, int i4) {
        }

        public boolean b(int i2, Bitmap bitmap) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public void g() {
        }

        public void h() {
        }

        public boolean a() {
        }

        public boolean b() {
        }

        public boolean a(int i2, Bitmap bitmap) {
        }

        public boolean a(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class ImageCache {
        private long nativeContext;

        private ImageCache(long j2) {
        }

        private static native long SetupCache(String str, int i2, int i3, int i4, boolean z);

        public static ImageCache a(String str, int i2, int i3, int i4) {
        }

        private static native void nativeInit();

        public boolean b(int i2, Bitmap bitmap) {
        }

        public native boolean flushSave();

        public native boolean inflateBitmap(int i2, Bitmap bitmap, int i3, boolean z);

        public native boolean isAllCached();

        public native boolean isCached(int i2);

        public native boolean putBitmapToSaveBuffer(int i2, Bitmap bitmap, int i3, boolean z);

        public native void release();

        public native void releaseSaveBuffer();

        public boolean a(int i2, Bitmap bitmap) {
        }
    }

    public void a() {
    }

    public a a(String str, int i2, int i3, int i4) {
    }

    public String a(String str) {
    }

    private static String a(Context context, String str) {
    }
}
