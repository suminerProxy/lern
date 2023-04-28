package h.g.a.v.p;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17278a = "FactoryPools";
    private static final int b = 20;
    private static final g<Object> c = null;

    /* compiled from: FactoryPools.java */
    /* renamed from: h.g.a.v.p.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0330a implements g<Object> {
        @Override // h.g.a.v.p.a.g
        public void a(@NonNull Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b<T> implements d<List<T>> {
        @NonNull
        public List<T> a() {
        }

        @Override // h.g.a.v.p.a.d
        @NonNull
        public /* bridge */ /* synthetic */ Object create() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c<T> implements g<List<T>> {
        @Override // h.g.a.v.p.a.g
        public /* bridge */ /* synthetic */ void a(@NonNull Object obj) {
        }

        public void b(@NonNull List<T> list) {
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface d<T> {
        T create();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class e<T> implements Pools.Pool<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f17279a;
        private final g<T> b;
        private final Pools.Pool<T> c;

        public e(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t) {
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface f {
        @NonNull
        h.g.a.v.p.c d();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface g<T> {
        void a(@NonNull T t);
    }

    private a() {
    }

    @NonNull
    private static <T extends f> Pools.Pool<T> a(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar) {
    }

    @NonNull
    private static <T> Pools.Pool<T> b(@NonNull Pools.Pool<T> pool, @NonNull d<T> dVar, @NonNull g<T> gVar) {
    }

    @NonNull
    private static <T> g<T> c() {
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> d(int i2, @NonNull d<T> dVar) {
    }

    @NonNull
    public static <T extends f> Pools.Pool<T> e(int i2, @NonNull d<T> dVar) {
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> f() {
    }

    @NonNull
    public static <T> Pools.Pool<List<T>> g(int i2) {
    }
}
