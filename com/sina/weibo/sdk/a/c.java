package com.sina.weibo.sdk.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class c<Params, Progress, Result> {
    public volatile int L;
    public final d<Params, Result> M;
    public final FutureTask<Result> N;
    public int O;
    public Params[] P;
    public Handler x;

    /* renamed from: com.sina.weibo.sdk.a.c$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends Handler {
        public final /* synthetic */ c Q;

        public AnonymousClass1(c cVar, Looper looper) {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
        }
    }

    /* renamed from: com.sina.weibo.sdk.a.c$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends d<Params, Result> {
        public final /* synthetic */ c Q;

        public AnonymousClass2(c cVar) {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
        }
    }

    /* renamed from: com.sina.weibo.sdk.a.c$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends c<Params, Progress, Result>.AbstractC0139c {
        public final /* synthetic */ c Q;

        public AnonymousClass3(c cVar, d dVar) {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
        }
    }

    /* renamed from: com.sina.weibo.sdk.a.c$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] R = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a<Data> {
        public final c S;
        public final Data[] T;

        public a(c cVar, Data... dataArr) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b {
        public static final int U = 1;
        public static final int V = 2;
        public static final int W = 3;
        private static final /* synthetic */ int[] X = null;

        public static int[] m() {
        }
    }

    /* renamed from: com.sina.weibo.sdk.a.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public abstract class AbstractC0139c extends FutureTask<Result> implements Comparable<Object> {
        public final /* synthetic */ c Q;
        public int priority;

        public AbstractC0139c(c cVar, d dVar) {
        }
    }

    public static /* synthetic */ void a(c cVar, Object obj) {
    }

    public abstract Result l();

    public void onPostExecute(Result result) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class d<Params, Result> implements Callable<Result> {
        public Params[] Y;
        public int priority;

        private d() {
        }

        public /* synthetic */ d(byte b) {
        }
    }
}
