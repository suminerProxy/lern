package i.a.e1.n;

import i.a.e1.c.q0;
import i.a.e1.h.h.p;
import i.a.e1.h.h.r;
import i.a.e1.h.h.s;
import java.util.concurrent.Executor;

/* compiled from: Schedulers.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b {
    @i.a.e1.b.f

    /* renamed from: a  reason: collision with root package name */
    public static final q0 f27983a = i.a.e1.l.a.J(new h());
    @i.a.e1.b.f
    public static final q0 b = i.a.e1.l.a.G(new C0511b());
    @i.a.e1.b.f
    public static final q0 c = i.a.e1.l.a.H(new c());
    @i.a.e1.b.f

    /* renamed from: d  reason: collision with root package name */
    public static final q0 f27984d = s.k();
    @i.a.e1.b.f

    /* renamed from: e  reason: collision with root package name */
    public static final q0 f27985e = i.a.e1.l.a.I(new f());

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f27986a = new i.a.e1.h.h.b();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: i.a.e1.n.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0511b implements i.a.e1.g.s<q0> {
        @Override // i.a.e1.g.s
        /* renamed from: a */
        public q0 get() {
            return a.f27986a;
        }
    }

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c implements i.a.e1.g.s<q0> {
        @Override // i.a.e1.g.s
        /* renamed from: a */
        public q0 get() {
            return d.f27987a;
        }
    }

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f27987a = new i.a.e1.h.h.g();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f27988a = new i.a.e1.h.h.h();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class f implements i.a.e1.g.s<q0> {
        @Override // i.a.e1.g.s
        /* renamed from: a */
        public q0 get() {
            return e.f27988a;
        }
    }

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f27989a = new r();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class h implements i.a.e1.g.s<q0> {
        @Override // i.a.e1.g.s
        /* renamed from: a */
        public q0 get() {
            return g.f27989a;
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    @i.a.e1.b.f
    public static q0 a() {
        return i.a.e1.l.a.X(b);
    }

    @i.a.e1.b.f
    public static q0 b(@i.a.e1.b.f Executor executor) {
        return new i.a.e1.h.h.d(executor, false, false);
    }

    @i.a.e1.b.f
    public static q0 c(@i.a.e1.b.f Executor executor, boolean interruptibleWorker) {
        return new i.a.e1.h.h.d(executor, interruptibleWorker, false);
    }

    @i.a.e1.b.f
    public static q0 d(@i.a.e1.b.f Executor executor, boolean interruptibleWorker, boolean fair) {
        return new i.a.e1.h.h.d(executor, interruptibleWorker, fair);
    }

    @i.a.e1.b.f
    public static q0 e() {
        return i.a.e1.l.a.Z(c);
    }

    @i.a.e1.b.f
    public static q0 f() {
        return i.a.e1.l.a.a0(f27985e);
    }

    public static void g() {
        a().h();
        e().h();
        f().h();
        h().h();
        j().h();
        p.d();
    }

    @i.a.e1.b.f
    public static q0 h() {
        return i.a.e1.l.a.c0(f27983a);
    }

    public static void i() {
        a().i();
        e().i();
        f().i();
        h().i();
        j().i();
        p.e();
    }

    @i.a.e1.b.f
    public static q0 j() {
        return f27984d;
    }
}
