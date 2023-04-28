package h.g.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import h.g.a.p.m;
import h.g.a.p.o.e;
import h.g.a.p.p.t;
import h.g.a.p.p.v;
import h.g.a.p.q.n;
import h.g.a.p.q.o;
import h.g.a.p.q.p;
import java.util.List;

/* compiled from: Registry.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class i {

    /* renamed from: k  reason: collision with root package name */
    public static final String f16453k = "Gif";

    /* renamed from: l  reason: collision with root package name */
    public static final String f16454l = "Bitmap";

    /* renamed from: m  reason: collision with root package name */
    public static final String f16455m = "BitmapDrawable";

    /* renamed from: n  reason: collision with root package name */
    private static final String f16456n = "legacy_prepend_all";

    /* renamed from: o  reason: collision with root package name */
    private static final String f16457o = "legacy_append";

    /* renamed from: a  reason: collision with root package name */
    private final p f16458a;
    private final h.g.a.s.a b;
    private final h.g.a.s.e c;

    /* renamed from: d  reason: collision with root package name */
    private final h.g.a.s.f f16459d;

    /* renamed from: e  reason: collision with root package name */
    private final h.g.a.p.o.f f16460e;

    /* renamed from: f  reason: collision with root package name */
    private final h.g.a.p.r.i.f f16461f;

    /* renamed from: g  reason: collision with root package name */
    private final h.g.a.s.b f16462g;

    /* renamed from: h  reason: collision with root package name */
    private final h.g.a.s.d f16463h;

    /* renamed from: i  reason: collision with root package name */
    private final h.g.a.s.c f16464i;

    /* renamed from: j  reason: collision with root package name */
    private final Pools.Pool<List<Throwable>> f16465j;

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a extends RuntimeException {
        public a(@NonNull String str) {
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b extends a {
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c extends a {
        public c(@NonNull Object obj) {
        }

        public <M> c(@NonNull M m2, @NonNull List<n<M, ?>> list) {
        }

        public c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d extends a {
        public d(@NonNull Class<?> cls) {
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e extends a {
        public e(@NonNull Class<?> cls) {
        }
    }

    @NonNull
    private <Data, TResource, Transcode> List<h.g.a.p.p.i<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
    }

    @NonNull
    public <Data> i a(@NonNull Class<Data> cls, @NonNull h.g.a.p.d<Data> dVar) {
    }

    @NonNull
    public <TResource> i b(@NonNull Class<TResource> cls, @NonNull m<TResource> mVar) {
    }

    @NonNull
    public <Data, TResource> i c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull h.g.a.p.l<Data, TResource> lVar) {
    }

    @NonNull
    public <Model, Data> i d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<Model, Data> oVar) {
    }

    @NonNull
    public <Data, TResource> i e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull h.g.a.p.l<Data, TResource> lVar) {
    }

    @NonNull
    public List<ImageHeaderParser> g() {
    }

    @Nullable
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
    }

    @NonNull
    public <Model> List<n<Model, ?>> i(@NonNull Model model) {
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
    }

    @NonNull
    public <X> m<X> k(@NonNull v<X> vVar) throws d {
    }

    @NonNull
    public <X> h.g.a.p.o.e<X> l(@NonNull X x) {
    }

    @NonNull
    public <X> h.g.a.p.d<X> m(@NonNull X x) throws e {
    }

    public boolean n(@NonNull v<?> vVar) {
    }

    @NonNull
    public <Data> i o(@NonNull Class<Data> cls, @NonNull h.g.a.p.d<Data> dVar) {
    }

    @NonNull
    public <TResource> i p(@NonNull Class<TResource> cls, @NonNull m<TResource> mVar) {
    }

    @NonNull
    public <Data, TResource> i q(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull h.g.a.p.l<Data, TResource> lVar) {
    }

    @NonNull
    public <Model, Data> i r(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<Model, Data> oVar) {
    }

    @NonNull
    public <Data, TResource> i s(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull h.g.a.p.l<Data, TResource> lVar) {
    }

    @NonNull
    public i t(@NonNull ImageHeaderParser imageHeaderParser) {
    }

    @NonNull
    public i u(@NonNull e.a<?> aVar) {
    }

    @NonNull
    @Deprecated
    public <Data> i v(@NonNull Class<Data> cls, @NonNull h.g.a.p.d<Data> dVar) {
    }

    @NonNull
    @Deprecated
    public <TResource> i w(@NonNull Class<TResource> cls, @NonNull m<TResource> mVar) {
    }

    @NonNull
    public <TResource, Transcode> i x(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull h.g.a.p.r.i.e<TResource, Transcode> eVar) {
    }

    @NonNull
    public <Model, Data> i y(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
    }

    @NonNull
    public final i z(@NonNull List<String> list) {
    }
}
