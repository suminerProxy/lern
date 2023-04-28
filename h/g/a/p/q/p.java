package h.g.a.p.q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final r f16916a;
    private final a b;

    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C0322a<?>> f16917a;

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: h.g.a.p.q.p$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class C0322a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<n<Model, ?>> f16918a;

            public C0322a(List<n<Model, ?>> list) {
            }
        }

        public void a() {
        }

        @Nullable
        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
        }
    }

    public p(@NonNull Pools.Pool<List<Throwable>> pool) {
    }

    @NonNull
    private static <A> Class<A> c(@NonNull A a2) {
    }

    @NonNull
    private synchronized <A> List<n<A, ?>> f(@NonNull Class<A> cls) {
    }

    private <Model, Data> void j(@NonNull List<o<? extends Model, ? extends Data>> list) {
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    public synchronized <Model, Data> n<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
    }

    @NonNull
    public synchronized List<Class<?>> d(@NonNull Class<?> cls) {
    }

    @NonNull
    public <A> List<n<A, ?>> e(@NonNull A a2) {
    }

    public synchronized <Model, Data> void g(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    public synchronized <Model, Data> void h(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    private p(@NonNull r rVar) {
    }
}
