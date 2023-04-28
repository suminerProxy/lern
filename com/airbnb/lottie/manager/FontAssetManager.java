package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.MutablePair;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FontAssetManager {
    private final AssetManager assetManager;
    private String defaultFontFileExtension;
    @Nullable
    private FontAssetDelegate delegate;
    private final Map<String, Typeface> fontFamilies;
    private final Map<MutablePair<String>, Typeface> fontMap;
    private final MutablePair<String> tempPair;

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
    }

    private Typeface getFontFamily(String str) {
    }

    private Typeface typefaceForStyle(Typeface typeface, String str) {
    }

    public Typeface getTypeface(String str, String str2) {
    }

    public void setDefaultFontFileExtension(String str) {
    }

    public void setDelegate(@Nullable FontAssetDelegate fontAssetDelegate) {
    }
}
