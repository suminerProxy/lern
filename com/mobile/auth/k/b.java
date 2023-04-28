package com.mobile.auth.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ConnectivityManager f5115a;
    private static b b;
    private Network c;

    /* renamed from: d  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f5116d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5117e;

    /* renamed from: com.mobile.auth.k.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f5118a;
        public final /* synthetic */ b b;

        public AnonymousClass1(b bVar, a aVar) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface a {
        void a(Network network);
    }

    private b(Context context) {
    }

    public static int a(String str) {
    }

    public static /* synthetic */ Network a(b bVar, Network network) {
    }

    public static b a(Context context) {
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
    }

    public static String b(String str) {
    }

    public void a() {
    }

    public void a(a aVar) {
    }
}
