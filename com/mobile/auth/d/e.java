package com.mobile.auth.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4736a = "e";
    private boolean b;
    private ConnectivityManager c;

    /* renamed from: d  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f4737d;

    /* renamed from: e  reason: collision with root package name */
    private a f4738e;

    /* renamed from: f  reason: collision with root package name */
    private long f4739f;

    /* renamed from: g  reason: collision with root package name */
    private long f4740g;

    /* renamed from: com.mobile.auth.d.e$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4741a;
        public final /* synthetic */ e b;

        public AnonymousClass1(e eVar, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.d.e$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f4742a;

        public AnonymousClass2(e eVar) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface a {
        void a();

        void a(int i2, String str, long j2);

        void a(Network network, long j2);
    }

    public static int a(String str) {
    }

    public static /* synthetic */ long a(e eVar, long j2) {
    }

    public static /* synthetic */ ConnectivityManager a(e eVar, ConnectivityManager connectivityManager) {
    }

    @TargetApi(21)
    private void a(Context context) {
    }

    public static /* synthetic */ boolean a(e eVar) {
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
    }

    public static /* synthetic */ a b(e eVar) {
    }

    public static /* synthetic */ String b() {
    }

    public static String b(String str) {
    }

    private boolean b(Context context, String str) {
    }

    public static /* synthetic */ long c(e eVar) {
    }

    public static /* synthetic */ long d(e eVar) {
    }

    public static /* synthetic */ ConnectivityManager e(e eVar) {
    }

    public void a() {
    }

    public void a(int i2) {
    }

    public void a(Context context, a aVar) {
    }

    public boolean a(Context context, String str) {
    }
}
