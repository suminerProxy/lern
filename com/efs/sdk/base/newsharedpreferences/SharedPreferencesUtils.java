package com.efs.sdk.base.newsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SharedPreferencesUtils {
    private static final HashMap<String, SharedPreferencesWrapper> sSpCache = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SharedPreferencesWrapper {
        private volatile SharedPreferences mSharedPreferences;

        private SharedPreferencesWrapper() {
        }

        public static /* synthetic */ SharedPreferences access$100(SharedPreferencesWrapper sharedPreferencesWrapper) {
        }

        public static /* synthetic */ SharedPreferences access$102(SharedPreferencesWrapper sharedPreferencesWrapper, SharedPreferences sharedPreferences) {
        }

        public /* synthetic */ SharedPreferencesWrapper(AnonymousClass1 anonymousClass1) {
        }
    }

    private static SharedPreferences getNewSharedPreferences(Context context, String str, boolean z) {
    }

    public static File getNewSharedPrefsFile(Context context, String str) {
    }

    public static SharedPreferences getSharedPreferences(Context context, String str) {
    }

    private static synchronized void handleReplace(Context context, String str, boolean z) {
    }

    private static Object invokeObjectMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
    }

    public static void onDestroy() {
    }

    private static SharedPreferences getNewSharedPreferences(Context context, String str, boolean z, boolean z2) {
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, boolean z) {
    }
}
