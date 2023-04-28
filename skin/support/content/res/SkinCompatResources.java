package skin.support.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import skin.support.SkinCompatManager;
import skin.support.annotation.AnyRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatResources {
    private static volatile SkinCompatResources sInstance;
    private Resources mResources;
    private SkinCompatManager.SkinLoaderStrategy mStrategy;
    private String mSkinPkgName = "";
    private String mSkinName = "";
    private boolean isDefaultSkin = true;
    private List<SkinResources> mSkinResources = new ArrayList();

    private SkinCompatResources() {
    }

    public static SkinCompatResources getInstance() {
        if (sInstance == null) {
            synchronized (SkinCompatResources.class) {
                if (sInstance == null) {
                    sInstance = new SkinCompatResources();
                }
            }
        }
        return sInstance;
    }

    private int getSkinColor(Context context, int i2) {
        int targetResId;
        ColorStateList color;
        ColorStateList colorStateList;
        if (!SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList = SkinCompatUserThemeManager.get().getColorStateList(i2)) != null) {
            return colorStateList.getDefaultColor();
        }
        SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
        if (skinLoaderStrategy != null && (color = skinLoaderStrategy.getColor(context, this.mSkinName, i2)) != null) {
            return color.getDefaultColor();
        }
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i2)) != 0) {
            return this.mResources.getColor(targetResId);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getResources().getColor(i2, context.getTheme());
        }
        return context.getResources().getColor(i2);
    }

    private ColorStateList getSkinColorStateList(Context context, int i2) {
        int targetResId;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (SkinCompatUserThemeManager.get().isColorEmpty() || (colorStateList2 = SkinCompatUserThemeManager.get().getColorStateList(i2)) == null) {
            SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
            if (skinLoaderStrategy == null || (colorStateList = skinLoaderStrategy.getColorStateList(context, this.mSkinName, i2)) == null) {
                if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i2)) != 0) {
                    return this.mResources.getColorStateList(targetResId);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    return context.getResources().getColorStateList(i2, context.getTheme());
                }
                return context.getResources().getColorStateList(i2);
            }
            return colorStateList;
        }
        return colorStateList2;
    }

    private Drawable getSkinDrawable(Context context, int i2) {
        int targetResId;
        Drawable drawable;
        Drawable drawable2;
        ColorStateList colorStateList;
        if (!SkinCompatUserThemeManager.get().isColorEmpty() && (colorStateList = SkinCompatUserThemeManager.get().getColorStateList(i2)) != null) {
            return new ColorDrawable(colorStateList.getDefaultColor());
        }
        if (SkinCompatUserThemeManager.get().isDrawableEmpty() || (drawable2 = SkinCompatUserThemeManager.get().getDrawable(i2)) == null) {
            SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
            if (skinLoaderStrategy == null || (drawable = skinLoaderStrategy.getDrawable(context, this.mSkinName, i2)) == null) {
                if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i2)) != 0) {
                    return this.mResources.getDrawable(targetResId);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    return context.getResources().getDrawable(i2, context.getTheme());
                }
                return context.getResources().getDrawable(i2);
            }
            return drawable;
        }
        return drawable2;
    }

    private void getSkinValue(Context context, @AnyRes int i2, TypedValue typedValue, boolean z) {
        int targetResId;
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i2)) != 0) {
            this.mResources.getValue(targetResId, typedValue, z);
        } else {
            context.getResources().getValue(i2, typedValue, z);
        }
    }

    private XmlResourceParser getSkinXml(Context context, int i2) {
        int targetResId;
        if (!this.isDefaultSkin && (targetResId = getTargetResId(context, i2)) != 0) {
            return this.mResources.getXml(targetResId);
        }
        return context.getResources().getXml(i2);
    }

    public static void getValue(Context context, @AnyRes int i2, TypedValue typedValue, boolean z) {
        getInstance().getSkinValue(context, i2, typedValue, z);
    }

    public static XmlResourceParser getXml(Context context, int i2) {
        return getInstance().getSkinXml(context, i2);
    }

    public void addSkinResources(SkinResources skinResources) {
        this.mSkinResources.add(skinResources);
    }

    @Deprecated
    public int getColor(int i2) {
        return getColor(SkinCompatManager.getInstance().getContext(), i2);
    }

    @Deprecated
    public ColorStateList getColorStateList(int i2) {
        return getColorStateList(SkinCompatManager.getInstance().getContext(), i2);
    }

    @Deprecated
    public Drawable getDrawable(int i2) {
        return getDrawable(SkinCompatManager.getInstance().getContext(), i2);
    }

    public String getSkinPkgName() {
        return this.mSkinPkgName;
    }

    public Resources getSkinResources() {
        return this.mResources;
    }

    public SkinCompatManager.SkinLoaderStrategy getStrategy() {
        return this.mStrategy;
    }

    public Drawable getStrategyDrawable(Context context, int i2) {
        SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
        if (skinLoaderStrategy != null) {
            return skinLoaderStrategy.getDrawable(context, this.mSkinName, i2);
        }
        return null;
    }

    public int getTargetResId(Context context, int i2) {
        try {
            SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy = this.mStrategy;
            String targetResourceEntryName = skinLoaderStrategy != null ? skinLoaderStrategy.getTargetResourceEntryName(context, this.mSkinName, i2) : null;
            if (TextUtils.isEmpty(targetResourceEntryName)) {
                targetResourceEntryName = context.getResources().getResourceEntryName(i2);
            }
            return this.mResources.getIdentifier(targetResourceEntryName, context.getResources().getResourceTypeName(i2), this.mSkinPkgName);
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean isDefaultSkin() {
        return this.isDefaultSkin;
    }

    public void reset() {
        reset(SkinCompatManager.getInstance().getStrategies().get(-1));
    }

    public void setupSkin(Resources resources, String str, String str2, SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy) {
        if (resources != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mResources = resources;
            this.mSkinPkgName = str;
            this.mSkinName = str2;
            this.mStrategy = skinLoaderStrategy;
            this.isDefaultSkin = false;
            SkinCompatUserThemeManager.get().clearCaches();
            for (SkinResources skinResources : this.mSkinResources) {
                skinResources.clear();
            }
            return;
        }
        reset(skinLoaderStrategy);
    }

    public static int getColor(Context context, int i2) {
        return getInstance().getSkinColor(context, i2);
    }

    public static ColorStateList getColorStateList(Context context, int i2) {
        return getInstance().getSkinColorStateList(context, i2);
    }

    public static Drawable getDrawable(Context context, int i2) {
        return getInstance().getSkinDrawable(context, i2);
    }

    public void reset(SkinCompatManager.SkinLoaderStrategy skinLoaderStrategy) {
        this.mResources = SkinCompatManager.getInstance().getContext().getResources();
        this.mSkinPkgName = "";
        this.mSkinName = "";
        this.mStrategy = skinLoaderStrategy;
        this.isDefaultSkin = true;
        SkinCompatUserThemeManager.get().clearCaches();
        for (SkinResources skinResources : this.mSkinResources) {
            skinResources.clear();
        }
    }
}
