package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WindowInsetsCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final WindowInsetsCompat CONSUMED = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
    private static final String TAG = "WindowInsetsCompat";
    private final Impl mImpl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BuilderImpl {
        private final WindowInsetsCompat mInsets;

        public BuilderImpl() {
        }

        @NonNull
        public WindowInsetsCompat build() {
        }

        public void setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
        }

        public void setMandatorySystemGestureInsets(@NonNull Insets insets) {
        }

        public void setStableInsets(@NonNull Insets insets) {
        }

        public void setSystemGestureInsets(@NonNull Insets insets) {
        }

        public void setSystemWindowInsets(@NonNull Insets insets) {
        }

        public void setTappableElementInsets(@NonNull Insets insets) {
        }

        public BuilderImpl(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Impl {
        public final WindowInsetsCompat mHost;

        public Impl(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        @NonNull
        public WindowInsetsCompat consumeDisplayCutout() {
        }

        @NonNull
        public WindowInsetsCompat consumeStableInsets() {
        }

        @NonNull
        public WindowInsetsCompat consumeSystemWindowInsets() {
        }

        public boolean equals(Object obj) {
        }

        @Nullable
        public DisplayCutoutCompat getDisplayCutout() {
        }

        @NonNull
        public Insets getMandatorySystemGestureInsets() {
        }

        @NonNull
        public Insets getStableInsets() {
        }

        @NonNull
        public Insets getSystemGestureInsets() {
        }

        @NonNull
        public Insets getSystemWindowInsets() {
        }

        @NonNull
        public Insets getTappableElementInsets() {
        }

        public int hashCode() {
        }

        @NonNull
        public WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
        }

        public boolean isConsumed() {
        }

        public boolean isRound() {
        }
    }

    @RequiresApi(28)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Impl28 extends Impl21 {
        public Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat consumeDisplayCutout() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @Nullable
        public DisplayCutoutCompat getDisplayCutout() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
        }

        public Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl28 impl28) {
        }
    }

    @RequiresApi(20)
    private WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.mImpl = new Impl29(this, windowInsets);
        } else if (i2 >= 28) {
            this.mImpl = new Impl28(this, windowInsets);
        } else if (i2 >= 21) {
            this.mImpl = new Impl21(this, windowInsets);
        } else if (i2 >= 20) {
            this.mImpl = new Impl20(this, windowInsets);
        } else {
            this.mImpl = new Impl(this);
        }
    }

    public static Insets insetInsets(Insets insets, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, insets.left - i2);
        int max2 = Math.max(0, insets.f30top - i3);
        int max3 = Math.max(0, insets.right - i4);
        int max4 = Math.max(0, insets.bottom - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? insets : Insets.of(max, max2, max3, max4);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        return new WindowInsetsCompat((WindowInsets) Preconditions.checkNotNull(windowInsets));
    }

    @NonNull
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.consumeDisplayCutout();
    }

    @NonNull
    public WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.consumeStableInsets();
    }

    @NonNull
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.consumeSystemWindowInsets();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return ObjectsCompat.equals(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
        }
        return false;
    }

    @Nullable
    public DisplayCutoutCompat getDisplayCutout() {
        return this.mImpl.getDisplayCutout();
    }

    @NonNull
    public Insets getMandatorySystemGestureInsets() {
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    public int getStableInsetBottom() {
        return getStableInsets().bottom;
    }

    public int getStableInsetLeft() {
        return getStableInsets().left;
    }

    public int getStableInsetRight() {
        return getStableInsets().right;
    }

    public int getStableInsetTop() {
        return getStableInsets().f30top;
    }

    @NonNull
    public Insets getStableInsets() {
        return this.mImpl.getStableInsets();
    }

    @NonNull
    public Insets getSystemGestureInsets() {
        return this.mImpl.getSystemGestureInsets();
    }

    public int getSystemWindowInsetBottom() {
        return getSystemWindowInsets().bottom;
    }

    public int getSystemWindowInsetLeft() {
        return getSystemWindowInsets().left;
    }

    public int getSystemWindowInsetRight() {
        return getSystemWindowInsets().right;
    }

    public int getSystemWindowInsetTop() {
        return getSystemWindowInsets().f30top;
    }

    @NonNull
    public Insets getSystemWindowInsets() {
        return this.mImpl.getSystemWindowInsets();
    }

    @NonNull
    public Insets getTappableElementInsets() {
        return this.mImpl.getTappableElementInsets();
    }

    public boolean hasInsets() {
        if (!hasSystemWindowInsets() && !hasStableInsets() && getDisplayCutout() == null) {
            Insets systemGestureInsets = getSystemGestureInsets();
            Insets insets = Insets.NONE;
            if (systemGestureInsets.equals(insets) && getMandatorySystemGestureInsets().equals(insets) && getTappableElementInsets().equals(insets)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasStableInsets() {
        return !getStableInsets().equals(Insets.NONE);
    }

    public boolean hasSystemWindowInsets() {
        return !getSystemWindowInsets().equals(Insets.NONE);
    }

    public int hashCode() {
        Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    @NonNull
    public WindowInsetsCompat inset(@NonNull Insets insets) {
        return inset(insets.left, insets.f30top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        return this.mImpl.isRound();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i2, int i3, int i4, int i5) {
        return new Builder(this).setSystemWindowInsets(Insets.of(i2, i3, i4, i5)).build();
    }

    @Nullable
    @RequiresApi(20)
    public WindowInsets toWindowInsets() {
        Impl impl = this.mImpl;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    @RequiresApi(api = 20)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BuilderImpl20 extends BuilderImpl {
        private static Constructor<WindowInsets> sConstructor;
        private static boolean sConstructorFetched;
        private static Field sConsumedField;
        private static boolean sConsumedFieldFetched;
        private WindowInsets mInsets;

        public BuilderImpl20() {
        }

        @Nullable
        private static WindowInsets createWindowInsetsInstance() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        public WindowInsetsCompat build() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(@NonNull Insets insets) {
        }

        public BuilderImpl20(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }
    }

    @RequiresApi(api = 29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BuilderImpl29 extends BuilderImpl {
        public final WindowInsets.Builder mPlatBuilder;

        public BuilderImpl29() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        public WindowInsetsCompat build() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setMandatorySystemGestureInsets(@NonNull Insets insets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setStableInsets(@NonNull Insets insets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemGestureInsets(@NonNull Insets insets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(@NonNull Insets insets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setTappableElementInsets(@NonNull Insets insets) {
        }

        public BuilderImpl29(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Impl21 extends Impl20 {
        private Insets mStableInsets;

        public Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat consumeStableInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat consumeSystemWindowInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public final Insets getStableInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isConsumed() {
        }

        public Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl21 impl21) {
        }
    }

    @NonNull
    public WindowInsetsCompat inset(@IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5) {
        return this.mImpl.inset(i2, i3, i4, i5);
    }

    @RequiresApi(20)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Impl20 extends Impl {
        @NonNull
        public final WindowInsets mPlatformInsets;
        private Insets mSystemWindowInsets;

        public Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public final Insets getSystemWindowInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isRound() {
        }

        public Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl20 impl20) {
        }
    }

    @RequiresApi(29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Impl29 extends Impl28 {
        private Insets mMandatorySystemGestureInsets;
        private Insets mSystemGestureInsets;
        private Insets mTappableElementInsets;

        public Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getMandatorySystemGestureInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getSystemGestureInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getTappableElementInsets() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat inset(int i2, int i3, int i4, int i5) {
        }

        public Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl29 impl29) {
        }
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(@NonNull Rect rect) {
        return new Builder(this).setSystemWindowInsets(Insets.of(rect)).build();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private final BuilderImpl mImpl;

        public Builder() {
        }

        @NonNull
        public WindowInsetsCompat build() {
        }

        @NonNull
        public Builder setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
        }

        @NonNull
        public Builder setMandatorySystemGestureInsets(@NonNull Insets insets) {
        }

        @NonNull
        public Builder setStableInsets(@NonNull Insets insets) {
        }

        @NonNull
        public Builder setSystemGestureInsets(@NonNull Insets insets) {
        }

        @NonNull
        public Builder setSystemWindowInsets(@NonNull Insets insets) {
        }

        @NonNull
        public Builder setTappableElementInsets(@NonNull Insets insets) {
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.mImpl;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && (impl instanceof Impl29)) {
                this.mImpl = new Impl29(this, (Impl29) impl);
                return;
            } else if (i2 >= 28 && (impl instanceof Impl28)) {
                this.mImpl = new Impl28(this, (Impl28) impl);
                return;
            } else if (i2 >= 21 && (impl instanceof Impl21)) {
                this.mImpl = new Impl21(this, (Impl21) impl);
                return;
            } else if (i2 >= 20 && (impl instanceof Impl20)) {
                this.mImpl = new Impl20(this, (Impl20) impl);
                return;
            } else {
                this.mImpl = new Impl(this);
                return;
            }
        }
        this.mImpl = new Impl(this);
    }
}
