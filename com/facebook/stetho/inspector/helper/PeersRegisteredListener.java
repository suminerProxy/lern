package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class PeersRegisteredListener implements PeerRegistrationListener {
    private AtomicInteger mPeers;

    public abstract void onFirstPeerRegistered();

    public abstract void onLastPeerUnregistered();

    public void onPeerAdded(JsonRpcPeer jsonRpcPeer) {
    }

    @Override // com.facebook.stetho.inspector.helper.PeerRegistrationListener
    public final void onPeerRegistered(JsonRpcPeer jsonRpcPeer) {
    }

    public void onPeerRemoved(JsonRpcPeer jsonRpcPeer) {
    }

    @Override // com.facebook.stetho.inspector.helper.PeerRegistrationListener
    public final void onPeerUnregistered(JsonRpcPeer jsonRpcPeer) {
    }
}
