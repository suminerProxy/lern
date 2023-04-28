package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ChromePeerManager {
    private static final String TAG = "ChromePeerManager";
    @GuardedBy("this")
    private PeerRegistrationListener mListener;
    @GuardedBy("this")
    private final Map<JsonRpcPeer, DisconnectReceiver> mReceivingPeers;
    @GuardedBy("this")
    private JsonRpcPeer[] mReceivingPeersSnapshot;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class UnregisterOnDisconnect implements DisconnectReceiver {
        private final JsonRpcPeer mPeer;
        public final /* synthetic */ ChromePeerManager this$0;

        public UnregisterOnDisconnect(ChromePeerManager chromePeerManager, JsonRpcPeer jsonRpcPeer) {
        }

        @Override // com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver
        public void onDisconnect() {
        }
    }

    private synchronized JsonRpcPeer[] getReceivingPeersSnapshot() {
    }

    private void sendMessageToPeers(String str, Object obj, @Nullable PendingRequestCallback pendingRequestCallback) {
    }

    public synchronized boolean addPeer(JsonRpcPeer jsonRpcPeer) {
    }

    public synchronized boolean hasRegisteredPeers() {
    }

    public void invokeMethodOnPeers(String str, Object obj, PendingRequestCallback pendingRequestCallback) {
    }

    public synchronized void removePeer(JsonRpcPeer jsonRpcPeer) {
    }

    public void sendNotificationToPeers(String str, Object obj) {
    }

    public synchronized void setListener(PeerRegistrationListener peerRegistrationListener) {
    }
}
