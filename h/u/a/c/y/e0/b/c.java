package h.u.a.c.y.e0.b;

import android.content.Context;
import android.os.AsyncTask;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.Marker;
import h.u.a.c.y.e0.a;
import h.u.a.c.y.e0.b.b;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;

/* compiled from: ClusterManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class c<T extends h.u.a.c.y.e0.b.b> implements BaiduMap.OnMapStatusChangeListener, BaiduMap.OnMarkerClickListener {
    private final h.u.a.c.y.e0.a b;
    private final a.C0352a c;

    /* renamed from: d  reason: collision with root package name */
    private final a.C0352a f20090d;

    /* renamed from: e  reason: collision with root package name */
    private h.u.a.c.y.e0.b.d.a<T> f20091e;

    /* renamed from: f  reason: collision with root package name */
    private final ReadWriteLock f20092f;

    /* renamed from: g  reason: collision with root package name */
    private h.u.a.c.y.e0.b.e.a<T> f20093g;

    /* renamed from: h  reason: collision with root package name */
    private BaiduMap f20094h;

    /* renamed from: i  reason: collision with root package name */
    private MapStatus f20095i;

    /* renamed from: j  reason: collision with root package name */
    private c<T>.b f20096j;

    /* renamed from: k  reason: collision with root package name */
    private final ReadWriteLock f20097k;

    /* renamed from: l  reason: collision with root package name */
    private e<T> f20098l;

    /* renamed from: m  reason: collision with root package name */
    private d<T> f20099m;

    /* renamed from: n  reason: collision with root package name */
    private f<T> f20100n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC0353c<T> f20101o;

    /* compiled from: ClusterManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b extends AsyncTask<Float, Void, Set<? extends h.u.a.c.y.e0.b.a<T>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f20102a;

        private b(c cVar) {
        }

        public Set<? extends h.u.a.c.y.e0.b.a<T>> a(Float... fArr) {
        }

        public void b(Set<? extends h.u.a.c.y.e0.b.a<T>> set) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Float[] fArr) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        }

        public /* synthetic */ b(c cVar, a aVar) {
        }
    }

    /* compiled from: ClusterManager.java */
    /* renamed from: h.u.a.c.y.e0.b.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InterfaceC0353c<T extends h.u.a.c.y.e0.b.b> {
        boolean a(h.u.a.c.y.e0.b.a<T> aVar);
    }

    /* compiled from: ClusterManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface d<T extends h.u.a.c.y.e0.b.b> {
        void a(h.u.a.c.y.e0.b.a<T> aVar);
    }

    /* compiled from: ClusterManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface e<T extends h.u.a.c.y.e0.b.b> {
        boolean a(T t);
    }

    /* compiled from: ClusterManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface f<T extends h.u.a.c.y.e0.b.b> {
        void a(T t);
    }

    public c(Context context, BaiduMap baiduMap) {
    }

    public static /* synthetic */ ReadWriteLock a(c cVar) {
    }

    public static /* synthetic */ h.u.a.c.y.e0.b.d.a b(c cVar) {
    }

    public static /* synthetic */ h.u.a.c.y.e0.b.e.a c(c cVar) {
    }

    public void d(T t) {
    }

    public void e(Collection<T> collection) {
    }

    public void f() {
    }

    public void g() {
    }

    public a.C0352a h() {
    }

    public a.C0352a i() {
    }

    public h.u.a.c.y.e0.a j() {
    }

    public void k(T t) {
    }

    public void l(h.u.a.c.y.e0.b.d.a<T> aVar) {
    }

    public void m(h.u.a.c.y.e0.b.e.a<T> aVar) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChange(MapStatus mapStatus) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChangeFinish(MapStatus mapStatus) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChangeStart(MapStatus mapStatus) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
    public void onMapStatusChangeStart(MapStatus mapStatus, int i2) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
    }

    public void setOnClusterClickListener(InterfaceC0353c<T> interfaceC0353c) {
    }

    public void setOnClusterInfoWindowClickListener(d<T> dVar) {
    }

    public void setOnClusterItemClickListener(e<T> eVar) {
    }

    public void setOnClusterItemInfoWindowClickListener(f<T> fVar) {
    }

    public c(Context context, BaiduMap baiduMap, h.u.a.c.y.e0.a aVar) {
    }
}
