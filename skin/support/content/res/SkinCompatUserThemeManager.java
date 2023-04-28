package skin.support.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import skin.support.SkinCompatManager;
import skin.support.annotation.ColorRes;
import skin.support.annotation.DrawableRes;
import skin.support.utils.ImageUtils;
import skin.support.utils.SkinPreference;
import skin.support.utils.Slog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatUserThemeManager {
    private static SkinCompatUserThemeManager INSTANCE = new SkinCompatUserThemeManager();
    private static final String KEY_DRAWABLE_NAME = "drawableName";
    private static final String KEY_DRAWABLE_PATH_AND_ANGLE = "drawablePathAndAngle";
    private static final String KEY_TYPE = "type";
    private static final String KEY_TYPE_COLOR = "color";
    private static final String KEY_TYPE_DRAWABLE = "drawable";
    private static final String TAG = "SkinCompatUserThemeManager";
    private boolean mColorEmpty;
    private boolean mDrawableEmpty;
    private final HashMap<String, ColorState> mColorNameStateMap = new HashMap<>();
    private final Object mColorCacheLock = new Object();
    private final WeakHashMap<Integer, WeakReference<ColorStateList>> mColorCaches = new WeakHashMap<>();
    private final HashMap<String, String> mDrawablePathAndAngleMap = new HashMap<>();
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Integer, WeakReference<Drawable>> mDrawableCaches = new WeakHashMap<>();

    private SkinCompatUserThemeManager() {
        try {
            startLoadFromSharedPreferences();
        } catch (JSONException e2) {
            this.mColorNameStateMap.clear();
            this.mDrawablePathAndAngleMap.clear();
            if (Slog.DEBUG) {
                Slog.i(TAG, "startLoadFromSharedPreferences error: " + e2);
            }
        }
    }

    private void addColorToCache(@ColorRes int i2, ColorStateList colorStateList) {
        if (colorStateList != null) {
            synchronized (this.mColorCacheLock) {
                this.mColorCaches.put(Integer.valueOf(i2), new WeakReference<>(colorStateList));
            }
        }
    }

    private void addDrawableToCache(@DrawableRes int i2, Drawable drawable) {
        if (drawable != null) {
            synchronized (this.mDrawableCacheLock) {
                this.mDrawableCaches.put(Integer.valueOf(i2), new WeakReference<>(drawable));
            }
        }
    }

    private static boolean checkPathValid(String str) {
        boolean z = !TextUtils.isEmpty(str) && new File(str).exists();
        if (Slog.DEBUG && !z) {
            Slog.i(TAG, "Invalid drawable path : " + str);
        }
        return z;
    }

    private void clearColorCaches() {
        synchronized (this.mColorCacheLock) {
            this.mColorCaches.clear();
        }
    }

    private void clearDrawableCaches() {
        synchronized (this.mDrawableCacheLock) {
            this.mDrawableCaches.clear();
        }
    }

    public static SkinCompatUserThemeManager get() {
        return INSTANCE;
    }

    private ColorStateList getCachedColor(@ColorRes int i2) {
        synchronized (this.mColorCacheLock) {
            WeakReference<ColorStateList> weakReference = this.mColorCaches.get(Integer.valueOf(i2));
            if (weakReference != null) {
                ColorStateList colorStateList = weakReference.get();
                if (colorStateList != null) {
                    return colorStateList;
                }
                this.mColorCaches.remove(Integer.valueOf(i2));
            }
            return null;
        }
    }

    private Drawable getCachedDrawable(@DrawableRes int i2) {
        synchronized (this.mDrawableCacheLock) {
            WeakReference<Drawable> weakReference = this.mDrawableCaches.get(Integer.valueOf(i2));
            if (weakReference != null) {
                Drawable drawable = weakReference.get();
                if (drawable != null) {
                    return drawable;
                }
                this.mDrawableCaches.remove(Integer.valueOf(i2));
            }
            return null;
        }
    }

    private String getEntryName(int i2, String str) {
        Context context = SkinCompatManager.getInstance().getContext();
        if (str.equalsIgnoreCase(context.getResources().getResourceTypeName(i2))) {
            return context.getResources().getResourceEntryName(i2);
        }
        return null;
    }

    private void removeColorInCache(@ColorRes int i2) {
        synchronized (this.mColorCacheLock) {
            this.mColorCaches.remove(Integer.valueOf(i2));
        }
    }

    private void removeDrawableInCache(@DrawableRes int i2) {
        synchronized (this.mDrawableCacheLock) {
            this.mDrawableCaches.remove(Integer.valueOf(i2));
        }
    }

    private void startLoadFromSharedPreferences() throws JSONException {
        String userTheme = SkinPreference.getInstance().getUserTheme();
        if (!TextUtils.isEmpty(userTheme)) {
            JSONArray jSONArray = new JSONArray(userTheme);
            if (Slog.DEBUG) {
                Slog.i(TAG, "startLoadFromSharedPreferences: " + jSONArray.toString());
            }
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.has("type")) {
                    String string = jSONObject.getString("type");
                    if ("color".equals(string)) {
                        ColorState fromJSONObject = ColorState.fromJSONObject(jSONObject);
                        if (fromJSONObject != null) {
                            this.mColorNameStateMap.put(fromJSONObject.colorName, fromJSONObject);
                        }
                    } else if (KEY_TYPE_DRAWABLE.equals(string)) {
                        String string2 = jSONObject.getString(KEY_DRAWABLE_NAME);
                        String string3 = jSONObject.getString(KEY_DRAWABLE_PATH_AND_ANGLE);
                        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            this.mDrawablePathAndAngleMap.put(string2, string3);
                        }
                    }
                }
            }
        }
        this.mColorEmpty = this.mColorNameStateMap.isEmpty();
        this.mDrawableEmpty = this.mDrawablePathAndAngleMap.isEmpty();
    }

    public void addColorState(@ColorRes int i2, ColorState colorState) {
        String entryName = getEntryName(i2, "color");
        if (TextUtils.isEmpty(entryName) || colorState == null) {
            return;
        }
        colorState.colorName = entryName;
        this.mColorNameStateMap.put(entryName, colorState);
        removeColorInCache(i2);
        this.mColorEmpty = false;
    }

    public void addDrawablePath(@DrawableRes int i2, String str) {
        if (checkPathValid(str)) {
            String entryName = getEntryName(i2, KEY_TYPE_DRAWABLE);
            if (TextUtils.isEmpty(entryName)) {
                return;
            }
            int imageRotateAngle = ImageUtils.getImageRotateAngle(str);
            this.mDrawablePathAndAngleMap.put(entryName, str + ":" + String.valueOf(imageRotateAngle));
            removeDrawableInCache(i2);
            this.mDrawableEmpty = false;
        }
    }

    public void apply() {
        JSONArray jSONArray = new JSONArray();
        for (String str : this.mColorNameStateMap.keySet()) {
            ColorState colorState = this.mColorNameStateMap.get(str);
            if (colorState != null) {
                try {
                    jSONArray.put(ColorState.toJSONObject(colorState).putOpt("type", "color"));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        for (String str2 : this.mDrawablePathAndAngleMap.keySet()) {
            try {
                jSONArray.put(new JSONObject().putOpt("type", KEY_TYPE_DRAWABLE).putOpt(KEY_DRAWABLE_NAME, str2).putOpt(KEY_DRAWABLE_PATH_AND_ANGLE, this.mDrawablePathAndAngleMap.get(str2)));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        if (Slog.DEBUG) {
            Slog.i(TAG, "Apply user theme: " + jSONArray.toString());
        }
        SkinPreference.getInstance().setUserTheme(jSONArray.toString()).commitEditor();
        SkinCompatManager.getInstance().notifyUpdateSkin();
    }

    public void clearCaches() {
        clearColorCaches();
        clearDrawableCaches();
    }

    public void clearColors() {
        this.mColorNameStateMap.clear();
        clearColorCaches();
        this.mColorEmpty = true;
        apply();
    }

    public void clearDrawables() {
        this.mDrawablePathAndAngleMap.clear();
        clearDrawableCaches();
        this.mDrawableEmpty = true;
        apply();
    }

    public ColorState getColorState(String str) {
        return this.mColorNameStateMap.get(str);
    }

    public ColorStateList getColorStateList(@ColorRes int i2) {
        ColorState colorState;
        ColorStateList cachedColor = getCachedColor(i2);
        if (cachedColor == null) {
            String entryName = getEntryName(i2, "color");
            if (!TextUtils.isEmpty(entryName) && (colorState = this.mColorNameStateMap.get(entryName)) != null && (cachedColor = colorState.parse()) != null) {
                addColorToCache(i2, cachedColor);
            }
        }
        return cachedColor;
    }

    public Drawable getDrawable(@DrawableRes int i2) {
        Drawable cachedDrawable = getCachedDrawable(i2);
        if (cachedDrawable == null) {
            String entryName = getEntryName(i2, KEY_TYPE_DRAWABLE);
            if (!TextUtils.isEmpty(entryName)) {
                String str = this.mDrawablePathAndAngleMap.get(entryName);
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split(":");
                    String str2 = split[0];
                    int intValue = split.length == 2 ? Integer.valueOf(split[1]).intValue() : 0;
                    if (checkPathValid(str2)) {
                        if (intValue == 0) {
                            cachedDrawable = Drawable.createFromPath(str2);
                        } else {
                            Matrix matrix = new Matrix();
                            matrix.postRotate(intValue);
                            Bitmap decodeFile = BitmapFactory.decodeFile(str2);
                            cachedDrawable = new BitmapDrawable((Resources) null, Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true));
                        }
                        if (cachedDrawable != null) {
                            addDrawableToCache(i2, cachedDrawable);
                        }
                    }
                }
            }
        }
        return cachedDrawable;
    }

    public int getDrawableAngle(String str) {
        String str2 = this.mDrawablePathAndAngleMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        String[] split = str2.split(":");
        if (split.length == 2) {
            return Integer.valueOf(split[1]).intValue();
        }
        return 0;
    }

    public String getDrawablePath(String str) {
        String str2 = this.mDrawablePathAndAngleMap.get(str);
        return !TextUtils.isEmpty(str2) ? str2.split(":")[0] : "";
    }

    public boolean isColorEmpty() {
        return this.mColorEmpty;
    }

    public boolean isDrawableEmpty() {
        return this.mDrawableEmpty;
    }

    public void removeColorState(@ColorRes int i2) {
        String entryName = getEntryName(i2, "color");
        if (TextUtils.isEmpty(entryName)) {
            return;
        }
        this.mColorNameStateMap.remove(entryName);
        removeColorInCache(i2);
        this.mColorEmpty = this.mColorNameStateMap.isEmpty();
    }

    public void removeDrawablePath(@DrawableRes int i2) {
        String entryName = getEntryName(i2, KEY_TYPE_DRAWABLE);
        if (TextUtils.isEmpty(entryName)) {
            return;
        }
        this.mDrawablePathAndAngleMap.remove(entryName);
        removeDrawableInCache(i2);
        this.mDrawableEmpty = this.mDrawablePathAndAngleMap.isEmpty();
    }

    public ColorState getColorState(@ColorRes int i2) {
        String entryName = getEntryName(i2, "color");
        if (TextUtils.isEmpty(entryName)) {
            return null;
        }
        return this.mColorNameStateMap.get(entryName);
    }

    public void removeColorState(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mColorNameStateMap.remove(str);
        this.mColorEmpty = this.mColorNameStateMap.isEmpty();
    }

    public void addColorState(@ColorRes int i2, String str) {
        if (ColorState.checkColorValid("colorDefault", str)) {
            String entryName = getEntryName(i2, "color");
            if (TextUtils.isEmpty(entryName)) {
                return;
            }
            this.mColorNameStateMap.put(entryName, new ColorState(entryName, str));
            removeColorInCache(i2);
            this.mColorEmpty = false;
        }
    }

    public void addDrawablePath(@DrawableRes int i2, String str, int i3) {
        if (checkPathValid(str)) {
            String entryName = getEntryName(i2, KEY_TYPE_DRAWABLE);
            if (TextUtils.isEmpty(entryName)) {
                return;
            }
            this.mDrawablePathAndAngleMap.put(entryName, str + ":" + String.valueOf(i3));
            removeDrawableInCache(i2);
            this.mDrawableEmpty = false;
        }
    }
}
