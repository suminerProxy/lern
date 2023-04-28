package com.tencent.liteav.base.logger;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class OnlineLoggerAndroid {
    private static final int INVALID_INSTANCE = -1;
    private long mNativeOnlineLoggerAndroid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11461a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final a f11462d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ a[] f11463e = null;
        public int level;

        private a(String str, int i2, int i3) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11464a = null;
        public static final b b = null;
        private static final /* synthetic */ b[] c = null;

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    public OnlineLoggerAndroid(b bVar, int i2, String str, String str2) {
    }

    private static native long nativeCreate(int i2, int i3, String str, String str2);

    private static native void nativeDestroy(long j2);

    private static native void nativeLog(long j2, int i2, String str);

    public synchronized void destroy() {
    }

    public void finalize() throws Throwable {
    }

    public synchronized void log(a aVar, String str) {
    }
}
