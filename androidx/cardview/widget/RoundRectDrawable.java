package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundRectDrawable extends Drawable {
    private ColorStateList mBackground;
    private final RectF mBoundsF;
    private final Rect mBoundsI;
    private boolean mInsetForPadding;
    private boolean mInsetForRadius;
    private float mPadding;
    private final Paint mPaint;
    private float mRadius;
    private ColorStateList mTint;
    private PorterDuffColorFilter mTintFilter;
    private PorterDuff.Mode mTintMode;

    public RoundRectDrawable(ColorStateList colorStateList, float f2) {
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
    }

    private void setBackground(ColorStateList colorStateList) {
    }

    private void updateBounds(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    public ColorStateList getColor() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
    }

    public float getPadding() {
    }

    public float getRadius() {
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

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setColor(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setPadding(float f2, boolean z, boolean z2) {
    }

    public void setRadius(float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
    }
}
