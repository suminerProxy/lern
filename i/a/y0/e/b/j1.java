package i.a.y0.e.b;

import java.util.Iterator;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableFromIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j1<T> extends i.a.l<T> {
    public final Iterable<? extends T> c;

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a<T> extends i.a.y0.i.d<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public Iterator<? extends T> it;
        public boolean once;

        public a(Iterator<? extends T> it) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // i.a.y0.c.o
        public final void clear() {
        }

        public abstract void fastPath();

        @Override // i.a.y0.c.o
        public final boolean isEmpty() {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public final T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public final int requestFusion(int i2) {
        }

        public abstract void slowPath(long j2);
    }

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final i.a.y0.c.a<? super T> downstream;

        public b(i.a.y0.c.a<? super T> aVar, Iterator<? extends T> it) {
        }

        @Override // i.a.y0.e.b.j1.a
        public void fastPath() {
        }

        @Override // i.a.y0.e.b.j1.a
        public void slowPath(long j2) {
        }
    }

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final Subscriber<? super T> downstream;

        public c(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
        }

        @Override // i.a.y0.e.b.j1.a
        public void fastPath() {
        }

        @Override // i.a.y0.e.b.j1.a
        public void slowPath(long j2) {
        }
    }

    public j1(Iterable<? extends T> iterable) {
    }

    public static <T> void I8(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
