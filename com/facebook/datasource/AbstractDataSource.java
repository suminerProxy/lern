package com.facebook.datasource;

import android.util.Pair;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbstractDataSource<T> implements DataSource<T> {
    @Nullable
    private static volatile DataSourceInstrumenter sDataSourceInstrumenter;
    @Nullable
    private Map<String, Object> mExtras;
    @GuardedBy("this")
    @Nullable
    private T mResult = null;
    @GuardedBy("this")
    @Nullable
    private Throwable mFailureThrowable = null;
    @GuardedBy("this")
    private float mProgress = 0.0f;
    @GuardedBy("this")
    private boolean mIsClosed = false;
    @GuardedBy("this")
    private DataSourceStatus mDataSourceStatus = DataSourceStatus.IN_PROGRESS;
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> mSubscribers = new ConcurrentLinkedQueue<>();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface DataSourceInstrumenter {
        Runnable decorateRunnable(Runnable runnable, String tag);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DataSourceStatus {
        private static final /* synthetic */ DataSourceStatus[] $VALUES = null;
        public static final DataSourceStatus FAILURE = null;
        public static final DataSourceStatus IN_PROGRESS = null;
        public static final DataSourceStatus SUCCESS = null;

        private DataSourceStatus(String $enum$name, int $enum$ordinal) {
        }

        public static DataSourceStatus valueOf(String name) {
        }

        public static DataSourceStatus[] values() {
        }
    }

    @Nullable
    public static DataSourceInstrumenter getDataSourceInstrumenter() {
        return sDataSourceInstrumenter;
    }

    private void notifyDataSubscribers() {
        boolean hasFailed = hasFailed();
        boolean wasCancelled = wasCancelled();
        Iterator<Pair<DataSubscriber<T>, Executor>> it = this.mSubscribers.iterator();
        while (it.hasNext()) {
            Pair<DataSubscriber<T>, Executor> next = it.next();
            notifyDataSubscriber((DataSubscriber) next.first, (Executor) next.second, hasFailed, wasCancelled);
        }
    }

    public static void provideInstrumenter(@Nullable DataSourceInstrumenter dataSourceInstrumenter) {
        sDataSourceInstrumenter = dataSourceInstrumenter;
    }

    private synchronized boolean setFailureInternal(@Nullable Throwable throwable, @Nullable Map<String, Object> extras) {
        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
            this.mDataSourceStatus = DataSourceStatus.FAILURE;
            this.mFailureThrowable = throwable;
            this.mExtras = extras;
            return true;
        }
        return false;
    }

    private synchronized boolean setProgressInternal(float progress) {
        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
            if (progress < this.mProgress) {
                return false;
            }
            this.mProgress = progress;
            return true;
        }
        return false;
    }

    private boolean setResultInternal(@Nullable T value, boolean isLast) {
        T t;
        T t2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.mIsClosed && this.mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
                            if (isLast) {
                                this.mDataSourceStatus = DataSourceStatus.SUCCESS;
                                this.mProgress = 1.0f;
                            }
                            T t3 = this.mResult;
                            if (t3 != value) {
                                try {
                                    this.mResult = value;
                                    t = t3;
                                } catch (Throwable th) {
                                    th = th;
                                    t2 = t3;
                                    throw th;
                                }
                            } else {
                                t = null;
                            }
                            return true;
                        }
                        if (value != null) {
                            closeResult(value);
                        }
                        return false;
                    } catch (Throwable th2) {
                        t2 = value;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (t2 != null) {
                closeResult(t2);
            }
        }
    }

    private synchronized boolean wasCancelled() {
        boolean z;
        if (isClosed()) {
            z = isFinished() ? false : true;
        }
        return z;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            if (this.mIsClosed) {
                return false;
            }
            this.mIsClosed = true;
            T t = this.mResult;
            this.mResult = null;
            if (t != null) {
                closeResult(t);
            }
            if (!isFinished()) {
                notifyDataSubscribers();
            }
            synchronized (this) {
                this.mSubscribers.clear();
            }
            return true;
        }
    }

    public void closeResult(@Nullable T result) {
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized Throwable getFailureCause() {
        return this.mFailureThrowable;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized float getProgress() {
        return this.mProgress;
    }

    @Override // com.facebook.datasource.DataSource
    @Nullable
    public synchronized T getResult() {
        return this.mResult;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasFailed() {
        return this.mDataSourceStatus == DataSourceStatus.FAILURE;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean hasMultipleResults() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasResult() {
        return this.mResult != null;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean isFinished() {
        return this.mDataSourceStatus != DataSourceStatus.IN_PROGRESS;
    }

    public void notifyDataSubscriber(final DataSubscriber<T> dataSubscriber, final Executor executor, final boolean isFailure, final boolean isCancellation) {
        Runnable runnable = new Runnable(this, isFailure, dataSubscriber, isCancellation) { // from class: com.facebook.datasource.AbstractDataSource.1
            public final /* synthetic */ AbstractDataSource this$0;
            public final /* synthetic */ DataSubscriber val$dataSubscriber;
            public final /* synthetic */ boolean val$isCancellation;
            public final /* synthetic */ boolean val$isFailure;

            @Override // java.lang.Runnable
            public void run() {
            }
        };
        DataSourceInstrumenter dataSourceInstrumenter = getDataSourceInstrumenter();
        if (dataSourceInstrumenter != null) {
            runnable = dataSourceInstrumenter.decorateRunnable(runnable, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(runnable);
    }

    public void notifyProgressUpdate() {
        Iterator<Pair<DataSubscriber<T>, Executor>> it = this.mSubscribers.iterator();
        while (it.hasNext()) {
            Pair<DataSubscriber<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new Runnable(this, (DataSubscriber) next.first) { // from class: com.facebook.datasource.AbstractDataSource.2
                public final /* synthetic */ AbstractDataSource this$0;
                public final /* synthetic */ DataSubscriber val$subscriber;

                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }
    }

    public void setExtras(@Nullable Map<String, Object> extras) {
        this.mExtras = extras;
    }

    public boolean setFailure(Throwable throwable) {
        return setFailure(throwable, null);
    }

    public boolean setProgress(float progress) {
        boolean progressInternal = setProgressInternal(progress);
        if (progressInternal) {
            notifyProgressUpdate();
        }
        return progressInternal;
    }

    public boolean setResult(@Nullable T value, boolean isLast, @Nullable Map<String, Object> extras) {
        setExtras(extras);
        boolean resultInternal = setResultInternal(value, isLast);
        if (resultInternal) {
            notifyDataSubscribers();
        }
        return resultInternal;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void subscribe(final com.facebook.datasource.DataSubscriber<T> r3, final java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r3)
            com.facebook.common.internal.Preconditions.checkNotNull(r4)
            monitor-enter(r2)
            boolean r0 = r2.mIsClosed     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r2.mDataSourceStatus     // Catch: java.lang.Throwable -> L41
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r0 = r2.mSubscribers     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.hasResult()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.isFinished()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.wasCancelled()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.hasFailed()
            boolean r1 = r2.wasCancelled()
            r2.notifyDataSubscriber(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.subscribe(com.facebook.datasource.DataSubscriber, java.util.concurrent.Executor):void");
    }

    public boolean setFailure(@Nullable Throwable throwable, @Nullable Map<String, Object> extras) {
        boolean failureInternal = setFailureInternal(throwable, extras);
        if (failureInternal) {
            notifyDataSubscribers();
        }
        return failureInternal;
    }

    public boolean setResult(@Nullable T value, boolean isLast) {
        return setResult(value, isLast, null);
    }
}
