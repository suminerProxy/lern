package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FirstAvailableDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    private final List<Supplier<DataSource<T>>> mDataSourceSuppliers;

    @ThreadSafe
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class FirstAvailableDataSource extends AbstractDataSource<T> {
        @Nullable
        private DataSource<T> mCurrentDataSource;
        @Nullable
        private DataSource<T> mDataSourceWithResult;
        private int mIndex;
        public final /* synthetic */ FirstAvailableDataSourceSupplier this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class InternalDataSubscriber implements DataSubscriber<T> {
            public final /* synthetic */ FirstAvailableDataSource this$1;

            private InternalDataSubscriber(final FirstAvailableDataSource this$1) {
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

            public /* synthetic */ InternalDataSubscriber(FirstAvailableDataSource firstAvailableDataSource, AnonymousClass1 anonymousClass1) {
            }
        }

        public FirstAvailableDataSource(final FirstAvailableDataSourceSupplier this$0) {
        }

        public static /* synthetic */ void access$200(FirstAvailableDataSource firstAvailableDataSource, DataSource dataSource) {
        }

        public static /* synthetic */ void access$300(FirstAvailableDataSource firstAvailableDataSource, DataSource dataSource) {
        }

        private synchronized boolean clearCurrentDataSource(DataSource<T> dataSource) {
        }

        private void closeSafely(@Nullable DataSource<T> dataSource) {
        }

        @Nullable
        private synchronized DataSource<T> getDataSourceWithResult() {
        }

        @Nullable
        private synchronized Supplier<DataSource<T>> getNextSupplier() {
        }

        private void maybeSetDataSourceWithResult(DataSource<T> dataSource, boolean isFinished) {
        }

        private void onDataSourceFailed(DataSource<T> dataSource) {
        }

        private void onDataSourceNewResult(DataSource<T> dataSource) {
        }

        private synchronized boolean setCurrentDataSource(DataSource<T> dataSource) {
        }

        private boolean startNextDataSource() {
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

    private FirstAvailableDataSourceSupplier(List<Supplier<DataSource<T>>> dataSourceSuppliers) {
    }

    public static /* synthetic */ List access$100(FirstAvailableDataSourceSupplier firstAvailableDataSourceSupplier) {
    }

    public static <T> FirstAvailableDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> dataSourceSuppliers) {
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

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
    }
}
