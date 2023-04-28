package com.facebook.stetho.common.android;

import android.app.Activity;
import java.lang.reflect.Field;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class FragmentCompat<FRAGMENT, DIALOG_FRAGMENT, FRAGMENT_MANAGER, FRAGMENT_ACTIVITY extends Activity> {
    private static FragmentCompat sFrameworkInstance;
    private static final boolean sHasSupportFragment = false;
    private static FragmentCompat sSupportInstance;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FragmentManagerAccessorViaReflection<FRAGMENT_MANAGER, FRAGMENT> implements FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
        @Nullable
        private Field mFieldMAdded;

        @Override // com.facebook.stetho.common.android.FragmentManagerAccessor
        @Nullable
        public List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragment_manager) {
        }
    }

    @Nullable
    public static FragmentCompat getFrameworkInstance() {
    }

    @Nullable
    public static FragmentCompat getSupportLibInstance() {
    }

    public abstract DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> forDialogFragment();

    public abstract FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> forFragment();

    public abstract FragmentActivityAccessor<FRAGMENT_ACTIVITY, FRAGMENT_MANAGER> forFragmentActivity();

    public abstract FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> forFragmentManager();

    public abstract Class<DIALOG_FRAGMENT> getDialogFragmentClass();

    public abstract Class<FRAGMENT_ACTIVITY> getFragmentActivityClass();

    public abstract Class<FRAGMENT> getFragmentClass();
}
