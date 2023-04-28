package com.mob.tools;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.proguard.EverythingKeeper;
import java.util.Iterator;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RxMob implements EverythingKeeper {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.mob.tools.RxMob$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<T> extends QuickSubscribe<T> {
        public final /* synthetic */ Object[] val$datas;

        public AnonymousClass1(Object[] objArr) {
        }

        @Override // com.mob.tools.RxMob.QuickSubscribe
        public void doNext(Subscriber<T> subscriber) throws Throwable {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.mob.tools.RxMob$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<T> extends QuickSubscribe<T> {
        public final /* synthetic */ Iterator val$datas;

        public AnonymousClass2(Iterator it) {
        }

        @Override // com.mob.tools.RxMob.QuickSubscribe
        public void doNext(Subscriber<T> subscriber) throws Throwable {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnSubscribe<T> extends EverythingKeeper {
        void call(Subscriber<T> subscriber);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class QuickSubscribe<T> implements OnSubscribe<T> {
        @Override // com.mob.tools.RxMob.OnSubscribe
        public final void call(Subscriber<T> subscriber) {
        }

        public abstract void doNext(Subscriber<T> subscriber) throws Throwable;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Subscribable<T> implements EverythingKeeper {
        private Thread observeThread;
        private OnSubscribe<T> onSubscribe;
        private Thread subscribeThread;

        /* renamed from: com.mob.tools.RxMob$Subscribable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Subscriber f3957a;
            public final /* synthetic */ Subscribable b;

            public AnonymousClass1(Subscribable subscribable, Subscriber subscriber) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.tools.RxMob$Subscribable$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends java.lang.Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Subscriber f3958a;
            public final /* synthetic */ Subscribable b;

            public AnonymousClass2(Subscribable subscribable, Subscriber subscriber) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public /* synthetic */ Subscribable(AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ OnSubscribe access$100(Subscribable subscribable) {
        }

        public static /* synthetic */ OnSubscribe access$102(Subscribable subscribable, OnSubscribe onSubscribe) {
        }

        public static /* synthetic */ Thread access$300(Subscribable subscribable) {
        }

        public Subscribable<T> observeOn(Thread thread) {
        }

        public void subscribe(Subscriber<T> subscriber) {
        }

        public Subscribable<T> subscribeOn(Thread thread) {
        }

        public void subscribeOnNewThreadAndObserveOnUIThread(Subscriber<T> subscriber) {
        }

        private Subscribable() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Subscriber<T> implements EverythingKeeper {
        private SubscriberWarpper<T> warpper;

        public static /* synthetic */ void access$200(Subscriber subscriber, SubscriberWarpper subscriberWarpper) {
        }

        private void setWarpper(SubscriberWarpper<T> subscriberWarpper) {
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }

        public void onStart() {
        }

        public final void unsubscribe() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SubscriberWarpper<T> extends Subscriber<T> {
        private Subscribable<T> subscribable;
        private Subscriber<T> subscriber;

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SubscriberWarpper f3959a;

            public AnonymousClass1(SubscriberWarpper subscriberWarpper) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends java.lang.Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SubscriberWarpper f3960a;

            public AnonymousClass2(SubscriberWarpper subscriberWarpper) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f3961a;
            public final /* synthetic */ SubscriberWarpper b;

            public AnonymousClass3(SubscriberWarpper subscriberWarpper, Object obj) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass4 extends java.lang.Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f3962a;
            public final /* synthetic */ SubscriberWarpper b;

            public AnonymousClass4(SubscriberWarpper subscriberWarpper, Object obj) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass5 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SubscriberWarpper f3963a;

            public AnonymousClass5(SubscriberWarpper subscriberWarpper) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass6 extends java.lang.Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SubscriberWarpper f3964a;

            public AnonymousClass6(SubscriberWarpper subscriberWarpper) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$7  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass7 implements Handler.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Throwable f3965a;
            public final /* synthetic */ SubscriberWarpper b;

            public AnonymousClass7(SubscriberWarpper subscriberWarpper, Throwable th) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
            }
        }

        /* renamed from: com.mob.tools.RxMob$SubscriberWarpper$8  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass8 extends java.lang.Thread {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Throwable f3966a;
            public final /* synthetic */ SubscriberWarpper b;

            public AnonymousClass8(SubscriberWarpper subscriberWarpper, Throwable th) {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
            }
        }

        public SubscriberWarpper(Subscribable<T> subscribable, Subscriber<T> subscriber) {
        }

        public static /* synthetic */ Subscriber access$400(SubscriberWarpper subscriberWarpper) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onCompleted() {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onError(Throwable th) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onNext(T t) {
        }

        @Override // com.mob.tools.RxMob.Subscriber
        public void onStart() {
        }

        public void removeSubscriber() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Thread implements EverythingKeeper {
        private static final /* synthetic */ Thread[] $VALUES = null;
        public static final Thread IMMEDIATE = null;
        public static final Thread NEW_THREAD = null;
        public static final Thread UI_THREAD = null;

        private Thread(String str, int i2) {
        }

        public static Thread valueOf(String str) {
        }

        public static Thread[] values() {
        }
    }

    public static <T> Subscribable<T> create(OnSubscribe<T> onSubscribe) {
    }

    public static <T> Subscribable<T> from(Iterator<T> it) {
    }

    public static <T> Subscribable<T> just(T... tArr) {
    }
}
