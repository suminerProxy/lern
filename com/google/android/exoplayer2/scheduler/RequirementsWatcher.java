package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RequirementsWatcher {
    private final Context context;
    private final Handler handler;
    private final Listener listener;
    @Nullable
    private NetworkCallback networkCallback;
    private int notMetRequirements;
    @Nullable
    private DeviceStatusChangeReceiver receiver;
    private final Requirements requirements;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        public final /* synthetic */ RequirementsWatcher this$0;

        private DeviceStatusChangeReceiver(final RequirementsWatcher this$0) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ DeviceStatusChangeReceiver(RequirementsWatcher requirementsWatcher, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int notMetRequirements);
    }

    @RequiresApi(24)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;
        public final /* synthetic */ RequirementsWatcher this$0;

        private NetworkCallback(final RequirementsWatcher this$0) {
        }

        private /* synthetic */ void a() {
        }

        private /* synthetic */ void c() {
        }

        private void postCheckRequirements() {
        }

        private void postRecheckNotMetNetworkRequirements() {
        }

        public /* synthetic */ void b() {
        }

        public /* synthetic */ void d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean blocked) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
        }

        public /* synthetic */ NetworkCallback(RequirementsWatcher requirementsWatcher, AnonymousClass1 anonymousClass1) {
        }
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
    }

    public static /* synthetic */ void access$200(RequirementsWatcher requirementsWatcher) {
    }

    public static /* synthetic */ Handler access$300(RequirementsWatcher requirementsWatcher) {
    }

    public static /* synthetic */ NetworkCallback access$400(RequirementsWatcher requirementsWatcher) {
    }

    public static /* synthetic */ void access$500(RequirementsWatcher requirementsWatcher) {
    }

    private void checkRequirements() {
    }

    private void recheckNotMetNetworkRequirements() {
    }

    @RequiresApi(24)
    private void registerNetworkCallbackV24() {
    }

    @RequiresApi(24)
    private void unregisterNetworkCallbackV24() {
    }

    public Requirements getRequirements() {
    }

    public int start() {
    }

    public void stop() {
    }
}
