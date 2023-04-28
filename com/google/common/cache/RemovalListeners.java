package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Executor;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RemovalListeners {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.cache.RemovalListeners$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<K, V> implements RemovalListener<K, V> {
        public final /* synthetic */ Executor val$executor;
        public final /* synthetic */ RemovalListener val$listener;

        /* renamed from: com.google.common.cache.RemovalListeners$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class RunnableC00651 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$0;
            public final /* synthetic */ RemovalNotification val$notification;

            public RunnableC00651(AnonymousClass1 anonymousClass1, RemovalNotification removalNotification) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(Executor executor, RemovalListener removalListener) {
        }

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<K, V> removalNotification) {
        }
    }

    private RemovalListeners() {
    }

    public static <K, V> RemovalListener<K, V> asynchronous(RemovalListener<K, V> removalListener, Executor executor) {
    }
}
