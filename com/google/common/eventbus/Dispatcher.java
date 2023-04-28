package com.google.common.eventbus;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Dispatcher {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ImmediateDispatcher extends Dispatcher {
        private static final ImmediateDispatcher INSTANCE = null;

        private ImmediateDispatcher() {
        }

        public static /* synthetic */ ImmediateDispatcher access$200() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it) {
        }
    }

    public static Dispatcher immediate() {
    }

    public static Dispatcher legacyAsync() {
    }

    public static Dispatcher perThreadDispatchQueue() {
    }

    public abstract void dispatch(Object obj, Iterator<Subscriber> it);

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LegacyAsyncDispatcher extends Dispatcher {
        private final ConcurrentLinkedQueue<EventWithSubscriber> queue;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class EventWithSubscriber {
            private final Object event;
            private final Subscriber subscriber;

            public /* synthetic */ EventWithSubscriber(Object obj, Subscriber subscriber, AnonymousClass1 anonymousClass1) {
            }

            public static /* synthetic */ Object access$700(EventWithSubscriber eventWithSubscriber) {
            }

            public static /* synthetic */ Subscriber access$800(EventWithSubscriber eventWithSubscriber) {
            }

            private EventWithSubscriber(Object obj, Subscriber subscriber) {
            }
        }

        private LegacyAsyncDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it) {
        }

        public /* synthetic */ LegacyAsyncDispatcher(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PerThreadQueuedDispatcher extends Dispatcher {
        private final ThreadLocal<Boolean> dispatching;
        private final ThreadLocal<Queue<Event>> queue;

        /* renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends ThreadLocal<Queue<Event>> {
            public final /* synthetic */ PerThreadQueuedDispatcher this$0;

            public AnonymousClass1(PerThreadQueuedDispatcher perThreadQueuedDispatcher) {
            }

            @Override // java.lang.ThreadLocal
            public /* bridge */ /* synthetic */ Queue<Event> initialValue() {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: initialValue  reason: avoid collision after fix types in other method */
            public Queue<Event> initialValue2() {
            }
        }

        /* renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends ThreadLocal<Boolean> {
            public final /* synthetic */ PerThreadQueuedDispatcher this$0;

            public AnonymousClass2(PerThreadQueuedDispatcher perThreadQueuedDispatcher) {
            }

            @Override // java.lang.ThreadLocal
            public /* bridge */ /* synthetic */ Boolean initialValue() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public Boolean initialValue() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Event {
            private final Object event;
            private final Iterator<Subscriber> subscribers;

            public /* synthetic */ Event(Object obj, Iterator it, AnonymousClass1 anonymousClass1) {
            }

            public static /* synthetic */ Iterator access$400(Event event) {
            }

            public static /* synthetic */ Object access$500(Event event) {
            }

            private Event(Object obj, Iterator<Subscriber> it) {
            }
        }

        private PerThreadQueuedDispatcher() {
        }

        @Override // com.google.common.eventbus.Dispatcher
        public void dispatch(Object obj, Iterator<Subscriber> it) {
        }

        public /* synthetic */ PerThreadQueuedDispatcher(AnonymousClass1 anonymousClass1) {
        }
    }
}
