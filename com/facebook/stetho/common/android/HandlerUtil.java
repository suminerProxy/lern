package com.facebook.stetho.common.android;

import android.os.Handler;
import com.facebook.stetho.common.UncheckedCallable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HandlerUtil {

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* renamed from: com.facebook.stetho.common.android.HandlerUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<V> extends WaitableRunnable<V> {
        public final /* synthetic */ UncheckedCallable val$c;

        public AnonymousClass1(UncheckedCallable uncheckedCallable) {
        }

        @Override // com.facebook.stetho.common.android.HandlerUtil.WaitableRunnable
        public V onRun() {
        }
    }

    /* renamed from: com.facebook.stetho.common.android.HandlerUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends WaitableRunnable<Void> {
        public final /* synthetic */ Runnable val$r;

        public AnonymousClass2(Runnable runnable) {
        }

        @Override // com.facebook.stetho.common.android.HandlerUtil.WaitableRunnable
        public /* bridge */ /* synthetic */ Void onRun() {
        }

        @Override // com.facebook.stetho.common.android.HandlerUtil.WaitableRunnable
        /* renamed from: onRun  reason: avoid collision after fix types in other method */
        public Void onRun2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class WaitableRunnable<V> implements Runnable {
        private Exception mException;
        private boolean mIsDone;
        private V mValue;

        private void join() {
        }

        public V invoke(Handler handler) {
        }

        public abstract V onRun();

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    private HandlerUtil() {
    }

    public static boolean checkThreadAccess(Handler handler) {
    }

    public static <V> V postAndWait(Handler handler, UncheckedCallable<V> uncheckedCallable) {
    }

    public static void verifyThreadAccess(Handler handler) {
    }

    public static void postAndWait(Handler handler, Runnable runnable) {
    }
}
