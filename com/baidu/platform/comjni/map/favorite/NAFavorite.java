package com.baidu.platform.comjni.map.favorite;

import android.os.Bundle;
import com.baidu.platform.comjni.JNIBaseApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NAFavorite extends JNIBaseApi {

    /* renamed from: a  reason: collision with root package name */
    private long f2877a;

    private native boolean nativeAdd(long j2, String str, String str2);

    private native boolean nativeClear(long j2);

    private native boolean nativeCloseCache(long j2);

    private native long nativeCreate();

    private native boolean nativeDelete(long j2);

    private native int nativeGetAll(long j2, Bundle bundle);

    private native int nativeGetLength(long j2);

    private native int nativeGetRelations(long j2, String str, Bundle bundle, int i2);

    private native String nativeGetValue(long j2, String str);

    private native boolean nativeIsExist(long j2, String str);

    private native boolean nativeLoad(long j2, String str, String str2, String str3, int i2, int i3, int i4);

    private native int nativeRelease(long j2);

    private native boolean nativeRemove(long j2, String str);

    private native boolean nativeResumeCache(long j2);

    private native boolean nativeSaveCache(long j2);

    private native boolean nativeSetType(long j2, int i2);

    private native boolean nativeUpdate(long j2, String str, String str2);

    public long a() {
    }

    public int b() {
    }

    public boolean c() {
    }

    public boolean d() {
    }

    public boolean a(String str, String str2, String str3, int i2, int i3, int i4) {
    }

    public boolean b(String str, String str2) {
    }

    public boolean c(String str) {
    }

    public boolean a(int i2) {
    }

    public String b(String str) {
    }

    public boolean a(String str, String str2) {
    }

    public boolean a(String str) {
    }

    public int a(Bundle bundle) {
    }
}
