package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SharedPreferencesHelper {
    private static final String PREFS_SUFFIX = ".xml";

    /* renamed from: com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Comparator<Map.Entry<String, ?>> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Map.Entry<String, ?> entry, Map.Entry<String, ?> entry2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Map.Entry<String, ?> entry, Map.Entry<String, ?> entry2) {
        }
    }

    private SharedPreferencesHelper() {
    }

    public static Set<Map.Entry<String, ?>> getSharedPreferenceEntriesSorted(SharedPreferences sharedPreferences) {
    }

    public static List<String> getSharedPreferenceTags(Context context) {
    }

    private static Boolean parseBoolean(String str) throws IllegalArgumentException {
    }

    @Nullable
    public static Object valueFromString(String str, Object obj) throws IllegalArgumentException {
    }

    public static String valueToString(Object obj) {
    }
}
