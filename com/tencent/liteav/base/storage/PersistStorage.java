package com.tencent.liteav.base.storage;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PersistStorage {
    public static final String GLOBAL_DOMAIN = "com.liteav.storage.global";
    private final SharedPreferences.Editor mEditor;
    private final SharedPreferences mSharedPreferences;

    @CalledByNative
    @SuppressLint({"CommitPrefEdits"})
    public PersistStorage(String str) {
    }

    @CalledByNative
    public static int integerToBase(Integer num) {
    }

    @CalledByNative
    public static long longToBase(Long l2) {
    }

    @CalledByNative
    public void clear(String str) {
    }

    @CalledByNative
    public void commit() {
    }

    @CalledByNative
    public String[] getAllKeys() {
    }

    @CalledByNative
    public Integer getInt(String str) {
    }

    @CalledByNative
    public Long getLong(String str) {
    }

    @CalledByNative
    public String getString(String str) {
    }

    @CalledByNative
    public void put(String str, int i2) {
    }

    @CalledByNative
    public void put(String str, long j2) {
    }

    @CalledByNative
    public void put(String str, String str2) {
    }
}
