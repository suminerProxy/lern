package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ArchTaskExecutor extends TaskExecutor {
    @NonNull
    private static final Executor sIOThreadExecutor = null;
    private static volatile ArchTaskExecutor sInstance;
    @NonNull
    private static final Executor sMainThreadExecutor = null;
    @NonNull
    private TaskExecutor mDefaultTaskExecutor;
    @NonNull
    private TaskExecutor mDelegate;

    /* renamed from: androidx.arch.core.executor.ArchTaskExecutor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    /* renamed from: androidx.arch.core.executor.ArchTaskExecutor$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }
    }

    private ArchTaskExecutor() {
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
    }

    @NonNull
    public static ArchTaskExecutor getInstance() {
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
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

    public void setDelegate(@Nullable TaskExecutor taskExecutor) {
    }
}
