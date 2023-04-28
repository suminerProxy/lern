package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    public static final PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private PorterDuff.Mode mCurrentMode;
    public Drawable mDrawable;
    private boolean mMutated;
    public WrappedDrawableState mState;

    public WrappedDrawableApi14(@NonNull WrappedDrawableState wrappedDrawableState, @Nullable Resources resources) {
    }

    @NonNull
    private WrappedDrawableState mutateConstantState() {
    }

    private void updateLocalState(@Nullable Resources resources) {
    }

    private boolean updateTint(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable getWrappedDrawable() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public boolean isAutoMirrored() {
    }

    public boolean isCompatTintEnabled() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public void setAutoMirrored(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i2) {
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
    }

    public WrappedDrawableApi14(@Nullable Drawable drawable) {
    }
}
