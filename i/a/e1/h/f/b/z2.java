package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableRangeLong.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z2 extends i.a.e1.c.s<Long> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27268d;

    /* compiled from: FlowableRangeLong.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a extends i.a.e1.h.j.d<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public final long end;
        public long index;

        public a(long index, long end) {
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
        public final Long poll() {
        }
    }

    /* compiled from: FlowableRangeLong.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        public final i.a.e1.h.c.c<? super Long> downstream;

        public b(i.a.e1.h.c.c<? super Long> actual, long index, long end) {
        }

        @Override // i.a.e1.h.f.b.z2.a
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.z2.a
        public void slowPath(long r) {
        }
    }

    /* compiled from: FlowableRangeLong.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends a {
        private static final long serialVersionUID = 2587302975077663557L;
        public final Subscriber<? super Long> downstream;

        public c(Subscriber<? super Long> actual, long index, long end) {
        }

        @Override // i.a.e1.h.f.b.z2.a
        public void fastPath() {
        }

        @Override // i.a.e1.h.f.b.z2.a
        public void slowPath(long r) {
        }
    }

    public z2(long start, long count) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super Long> s) {
    }
}
