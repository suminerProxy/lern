package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DrawableContainer extends Drawable implements Drawable.Callback {
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final String TAG = "DrawableContainer";
    private int mAlpha;
    private Runnable mAnimationRunnable;
    private BlockInvalidateCallback mBlockInvalidateCallback;
    private int mCurIndex;
    private Drawable mCurrDrawable;
    private DrawableContainerState mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private Rect mHotspotBounds;
    private Drawable mLastDrawable;
    private boolean mMutated;

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ DrawableContainer this$0;

        public AnonymousClass1(DrawableContainer drawableContainer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BlockInvalidateCallback implements Drawable.Callback {
        private Drawable.Callback mCallback;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        }

        public Drawable.Callback unwrap() {
        }

        public BlockInvalidateCallback wrap(Drawable.Callback callback) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class DrawableContainerState extends Drawable.ConstantState {
        public boolean mAutoMirrored;
        public boolean mCanConstantState;
        public int mChangingConfigurations;
        public boolean mCheckedConstantSize;
        public boolean mCheckedConstantState;
        public boolean mCheckedOpacity;
        public boolean mCheckedPadding;
        public boolean mCheckedStateful;
        public int mChildrenChangingConfigurations;
        public ColorFilter mColorFilter;
        public int mConstantHeight;
        public int mConstantMinimumHeight;
        public int mConstantMinimumWidth;
        public Rect mConstantPadding;
        public boolean mConstantSize;
        public int mConstantWidth;
        public int mDensity;
        public boolean mDither;
        public SparseArray<Drawable.ConstantState> mDrawableFutures;
        public Drawable[] mDrawables;
        public int mEnterFadeDuration;
        public int mExitFadeDuration;
        public boolean mHasColorFilter;
        public boolean mHasTintList;
        public boolean mHasTintMode;
        public int mLayoutDirection;
        public boolean mMutated;
        public int mNumChildren;
        public int mOpacity;
        public final DrawableContainer mOwner;
        public Resources mSourceRes;
        public boolean mStateful;
        public ColorStateList mTintList;
        public PorterDuff.Mode mTintMode;
        public boolean mVariablePadding;

        public DrawableContainerState(DrawableContainerState drawableContainerState, DrawableContainer drawableContainer, Resources resources) {
        }

        private void createAllFutures() {
        }

        private Drawable prepareDrawable(Drawable drawable) {
        }

        public final int addChild(Drawable drawable) {
        }

        @RequiresApi(21)
        public final void applyTheme(Resources.Theme theme) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(21)
        public boolean canApplyTheme() {
        }

        public synchronized boolean canConstantState() {
        }

        public final void clearMutated() {
        }

        public void computeConstantSize() {
        }

        public final int getCapacity() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        public final Drawable getChild(int i2) {
        }

        public final int getChildCount() {
        }

        public final int getConstantHeight() {
        }

        public final int getConstantMinimumHeight() {
        }

        public final int getConstantMinimumWidth() {
        }

        public final Rect getConstantPadding() {
        }

        public final int getConstantWidth() {
        }

        public final int getEnterFadeDuration() {
        }

        public final int getExitFadeDuration() {
        }

        public final int getOpacity() {
        }

        public void growArray(int i2, int i3) {
        }

        public void invalidateCache() {
        }

        public final boolean isConstantSize() {
        }

        public final boolean isStateful() {
        }

        public void mutate() {
        }

        public final void setConstantSize(boolean z) {
        }

        public final void setEnterFadeDuration(int i2) {
        }

        public final void setExitFadeDuration(int i2) {
        }

        public final boolean setLayoutDirection(int i2, int i3) {
        }

        public final void setVariablePadding(boolean z) {
        }

        public final void updateDensity(Resources resources) {
        }
    }

    private void initializeDrawableForDisplay(Drawable drawable) {
    }

    private boolean needsMirroring() {
    }

    public static int resolveDensity(@Nullable Resources resources, int i2) {
    }

    public void animate(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
    }

    public void clearMutated() {
    }

    public DrawableContainerState cloneConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
    }

    public int getCurrentIndex() {
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
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
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
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
    public boolean onLayoutDirectionChanged(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
    }

    public boolean selectDrawable(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setConstantState(DrawableContainerState drawableContainerState) {
    }

    public void setCurrentIndex(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
    }

    public void setEnterFadeDuration(int i2) {
    }

    public void setExitFadeDuration(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
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

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
    }

    public final void updateDensity(Resources resources) {
    }
}
