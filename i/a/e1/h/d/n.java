package i.a.e1.h.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import i.a.e1.c.u0;
import java.util.Iterator;
import java.util.stream.Stream;

/* compiled from: MaybeFlattenStreamAsObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n<T, R> extends i0<R> {
    public final i.a.e1.c.z<T> b;
    public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> c;

    /* compiled from: MaybeFlattenStreamAsObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.e1.h.e.b<R> implements i.a.e1.c.c0<T>, u0<T> {
        private static final long serialVersionUID = 7363336003027148283L;
        public AutoCloseable close;
        public volatile boolean disposed;
        public final p0<? super R> downstream;
        public volatile Iterator<? extends R> iterator;
        public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper;
        public boolean once;
        public boolean outputFused;
        public i.a.e1.d.f upstream;

        public a(p0<? super R> downstream, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void close(AutoCloseable c) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(@i.a.e1.b.f Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(@i.a.e1.b.f T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public R poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public n(i.a.e1.c.z<T> source, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.i0
    public void c6(@i.a.e1.b.f p0<? super R> s) {
    }
}
