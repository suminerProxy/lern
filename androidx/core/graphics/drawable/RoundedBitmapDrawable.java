package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class RoundedBitmapDrawable extends Drawable {
    private static final int DEFAULT_PAINT_FLAGS = 3;
    private boolean mApplyGravity;
    public final Bitmap mBitmap;
    private int mBitmapHeight;
    private final BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private float mCornerRadius;
    public final Rect mDstRect;
    private final RectF mDstRectF;
    private int mGravity;
    private boolean mIsCircular;
    private final Paint mPaint;
    private final Matrix mShaderMatrix;
    private int mTargetDensity;

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
    }

    private void computeBitmapSize() {
    }

    private static boolean isGreaterThanZero(float f2) {
    }

    private void updateCircularCornerRadius() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Nullable
    public final Bitmap getBitmap() {
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
    }

    public float getCornerRadius() {
    }

    public int getGravity() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @NonNull
    public final Paint getPaint() {
    }

    public void gravityCompatApply(int i2, int i3, int i4, Rect rect, Rect rect2) {
    }

    public boolean hasAntiAlias() {
    }

    public boolean hasMipMap() {
    }

    public boolean isCircular() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setAntiAlias(boolean z) {
    }

    public void setCircular(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setCornerRadius(float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
    }

    public void setGravity(int i2) {
    }

    public void setMipMap(boolean z) {
    }

    public void setTargetDensity(@NonNull Canvas canvas) {
    }

    public void updateDstRect() {
    }

    public void setTargetDensity(@NonNull DisplayMetrics displayMetrics) {
    }

    public void setTargetDensity(int i2) {
    }
}
