package h.g.a.s;

import androidx.annotation.NonNull;
import h.g.a.p.l;
import java.util.List;
import java.util.Map;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f17171a;
    private final Map<String, List<a<?, ?>>> b;

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f17172a;
        public final Class<R> b;
        public final l<T, R> c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, l<T, R> lVar) {
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        }
    }

    @NonNull
    private synchronized List<a<?, ?>> c(@NonNull String str) {
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull l<T, R> lVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
    }

    @NonNull
    public synchronized <T, R> List<l<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
    }

    public synchronized <T, R> void e(@NonNull String str, @NonNull l<T, R> lVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
    }

    public synchronized void f(@NonNull List<String> list) {
    }
}
