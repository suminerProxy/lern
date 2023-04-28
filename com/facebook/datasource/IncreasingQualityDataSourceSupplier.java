package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IncreasingQualityDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    private final boolean mDataSourceLazy;
    private final List<Supplier<DataSource<T>>> mDataSourceSuppliers;

    @ThreadSafe
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class IncreasingQualityDataSource extends AbstractDataSource<T> {
        @GuardedBy("IncreasingQualityDataSource.this")
        @Nullable
        private ArrayList<DataSource<T>> mDataSources;
        @Nullable
        private Throwable mDelayedError;
        @Nullable
        private Map<String, Object> mDelayedExtras;
        private AtomicInteger mFinishedDataSources;
        @GuardedBy("IncreasingQualityDataSource.this")
        private int mIndexOfDataSourceWithResult;
        private int mNumberOfDataSources;
        public final /* synthetic */ IncreasingQualityDataSourceSupplier this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class InternalDataSubscriber implements DataSubscriber<T> {
            private int mIndex;
            public final /* synthetic */ IncreasingQualityDataSource this$1;

            public InternalDataSubscriber(final IncreasingQualityDataSource this$1, int index) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
            }
        }

        public IncreasingQualityDataSource(final IncreasingQualityDataSourceSupplier this$0) {
        }

        public static /* synthetic */ void access$200(IncreasingQualityDataSource increasingQualityDataSource, int i2, DataSource dataSource) {
        }

        public static /* synthetic */ void access$300(IncreasingQualityDataSource increasingQualityDataSource, int i2, DataSource dataSource) {
        }

        private void closeSafely(DataSource<T> dataSource) {
        }

        private void ensureDataSourceInitialized() {
        }

        @Nullable
        private synchronized DataSource<T> getAndClearDataSource(int i2) {
        }

        @Nullable
        private synchronized DataSource<T> getDataSource(int i2) {
        }

        @Nullable
        private synchronized DataSource<T> getDataSourceWithResult() {
        }

        private void maybeSetFailure() {
        }

        private void maybeSetIndexOfDataSourceWithResult(int index, DataSource<T> dataSource, boolean isFinished) {
        }

        private void onDataSourceFailed(int index, DataSource<T> dataSource) {
        }

        private void onDataSourceNewResult(int index, DataSource<T> dataSource) {
        }

        @Nullable
        private synchronized DataSource<T> tryGetAndClearDataSource(int i2, DataSource<T> dataSource) {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public boolean close() {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        @Nullable
        public synchronized T getResult() {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public synchronized boolean hasResult() {
        }
    }

    private IncreasingQualityDataSourceSupplier(List<Supplier<DataSource<T>>> dataSourceSuppliers, boolean dataSourceLazy) {
    }

    public static /* synthetic */ boolean access$000(IncreasingQualityDataSourceSupplier increasingQualityDataSourceSupplier) {
    }

    public static /* synthetic */ List access$100(IncreasingQualityDataSourceSupplier increasingQualityDataSourceSupplier) {
    }

    public static <T> IncreasingQualityDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> dataSourceSuppliers) {
    }

    public boolean equals(@Nullable Object other) {
    }

    @Override // com.facebook.common.internal.Supplier
    public /* bridge */ /* synthetic */ Object get() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public static <T> IncreasingQualityDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> dataSourceSuppliers, boolean dataSourceLazy) {
    }

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
    }
}
