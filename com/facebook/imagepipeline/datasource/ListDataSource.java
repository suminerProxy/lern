package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ListDataSource<T> extends AbstractDataSource<List<CloseableReference<T>>> {
    private final DataSource<CloseableReference<T>>[] mDataSources;
    @GuardedBy("this")
    private int mFinishedDataSources;

    public ListDataSource(DataSource<CloseableReference<T>>[] dataSources) {
    }

    public static /* synthetic */ void access$100(ListDataSource listDataSource, DataSource dataSource) {
    }

    public static /* synthetic */ void access$200(ListDataSource listDataSource) {
    }

    public static /* synthetic */ void access$300(ListDataSource listDataSource) {
    }

    public static /* synthetic */ void access$400(ListDataSource listDataSource) {
    }

    public static <T> ListDataSource<T> create(DataSource<CloseableReference<T>>... dataSources) {
    }

    private synchronized boolean increaseAndCheckIfLast() {
    }

    private void onDataSourceCancelled() {
    }

    private void onDataSourceFailed(DataSource<CloseableReference<T>> dataSource) {
    }

    private void onDataSourceFinished() {
    }

    private void onDataSourceProgress() {
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    public boolean close() {
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    @Nullable
    public /* bridge */ /* synthetic */ Object getResult() {
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    public synchronized boolean hasResult() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class InternalDataSubscriber implements DataSubscriber<CloseableReference<T>> {
        @GuardedBy("InternalDataSubscriber.this")
        public boolean mFinished;
        public final /* synthetic */ ListDataSource this$0;

        private InternalDataSubscriber(final ListDataSource this$0) {
        }

        private synchronized boolean tryFinish() {
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onCancellation(DataSource<CloseableReference<T>> dataSource) {
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onFailure(DataSource<CloseableReference<T>> dataSource) {
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onNewResult(DataSource<CloseableReference<T>> dataSource) {
        }

        @Override // com.facebook.datasource.DataSubscriber
        public void onProgressUpdate(DataSource<CloseableReference<T>> dataSource) {
        }

        public /* synthetic */ InternalDataSubscriber(ListDataSource listDataSource, AnonymousClass1 anonymousClass1) {
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    @Nullable
    public synchronized List<CloseableReference<T>> getResult() {
    }
}
