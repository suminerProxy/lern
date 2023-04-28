package com.tencent.liteav.sdk.common;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::license")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LicenseChecker {
    private b mLicenceCheckListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11611a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final a f11612d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final a f11613e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final a f11614f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final a f11615g = null;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ a[] f11616h = null;
        public int value;

        private a(String str, int i2, int i3) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void a(int i2, String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11617a = null;
        public static final c b = null;
        private static final /* synthetic */ c[] c = null;

        private c(String str, int i2) {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static LicenseChecker f11618a;
    }

    public static LicenseChecker getInstance() {
    }

    private static native String nativeGetAppId();

    private static native String nativeGetKey(int i2);

    private static native String nativeGetLicense(int i2);

    private static native void nativeSetClient(LicenseChecker licenseChecker);

    private static native boolean nativeSetLicense(int i2, String str, String str2);

    private static native boolean nativeValid(int i2);

    @CalledByNative
    public void OnResult(int i2, String str) {
    }

    public String getAppId() {
    }

    public String getKey(c cVar) {
    }

    public String getLicense(c cVar) {
    }

    public boolean setLicense(c cVar, String str, String str2) {
    }

    public void setListener(b bVar) {
    }

    public boolean valid(a aVar) {
    }
}
