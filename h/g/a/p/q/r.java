package h.g.a.p.q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import h.g.a.p.q.n;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class r {

    /* renamed from: e  reason: collision with root package name */
    private static final c f16925e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final n<Object, Object> f16926f = null;

    /* renamed from: a  reason: collision with root package name */
    private final List<b<?, ?>> f16927a;
    private final c b;
    private final Set<b<?, ?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final Pools.Pool<List<Throwable>> f16928d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements n<Object, Object> {
        @Override // h.g.a.p.q.n
        public boolean a(@NonNull Object obj) {
        }

        @Override // h.g.a.p.q.n
        @Nullable
        public n.a<Object> b(@NonNull Object obj, int i2, int i3, @NonNull h.g.a.p.j jVar) {
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Model> f16929a;
        public final Class<Data> b;
        public final o<? extends Model, ? extends Data> c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        }

        public boolean a(@NonNull Class<?> cls) {
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c {
        @NonNull
        public <Model, Data> q<Model, Data> a(@NonNull List<n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        }
    }

    public r(@NonNull Pools.Pool<List<Throwable>> pool) {
    }

    private <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar, boolean z) {
    }

    @NonNull
    private <Model, Data> n<Model, Data> c(@NonNull b<?, ?> bVar) {
    }

    @NonNull
    private static <Model, Data> n<Model, Data> f() {
    }

    @NonNull
    private <Model, Data> o<Model, Data> h(@NonNull b<?, ?> bVar) {
    }

    public synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    @NonNull
    public synchronized <Model, Data> n<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
    }

    @NonNull
    public synchronized <Model> List<n<Model, ?>> e(@NonNull Class<Model> cls) {
    }

    @NonNull
    public synchronized List<Class<?>> g(@NonNull Class<?> cls) {
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    @NonNull
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
    }

    @NonNull
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> k(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    @VisibleForTesting
    public r(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull c cVar) {
    }
}
