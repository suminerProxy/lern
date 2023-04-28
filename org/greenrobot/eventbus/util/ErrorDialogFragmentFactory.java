package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class ErrorDialogFragmentFactory<T> {
    public final ErrorDialogConfig config;

    @TargetApi(11)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Honeycomb extends ErrorDialogFragmentFactory<Fragment> {
        public Honeycomb(ErrorDialogConfig errorDialogConfig) {
        }

        @Override // org.greenrobot.eventbus.util.ErrorDialogFragmentFactory
        public /* bridge */ /* synthetic */ Fragment createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.greenrobot.eventbus.util.ErrorDialogFragmentFactory
        public Fragment createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Support extends ErrorDialogFragmentFactory<androidx.fragment.app.Fragment> {
        public Support(ErrorDialogConfig errorDialogConfig) {
        }

        @Override // org.greenrobot.eventbus.util.ErrorDialogFragmentFactory
        public /* bridge */ /* synthetic */ androidx.fragment.app.Fragment createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.greenrobot.eventbus.util.ErrorDialogFragmentFactory
        public androidx.fragment.app.Fragment createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
        }
    }

    public ErrorDialogFragmentFactory(ErrorDialogConfig errorDialogConfig) {
    }

    public abstract T createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle);

    public String getMessageFor(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
    }

    public String getTitleFor(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
    }

    public T prepareErrorFragment(ThrowableFailureEvent throwableFailureEvent, boolean z, Bundle bundle) {
    }
}
