package com.tencent.thumbplayer.core.connection;

import com.tencent.thumbplayer.core.player.TPNativePlayer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPNativePlayerConnectionMgr {
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;

    private native int _activeAllConnections();

    private native int _activeConnection(int i2);

    private native int _addConnection(Object obj, Object obj2, Object obj3, Object obj4);

    private native int _addConnectionWithAddr(long j2, Object obj, long j3, Object obj2);

    private native void _deactiveAllConnections();

    private native void _deactiveConnection(int i2);

    private native void _init();

    private native void _removeConnection(int i2);

    private native void _unInit();

    public int activeAllConnections() {
    }

    public int activeConnection(int i2) {
    }

    public int addConnection(long j2, TPNativePlayerConnectionNode tPNativePlayerConnectionNode, long j3, TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
    }

    public int addConnection(TPNativePlayer tPNativePlayer, TPNativePlayerConnectionNode tPNativePlayerConnectionNode, TPNativePlayer tPNativePlayer2, TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
    }

    public void deactiveAllConnections() {
    }

    public void deactiveConnection(int i2) {
    }

    public void init() {
    }

    public void removeConnection(int i2) {
    }

    public void unInit() {
    }
}
