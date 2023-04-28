package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile AsyncTaskLoader<D>.LoadTask mTask;
    public long mUpdateThrottle;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {
        private final CountDownLatch mDone;
        public final /* synthetic */ AsyncTaskLoader this$0;
        public boolean waiting;

        public LoadTask(AsyncTaskLoader asyncTaskLoader) {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void onCancelled(D d2) {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void onPostExecute(D d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void waitForLoader() {
        }

        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public D doInBackground2(Void... voidArr) {
        }
    }

    public AsyncTaskLoader(@NonNull Context context) {
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AsyncTaskLoader<D>.LoadTask loadTask, D d2) {
    }

    public void dispatchOnLoadComplete(AsyncTaskLoader<D>.LoadTask loadTask, D d2) {
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void executePendingTask() {
    }

    public boolean isLoadInBackgroundCanceled() {
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
    }

    public void onCanceled(@Nullable D d2) {
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
    }

    @Nullable
    public D onLoadInBackground() {
    }

    public void setUpdateThrottle(long j2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
    }

    private AsyncTaskLoader(@NonNull Context context, @NonNull Executor executor) {
    }
}
