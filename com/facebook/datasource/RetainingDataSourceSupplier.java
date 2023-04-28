package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RetainingDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    @Nullable
    private Supplier<DataSource<T>> mCurrentDataSourceSupplier;
    private final Set<RetainingDataSource> mDataSources;

    @Override // com.facebook.common.internal.Supplier
    public /* bridge */ /* synthetic */ Object get() {
    }

    public void replaceSupplier(Supplier<DataSource<T>> supplier) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RetainingDataSource<T> extends AbstractDataSource<T> {
        @GuardedBy("RetainingDataSource.this")
        @Nullable
        private DataSource<T> mDataSource;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class InternalDataSubscriber implements DataSubscriber<T> {
            public final /* synthetic */ RetainingDataSource this$0;

            private InternalDataSubscriber(final RetainingDataSource this$0) {
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

            public /* synthetic */ InternalDataSubscriber(RetainingDataSource retainingDataSource, AnonymousClass1 anonymousClass1) {
            }
        }

        private RetainingDataSource() {
        }

        public static /* synthetic */ void access$200(RetainingDataSource retainingDataSource, DataSource dataSource) {
        }

        public static /* synthetic */ void access$300(RetainingDataSource retainingDataSource) {
        }

        public static /* synthetic */ void access$400(RetainingDataSource retainingDataSource, DataSource dataSource) {
        }

        private static <T> void closeSafely(DataSource<T> dataSource) {
        }

        private void onDataSourceFailed() {
        }

        private void onDataSourceNewResult(DataSource<T> dataSource) {
        }

        private void onDatasourceProgress(DataSource<T> dataSource) {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public boolean close() {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        @Nullable
        public synchronized T getResult() {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public boolean hasMultipleResults() {
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public synchronized boolean hasResult() {
        }

        public void setSupplier(@Nullable Supplier<DataSource<T>> supplier) {
        }

        public /* synthetic */ RetainingDataSource(AnonymousClass1 anonymousClass1) {
        }
    }

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
    }
}
