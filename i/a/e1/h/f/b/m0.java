package i.a.e1.h.f.b;

import java.util.Collection;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableDistinct.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m0<T, K> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, K> f27033d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.s<? extends Collection<? super K>> f27034e;

    /* compiled from: FlowableDistinct.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, K> extends i.a.e1.h.i.b<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final Collection<? super K> f27035g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, K> f27036h;

        public a(Subscriber<? super T> actual, i.a.e1.g.o<? super T, K> keySelector, Collection<? super K> collection) {
        }

        @Override // i.a.e1.h.i.b, i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.h.i.b, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.e1.h.i.b, org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T value) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public m0(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, K> keySelector, i.a.e1.g.s<? extends Collection<? super K>> collectionSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> subscriber) {
    }
}
