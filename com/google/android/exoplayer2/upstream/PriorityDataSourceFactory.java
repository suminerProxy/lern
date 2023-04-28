package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.PriorityTaskManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PriorityDataSourceFactory implements DataSource.Factory {
    private final int priority;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamFactory;

    public PriorityDataSourceFactory(DataSource.Factory upstreamFactory, PriorityTaskManager priorityTaskManager, int priority) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ DataSource createDataSource() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public PriorityDataSource createDataSource() {
    }
}
