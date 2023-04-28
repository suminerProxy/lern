package androidx.arch.core.executor;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultTaskExecutor extends TaskExecutor {
    private final ExecutorService mDiskIO;
    private final Object mLock;
    @Nullable
    private volatile Handler mMainHandler;

    /* renamed from: androidx.arch.core.executor.DefaultTaskExecutor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ThreadFactory {
        private static final String THREAD_NAME_STEM = "arch_disk_io_%d";
        private final AtomicInteger mThreadId;
        public final /* synthetic */ DefaultTaskExecutor this$0;

        public AnonymousClass1(DefaultTaskExecutor defaultTaskExecutor) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(Runnable runnable) {
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(Runnable runnable) {
    }
}
