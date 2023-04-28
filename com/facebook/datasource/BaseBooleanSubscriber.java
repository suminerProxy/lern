package com.facebook.datasource;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseBooleanSubscriber implements DataSubscriber<Boolean> {
    @Override // com.facebook.datasource.DataSubscriber
    public void onCancellation(DataSource<Boolean> dataSource) {
    }

    @Override // com.facebook.datasource.DataSubscriber
    public void onFailure(DataSource<Boolean> dataSource) {
    }

    public abstract void onFailureImpl(DataSource<Boolean> dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onNewResult(DataSource<Boolean> dataSource) {
    }

    public abstract void onNewResultImpl(boolean isFoundInDisk);

    @Override // com.facebook.datasource.DataSubscriber
    public void onProgressUpdate(DataSource<Boolean> dataSource) {
    }
}
