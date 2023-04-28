package e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Task.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class j<TResult> {

    /* renamed from: l  reason: collision with root package name */
    private static volatile q f15546l;
    private boolean b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private TResult f15552d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f15553e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15554f;

    /* renamed from: g  reason: collision with root package name */
    private e.l f15555g;

    /* renamed from: i  reason: collision with root package name */
    public static final ExecutorService f15543i = e.c.a();

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f15544j = e.c.b();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f15545k = e.b.d();

    /* renamed from: m  reason: collision with root package name */
    private static j<?> f15547m = new j<>((Object) null);

    /* renamed from: n  reason: collision with root package name */
    private static j<Boolean> f15548n = new j<>(Boolean.TRUE);

    /* renamed from: o  reason: collision with root package name */
    private static j<Boolean> f15549o = new j<>(Boolean.FALSE);

    /* renamed from: p  reason: collision with root package name */
    private static j<?> f15550p = new j<>(true);

    /* renamed from: a  reason: collision with root package name */
    private final Object f15551a = new Object();

    /* renamed from: h  reason: collision with root package name */
    private List<e.h<TResult, Void>> f15556h = new ArrayList();

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements e.h<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.k f15557a;
        public final /* synthetic */ e.h b;
        public final /* synthetic */ Executor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.d f15558d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j f15559e;

        public a(j jVar, e.k kVar, e.h hVar, Executor executor, e.d dVar) {
        }

        public Void a(j<TResult> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Void then(j jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements e.h<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.k f15560a;
        public final /* synthetic */ e.h b;
        public final /* synthetic */ Executor c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.d f15561d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j f15562e;

        public b(j jVar, e.k kVar, e.h hVar, Executor executor, e.d dVar) {
        }

        public Void a(j<TResult> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Void then(j jVar) throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c<TContinuationResult> implements e.h<TResult, j<TContinuationResult>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.d f15563a;
        public final /* synthetic */ e.h b;
        public final /* synthetic */ j c;

        public c(j jVar, e.d dVar, e.h hVar) {
        }

        public j<TContinuationResult> a(j<TResult> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Object then(j jVar) throws Exception {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class d<TContinuationResult> implements e.h<TResult, j<TContinuationResult>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.d f15564a;
        public final /* synthetic */ e.h b;
        public final /* synthetic */ j c;

        public d(j jVar, e.d dVar, e.h hVar) {
        }

        public j<TContinuationResult> a(j<TResult> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Object then(j jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e implements Runnable {
        public final /* synthetic */ e.d b;
        public final /* synthetic */ e.k c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.h f15565d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j f15566e;

        public e(e.d dVar, e.k kVar, e.h hVar, j jVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class f implements Runnable {
        public final /* synthetic */ e.d b;
        public final /* synthetic */ e.k c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.h f15567d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j f15568e;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* compiled from: Task.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a<TContinuationResult> implements e.h<TContinuationResult, Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f15569a;

            public a(f fVar) {
            }

            public Void a(j<TContinuationResult> jVar) {
            }

            @Override // e.h
            public /* bridge */ /* synthetic */ Void then(j jVar) throws Exception {
            }
        }

        public f(e.d dVar, e.k kVar, e.h hVar, j jVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class g implements Runnable {
        public final /* synthetic */ e.k b;

        public g(e.k kVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class h implements Runnable {
        public final /* synthetic */ ScheduledFuture b;
        public final /* synthetic */ e.k c;

        public h(ScheduledFuture scheduledFuture, e.k kVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class i implements e.h<TResult, j<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f15570a;

        public i(j jVar) {
        }

        public j<Void> a(j<TResult> jVar) throws Exception {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ j<Void> then(j jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* renamed from: e.j$j  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RunnableC0290j implements Runnable {
        public final /* synthetic */ e.d b;
        public final /* synthetic */ e.k c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Callable f15571d;

        public RunnableC0290j(e.d dVar, e.k kVar, Callable callable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class k implements e.h<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f15572a;
        public final /* synthetic */ e.k b;

        public k(AtomicBoolean atomicBoolean, e.k kVar) {
        }

        public Void a(j<TResult> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Void then(j jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class l implements e.h<Object, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f15573a;
        public final /* synthetic */ e.k b;

        public l(AtomicBoolean atomicBoolean, e.k kVar) {
        }

        public Void a(j<Object> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Void then(j<Object> jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class m implements e.h<Void, List<TResult>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Collection f15574a;

        public m(Collection collection) {
        }

        public List<TResult> a(j<Void> jVar) throws Exception {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Object then(j<Void> jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class n implements e.h<Object, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f15575a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ AtomicBoolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f15576d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e.k f15577e;

        public n(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, e.k kVar) {
        }

        public Void a(j<Object> jVar) {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ Void then(j<Object> jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class o implements e.h<Void, j<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e.d f15578a;
        public final /* synthetic */ Callable b;
        public final /* synthetic */ e.h c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Executor f15579d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e.g f15580e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ j f15581f;

        public o(j jVar, e.d dVar, Callable callable, e.h hVar, Executor executor, e.g gVar) {
        }

        public j<Void> a(j<Void> jVar) throws Exception {
        }

        @Override // e.h
        public /* bridge */ /* synthetic */ j<Void> then(j<Void> jVar) throws Exception {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class p extends e.k<TResult> {
        public final /* synthetic */ j b;

        public p(j jVar) {
        }
    }

    /* compiled from: Task.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface q {
        void a(j<?> jVar, e.m mVar);
    }

    public j() {
    }

    public static j<Void> A(long j2, e.d dVar) {
        return B(j2, e.c.d(), dVar);
    }

    public static j<Void> B(long j2, ScheduledExecutorService scheduledExecutorService, e.d dVar) {
        if (dVar == null || !dVar.a()) {
            if (j2 <= 0) {
                return D(null);
            }
            e.k kVar = new e.k();
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new g(kVar), j2, TimeUnit.MILLISECONDS);
            if (dVar != null) {
                dVar.b(new h(schedule, kVar));
            }
            return kVar.a();
        }
        return i();
    }

    public static <TResult> j<TResult> C(Exception exc) {
        e.k kVar = new e.k();
        kVar.c(exc);
        return kVar.a();
    }

    public static <TResult> j<TResult> D(TResult tresult) {
        if (tresult == null) {
            return (j<TResult>) f15547m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (j<TResult>) f15548n : (j<TResult>) f15549o;
        }
        e.k kVar = new e.k();
        kVar.d(tresult);
        return kVar.a();
    }

    public static q G() {
        return f15546l;
    }

    private void T() {
        synchronized (this.f15551a) {
            for (e.h<TResult, Void> hVar : this.f15556h) {
                try {
                    hVar.then(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f15556h = null;
        }
    }

    public static void U(q qVar) {
        f15546l = qVar;
    }

    public static j<Void> a0(Collection<? extends j<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        e.k kVar = new e.k();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (j<?> jVar : collection) {
            jVar.q(new n(obj, arrayList, atomicBoolean, atomicInteger, kVar));
        }
        return kVar.a();
    }

    public static <TResult> j<List<TResult>> b0(Collection<? extends j<TResult>> collection) {
        return (j<List<TResult>>) a0(collection).L(new m(collection));
    }

    public static <TResult> j<TResult> c(Callable<TResult> callable) {
        return f(callable, f15544j, null);
    }

    public static j<j<?>> c0(Collection<? extends j<?>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        e.k kVar = new e.k();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (j<?> jVar : collection) {
            jVar.q(new l(atomicBoolean, kVar));
        }
        return kVar.a();
    }

    public static <TResult> j<TResult> d(Callable<TResult> callable, e.d dVar) {
        return f(callable, f15544j, dVar);
    }

    public static <TResult> j<j<TResult>> d0(Collection<? extends j<TResult>> collection) {
        if (collection.size() == 0) {
            return D(null);
        }
        e.k kVar = new e.k();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (j<TResult> jVar : collection) {
            jVar.q(new k(atomicBoolean, kVar));
        }
        return kVar.a();
    }

    public static <TResult> j<TResult> e(Callable<TResult> callable, Executor executor) {
        return f(callable, executor, null);
    }

    public static <TResult> j<TResult> f(Callable<TResult> callable, Executor executor, e.d dVar) {
        e.k kVar = new e.k();
        try {
            executor.execute(new RunnableC0290j(dVar, kVar, callable));
        } catch (Exception e2) {
            kVar.c(new e.i(e2));
        }
        return kVar.a();
    }

    public static <TResult> j<TResult> g(Callable<TResult> callable) {
        return f(callable, f15543i, null);
    }

    public static <TResult> j<TResult> h(Callable<TResult> callable, e.d dVar) {
        return f(callable, f15543i, dVar);
    }

    public static <TResult> j<TResult> i() {
        return (j<TResult>) f15550p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void k(e.k<TContinuationResult> kVar, e.h<TResult, j<TContinuationResult>> hVar, j<TResult> jVar, Executor executor, e.d dVar) {
        try {
            executor.execute(new f(dVar, kVar, hVar, jVar));
        } catch (Exception e2) {
            kVar.c(new e.i(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void l(e.k<TContinuationResult> kVar, e.h<TResult, TContinuationResult> hVar, j<TResult> jVar, Executor executor, e.d dVar) {
        try {
            executor.execute(new e(dVar, kVar, hVar, jVar));
        } catch (Exception e2) {
            kVar.c(new e.i(e2));
        }
    }

    public static <TResult> j<TResult>.p y() {
        return new p(new j());
    }

    public static j<Void> z(long j2) {
        return B(j2, e.c.d(), null);
    }

    public Exception E() {
        Exception exc;
        synchronized (this.f15551a) {
            if (this.f15553e != null) {
                this.f15554f = true;
                e.l lVar = this.f15555g;
                if (lVar != null) {
                    lVar.a();
                    this.f15555g = null;
                }
            }
            exc = this.f15553e;
        }
        return exc;
    }

    public TResult F() {
        TResult tresult;
        synchronized (this.f15551a) {
            tresult = this.f15552d;
        }
        return tresult;
    }

    public boolean H() {
        boolean z;
        synchronized (this.f15551a) {
            z = this.c;
        }
        return z;
    }

    public boolean I() {
        boolean z;
        synchronized (this.f15551a) {
            z = this.b;
        }
        return z;
    }

    public boolean J() {
        boolean z;
        synchronized (this.f15551a) {
            z = E() != null;
        }
        return z;
    }

    public j<Void> K() {
        return u(new i(this));
    }

    public <TContinuationResult> j<TContinuationResult> L(e.h<TResult, TContinuationResult> hVar) {
        return O(hVar, f15544j, null);
    }

    public <TContinuationResult> j<TContinuationResult> M(e.h<TResult, TContinuationResult> hVar, e.d dVar) {
        return O(hVar, f15544j, dVar);
    }

    public <TContinuationResult> j<TContinuationResult> N(e.h<TResult, TContinuationResult> hVar, Executor executor) {
        return O(hVar, executor, null);
    }

    public <TContinuationResult> j<TContinuationResult> O(e.h<TResult, TContinuationResult> hVar, Executor executor, e.d dVar) {
        return w(new c(this, dVar, hVar), executor);
    }

    public <TContinuationResult> j<TContinuationResult> P(e.h<TResult, j<TContinuationResult>> hVar) {
        return R(hVar, f15544j);
    }

    public <TContinuationResult> j<TContinuationResult> Q(e.h<TResult, j<TContinuationResult>> hVar, e.d dVar) {
        return S(hVar, f15544j, dVar);
    }

    public <TContinuationResult> j<TContinuationResult> R(e.h<TResult, j<TContinuationResult>> hVar, Executor executor) {
        return S(hVar, executor, null);
    }

    public <TContinuationResult> j<TContinuationResult> S(e.h<TResult, j<TContinuationResult>> hVar, Executor executor, e.d dVar) {
        return w(new d(this, dVar, hVar), executor);
    }

    public boolean V() {
        synchronized (this.f15551a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.f15551a.notifyAll();
            T();
            return true;
        }
    }

    public boolean W(Exception exc) {
        synchronized (this.f15551a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f15553e = exc;
            this.f15554f = false;
            this.f15551a.notifyAll();
            T();
            if (!this.f15554f && G() != null) {
                this.f15555g = new e.l(this);
            }
            return true;
        }
    }

    public boolean X(TResult tresult) {
        synchronized (this.f15551a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f15552d = tresult;
            this.f15551a.notifyAll();
            T();
            return true;
        }
    }

    public void Y() throws InterruptedException {
        synchronized (this.f15551a) {
            if (!I()) {
                this.f15551a.wait();
            }
        }
    }

    public boolean Z(long j2, TimeUnit timeUnit) throws InterruptedException {
        boolean I;
        synchronized (this.f15551a) {
            if (!I()) {
                this.f15551a.wait(timeUnit.toMillis(j2));
            }
            I = I();
        }
        return I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> j<TOut> j() {
        return this;
    }

    public j<Void> m(Callable<Boolean> callable, e.h<Void, j<Void>> hVar) {
        return p(callable, hVar, f15544j, null);
    }

    public j<Void> n(Callable<Boolean> callable, e.h<Void, j<Void>> hVar, e.d dVar) {
        return p(callable, hVar, f15544j, dVar);
    }

    public j<Void> o(Callable<Boolean> callable, e.h<Void, j<Void>> hVar, Executor executor) {
        return p(callable, hVar, executor, null);
    }

    public j<Void> p(Callable<Boolean> callable, e.h<Void, j<Void>> hVar, Executor executor, e.d dVar) {
        e.g gVar = new e.g();
        gVar.b(new o(this, dVar, callable, hVar, executor, gVar));
        return K().w((e.h) gVar.a(), executor);
    }

    public <TContinuationResult> j<TContinuationResult> q(e.h<TResult, TContinuationResult> hVar) {
        return t(hVar, f15544j, null);
    }

    public <TContinuationResult> j<TContinuationResult> r(e.h<TResult, TContinuationResult> hVar, e.d dVar) {
        return t(hVar, f15544j, dVar);
    }

    public <TContinuationResult> j<TContinuationResult> s(e.h<TResult, TContinuationResult> hVar, Executor executor) {
        return t(hVar, executor, null);
    }

    public <TContinuationResult> j<TContinuationResult> t(e.h<TResult, TContinuationResult> hVar, Executor executor, e.d dVar) {
        boolean I;
        e.k kVar = new e.k();
        synchronized (this.f15551a) {
            I = I();
            if (!I) {
                this.f15556h.add(new a(this, kVar, hVar, executor, dVar));
            }
        }
        if (I) {
            l(kVar, hVar, this, executor, dVar);
        }
        return kVar.a();
    }

    public <TContinuationResult> j<TContinuationResult> u(e.h<TResult, j<TContinuationResult>> hVar) {
        return x(hVar, f15544j, null);
    }

    public <TContinuationResult> j<TContinuationResult> v(e.h<TResult, j<TContinuationResult>> hVar, e.d dVar) {
        return x(hVar, f15544j, dVar);
    }

    public <TContinuationResult> j<TContinuationResult> w(e.h<TResult, j<TContinuationResult>> hVar, Executor executor) {
        return x(hVar, executor, null);
    }

    public <TContinuationResult> j<TContinuationResult> x(e.h<TResult, j<TContinuationResult>> hVar, Executor executor, e.d dVar) {
        boolean I;
        e.k kVar = new e.k();
        synchronized (this.f15551a) {
            I = I();
            if (!I) {
                this.f15556h.add(new b(this, kVar, hVar, executor, dVar));
            }
        }
        if (I) {
            k(kVar, hVar, this, executor, dVar);
        }
        return kVar.a();
    }

    private j(TResult tresult) {
        X(tresult);
    }

    private j(boolean z) {
        if (z) {
            V();
        } else {
            X(null);
        }
    }
}
