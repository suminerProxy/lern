package i.a.e1.h.f.d;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSwitchMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h<T> extends i.a.e1.c.j {
    public final i.a.e1.c.s<T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27346d;

    /* compiled from: FlowableSwitchMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, i.a.e1.d.f {

        /* renamed from: i  reason: collision with root package name */
        public static final C0467a f27347i = null;
        public final i.a.e1.c.m b;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27348d;

        /* renamed from: e  reason: collision with root package name */
        public final i.a.e1.h.k.c f27349e;

        /* renamed from: f  reason: collision with root package name */
        public final AtomicReference<C0467a> f27350f;

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f27351g;

        /* renamed from: h  reason: collision with root package name */
        public Subscription f27352h;

        /* compiled from: FlowableSwitchMapCompletable.java */
        /* renamed from: i.a.e1.h.f.d.h$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0467a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = -8003404460084760287L;
            public final a<?> parent;

            public C0467a(a<?> parent) {
            }

            public void dispose() {
            }

            @Override // i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.m downstream, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
        }

        public void a() {
        }

        public void b(C0467a sender) {
        }

        public void c(C0467a sender, Throwable error) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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
    }

    public h(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
