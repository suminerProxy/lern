package h.g.a.p.p;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import h.g.a.p.p.f;
import h.g.a.p.p.i;
import h.g.a.v.p.a;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeJob.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private static final String H = "DecodeJob";
    private Object A;
    private h.g.a.p.a B;
    private h.g.a.p.o.d<?> C;
    private volatile h.g.a.p.p.f D;
    private volatile boolean E;
    private volatile boolean F;
    private boolean G;
    private final h.g.a.p.p.g<R> b;
    private final List<Throwable> c;

    /* renamed from: d  reason: collision with root package name */
    private final h.g.a.v.p.c f16776d;

    /* renamed from: e  reason: collision with root package name */
    private final e f16777e;

    /* renamed from: f  reason: collision with root package name */
    private final Pools.Pool<h<?>> f16778f;

    /* renamed from: g  reason: collision with root package name */
    private final d<?> f16779g;

    /* renamed from: h  reason: collision with root package name */
    private final f f16780h;

    /* renamed from: i  reason: collision with root package name */
    private h.g.a.c f16781i;

    /* renamed from: j  reason: collision with root package name */
    private h.g.a.p.g f16782j;

    /* renamed from: k  reason: collision with root package name */
    private h.g.a.h f16783k;

    /* renamed from: l  reason: collision with root package name */
    private n f16784l;

    /* renamed from: m  reason: collision with root package name */
    private int f16785m;

    /* renamed from: n  reason: collision with root package name */
    private int f16786n;

    /* renamed from: o  reason: collision with root package name */
    private j f16787o;

    /* renamed from: p  reason: collision with root package name */
    private h.g.a.p.j f16788p;
    private b<R> q;
    private int r;
    private EnumC0317h s;
    private g t;
    private long u;
    private boolean v;
    private Object w;
    private Thread x;
    private h.g.a.p.g y;
    private h.g.a.p.g z;

    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16789a = null;
        public static final /* synthetic */ int[] b = null;
        public static final /* synthetic */ int[] c = null;
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b<R> {
        void b(v<R> vVar, h.g.a.p.a aVar, boolean z);

        void c(q qVar);

        void e(h<?> hVar);
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        private final h.g.a.p.a f16790a;
        public final /* synthetic */ h b;

        public c(h hVar, h.g.a.p.a aVar) {
        }

        @Override // h.g.a.p.p.i.a
        @NonNull
        public v<Z> a(@NonNull v<Z> vVar) {
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        private h.g.a.p.g f16791a;
        private h.g.a.p.m<Z> b;
        private u<Z> c;

        public void a() {
        }

        public void b(e eVar, h.g.a.p.j jVar) {
        }

        public boolean c() {
        }

        public <X> void d(h.g.a.p.g gVar, h.g.a.p.m<X> mVar, u<X> uVar) {
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface e {
        h.g.a.p.p.b0.a a();
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f16792a;
        private boolean b;
        private boolean c;

        private boolean a(boolean z) {
        }

        public synchronized boolean b() {
        }

        public synchronized boolean c() {
        }

        public synchronized boolean d(boolean z) {
        }

        public synchronized void e() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: DecodeJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES = null;
        public static final g DECODE_DATA = null;
        public static final g INITIALIZE = null;
        public static final g SWITCH_TO_SOURCE_SERVICE = null;

        private g(String str, int i2) {
        }

        public static g valueOf(String str) {
        }

        public static g[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: DecodeJob.java */
    /* renamed from: h.g.a.p.p.h$h  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class EnumC0317h {
        private static final /* synthetic */ EnumC0317h[] $VALUES = null;
        public static final EnumC0317h DATA_CACHE = null;
        public static final EnumC0317h ENCODE = null;
        public static final EnumC0317h FINISHED = null;
        public static final EnumC0317h INITIALIZE = null;
        public static final EnumC0317h RESOURCE_CACHE = null;
        public static final EnumC0317h SOURCE = null;

        private EnumC0317h(String str, int i2) {
        }

        public static EnumC0317h valueOf(String str) {
        }

        public static EnumC0317h[] values() {
        }
    }

    public h(e eVar, Pools.Pool<h<?>> pool) {
    }

    private void A() {
    }

    private void B() {
    }

    private <Data> v<R> g(h.g.a.p.o.d<?> dVar, Data data, h.g.a.p.a aVar) throws q {
    }

    private <Data> v<R> h(Data data, h.g.a.p.a aVar) throws q {
    }

    private void i() {
    }

    private h.g.a.p.p.f j() {
    }

    private EnumC0317h k(EnumC0317h enumC0317h) {
    }

    @NonNull
    private h.g.a.p.j l(h.g.a.p.a aVar) {
    }

    private int m() {
    }

    private void o(String str, long j2) {
    }

    private void p(String str, long j2, String str2) {
    }

    private void q(v<R> vVar, h.g.a.p.a aVar, boolean z) {
    }

    private void r(v<R> vVar, h.g.a.p.a aVar, boolean z) {
    }

    private void s() {
    }

    private void t() {
    }

    private void u() {
    }

    private void x() {
    }

    private void y() {
    }

    private <Data, ResourceType> v<R> z(Data data, h.g.a.p.a aVar, t<Data, ResourceType, R> tVar) throws q {
    }

    public boolean C() {
    }

    @Override // h.g.a.p.p.f.a
    public void a(h.g.a.p.g gVar, Exception exc, h.g.a.p.o.d<?> dVar, h.g.a.p.a aVar) {
    }

    public void b() {
    }

    @Override // h.g.a.p.p.f.a
    public void c() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull h<?> hVar) {
    }

    @Override // h.g.a.v.p.a.f
    @NonNull
    public h.g.a.v.p.c d() {
    }

    @Override // h.g.a.p.p.f.a
    public void e(h.g.a.p.g gVar, Object obj, h.g.a.p.o.d<?> dVar, h.g.a.p.a aVar, h.g.a.p.g gVar2) {
    }

    public int f(@NonNull h<?> hVar) {
    }

    public h<R> n(h.g.a.c cVar, Object obj, n nVar, h.g.a.p.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, h.g.a.h hVar, j jVar, Map<Class<?>, h.g.a.p.n<?>> map, boolean z, boolean z2, boolean z3, h.g.a.p.j jVar2, b<R> bVar, int i4) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    @NonNull
    public <Z> v<Z> v(h.g.a.p.a aVar, @NonNull v<Z> vVar) {
    }

    public void w(boolean z) {
    }
}
