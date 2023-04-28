package i.a.e1.h.d;

import i.a.e1.c.i0;
import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* compiled from: ObservableFlatMapStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t<T, R> extends i0<R> {
    public final i0<T> b;
    public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> c;

    /* compiled from: ObservableFlatMapStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -5127032662980523968L;
        public volatile boolean disposed;
        public boolean done;
        public final p0<? super R> downstream;
        public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper;
        public i.a.e1.d.f upstream;

        public a(p0<? super R> downstream, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(@i.a.e1.b.f Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(@i.a.e1.b.f T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
        }
    }

    public t(i0<T> source, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super R> observer) {
    }
}
