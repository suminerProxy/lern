package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Subscriber {
    @Weak
    private EventBus bus;
    private final Executor executor;
    private final Method method;
    @VisibleForTesting
    public final Object target;

    /* renamed from: com.google.common.eventbus.Subscriber$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Subscriber this$0;
        public final /* synthetic */ Object val$event;

        public AnonymousClass1(Subscriber subscriber, Object obj) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SynchronizedSubscriber extends Subscriber {
        public /* synthetic */ SynchronizedSubscriber(EventBus eventBus, Object obj, Method method, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.eventbus.Subscriber
        public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj, Method method) {
        }
    }

    public /* synthetic */ Subscriber(EventBus eventBus, Object obj, Method method, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ SubscriberExceptionContext access$100(Subscriber subscriber, Object obj) {
    }

    public static /* synthetic */ EventBus access$200(Subscriber subscriber) {
    }

    private SubscriberExceptionContext context(Object obj) {
    }

    public static Subscriber create(EventBus eventBus, Object obj, Method method) {
    }

    private static boolean isDeclaredThreadSafe(Method method) {
    }

    public final void dispatchEvent(Object obj) {
    }

    public final boolean equals(@NullableDecl Object obj) {
    }

    public final int hashCode() {
    }

    @VisibleForTesting
    public void invokeSubscriberMethod(Object obj) throws InvocationTargetException {
    }

    private Subscriber(EventBus eventBus, Object obj, Method method) {
    }
}
