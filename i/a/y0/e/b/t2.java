package i.a.y0.e.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableRange.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t2 extends i.a.l<Integer> {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28510d;

    /* compiled from: FlowableRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a extends i.a.y0.i.d<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public final int end;
        public int index;

        public a(int i2, int i3) {
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
        public /* bridge */ /* synthetic */ Object poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public final int requestFusion(int i2) {
        }

        public abstract void slowPath(long j2);

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public final Integer poll() {
        }
    }

    /* compiled from: FlowableRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        public final i.a.y0.c.a<? super Integer> downstream;

        public b(i.a.y0.c.a<? super Integer> aVar, int i2, int i3) {
        }

        @Override // i.a.y0.e.b.t2.a
        public void fastPath() {
        }

        @Override // i.a.y0.e.b.t2.a
        public void slowPath(long j2) {
        }
    }

    /* compiled from: FlowableRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        public final Subscriber<? super Integer> downstream;

        public c(Subscriber<? super Integer> subscriber, int i2, int i3) {
        }

        @Override // i.a.y0.e.b.t2.a
        public void fastPath() {
        }

        @Override // i.a.y0.e.b.t2.a
        public void slowPath(long j2) {
        }
    }

    public t2(int i2, int i3) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super Integer> subscriber) {
    }
}
