package i.a.e1.h.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* compiled from: ObservableCollectWithCollector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q<T, A, R> extends i0<R> {
    public final i0<T> b;
    public final Collector<T, A, R> c;

    /* compiled from: ObservableCollectWithCollector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, A, R> extends i.a.e1.h.e.m<R> implements p0<T> {
        private static final long serialVersionUID = -229544830565448758L;
        public final BiConsumer<A, T> accumulator;
        public A container;
        public boolean done;
        public final Function<A, R> finisher;
        public i.a.e1.d.f upstream;

        public a(p0<? super R> downstream, A container, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
        }

        @Override // i.a.e1.h.e.m, i.a.e1.d.f
        public void dispose() {
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
        public void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
        }
    }

    public q(i0<T> source, Collector<T, A, R> collector) {
    }

    @Override // i.a.e1.c.i0
    public void c6(@i.a.e1.b.f p0<? super R> observer) {
    }
}
