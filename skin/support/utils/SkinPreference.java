package skin.support.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinPreference {
    private static final String FILE_NAME = "meta-data";
    private static final String KEY_SKIN_NAME = "skin-name";
    private static final String KEY_SKIN_STRATEGY = "skin-strategy";
    private static final String KEY_SKIN_USER_THEME = "skin-user-theme-json";
    private static SkinPreference sInstance;
    private final Context mApp;
    private final SharedPreferences.Editor mEditor;
    private final SharedPreferences mPref;

    private SkinPreference(Context context) {
        this.mApp = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, 0);
        this.mPref = sharedPreferences;
        this.mEditor = sharedPreferences.edit();
    }

    public static SkinPreference getInstance() {
        return sInstance;
    }

    public static void init(Context context) {
        if (sInstance == null) {
            synchronized (SkinPreference.class) {
                if (sInstance == null) {
                    sInstance = new SkinPreference(context.getApplicationContext());
                }
            }
        }
    }

    public void commitEditor() {
        this.mEditor.apply();
    }

    public String getSkinName() {
        return this.mPref.getString(KEY_SKIN_NAME, "");
    }

    public int getSkinStrategy() {
        return this.mPref.getInt(KEY_SKIN_STRATEGY, -1);
    }

    public String getUserTheme() {
        return this.mPref.getString(KEY_SKIN_USER_THEME, "");
    }

    public SkinPreference setSkinName(String str) {
        this.mEditor.putString(KEY_SKIN_NAME, str);
        return this;
    }

    public SkinPreference setSkinStrategy(int i2) {
        this.mEditor.putInt(KEY_SKIN_STRATEGY, i2);
        return this;
    }

    public SkinPreference setUserTheme(String str) {
        this.mEditor.putString(KEY_SKIN_USER_THEME, str);
        return this;
    }
}
