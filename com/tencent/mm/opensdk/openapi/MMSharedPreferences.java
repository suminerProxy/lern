package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MMSharedPreferences implements SharedPreferences {
    private static final String TAG = "MicroMsg.SDK.SharedPreferences";
    private final String[] columns;
    private final ContentResolver cr;
    private REditor editor;
    private final HashMap<String, Object> values;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class REditor implements SharedPreferences.Editor {
        private boolean clear;
        private ContentResolver cr;
        private Set<String> remove;
        private Map<String, Object> values;

        public REditor(ContentResolver contentResolver) {
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
        }
    }

    public MMSharedPreferences(Context context) {
    }

    private Object getValue(String str) {
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
