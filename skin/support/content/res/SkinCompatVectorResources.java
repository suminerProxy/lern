package skin.support.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.content.res.AppCompatResources;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatVectorResources implements SkinResources {
    private static SkinCompatVectorResources sInstance;

    private SkinCompatVectorResources() {
        SkinCompatResources.getInstance().addSkinResources(this);
    }

    public static Drawable getDrawableCompat(Context context, int i2) {
        return getInstance().getSkinDrawableCompat(context, i2);
    }

    public static SkinCompatVectorResources getInstance() {
        if (sInstance == null) {
            synchronized (SkinCompatVectorResources.class) {
                if (sInstance == null) {
                    sInstance = new SkinCompatVectorResources();
                }
            }
        }
        return sInstance;
    }

    private Drawable getSkinDrawableCompat(Context context, int i2) {
        int targetResId;
        Drawable drawable;
        ColorStateList colorStateList;
        Drawable drawable2;
        ColorStateList colorStateList2;
        if (AppCompatDelegate.isCompatVectorFromResourcesEnabled()) {
            if (!SkinCompatResources.getInstance().isDefaultSkin()) {
                try {
                    return SkinCompatDrawableManager.get().getDrawable(context, i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (!SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList2 = SkinCompatUserThemeManager.get().getColorStateList(i2)) != null) {
                return new ColorDrawable(colorStateList2.getDefaultColor());
            }
            if (SkinCompatUserThemeManager.get().isDrawableEmpty() || (drawable2 = SkinCompatUserThemeManager.get().getDrawable(i2)) == null) {
                Drawable strategyDrawable = SkinCompatResources.getInstance().getStrategyDrawable(context, i2);
                return strategyDrawable != null ? strategyDrawable : AppCompatResources.getDrawable(context, i2);
            }
            return drawable2;
        } else if (!SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList = SkinCompatUserThemeManager.get().getColorStateList(i2)) != null) {
            return new ColorDrawable(colorStateList.getDefaultColor());
        } else {
            if (SkinCompatUserThemeManager.get().isDrawableEmpty() || (drawable = SkinCompatUserThemeManager.get().getDrawable(i2)) == null) {
                Drawable strategyDrawable2 = SkinCompatResources.getInstance().getStrategyDrawable(context, i2);
                if (strategyDrawable2 != null) {
                    return strategyDrawable2;
                }
                if (!SkinCompatResources.getInstance().isDefaultSkin() && (targetResId = SkinCompatResources.getInstance().getTargetResId(context, i2)) != 0) {
                    return SkinCompatResources.getInstance().getSkinResources().getDrawable(targetResId);
                }
                return AppCompatResources.getDrawable(context, i2);
            }
            return drawable;
        }
    }

    @Override // skin.support.content.res.SkinResources
    public void clear() {
        SkinCompatDrawableManager.get().clearCaches();
    }
}
