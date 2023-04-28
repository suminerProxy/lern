package com.mobile.auth.k;

import android.content.Context;
import android.os.Bundle;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f5139a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f5140a;

        /* renamed from: com.mobile.auth.k.v$a$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Thread.UncaughtExceptionHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f5141a;

            public AnonymousClass1(a aVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
            }
        }

        /* renamed from: com.mobile.auth.k.v$a$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Thread.UncaughtExceptionHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f5142a;
            public final /* synthetic */ Bundle b;
            public final /* synthetic */ a c;

            public AnonymousClass2(a aVar, Context context, Bundle bundle) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
            }
        }

        public a() {
        }

        public a(Context context, Bundle bundle) {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static void a(a aVar) {
    }
}
