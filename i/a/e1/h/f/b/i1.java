package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableFromArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i1<T> extends i.a.e1.c.s<T> {
    public final T[] c;

    /* compiled from: FlowableFromArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final i.a.e1.h.c.c<? super T> downstream;

        public a(i.a.e1.h.c.c<? super T> actual, T[] array) {
        }

        @Override // i.a.e1.h.f.b.i1.c
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.i1.c
        public void slowPath(long r) {
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final Subscriber<? super T> downstream;

        public b(Subscriber<? super T> actual, T[] array) {
        }

        @Override // i.a.e1.h.f.b.i1.c
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.i1.c
        public void slowPath(long r) {
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T> extends i.a.e1.h.j.d<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public final T[] array;
        public volatile boolean cancelled;
        public int index;

        public c(T[] array) {
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

    public i1(T[] array) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
