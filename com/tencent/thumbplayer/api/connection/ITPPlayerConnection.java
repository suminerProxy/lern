package com.tencent.thumbplayer.api.connection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPPlayerConnection {
    int activeAllConnections();

    int activeConnection(int i2);

    int addConnection(long j2, TPPlayerConnectionNode tPPlayerConnectionNode, long j3, TPPlayerConnectionNode tPPlayerConnectionNode2);

    void deactiveAllConnections();

    void deactiveConnection(int i2);

    void init();

    void removeConnection(int i2);

    void uninit();
}
