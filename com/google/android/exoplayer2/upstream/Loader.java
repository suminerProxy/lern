package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final LoadErrorAction DONT_RETRY = null;
    public static final LoadErrorAction DONT_RETRY_FATAL = null;
    public static final LoadErrorAction RETRY = null;
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT = null;
    private static final String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    @Nullable
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    @Nullable
    private IOException fatalError;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released);

        void onLoadCompleted(T loadable, long elapsedRealtimeMs, long loadDurationMs);

        LoadErrorAction onLoadError(T loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        public /* synthetic */ LoadErrorAction(int i2, long j2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int access$300(LoadErrorAction loadErrorAction) {
        }

        public static /* synthetic */ long access$400(LoadErrorAction loadErrorAction) {
        }

        public boolean isRetry() {
        }

        private LoadErrorAction(int type, long retryDelayMillis) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_FATAL_ERROR = 3;
        private static final int MSG_FINISH = 1;
        private static final int MSG_IO_EXCEPTION = 2;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        @Nullable
        private Callback<T> callback;
        private boolean canceled;
        @Nullable
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        @Nullable
        private Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;
        public final /* synthetic */ Loader this$0;

        public LoadTask(final Loader this$0, Looper looper, T loadable, Callback<T> callback, int defaultMinRetryCount, long startTimeMs) {
        }

        private void execute() {
        }

        private void finish() {
        }

        private long getRetryDelayMillis() {
        }

        public void cancel(boolean released) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
        }

        public void maybeThrowError(int minRetryCount) throws IOException {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void start(long delayMillis) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Loadable {
        void cancelLoad();

        void load() throws IOException;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback callback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable cause) {
        }
    }

    public Loader(String threadNameSuffix) {
    }

    public static /* synthetic */ LoadTask access$100(Loader loader) {
    }

    public static /* synthetic */ LoadTask access$102(Loader loader, LoadTask loadTask) {
    }

    public static /* synthetic */ IOException access$202(Loader loader, IOException iOException) {
    }

    public static /* synthetic */ ExecutorService access$500(Loader loader) {
    }

    public static LoadErrorAction createRetryAction(boolean resetErrorCount, long retryDelayMillis) {
    }

    public void cancelLoading() {
    }

    public void clearFatalError() {
    }

    public boolean hasFatalError() {
    }

    public boolean isLoading() {
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
    }

    public void release() {
    }

    public <T extends Loadable> long startLoading(T loadable, Callback<T> callback, int defaultMinRetryCount) {
    }

    @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int minRetryCount) throws IOException {
    }

    public void release(@Nullable ReleaseCallback callback) {
    }
}
