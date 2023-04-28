package com.mobile.auth.ap;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.CountDownTimer;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f4672a;
    private ConnectivityManager.NetworkCallback b;
    private ConnectivityManager c;

    /* renamed from: d  reason: collision with root package name */
    private volatile CountDownTimerC0117a f4673d;

    /* renamed from: e  reason: collision with root package name */
    private ExecutorService f4674e;

    /* renamed from: com.mobile.auth.ap.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4675a;
        public final /* synthetic */ String b;
        public final /* synthetic */ b c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f4676d;

        public AnonymousClass1(a aVar, Context context, String str, b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.mobile.auth.ap.a$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f4677a;
        public final /* synthetic */ a b;

        public AnonymousClass2(a aVar, b bVar) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
        }
    }

    /* renamed from: com.mobile.auth.ap.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CountDownTimerC0117a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f4678a;
        private b b;

        public CountDownTimerC0117a(a aVar, b bVar) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface b {
        void a(boolean z, Network network);
    }

    public static /* synthetic */ CountDownTimerC0117a a(a aVar) {
    }

    public static /* synthetic */ CountDownTimerC0117a a(a aVar, CountDownTimerC0117a countDownTimerC0117a) {
    }

    public static a a() {
    }

    @TargetApi(21)
    private void a(Context context, b bVar) {
    }

    private boolean a(Context context, String str) {
    }

    public static /* synthetic */ boolean a(a aVar, Context context, String str) {
    }

    public void a(Context context, String str, b bVar) {
    }

    public void b() {
    }
}
