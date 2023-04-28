package com.mobile.auth.gatewayauth.utils;

import android.os.Handler;
import com.mobile.auth.gatewayauth.TokenResultListener;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f5084a;
    private static Handler b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class a implements Runnable {
        public abstract void a();

        public abstract void a(Throwable th);

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f5085a;

        /* renamed from: com.mobile.auth.gatewayauth.utils.e$b$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f5086a;

            public AnonymousClass1(b bVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
            }
        }

        /* renamed from: com.mobile.auth.gatewayauth.utils.e$b$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Thread.UncaughtExceptionHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TokenResultListener f5087a;
            public final /* synthetic */ b b;

            /* renamed from: com.mobile.auth.gatewayauth.utils.e$b$2$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 extends a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Throwable f5088a;
                public final /* synthetic */ AnonymousClass2 b;

                public AnonymousClass1(AnonymousClass2 anonymousClass2, Throwable th) {
                }

                @Override // com.mobile.auth.gatewayauth.utils.e.a
                public void a() {
                }

                @Override // com.mobile.auth.gatewayauth.utils.e.a
                public void a(Throwable th) {
                }
            }

            public AnonymousClass2(b bVar, TokenResultListener tokenResultListener) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
            }
        }

        public b() {
        }

        public b(TokenResultListener tokenResultListener) {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static String a(Throwable th) {
    }

    public static Future<?> a(Runnable runnable) {
    }

    public static void a(a aVar) {
    }

    public static void a(b bVar) {
    }

    public static String b(Throwable th) {
    }
}
