package com.facebook.stetho.common.android;

import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.stetho.common.android.FragmentCompat;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FragmentCompatSupportLib extends FragmentCompat<Fragment, DialogFragment, FragmentManager, FragmentActivity> {
    private static final DialogFragmentAccessorSupportLib sDialogFragmentAccessor = null;
    private static final FragmentAccessorSupportLib sFragmentAccessor = null;
    private static final FragmentActivityAccessorSupportLib sFragmentActivityAccessor = null;
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> {
        private DialogFragmentAccessorSupportLib() {
        }

        @Override // com.facebook.stetho.common.android.DialogFragmentAccessor
        public /* bridge */ /* synthetic */ Dialog getDialog(DialogFragment dialogFragment) {
        }

        public /* synthetic */ DialogFragmentAccessorSupportLib(AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: getDialog  reason: avoid collision after fix types in other method */
        public Dialog getDialog2(DialogFragment dialogFragment) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, FragmentManager> {
        private FragmentAccessorSupportLib() {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ FragmentManager getChildFragmentManager(Fragment fragment) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ FragmentManager getFragmentManager(Fragment fragment) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public /* bridge */ /* synthetic */ int getId(Fragment fragment) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public /* bridge */ /* synthetic */ Resources getResources(Fragment fragment) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ String getTag(Fragment fragment) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ View getView(Fragment fragment) {
        }

        public /* synthetic */ FragmentAccessorSupportLib(AnonymousClass1 anonymousClass1) {
        }

        @Nullable
        /* renamed from: getChildFragmentManager  reason: avoid collision after fix types in other method */
        public FragmentManager getChildFragmentManager2(Fragment fragment) {
        }

        @Nullable
        /* renamed from: getFragmentManager  reason: avoid collision after fix types in other method */
        public FragmentManager getFragmentManager2(Fragment fragment) {
        }

        /* renamed from: getId  reason: avoid collision after fix types in other method */
        public int getId2(Fragment fragment) {
        }

        /* renamed from: getResources  reason: avoid collision after fix types in other method */
        public Resources getResources2(Fragment fragment) {
        }

        @Nullable
        /* renamed from: getTag  reason: avoid collision after fix types in other method */
        public String getTag2(Fragment fragment) {
        }

        @Nullable
        /* renamed from: getView  reason: avoid collision after fix types in other method */
        public View getView2(Fragment fragment) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<FragmentActivity, FragmentManager> {
        private FragmentActivityAccessorSupportLib() {
        }

        @Override // com.facebook.stetho.common.android.FragmentActivityAccessor
        @Nullable
        public /* bridge */ /* synthetic */ FragmentManager getFragmentManager(FragmentActivity fragmentActivity) {
        }

        public /* synthetic */ FragmentActivityAccessorSupportLib(AnonymousClass1 anonymousClass1) {
        }

        @Nullable
        /* renamed from: getFragmentManager  reason: avoid collision after fix types in other method */
        public FragmentManager getFragmentManager2(FragmentActivity fragmentActivity) {
        }
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public /* bridge */ /* synthetic */ DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public /* bridge */ /* synthetic */ FragmentAccessor<Fragment, FragmentManager> forFragment() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public /* bridge */ /* synthetic */ FragmentActivityAccessor<FragmentActivity, FragmentManager> forFragmentActivity() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<DialogFragment> getDialogFragmentClass() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<FragmentActivity> getFragmentActivityClass() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<Fragment> getFragmentClass() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* renamed from: forDialogFragment  reason: avoid collision after fix types in other method */
    public DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment2() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* renamed from: forFragment  reason: avoid collision after fix types in other method */
    public FragmentAccessor<Fragment, FragmentManager> forFragment2() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* renamed from: forFragmentActivity  reason: avoid collision after fix types in other method */
    public FragmentActivityAccessor<FragmentActivity, FragmentManager> forFragmentActivity2() {
    }
}
