package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ObservableWithLatestFromMany.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p4<T, R> extends i.a.e1.h.f.e.a<T, R> {
    @i.a.e1.b.g
    public final i.a.e1.c.n0<?>[] c;
    @i.a.e1.b.g

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends i.a.e1.c.n0<?>> f27569d;
    @i.a.e1.b.f

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super Object[], R> f27570e;

    /* compiled from: ObservableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a implements i.a.e1.g.o<T, R> {
        public final /* synthetic */ p4 b;

        public a(final p4 this$0) {
        }

        @Override // i.a.e1.g.o
        public R apply(T t) throws Throwable {
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 1577321883966341961L;
        public final i.a.e1.g.o<? super Object[], R> combiner;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super R> downstream;
        public final i.a.e1.h.k.c error;
        public final c[] observers;
        public final AtomicReference<i.a.e1.d.f> upstream;
        public final AtomicReferenceArray<Object> values;

        public b(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super Object[], R> combiner, int n2) {
        }

        public void cancelAllBut(int index) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void innerComplete(int index, boolean nonEmpty) {
        }

        public void innerError(int index, Throwable t) {
        }

        public void innerNext(int index, Object o2) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void subscribe(i.a.e1.c.n0<?>[] others, int n2) {
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        public boolean hasValue;
        public final int index;
        public final b<?, ?> parent;

        public c(b<?, ?> parent, int index) {
        }

        public void dispose() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public p4(@i.a.e1.b.f i.a.e1.c.n0<T> source, @i.a.e1.b.f i.a.e1.c.n0<?>[] otherArray, @i.a.e1.b.f i.a.e1.g.o<? super Object[], R> combiner) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }

    public p4(@i.a.e1.b.f i.a.e1.c.n0<T> source, @i.a.e1.b.f Iterable<? extends i.a.e1.c.n0<?>> otherIterable, @i.a.e1.b.f i.a.e1.g.o<? super Object[], R> combiner) {
    }
}
