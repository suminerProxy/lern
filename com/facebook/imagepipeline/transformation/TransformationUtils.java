package com.facebook.imagepipeline.transformation;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TransformationUtils {
    public static boolean maybeApplyTransformation(@Nullable BitmapTransformation transformation, @Nullable CloseableReference<Bitmap> bitmapReference) {
        if (transformation == null || bitmapReference == null) {
            return false;
        }
        Bitmap bitmap = bitmapReference.get();
        if (Build.VERSION.SDK_INT >= 12 && transformation.modifiesTransparency()) {
            bitmap.setHasAlpha(true);
        }
        transformation.transform(bitmap);
        return true;
    }
}
