package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FragmentManager {
    public static final FragmentFactory DEFAULT_FACTORY = new FragmentFactory();
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private FragmentFactory mFragmentFactory = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface BackStackEntry {
        @Nullable
        CharSequence getBreadCrumbShortTitle();

        @StringRes
        int getBreadCrumbShortTitleRes();

        @Nullable
        CharSequence getBreadCrumbTitle();

        @StringRes
        int getBreadCrumbTitleRes();

        int getId();

        @Nullable
        String getName();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class FragmentLifecycleCallbacks {
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    public static void enableDebugLogging(boolean z) {
        FragmentManagerImpl.DEBUG = z;
    }

    public abstract void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener);

    @NonNull
    public abstract FragmentTransaction beginTransaction();

    public abstract void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr);

    public abstract boolean executePendingTransactions();

    @Nullable
    public abstract Fragment findFragmentById(@IdRes int i2);

    @Nullable
    public abstract Fragment findFragmentByTag(@Nullable String str);

    @NonNull
    public abstract BackStackEntry getBackStackEntryAt(int i2);

    public abstract int getBackStackEntryCount();

    @Nullable
    public abstract Fragment getFragment(@NonNull Bundle bundle, @NonNull String str);

    @NonNull
    public FragmentFactory getFragmentFactory() {
        if (this.mFragmentFactory == null) {
            this.mFragmentFactory = DEFAULT_FACTORY;
        }
        return this.mFragmentFactory;
    }

    @NonNull
    public abstract List<Fragment> getFragments();

    @Nullable
    public abstract Fragment getPrimaryNavigationFragment();

    public abstract boolean isDestroyed();

    public abstract boolean isStateSaved();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public abstract void popBackStack();

    public abstract void popBackStack(int i2, int i3);

    public abstract void popBackStack(@Nullable String str, int i2);

    public abstract boolean popBackStackImmediate();

    public abstract boolean popBackStackImmediate(int i2, int i3);

    public abstract boolean popBackStackImmediate(@Nullable String str, int i2);

    public abstract void putFragment(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment);

    public abstract void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z);

    public abstract void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener);

    @Nullable
    public abstract Fragment.SavedState saveFragmentInstanceState(@NonNull Fragment fragment);

    public void setFragmentFactory(@NonNull FragmentFactory fragmentFactory) {
        this.mFragmentFactory = fragmentFactory;
    }

    public abstract void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks);
}
