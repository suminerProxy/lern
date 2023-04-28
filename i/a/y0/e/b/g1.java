package i.a.y0.e.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableFromArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g1<T> extends i.a.l<T> {
    public final T[] c;

    /* compiled from: FlowableFromArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final i.a.y0.c.a<? super T> downstream;

        public a(i.a.y0.c.a<? super T> aVar, T[] tArr) {
        }

        @Override // i.a.y0.e.b.g1.c
        public void fastPath() {
        }

        @Override // i.a.y0.e.b.g1.c
        public void slowPath(long j2) {
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final Subscriber<? super T> downstream;

        public b(Subscriber<? super T> subscriber, T[] tArr) {
        }

        @Override // i.a.y0.e.b.g1.c
        public void fastPath() {
        }

        @Override // i.a.y0.e.b.g1.c
        public void slowPath(long j2) {
        }
    }

    /* compiled from: FlowableFromArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T> extends i.a.y0.i.d<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public final T[] array;
        public volatile boolean cancelled;
        public int index;

        public c(T[] tArr) {
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

    public g1(T[] tArr) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
