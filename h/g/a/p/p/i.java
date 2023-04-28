package h.g.a.p.p;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.List;

/* compiled from: DecodePath.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f16793f = "DecodePath";

    /* renamed from: a  reason: collision with root package name */
    private final Class<DataType> f16794a;
    private final List<? extends h.g.a.p.l<DataType, ResourceType>> b;
    private final h.g.a.p.r.i.e<ResourceType, Transcode> c;

    /* renamed from: d  reason: collision with root package name */
    private final Pools.Pool<List<Throwable>> f16795d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16796e;

    /* compiled from: DecodePath.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a<ResourceType> {
        @NonNull
        v<ResourceType> a(@NonNull v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends h.g.a.p.l<DataType, ResourceType>> list, h.g.a.p.r.i.e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
    }

    @NonNull
    private v<ResourceType> b(h.g.a.p.o.e<DataType> eVar, int i2, int i3, @NonNull h.g.a.p.j jVar) throws q {
    }

    @NonNull
    private v<ResourceType> c(h.g.a.p.o.e<DataType> eVar, int i2, int i3, @NonNull h.g.a.p.j jVar, List<Throwable> list) throws q {
    }

    public v<Transcode> a(h.g.a.p.o.e<DataType> eVar, int i2, int i3, @NonNull h.g.a.p.j jVar, a<ResourceType> aVar) throws q {
    }

    public String toString() {
    }
}
