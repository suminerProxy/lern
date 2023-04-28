package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class NetworkTypeObserver {
    @Nullable
    private static NetworkTypeObserver staticInstance;
    private final CopyOnWriteArrayList<WeakReference<Listener>> listeners;
    private final Handler mainHandler;
    @GuardedBy("networkTypeLock")
    private int networkType;
    private final Object networkTypeLock;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Config {
        private static volatile boolean disable5GNsaDisambiguation;

        private Config() {
        }

        public static /* synthetic */ boolean access$200() {
        }

        public static void disable5GNsaDisambiguation() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onNetworkTypeChanged(int networkType);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Receiver extends BroadcastReceiver {
        public final /* synthetic */ NetworkTypeObserver this$0;

        private Receiver(final NetworkTypeObserver this$0) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ Receiver(NetworkTypeObserver networkTypeObserver, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class TelephonyManagerListener extends PhoneStateListener {
        public final /* synthetic */ NetworkTypeObserver this$0;

        private TelephonyManagerListener(final NetworkTypeObserver this$0) {
        }

        @Override // android.telephony.PhoneStateListener
        @RequiresApi(31)
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(@Nullable ServiceState serviceState) {
        }

        public /* synthetic */ TelephonyManagerListener(NetworkTypeObserver networkTypeObserver, AnonymousClass1 anonymousClass1) {
        }
    }

    private NetworkTypeObserver(Context context) {
    }

    private /* synthetic */ void a(Listener listener) {
    }

    public static /* synthetic */ int access$100(Context context) {
    }

    public static /* synthetic */ void access$400(NetworkTypeObserver networkTypeObserver, int i2) {
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
    }

    private static int getNetworkTypeFromConnectivityManager(Context context) {
    }

    private void removeClearedReferences() {
    }

    @VisibleForTesting
    public static synchronized void resetForTests() {
    }

    private void updateNetworkType(int networkType) {
    }

    public /* synthetic */ void b(Listener listener) {
    }

    public int getNetworkType() {
    }

    public void register(Listener listener) {
    }
}
