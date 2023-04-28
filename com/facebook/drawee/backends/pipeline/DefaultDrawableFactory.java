package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultDrawableFactory implements DrawableFactory {
    @Nullable
    private final DrawableFactory mAnimatedDrawableFactory;
    private final Resources mResources;

    public DefaultDrawableFactory(Resources resources, @Nullable DrawableFactory animatedDrawableFactory) {
    }

    private static boolean hasTransformableExifOrientation(CloseableStaticBitmap closeableStaticBitmap) {
    }

    private static boolean hasTransformableRotationAngle(CloseableStaticBitmap closeableStaticBitmap) {
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    @Nullable
    public Drawable createDrawable(CloseableImage closeableImage) {
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public boolean supportsImageType(CloseableImage image) {
    }
}
