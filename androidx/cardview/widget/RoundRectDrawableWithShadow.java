package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundRectDrawableWithShadow extends Drawable {
    private static final double COS_45 = 0.0d;
    private static final float SHADOW_MULTIPLIER = 1.5f;
    public static RoundRectHelper sRoundRectHelper;
    private boolean mAddPaddingForCorners;
    private ColorStateList mBackground;
    private final RectF mCardBounds;
    private float mCornerRadius;
    private Paint mCornerShadowPaint;
    private Path mCornerShadowPath;
    private boolean mDirty;
    private Paint mEdgeShadowPaint;
    private final int mInsetShadow;
    private Paint mPaint;
    private boolean mPrintedShadowClipWarning;
    private float mRawMaxShadowSize;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface RoundRectHelper {
        void drawRoundRect(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    public RoundRectDrawableWithShadow(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
    }

    private void buildComponents(Rect rect) {
    }

    private void buildShadowCorners() {
    }

    public static float calculateHorizontalPadding(float f2, float f3, boolean z) {
    }

    public static float calculateVerticalPadding(float f2, float f3, boolean z) {
    }

    private void drawShadow(Canvas canvas) {
    }

    private void setBackground(ColorStateList colorStateList) {
    }

    private void setShadowSize(float f2, float f3) {
    }

    private int toEven(float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public ColorStateList getColor() {
    }

    public float getCornerRadius() {
    }

    public void getMaxShadowAndCornerPadding(Rect rect) {
    }

    public float getMaxShadowSize() {
    }

    public float getMinHeight() {
    }

    public float getMinWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
    }

    public float getShadowSize() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    public void setAddPaddingForCorners(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setColor(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setCornerRadius(float f2) {
    }

    public void setMaxShadowSize(float f2) {
    }

    public void setShadowSize(float f2) {
    }
}
