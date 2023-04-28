package i.a.e1.h.f.b;

import java.util.Iterator;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableFromIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m1<T> extends i.a.e1.c.s<T> {
    public final Iterable<? extends T> c;

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> extends i.a.e1.h.j.d<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public Iterator<? extends T> iterator;
        public boolean once;

        public a(Iterator<? extends T> it) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public final void clear() {
        }

        public abstract void fastPath();

        @Override // i.a.e1.h.c.q
        public final boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public final T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public final int requestFusion(int mode) {
        }

        public abstract void slowPath(long r);
    }

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final i.a.e1.h.c.c<? super T> downstream;

        public b(i.a.e1.h.c.c<? super T> actual, Iterator<? extends T> it) {
        }

        @Override // i.a.e1.h.f.b.m1.a
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.m1.a
        public void slowPath(long r) {
        }
    }

    /* compiled from: FlowableFromIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final Subscriber<? super T> downstream;

        public c(Subscriber<? super T> actual, Iterator<? extends T> it) {
        }

        @Override // i.a.e1.h.f.b.m1.a
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.m1.a
        public void slowPath(long r) {
        }
    }

    public m1(Iterable<? extends T> source) {
    }

    public static <T> void e9(Subscriber<? super T> s, Iterator<? extends T> it) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
