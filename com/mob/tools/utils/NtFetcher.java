package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NtFetcher implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static NtFetcher f4513a;
    private Context b;
    private BroadcastReceiver c;

    /* renamed from: d  reason: collision with root package name */
    private String f4514d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f4515e;

    /* renamed from: com.mob.tools.utils.NtFetcher$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NtFetcher f4516a;

        public AnonymousClass1(NtFetcher ntFetcher) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i2) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
        }
    }

    /* renamed from: com.mob.tools.utils.NtFetcher$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NtFetcher f4517a;

        public AnonymousClass2(NtFetcher ntFetcher) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    private NtFetcher(Context context) {
    }

    public static /* synthetic */ void a(NtFetcher ntFetcher) {
    }

    @TargetApi(21)
    private ConnectivityManager.NetworkCallback b() {
    }

    private void c() {
    }

    private int d() {
    }

    private void e() {
    }

    private void f() {
    }

    private String g() {
    }

    public static NtFetcher getInstance(Context context) {
    }

    private boolean h() {
    }

    private boolean i() {
    }

    private boolean j() {
    }

    private boolean k() {
    }

    private boolean l() {
    }

    private boolean m() {
    }

    @Deprecated
    public synchronized int getDtNtType() {
    }

    public synchronized String getNtType() {
    }

    public void recycle() {
    }

    @SuppressLint({"MissingPermission"})
    private void a() {
    }
}
