package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class WrappedDrawableState extends Drawable.ConstantState {
    public int mChangingConfigurations;
    public Drawable.ConstantState mDrawableState;
    public ColorStateList mTint;
    public PorterDuff.Mode mTintMode;

    public WrappedDrawableState(@Nullable WrappedDrawableState wrappedDrawableState) {
    }

    public boolean canConstantState() {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(@Nullable Resources resources) {
    }
}
