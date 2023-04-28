package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseDataSource implements DataSource {
    @Nullable
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners;

    public BaseDataSource(boolean isNetwork) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
    }

    public final void bytesTransferred(int bytesTransferred) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
    }

    public final void transferEnded() {
    }

    public final void transferInitializing(DataSpec dataSpec) {
    }

    public final void transferStarted(DataSpec dataSpec) {
    }
}
