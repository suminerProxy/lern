package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.SimpleSession;
import java.nio.channels.NotYetConnectedException;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class JsonRpcPeer {
    private final DisconnectObservable mDisconnectObservable;
    @GuardedBy("this")
    private long mNextRequestId;
    private final ObjectMapper mObjectMapper;
    private final SimpleSession mPeer;
    @GuardedBy("this")
    private final Map<Long, PendingRequest> mPendingRequests;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DisconnectObservable extends Observable<DisconnectReceiver> {
        private DisconnectObservable() {
        }

        public void onDisconnect() {
        }

        public /* synthetic */ DisconnectObservable(AnonymousClass1 anonymousClass1) {
        }
    }

    public JsonRpcPeer(ObjectMapper objectMapper, SimpleSession simpleSession) {
    }

    private synchronized long preparePendingRequest(PendingRequestCallback pendingRequestCallback) {
    }

    public synchronized PendingRequest getAndRemovePendingRequest(long j2) {
    }

    public SimpleSession getWebSocket() {
    }

    public void invokeDisconnectReceivers() {
    }

    public void invokeMethod(String str, Object obj, @Nullable PendingRequestCallback pendingRequestCallback) throws NotYetConnectedException {
    }

    public void registerDisconnectReceiver(DisconnectReceiver disconnectReceiver) {
    }

    public void unregisterDisconnectReceiver(DisconnectReceiver disconnectReceiver) {
    }
}
