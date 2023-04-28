package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BasePostprocessor implements Postprocessor {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = null;
    private static Method sCopyBitmap;

    private static void internalCopyBitmap(Bitmap destBitmap, Bitmap sourceBitmap) {
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public String getName() {
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    @Nullable
    public CacheKey getPostprocessorCacheKey() {
    }

    @Override // com.facebook.imagepipeline.request.Postprocessor
    public CloseableReference<Bitmap> process(Bitmap sourceBitmap, PlatformBitmapFactory bitmapFactory) {
    }

    public void process(Bitmap bitmap) {
    }

    public void process(Bitmap destBitmap, Bitmap sourceBitmap) {
    }
}
