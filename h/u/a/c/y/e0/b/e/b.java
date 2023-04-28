package h.u.a.c.y.e0.b.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.Projection;
import com.baidu.mapapi.model.LatLng;
import com.showstartfans.activity.activitys.community.clusterutil.ui.SquareTextView;
import h.u.a.c.y.e0.b.b;
import h.u.a.c.y.e0.b.c;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: DefaultClusterRenderer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b<T extends h.u.a.c.y.e0.b.b> implements h.u.a.c.y.e0.b.e.a<T> {
    private static final boolean r = false;
    private static final int[] s = null;
    private static final int t = 1;
    private static final TimeInterpolator u = null;

    /* renamed from: a  reason: collision with root package name */
    private final BaiduMap f20108a;
    private final h.u.a.c.y.e0.b.c<T> b;
    private final float c;

    /* renamed from: d  reason: collision with root package name */
    private ShapeDrawable f20109d;

    /* renamed from: e  reason: collision with root package name */
    private Set<g> f20110e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<BitmapDescriptor> f20111f;

    /* renamed from: g  reason: collision with root package name */
    private e<T> f20112g;

    /* renamed from: h  reason: collision with root package name */
    private Set<? extends h.u.a.c.y.e0.b.a<T>> f20113h;

    /* renamed from: i  reason: collision with root package name */
    private Map<Marker, h.u.a.c.y.e0.b.a<T>> f20114i;

    /* renamed from: j  reason: collision with root package name */
    private Map<h.u.a.c.y.e0.b.a<T>, Marker> f20115j;

    /* renamed from: k  reason: collision with root package name */
    private float f20116k;

    /* renamed from: l  reason: collision with root package name */
    private final b<T>.i f20117l;

    /* renamed from: m  reason: collision with root package name */
    private c.InterfaceC0353c<T> f20118m;

    /* renamed from: n  reason: collision with root package name */
    private c.d<T> f20119n;

    /* renamed from: o  reason: collision with root package name */
    private c.e<T> f20120o;

    /* renamed from: p  reason: collision with root package name */
    private c.f<T> f20121p;
    private Context q;

    /* compiled from: DefaultClusterRenderer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements BaiduMap.OnMarkerClickListener {
        public final /* synthetic */ b b;

        public a(b bVar) {
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: h.u.a.c.y.e0.b.e.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C0355b implements BaiduMap.OnMarkerClickListener {
        public final /* synthetic */ b b;

        public C0355b(b bVar) {
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @TargetApi(12)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final g b;
        private final Marker c;

        /* renamed from: d  reason: collision with root package name */
        private final LatLng f20122d;

        /* renamed from: e  reason: collision with root package name */
        private final LatLng f20123e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20124f;

        /* renamed from: g  reason: collision with root package name */
        private h.u.a.c.y.e0.a f20125g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b f20126h;

        public /* synthetic */ c(b bVar, g gVar, LatLng latLng, LatLng latLng2, a aVar) {
        }

        public void a() {
        }

        public void b(h.u.a.c.y.e0.a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }

        private c(b bVar, g gVar, LatLng latLng, LatLng latLng2) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final h.u.a.c.y.e0.b.a<T> f20127a;
        private final Set<g> b;
        private final LatLng c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f20128d;

        public d(b bVar, h.u.a.c.y.e0.b.a<T> aVar, Set<g> set, LatLng latLng) {
        }

        public static /* synthetic */ void a(d dVar, f fVar) {
        }

        private void b(b<T>.f fVar) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class f extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: k  reason: collision with root package name */
        private static final int f20130k = 0;
        private final Lock b;
        private final Condition c;

        /* renamed from: d  reason: collision with root package name */
        private Queue<b<T>.d> f20131d;

        /* renamed from: e  reason: collision with root package name */
        private Queue<b<T>.d> f20132e;

        /* renamed from: f  reason: collision with root package name */
        private Queue<Marker> f20133f;

        /* renamed from: g  reason: collision with root package name */
        private Queue<Marker> f20134g;

        /* renamed from: h  reason: collision with root package name */
        private Queue<b<T>.c> f20135h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f20136i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f20137j;

        public /* synthetic */ f(b bVar, a aVar) {
        }

        private void e() {
        }

        private void g(Marker marker) {
        }

        public void a(boolean z, b<T>.d dVar) {
        }

        public void b(g gVar, LatLng latLng, LatLng latLng2) {
        }

        public void c(g gVar, LatLng latLng, LatLng latLng2) {
        }

        public boolean d() {
        }

        public void f(boolean z, Marker marker) {
        }

        public void h() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
        }

        private f(b bVar) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private final Marker f20138a;
        private LatLng b;

        public /* synthetic */ g(Marker marker, a aVar) {
        }

        public static /* synthetic */ LatLng a(g gVar) {
        }

        public static /* synthetic */ LatLng b(g gVar, LatLng latLng) {
        }

        public static /* synthetic */ Marker c(g gVar) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        private g(Marker marker) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class h implements Runnable {
        public final Set<? extends h.u.a.c.y.e0.b.a<T>> b;
        private Runnable c;

        /* renamed from: d  reason: collision with root package name */
        private Projection f20139d;

        /* renamed from: e  reason: collision with root package name */
        private h.u.a.c.y.e0.c.c f20140e;

        /* renamed from: f  reason: collision with root package name */
        private float f20141f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f20142g;

        public /* synthetic */ h(b bVar, Set set, a aVar) {
        }

        public void a(Runnable runnable) {
        }

        public void b(float f2) {
        }

        public void c(Projection projection) {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
        }

        private h(b bVar, Set<? extends h.u.a.c.y.e0.b.a<T>> set) {
        }
    }

    public b(Context context, BaiduMap baiduMap, h.u.a.c.y.e0.b.c<T> cVar) {
    }

    private int A(int i2) {
    }

    private LayerDrawable F() {
    }

    private SquareTextView G(Context context) {
    }

    public static /* synthetic */ Set d(b bVar) {
    }

    public static /* synthetic */ Set e(b bVar, Set set) {
    }

    public static /* synthetic */ boolean f() {
    }

    public static /* synthetic */ h.u.a.c.y.e0.c.b g(List list, h.u.a.c.y.e0.c.b bVar) {
    }

    public static /* synthetic */ h.u.a.c.y.e0.b.c h(b bVar) {
    }

    public static /* synthetic */ Map i(b bVar) {
    }

    public static /* synthetic */ c.e j(b bVar) {
    }

    public static /* synthetic */ Context k(b bVar) {
    }

    public static /* synthetic */ TimeInterpolator l() {
    }

    public static /* synthetic */ e m(b bVar) {
    }

    public static /* synthetic */ c.InterfaceC0353c n(b bVar) {
    }

    public static /* synthetic */ Map o(b bVar) {
    }

    public static /* synthetic */ BaiduMap p(b bVar) {
    }

    public static /* synthetic */ float q(b bVar) {
    }

    public static /* synthetic */ float r(b bVar, float f2) {
    }

    public static /* synthetic */ Set s(b bVar) {
    }

    public static /* synthetic */ Set t(b bVar, Set set) {
    }

    private static double u(h.u.a.c.y.e0.c.b bVar, h.u.a.c.y.e0.c.b bVar2) {
    }

    private static h.u.a.c.y.e0.c.b v(List<h.u.a.c.y.e0.c.b> list, h.u.a.c.y.e0.c.b bVar) {
    }

    public Marker B(h.u.a.c.y.e0.b.a<T> aVar) {
    }

    public Marker C(T t2) {
    }

    public int[] D(h.u.a.c.y.e0.b.a<T> aVar) {
    }

    public String E(h.u.a.c.y.e0.b.a<T> aVar) {
    }

    public void H(T t2, MarkerOptions markerOptions) {
    }

    public void I(h.u.a.c.y.e0.b.a<T> aVar, MarkerOptions markerOptions) {
    }

    public void J(T t2, Marker marker) {
    }

    public void K(h.u.a.c.y.e0.b.a<T> aVar, Marker marker) {
    }

    public boolean L(h.u.a.c.y.e0.b.a<T> aVar) {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void a() {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void b() {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void c(Set<? extends h.u.a.c.y.e0.b.a<T>> set) {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void setOnClusterClickListener(c.InterfaceC0353c<T> interfaceC0353c) {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void setOnClusterInfoWindowClickListener(c.d<T> dVar) {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void setOnClusterItemClickListener(c.e<T> eVar) {
    }

    @Override // h.u.a.c.y.e0.b.e.a
    public void setOnClusterItemInfoWindowClickListener(c.f<T> fVar) {
    }

    public int w(h.u.a.c.y.e0.b.a<T> aVar) {
    }

    public h.u.a.c.y.e0.b.a<T> x(Marker marker) {
    }

    public T y(Marker marker) {
    }

    public String z(int i2) {
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class e<T> {

        /* renamed from: a  reason: collision with root package name */
        private Map<T, Marker> f20129a;
        private Map<Marker, T> b;

        private e() {
        }

        public Marker a(T t) {
        }

        public T b(Marker marker) {
        }

        public void c(T t, Marker marker) {
        }

        public void d(Marker marker) {
        }

        public /* synthetic */ e(a aVar) {
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class i extends Handler {

        /* renamed from: d  reason: collision with root package name */
        private static final int f20143d = 0;

        /* renamed from: e  reason: collision with root package name */
        private static final int f20144e = 1;

        /* renamed from: a  reason: collision with root package name */
        private boolean f20145a;
        private b<T>.h b;
        public final /* synthetic */ b c;

        /* compiled from: DefaultClusterRenderer.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a implements Runnable {
            public final /* synthetic */ i b;

            public a(i iVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        private i(b bVar) {
        }

        public void a(Set<? extends h.u.a.c.y.e0.b.a<T>> set) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        public /* synthetic */ i(b bVar, a aVar) {
        }
    }
}
