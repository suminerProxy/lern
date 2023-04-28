package h.g.a.p.q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import h.g.a.p.o.d;
import h.g.a.p.q.n;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<Model, Data>> f16919a;
    private final Pools.Pool<List<Throwable>> b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a<Data> implements h.g.a.p.o.d<Data>, d.a<Data> {
        private final List<h.g.a.p.o.d<Data>> b;
        private final Pools.Pool<List<Throwable>> c;

        /* renamed from: d  reason: collision with root package name */
        private int f16920d;

        /* renamed from: e  reason: collision with root package name */
        private h.g.a.h f16921e;

        /* renamed from: f  reason: collision with root package name */
        private d.a<? super Data> f16922f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        private List<Throwable> f16923g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f16924h;

        public a(@NonNull List<h.g.a.p.o.d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        }

        private void f() {
        }

        @Override // h.g.a.p.o.d
        @NonNull
        public Class<Data> a() {
        }

        @Override // h.g.a.p.o.d
        public void b() {
        }

        @Override // h.g.a.p.o.d.a
        public void c(@NonNull Exception exc) {
        }

        @Override // h.g.a.p.o.d
        public void cancel() {
        }

        @Override // h.g.a.p.o.d
        public void d(@NonNull h.g.a.h hVar, @NonNull d.a<? super Data> aVar) {
        }

        @Override // h.g.a.p.o.d.a
        public void e(@Nullable Data data) {
        }

        @Override // h.g.a.p.o.d
        @NonNull
        public h.g.a.p.a getDataSource() {
        }
    }

    public q(@NonNull List<n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
    }

    @Override // h.g.a.p.q.n
    public boolean a(@NonNull Model model) {
    }

    @Override // h.g.a.p.q.n
    public n.a<Data> b(@NonNull Model model, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public String toString() {
    }
}
