package skin.support.load;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import skin.support.SkinCompatManager;
import skin.support.content.res.SkinCompatResources;
import skin.support.utils.SkinFileUtils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class SkinSDCardLoader implements SkinCompatManager.SkinLoaderStrategy {
    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public ColorStateList getColor(Context context, String str, int i2) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public ColorStateList getColorStateList(Context context, String str, int i2) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public Drawable getDrawable(Context context, String str, int i2) {
        return null;
    }

    public abstract String getSkinPath(Context context, String str);

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public String getTargetResourceEntryName(Context context, String str, int i2) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public String loadSkinInBackground(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String skinPath = getSkinPath(context, str);
        if (SkinFileUtils.isFileExists(skinPath)) {
            String skinPackageName = SkinCompatManager.getInstance().getSkinPackageName(skinPath);
            Resources skinResources = SkinCompatManager.getInstance().getSkinResources(skinPath);
            if (skinResources == null || TextUtils.isEmpty(skinPackageName)) {
                return null;
            }
            SkinCompatResources.getInstance().setupSkin(skinResources, skinPackageName, str, this);
            return str;
        }
        return null;
    }
}
