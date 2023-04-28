package com.facebook.stetho.inspector.network;

import android.content.Context;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NetworkPeerManager extends ChromePeerManager {
    private static NetworkPeerManager sInstance;
    private AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry;
    private AsyncPrettyPrinterInitializer mPrettyPrinterInitializer;
    private final ResponseBodyFileManager mResponseBodyFileManager;
    private final PeersRegisteredListener mTempFileCleanup;

    /* renamed from: com.facebook.stetho.inspector.network.NetworkPeerManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends PeersRegisteredListener {
        public final /* synthetic */ NetworkPeerManager this$0;

        public AnonymousClass1(NetworkPeerManager networkPeerManager) {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public void onFirstPeerRegistered() {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public void onLastPeerUnregistered() {
        }
    }

    public NetworkPeerManager(ResponseBodyFileManager responseBodyFileManager) {
    }

    public static /* synthetic */ AsyncPrettyPrinterRegistry access$000(NetworkPeerManager networkPeerManager) {
    }

    public static /* synthetic */ AsyncPrettyPrinterRegistry access$002(NetworkPeerManager networkPeerManager, AsyncPrettyPrinterRegistry asyncPrettyPrinterRegistry) {
    }

    public static /* synthetic */ AsyncPrettyPrinterInitializer access$100(NetworkPeerManager networkPeerManager) {
    }

    public static /* synthetic */ ResponseBodyFileManager access$200(NetworkPeerManager networkPeerManager) {
    }

    @Nullable
    public static synchronized NetworkPeerManager getInstanceOrNull() {
    }

    public static synchronized NetworkPeerManager getOrCreateInstance(Context context) {
    }

    @Nullable
    public AsyncPrettyPrinterRegistry getAsyncPrettyPrinterRegistry() {
    }

    public ResponseBodyFileManager getResponseBodyFileManager() {
    }

    public void setPrettyPrinterInitializer(AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
    }
}
