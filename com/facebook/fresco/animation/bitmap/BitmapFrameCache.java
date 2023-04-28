package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface BitmapFrameCache {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface FrameCacheListener {
        void onFrameCached(BitmapFrameCache bitmapFrameCache, int frameNumber);

        void onFrameEvicted(BitmapFrameCache bitmapFrameCache, int frameNumber);
    }

    void clear();

    boolean contains(int frameNumber);

    @Nullable
    CloseableReference<Bitmap> getBitmapToReuseForFrame(int frameNumber, int width, int height);

    @Nullable
    CloseableReference<Bitmap> getCachedFrame(int frameNumber);

    @Nullable
    CloseableReference<Bitmap> getFallbackFrame(int frameNumber);

    int getSizeInBytes();

    void onFramePrepared(int frameNumber, CloseableReference<Bitmap> bitmapReference, int frameType);

    void onFrameRendered(int frameNumber, CloseableReference<Bitmap> bitmapReference, int frameType);

    void setFrameCacheListener(FrameCacheListener frameCacheListener);
}
