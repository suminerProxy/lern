package com.facebook.imagepipeline.postprocessors;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BlurPostProcessor extends BasePostprocessor {
    private static final int DEFAULT_ITERATIONS = 3;
    private static final boolean canUseRenderScript = false;
    private final int mBlurRadius;
    @Nullable
    private CacheKey mCacheKey;
    private final Context mContext;
    private final int mIterations;

    public BlurPostProcessor(final int blurRadius, final Context context, final int iterations) {
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    @Nullable
    public CacheKey getPostprocessorCacheKey() {
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(final Bitmap destBitmap, final Bitmap sourceBitmap) {
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(final Bitmap bitmap) {
    }

    public BlurPostProcessor(final int blurRadius, final Context context) {
    }
}
