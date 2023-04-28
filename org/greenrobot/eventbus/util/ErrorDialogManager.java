package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import org.greenrobot.eventbus.EventBus;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ErrorDialogManager {
    public static final String KEY_EVENT_TYPE_ON_CLOSE = "de.greenrobot.eventbus.errordialog.event_type_on_close";
    public static final String KEY_FINISH_AFTER_DIALOG = "de.greenrobot.eventbus.errordialog.finish_after_dialog";
    public static final String KEY_ICON_ID = "de.greenrobot.eventbus.errordialog.icon_id";
    public static final String KEY_MESSAGE = "de.greenrobot.eventbus.errordialog.message";
    public static final String KEY_TITLE = "de.greenrobot.eventbus.errordialog.title";
    public static final String TAG_ERROR_DIALOG = "de.greenrobot.eventbus.error_dialog";
    public static final String TAG_ERROR_DIALOG_MANAGER = "de.greenrobot.eventbus.error_dialog_manager";
    public static ErrorDialogFragmentFactory<?> factory;

    @TargetApi(11)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class HoneycombManagerFragment extends Fragment {
        public Bundle argumentsForErrorDialog;
        private EventBus eventBus;
        private Object executionScope;
        public boolean finishAfterDialog;

        public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
        }

        public void onEventMainThread(ThrowableFailureEvent throwableFailureEvent) {
        }

        @Override // android.app.Fragment
        public void onPause() {
        }

        @Override // android.app.Fragment
        public void onResume() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class SupportManagerFragment extends androidx.fragment.app.Fragment {
        public Bundle argumentsForErrorDialog;
        private EventBus eventBus;
        private Object executionScope;
        public boolean finishAfterDialog;
        private boolean skipRegisterOnNextResume;

        public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
        }

        public void onEventMainThread(ThrowableFailureEvent throwableFailureEvent) {
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
        }
    }

    public static /* synthetic */ boolean access$000(Object obj, ThrowableFailureEvent throwableFailureEvent) {
    }

    public static void attachTo(Activity activity) {
    }

    public static void checkLogException(ThrowableFailureEvent throwableFailureEvent) {
    }

    private static boolean isInExecutionScope(Object obj, ThrowableFailureEvent throwableFailureEvent) {
    }

    private static boolean isSupportActivity(Activity activity) {
    }

    public static void attachTo(Activity activity, boolean z) {
    }

    public static void attachTo(Activity activity, boolean z, Bundle bundle) {
    }

    public static void attachTo(Activity activity, Object obj, boolean z, Bundle bundle) {
    }
}
