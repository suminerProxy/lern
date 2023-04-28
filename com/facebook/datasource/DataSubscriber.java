package com.facebook.datasource;

import javax.annotation.Nonnull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface DataSubscriber<T> {
    void onCancellation(@Nonnull DataSource<T> dataSource);

    void onFailure(@Nonnull DataSource<T> dataSource);

    void onNewResult(@Nonnull DataSource<T> dataSource);

    void onProgressUpdate(@Nonnull DataSource<T> dataSource);
}
