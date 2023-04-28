package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundedBitmapDrawable extends RoundedDrawable {
    @Nullable
    private final Bitmap mBitmap;
    private final Paint mBorderPaint;
    @Nullable
    private WeakReference<Bitmap> mLastBitmap;
    private final Paint mPaint;

    public RoundedBitmapDrawable(Resources res, @Nullable Bitmap bitmap, @Nullable Paint paint) {
    }

    public static RoundedBitmapDrawable fromBitmapDrawable(Resources res, BitmapDrawable bitmapDrawable) {
    }

    private void updatePaint() {
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public Paint getPaint() {
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    @Override // com.facebook.drawee.drawable.RoundedDrawable
    @VisibleForTesting
    public boolean shouldRound() {
    }

    public RoundedBitmapDrawable(Resources res, @Nullable Bitmap bitmap) {
    }
}
