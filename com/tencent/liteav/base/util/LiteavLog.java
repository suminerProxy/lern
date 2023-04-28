package com.tencent.liteav.base.util;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LiteavLog {
    private static a sCallback = null;
    private static final boolean useChromiumBaseLog = true;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(b bVar, String str, String str2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11479a = null;
        public static final b b = null;
        public static final b c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final b f11480d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final b f11481e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final b f11482f = null;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ b[] f11483g = null;
        public int mNativeValue;

        private b(String str, int i2, int i3) {
        }

        public static final b a(int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Object... objArr) {
    }

    public static void i(String str, String str2, Object... objArr) {
    }

    public static native void nativeSetConsoleLogEnabled(boolean z);

    public static native void nativeSetLogCallbackEnabled(boolean z);

    public static native void nativeSetLogCompressEnabled(boolean z);

    public static native void nativeSetLogFilePath(String str);

    public static native void nativeSetLogLevel(int i2);

    public static native void nativeSetLogToFileEnabled(boolean z);

    @CalledByNative
    public static void onLog(int i2, String str) {
    }

    public static void setCallback(a aVar) {
    }

    public static void v(String str, String str2, Object... objArr) {
    }

    public static void w(String str, String str2, Object... objArr) {
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
    }
}
