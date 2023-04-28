package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DataSources {
    private DataSources() {
    }

    public static <T> Supplier<DataSource<T>> getFailedDataSourceSupplier(final Throwable failure) {
        return new Supplier<DataSource<T>>(failure) { // from class: com.facebook.datasource.DataSources.1
            public final /* synthetic */ Throwable val$failure;

            @Override // com.facebook.common.internal.Supplier
            public /* bridge */ /* synthetic */ Object get() {
            }

            @Override // com.facebook.common.internal.Supplier
            public DataSource<T> get() {
            }
        };
    }

    public static <T> DataSource<T> immediateDataSource(T result) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setResult(result);
        return create;
    }

    public static <T> DataSource<T> immediateFailedDataSource(Throwable failure) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setFailure(failure);
        return create;
    }

    @Nullable
    public static <T> T waitForFinalResult(DataSource<T> dataSource) throws Throwable {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ValueHolder valueHolder = new ValueHolder(null);
        ValueHolder valueHolder2 = new ValueHolder(null);
        dataSource.subscribe(new DataSubscriber<T>(valueHolder, countDownLatch, valueHolder2) { // from class: com.facebook.datasource.DataSources.2
            public final /* synthetic */ CountDownLatch val$latch;
            public final /* synthetic */ ValueHolder val$pendingException;
            public final /* synthetic */ ValueHolder val$resultHolder;

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource2) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource2) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource2) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource2) {
            }
        }, new Executor() { // from class: com.facebook.datasource.DataSources.3
            @Override // java.util.concurrent.Executor
            public void execute(Runnable command) {
            }
        });
        countDownLatch.await();
        T t = valueHolder2.value;
        if (t == null) {
            return valueHolder.value;
        }
        throw ((Throwable) t);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ValueHolder<T> {
        @Nullable
        public T value;

        private ValueHolder() {
        }

        public /* synthetic */ ValueHolder(AnonymousClass1 anonymousClass1) {
        }
    }
}
