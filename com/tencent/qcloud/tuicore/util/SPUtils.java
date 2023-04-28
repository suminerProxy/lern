package com.tencent.qcloud.tuicore.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SPUtils {
    public static final String DEFAULT_DATABASE = "tuikit";
    private static final Map<String, SPUtils> SP_UTILS_MAP = new HashMap();
    private final SharedPreferences mSharedPreferences;

    private SPUtils(String str, int i2) {
        this.mSharedPreferences = getApplicationContext().getSharedPreferences(str, i2);
    }

    private Context getApplicationContext() {
        return ServiceInitializer.getAppContext();
    }

    public static SPUtils getInstance() {
        return getInstance(DEFAULT_DATABASE, 0);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull String str) {
        return this.mSharedPreferences.contains(str);
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, -1.0f);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, -1);
    }

    public long getLong(@NonNull String str) {
        return getLong(str, -1L);
    }

    public String getString(@NonNull String str) {
        return getString(str, "");
    }

    public void put(@NonNull String str, String str2) {
        put(str, str2, false);
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public static SPUtils getInstance(int i2) {
        return getInstance(DEFAULT_DATABASE, i2);
    }

    public void clear(boolean z) {
        if (z) {
            this.mSharedPreferences.edit().clear().commit();
        } else {
            this.mSharedPreferences.edit().clear().apply();
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z) {
        return this.mSharedPreferences.getBoolean(str, z);
    }

    public float getFloat(@NonNull String str, float f2) {
        return this.mSharedPreferences.getFloat(str, f2);
    }

    public int getInt(@NonNull String str, int i2) {
        return this.mSharedPreferences.getInt(str, i2);
    }

    public long getLong(@NonNull String str, long j2) {
        return this.mSharedPreferences.getLong(str, j2);
    }

    public String getString(@NonNull String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public void put(@NonNull String str, String str2, boolean z) {
        if (z) {
            this.mSharedPreferences.edit().putString(str, str2).commit();
        } else {
            this.mSharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public void remove(@NonNull String str, boolean z) {
        if (z) {
            this.mSharedPreferences.edit().remove(str).commit();
        } else {
            this.mSharedPreferences.edit().remove(str).apply();
        }
    }

    public static SPUtils getInstance(String str) {
        return getInstance(str, 0);
    }

    public static SPUtils getInstance(String str, int i2) {
        if (isSpace(str)) {
            str = DEFAULT_DATABASE;
        }
        Map<String, SPUtils> map = SP_UTILS_MAP;
        SPUtils sPUtils = map.get(str);
        if (sPUtils == null) {
            synchronized (SPUtils.class) {
                sPUtils = map.get(str);
                if (sPUtils == null) {
                    sPUtils = new SPUtils(str, i2);
                    map.put(str, sPUtils);
                }
            }
        }
        return sPUtils;
    }

    public void put(@NonNull String str, boolean z) {
        put(str, z, false);
    }

    public void put(@NonNull String str, boolean z, boolean z2) {
        if (z2) {
            this.mSharedPreferences.edit().putBoolean(str, z).commit();
        } else {
            this.mSharedPreferences.edit().putBoolean(str, z).apply();
        }
    }

    public void put(@NonNull String str, int i2) {
        put(str, i2, false);
    }

    public void put(@NonNull String str, int i2, boolean z) {
        if (z) {
            this.mSharedPreferences.edit().putInt(str, i2).commit();
        } else {
            this.mSharedPreferences.edit().putInt(str, i2).apply();
        }
    }

    public void put(@NonNull String str, float f2) {
        put(str, f2, false);
    }

    public void put(@NonNull String str, float f2, boolean z) {
        if (z) {
            this.mSharedPreferences.edit().putFloat(str, f2).commit();
        } else {
            this.mSharedPreferences.edit().putFloat(str, f2).apply();
        }
    }

    public void put(@NonNull String str, long j2) {
        put(str, j2, false);
    }

    public void put(@NonNull String str, long j2, boolean z) {
        if (z) {
            this.mSharedPreferences.edit().putLong(str, j2).commit();
        } else {
            this.mSharedPreferences.edit().putLong(str, j2).apply();
        }
    }
}
