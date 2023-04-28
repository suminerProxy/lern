package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImageAssetManager {
    private static final Object bitmapHashLock = null;
    private final Context context;
    @Nullable
    private ImageAssetDelegate delegate;
    private final Map<String, LottieImageAsset> imageAssets;
    private String imagesFolder;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
    }

    private Bitmap putBitmap(String str, @Nullable Bitmap bitmap) {
    }

    @Nullable
    public Bitmap bitmapForId(String str) {
    }

    public boolean hasSameContext(Context context) {
    }

    public void setDelegate(@Nullable ImageAssetDelegate imageAssetDelegate) {
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
    }
}
