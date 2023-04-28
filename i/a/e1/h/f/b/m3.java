package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSamplePublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m3<T> extends i.a.e1.c.s<T> {
    public final Publisher<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<?> f27037d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27038e;

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        public a(Subscriber<? super T> actual, Publisher<?> other) {
        }

        @Override // i.a.e1.h.f.b.m3.c
        public void completion() {
        }

        @Override // i.a.e1.h.f.b.m3.c
        public void run() {
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b(Subscriber<? super T> actual, Publisher<?> other) {
        }

        @Override // i.a.e1.h.f.b.m3.c
        public void completion() {
        }

        @Override // i.a.e1.h.f.b.m3.c
        public void run() {
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Subscriber<? super T> downstream;
        public final AtomicReference<Subscription> other;
        public final AtomicLong requested;
        public final Publisher<?> sampler;
        public Subscription upstream;

        public c(Subscriber<? super T> actual, Publisher<?> other) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void complete() {
        }

        public abstract void completion();

        public void emit() {
        }

        public void error(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public abstract void run();

        public void setOther(Subscription o2) {
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> implements i.a.e1.c.x<Object> {
        public final c<T> b;

        public d(c<T> parent) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public m3(Publisher<T> source, Publisher<?> other, boolean emitLast) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
