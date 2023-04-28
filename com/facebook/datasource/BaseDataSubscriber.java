package com.facebook.datasource;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nonnull;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseDataSubscriber<T> implements DataSubscriber<T> {
    @Override // com.facebook.datasource.DataSubscriber
    public void onCancellation(@Nonnull DataSource<T> dataSource) {
    }

    @Override // com.facebook.datasource.DataSubscriber
    public void onFailure(@Nonnull DataSource<T> dataSource) {
    }

    public abstract void onFailureImpl(@Nonnull DataSource<T> dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onNewResult(@Nonnull DataSource<T> dataSource) {
    }

    public abstract void onNewResultImpl(@Nonnull DataSource<T> dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onProgressUpdate(@Nonnull DataSource<T> dataSource) {
    }
}
