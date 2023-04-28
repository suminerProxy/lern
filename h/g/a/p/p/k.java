package h.g.a.p.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import h.g.a.p.p.b0.a;
import h.g.a.p.p.b0.j;
import h.g.a.p.p.h;
import h.g.a.p.p.p;
import h.g.a.v.p.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class k implements m, j.a, p.a {

    /* renamed from: i  reason: collision with root package name */
    private static final String f16800i = "Engine";

    /* renamed from: j  reason: collision with root package name */
    private static final int f16801j = 150;

    /* renamed from: k  reason: collision with root package name */
    private static final boolean f16802k = false;

    /* renamed from: a  reason: collision with root package name */
    private final s f16803a;
    private final o b;
    private final h.g.a.p.p.b0.j c;

    /* renamed from: d  reason: collision with root package name */
    private final b f16804d;

    /* renamed from: e  reason: collision with root package name */
    private final y f16805e;

    /* renamed from: f  reason: collision with root package name */
    private final c f16806f;

    /* renamed from: g  reason: collision with root package name */
    private final a f16807g;

    /* renamed from: h  reason: collision with root package name */
    private final h.g.a.p.p.a f16808h;

    /* compiled from: Engine.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final h.e f16809a;
        public final Pools.Pool<h<?>> b;
        private int c;

        /* compiled from: Engine.java */
        /* renamed from: h.g.a.p.p.k$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0318a implements a.d<h<?>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f16810a;

            public C0318a(a aVar) {
            }

            public h<?> a() {
            }

            @Override // h.g.a.v.p.a.d
            public /* bridge */ /* synthetic */ h<?> create() {
            }
        }

        public a(h.e eVar) {
        }

        public <R> h<R> a(h.g.a.c cVar, Object obj, n nVar, h.g.a.p.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, h.g.a.h hVar, j jVar, Map<Class<?>, h.g.a.p.n<?>> map, boolean z, boolean z2, boolean z3, h.g.a.p.j jVar2, h.b<R> bVar) {
        }
    }

    /* compiled from: Engine.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final h.g.a.p.p.c0.a f16811a;
        public final h.g.a.p.p.c0.a b;
        public final h.g.a.p.p.c0.a c;

        /* renamed from: d  reason: collision with root package name */
        public final h.g.a.p.p.c0.a f16812d;

        /* renamed from: e  reason: collision with root package name */
        public final m f16813e;

        /* renamed from: f  reason: collision with root package name */
        public final p.a f16814f;

        /* renamed from: g  reason: collision with root package name */
        public final Pools.Pool<l<?>> f16815g;

        /* compiled from: Engine.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a implements a.d<l<?>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f16816a;

            public a(b bVar) {
            }

            public l<?> a() {
            }

            @Override // h.g.a.v.p.a.d
            public /* bridge */ /* synthetic */ l<?> create() {
            }
        }

        public b(h.g.a.p.p.c0.a aVar, h.g.a.p.p.c0.a aVar2, h.g.a.p.p.c0.a aVar3, h.g.a.p.p.c0.a aVar4, m mVar, p.a aVar5) {
        }

        public <R> l<R> a(h.g.a.p.g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        }

        @VisibleForTesting
        public void b() {
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0311a f16817a;
        private volatile h.g.a.p.p.b0.a b;

        public c(a.InterfaceC0311a interfaceC0311a) {
        }

        @Override // h.g.a.p.p.h.e
        public h.g.a.p.p.b0.a a() {
        }

        @VisibleForTesting
        public synchronized void b() {
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final l<?> f16818a;
        private final h.g.a.t.i b;
        public final /* synthetic */ k c;

        public d(k kVar, h.g.a.t.i iVar, l<?> lVar) {
        }

        public void a() {
        }
    }

    public k(h.g.a.p.p.b0.j jVar, a.InterfaceC0311a interfaceC0311a, h.g.a.p.p.c0.a aVar, h.g.a.p.p.c0.a aVar2, h.g.a.p.p.c0.a aVar3, h.g.a.p.p.c0.a aVar4, boolean z) {
    }

    private p<?> f(h.g.a.p.g gVar) {
    }

    @Nullable
    private p<?> h(h.g.a.p.g gVar) {
    }

    private p<?> i(h.g.a.p.g gVar) {
    }

    @Nullable
    private p<?> j(n nVar, boolean z, long j2) {
    }

    private static void k(String str, long j2, h.g.a.p.g gVar) {
    }

    private <R> d n(h.g.a.c cVar, Object obj, h.g.a.p.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, h.g.a.h hVar, j jVar, Map<Class<?>, h.g.a.p.n<?>> map, boolean z, boolean z2, h.g.a.p.j jVar2, boolean z3, boolean z4, boolean z5, boolean z6, h.g.a.t.i iVar, Executor executor, n nVar, long j2) {
    }

    @Override // h.g.a.p.p.b0.j.a
    public void a(@NonNull v<?> vVar) {
    }

    @Override // h.g.a.p.p.m
    public synchronized void b(l<?> lVar, h.g.a.p.g gVar, p<?> pVar) {
    }

    @Override // h.g.a.p.p.m
    public synchronized void c(l<?> lVar, h.g.a.p.g gVar) {
    }

    @Override // h.g.a.p.p.p.a
    public void d(h.g.a.p.g gVar, p<?> pVar) {
    }

    public void e() {
    }

    public <R> d g(h.g.a.c cVar, Object obj, h.g.a.p.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, h.g.a.h hVar, j jVar, Map<Class<?>, h.g.a.p.n<?>> map, boolean z, boolean z2, h.g.a.p.j jVar2, boolean z3, boolean z4, boolean z5, boolean z6, h.g.a.t.i iVar, Executor executor) {
    }

    public void l(v<?> vVar) {
    }

    @VisibleForTesting
    public void m() {
    }

    @VisibleForTesting
    public k(h.g.a.p.p.b0.j jVar, a.InterfaceC0311a interfaceC0311a, h.g.a.p.p.c0.a aVar, h.g.a.p.p.c0.a aVar2, h.g.a.p.p.c0.a aVar3, h.g.a.p.p.c0.a aVar4, s sVar, o oVar, h.g.a.p.p.a aVar5, b bVar, a aVar6, y yVar, boolean z) {
    }
}
