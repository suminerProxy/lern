package androidx.loader.content;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE = 128;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final Executor THREAD_POOL_EXECUTOR = null;
    private static volatile Executor sDefaultExecutor;
    private static InternalHandler sHandler;
    private static final BlockingQueue<Runnable> sPoolWorkQueue = null;
    private static final ThreadFactory sThreadFactory = null;
    public final AtomicBoolean mCancelled;
    private final FutureTask<Result> mFuture;
    private volatile Status mStatus;
    public final AtomicBoolean mTaskInvoked;
    private final WorkerRunnable<Params, Result> mWorker;

    /* renamed from: androidx.loader.content.ModernAsyncTask$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements ThreadFactory {
        private final AtomicInteger mCount;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends WorkerRunnable<Params, Result> {
        public final /* synthetic */ ModernAsyncTask this$0;

        public AnonymousClass2(ModernAsyncTask modernAsyncTask) {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends FutureTask<Result> {
        public final /* synthetic */ ModernAsyncTask this$0;

        public AnonymousClass3(ModernAsyncTask modernAsyncTask, Callable callable) {
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
        }
    }

    /* renamed from: androidx.loader.content.ModernAsyncTask$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AsyncTaskResult<Data> {
        public final Data[] mData;
        public final ModernAsyncTask mTask;

        public AsyncTaskResult(ModernAsyncTask modernAsyncTask, Data... dataArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InternalHandler extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES = null;
        public static final Status FINISHED = null;
        public static final Status PENDING = null;
        public static final Status RUNNING = null;

        private Status(String str, int i2) {
        }

        public static Status valueOf(String str) {
        }

        public static Status[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {
        public Params[] mParams;
    }

    private static Handler getHandler() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setDefaultExecutor(Executor executor) {
    }

    public final boolean cancel(boolean z) {
    }

    public abstract Result doInBackground(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> execute(Params... paramsArr) {
    }

    public final ModernAsyncTask<Params, Progress, Result> executeOnExecutor(Executor executor, Params... paramsArr) {
    }

    public void finish(Result result) {
    }

    public final Result get() throws InterruptedException, ExecutionException {
    }

    public final Status getStatus() {
    }

    public final boolean isCancelled() {
    }

    public void onCancelled() {
    }

    public void onCancelled(Result result) {
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }

    public void onProgressUpdate(Progress... progressArr) {
    }

    public Result postResult(Result result) {
    }

    public void postResultIfNotInvoked(Result result) {
    }

    public final void publishProgress(Progress... progressArr) {
    }

    public static void execute(Runnable runnable) {
    }

    public final Result get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }
}
