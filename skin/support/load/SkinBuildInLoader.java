package skin.support.load;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import h.l.a.a.c;
import skin.support.SkinCompatManager;
import skin.support.content.res.SkinCompatResources;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinBuildInLoader implements SkinCompatManager.SkinLoaderStrategy {
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

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public String getTargetResourceEntryName(Context context, String str, int i2) {
        return context.getResources().getResourceEntryName(i2) + c.f17369e + str;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public int getType() {
        return 1;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public String loadSkinInBackground(Context context, String str) {
        SkinCompatResources.getInstance().setupSkin(context.getResources(), context.getPackageName(), str, this);
        return str;
    }
}
