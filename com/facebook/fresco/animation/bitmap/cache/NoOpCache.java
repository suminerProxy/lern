package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NoOpCache implements BitmapFrameCache {
    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void clear() {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public boolean contains(int frameNumber) {
        return false;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    @Nullable
    public CloseableReference<Bitmap> getBitmapToReuseForFrame(int frameNumber, int width, int height) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    @Nullable
    public CloseableReference<Bitmap> getCachedFrame(int frameNumber) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    @Nullable
    public CloseableReference<Bitmap> getFallbackFrame(int frameNumber) {
        return null;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public int getSizeInBytes() {
        return 0;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void onFramePrepared(int frameNumber, CloseableReference<Bitmap> bitmapReference, int frameType) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void onFrameRendered(int frameNumber, CloseableReference<Bitmap> bitmapReference, int frameType) {
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameCache
    public void setFrameCacheListener(BitmapFrameCache.FrameCacheListener frameCacheListener) {
    }
}
