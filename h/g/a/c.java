package h.g.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import h.g.a.t.l.r;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class c extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    public static final l<?, ?> f16432k = null;

    /* renamed from: a  reason: collision with root package name */
    private final h.g.a.p.p.a0.b f16433a;
    private final i b;
    private final h.g.a.t.l.k c;

    /* renamed from: d  reason: collision with root package name */
    private final Glide.a f16434d;

    /* renamed from: e  reason: collision with root package name */
    private final List<h.g.a.t.h<Object>> f16435e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f16436f;

    /* renamed from: g  reason: collision with root package name */
    private final h.g.a.p.p.k f16437g;

    /* renamed from: h  reason: collision with root package name */
    private final d f16438h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16439i;
    @Nullable
    @GuardedBy("this")

    /* renamed from: j  reason: collision with root package name */
    private RequestOptions f16440j;

    public c(@NonNull Context context, @NonNull h.g.a.p.p.a0.b bVar, @NonNull i iVar, @NonNull h.g.a.t.l.k kVar, @NonNull Glide.a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<h.g.a.t.h<Object>> list, @NonNull h.g.a.p.p.k kVar2, @NonNull d dVar, int i2) {
    }

    @NonNull
    public <X> r<ImageView, X> a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
    }

    @NonNull
    public h.g.a.p.p.a0.b b() {
    }

    public List<h.g.a.t.h<Object>> c() {
    }

    public synchronized RequestOptions d() {
    }

    @NonNull
    public <T> l<?, T> e(@NonNull Class<T> cls) {
    }

    @NonNull
    public h.g.a.p.p.k f() {
    }

    public d g() {
    }

    public int h() {
    }

    @NonNull
    public i i() {
    }
}
