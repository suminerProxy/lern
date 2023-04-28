package com.google.android.exoplayer2.upstream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface TransferListener {
    void onBytesTransferred(DataSource source, DataSpec dataSpec, boolean isNetwork, int bytesTransferred);

    void onTransferEnd(DataSource source, DataSpec dataSpec, boolean isNetwork);

    void onTransferInitializing(DataSource source, DataSpec dataSpec, boolean isNetwork);

    void onTransferStart(DataSource source, DataSpec dataSpec, boolean isNetwork);
}
