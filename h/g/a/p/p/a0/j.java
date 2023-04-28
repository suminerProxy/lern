package h.g.a.p.p.a0;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.NavigableMap;

/* compiled from: LruArrayPool.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class j implements h.g.a.p.p.a0.b {

    /* renamed from: h  reason: collision with root package name */
    private static final int f16643h = 4194304;
    @VisibleForTesting

    /* renamed from: i  reason: collision with root package name */
    public static final int f16644i = 8;

    /* renamed from: j  reason: collision with root package name */
    private static final int f16645j = 2;
    private final h<a, Object> b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f16646d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, h.g.a.p.p.a0.a<?>> f16647e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16648f;

    /* renamed from: g  reason: collision with root package name */
    private int f16649g;

    /* compiled from: LruArrayPool.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f16650a;
        public int b;
        private Class<?> c;

        public a(b bVar) {
        }

        @Override // h.g.a.p.p.a0.m
        public void a() {
        }

        public void b(int i2, Class<?> cls) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b extends d<a> {
        @Override // h.g.a.p.p.a0.d
        public /* bridge */ /* synthetic */ a a() {
        }

        public a d() {
        }

        public a e(int i2, Class<?> cls) {
        }
    }

    @VisibleForTesting
    public j() {
    }

    private void f(int i2, Class<?> cls) {
    }

    private void g() {
    }

    private void h(int i2) {
    }

    private <T> h.g.a.p.p.a0.a<T> i(T t) {
    }

    private <T> h.g.a.p.p.a0.a<T> j(Class<T> cls) {
    }

    @Nullable
    private <T> T k(a aVar) {
    }

    private <T> T m(a aVar, Class<T> cls) {
    }

    private NavigableMap<Integer, Integer> n(Class<?> cls) {
    }

    private boolean o() {
    }

    private boolean p(int i2) {
    }

    private boolean q(int i2, Integer num) {
    }

    @Override // h.g.a.p.p.a0.b
    public synchronized void a(int i2) {
    }

    @Override // h.g.a.p.p.a0.b
    public synchronized void b() {
    }

    @Override // h.g.a.p.p.a0.b
    public synchronized <T> T c(int i2, Class<T> cls) {
    }

    @Override // h.g.a.p.p.a0.b
    public synchronized <T> T d(int i2, Class<T> cls) {
    }

    @Override // h.g.a.p.p.a0.b
    @Deprecated
    public <T> void e(T t, Class<T> cls) {
    }

    public int l() {
    }

    @Override // h.g.a.p.p.a0.b
    public synchronized <T> void put(T t) {
    }

    public j(int i2) {
    }
}
