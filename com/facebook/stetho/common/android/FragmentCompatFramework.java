package com.facebook.stetho.common.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.view.View;
import com.facebook.stetho.common.android.FragmentCompat;
import javax.annotation.Nullable;

@TargetApi(11)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FragmentCompatFramework extends FragmentCompat<Fragment, DialogFragment, FragmentManager, Activity> {
    private static final DialogFragmentAccessorFramework sDialogFragmentAccessor = null;
    private static final FragmentAccessorFrameworkHoneycomb sFragmentAccessor = null;
    private static final FragmentActivityAccessorFramework sFragmentActivityAccessor = null;
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> sFragmentManagerAccessor = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DialogFragmentAccessorFramework implements DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> {
        private final FragmentAccessor<Fragment, FragmentManager> mFragmentAccessor;

        public DialogFragmentAccessorFramework(FragmentAccessor<Fragment, FragmentManager> fragmentAccessor) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ Object getChildFragmentManager(Object obj) {
        }

        @Override // com.facebook.stetho.common.android.DialogFragmentAccessor
        public /* bridge */ /* synthetic */ Dialog getDialog(DialogFragment dialogFragment) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ Object getFragmentManager(Object obj) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public /* bridge */ /* synthetic */ int getId(Object obj) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        public /* bridge */ /* synthetic */ Resources getResources(Object obj) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ String getTag(Object obj) {
        }

        @Override // com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ View getView(Object obj) {
        }

        @Nullable
        public FragmentManager getChildFragmentManager(Fragment fragment) {
        }

        /* renamed from: getDialog  reason: avoid collision after fix types in other method */
        public Dialog getDialog2(DialogFragment dialogFragment) {
        }

        @Nullable
        public FragmentManager getFragmentManager(Fragment fragment) {
        }

        public int getId(Fragment fragment) {
        }

        public Resources getResources(Fragment fragment) {
        }

        @Nullable
        public String getTag(Fragment fragment) {
        }

        @Nullable
        public View getView(Fragment fragment) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FragmentAccessorFrameworkHoneycomb implements FragmentAccessor<Fragment, FragmentManager> {
        private FragmentAccessorFrameworkHoneycomb() {
        }

        @Nullable
        /* renamed from: getChildFragmentManager  reason: avoid collision after fix types in other method */
        public FragmentManager getChildFragmentManager2(Fragment fragment) {
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

        public /* synthetic */ FragmentAccessorFrameworkHoneycomb(AnonymousClass1 anonymousClass1) {
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

    @TargetApi(17)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FragmentAccessorFrameworkJellyBean extends FragmentAccessorFrameworkHoneycomb {
        private FragmentAccessorFrameworkJellyBean() {
        }

        @Override // com.facebook.stetho.common.android.FragmentCompatFramework.FragmentAccessorFrameworkHoneycomb, com.facebook.stetho.common.android.FragmentAccessor
        @Nullable
        public /* bridge */ /* synthetic */ FragmentManager getChildFragmentManager(Fragment fragment) {
        }

        public /* synthetic */ FragmentAccessorFrameworkJellyBean(AnonymousClass1 anonymousClass1) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.common.android.FragmentCompatFramework.FragmentAccessorFrameworkHoneycomb
        @Nullable
        public FragmentManager getChildFragmentManager(Fragment fragment) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FragmentActivityAccessorFramework implements FragmentActivityAccessor<Activity, FragmentManager> {
        private FragmentActivityAccessorFramework() {
        }

        @Override // com.facebook.stetho.common.android.FragmentActivityAccessor
        @Nullable
        public /* bridge */ /* synthetic */ FragmentManager getFragmentManager(Activity activity) {
        }

        public /* synthetic */ FragmentActivityAccessorFramework(AnonymousClass1 anonymousClass1) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.common.android.FragmentActivityAccessor
        @Nullable
        public FragmentManager getFragmentManager(Activity activity) {
        }
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public /* bridge */ /* synthetic */ DialogFragmentAccessor<DialogFragment, Fragment, FragmentManager> forDialogFragment() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public /* bridge */ /* synthetic */ FragmentAccessor<Fragment, FragmentManager> forFragment() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public /* bridge */ /* synthetic */ FragmentActivityAccessor<Activity, FragmentManager> forFragmentActivity() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    /* renamed from: forFragmentManager  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager2() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<DialogFragment> getDialogFragmentClass() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public Class<Activity> getFragmentActivityClass() {
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
    public FragmentActivityAccessor<Activity, FragmentManager> forFragmentActivity2() {
    }

    @Override // com.facebook.stetho.common.android.FragmentCompat
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager() {
    }
}
