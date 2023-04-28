package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface DataSource<T> {
    boolean close();

    @Nullable
    Map<String, Object> getExtras();

    @Nullable
    Throwable getFailureCause();

    float getProgress();

    @Nullable
    T getResult();

    boolean hasFailed();

    boolean hasMultipleResults();

    boolean hasResult();

    boolean isClosed();

    boolean isFinished();

    void subscribe(DataSubscriber<T> dataSubscriber, Executor executor);
}
