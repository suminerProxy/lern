package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableRange.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class y2 extends i.a.e1.c.s<Integer> {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27253d;

    /* compiled from: FlowableRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a extends i.a.e1.h.j.d<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public final int end;
        public int index;

        public a(int index, int end) {
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
        public /* bridge */ /* synthetic */ Object poll() throws Throwable {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public final int requestFusion(int mode) {
        }

        public abstract void slowPath(long r);

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public final Integer poll() {
        }
    }

    /* compiled from: FlowableRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        public final i.a.e1.h.c.c<? super Integer> downstream;

        public b(i.a.e1.h.c.c<? super Integer> actual, int index, int end) {
        }

        @Override // i.a.e1.h.f.b.y2.a
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.y2.a
        public void slowPath(long r) {
        }
    }

    /* compiled from: FlowableRange.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        public final Subscriber<? super Integer> downstream;

        public c(Subscriber<? super Integer> actual, int index, int end) {
        }

        @Override // i.a.e1.h.f.b.y2.a
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.y2.a
        public void slowPath(long r) {
        }
    }

    public y2(int start, int count) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super Integer> s) {
    }
}
