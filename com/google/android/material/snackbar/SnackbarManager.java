package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    public static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static SnackbarManager snackbarManager;
    @Nullable
    private SnackbarRecord currentSnackbar;
    @NonNull
    private final Handler handler;
    @NonNull
    private final Object lock;
    @Nullable
    private SnackbarRecord nextSnackbar;

    /* renamed from: com.google.android.material.snackbar.SnackbarManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ SnackbarManager this$0;

        public AnonymousClass1(SnackbarManager snackbarManager) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Callback {
        void dismiss(int i2);

        void show();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SnackbarRecord {
        @NonNull
        public final WeakReference<Callback> callback;
        public int duration;
        public boolean paused;

        public SnackbarRecord(int i2, Callback callback) {
        }

        public boolean isSnackbar(@Nullable Callback callback) {
        }
    }

    private SnackbarManager() {
    }

    private boolean cancelSnackbarLocked(@NonNull SnackbarRecord snackbarRecord, int i2) {
    }

    public static SnackbarManager getInstance() {
    }

    private boolean isCurrentSnackbarLocked(Callback callback) {
    }

    private boolean isNextSnackbarLocked(Callback callback) {
    }

    private void scheduleTimeoutLocked(@NonNull SnackbarRecord snackbarRecord) {
    }

    private void showNextSnackbarLocked() {
    }

    public void dismiss(Callback callback, int i2) {
    }

    public void handleTimeout(@NonNull SnackbarRecord snackbarRecord) {
    }

    public boolean isCurrent(Callback callback) {
    }

    public boolean isCurrentOrNext(Callback callback) {
    }

    public void onDismissed(Callback callback) {
    }

    public void onShown(Callback callback) {
    }

    public void pauseTimeout(Callback callback) {
    }

    public void restoreTimeoutIfPaused(Callback callback) {
    }

    public void show(int i2, Callback callback) {
    }
}
