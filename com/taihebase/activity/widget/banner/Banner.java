package com.taihebase.activity.widget.banner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.IntRange;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.taihebase.activity.widget.banner.view.BannerViewPager;
import h.y.a.p.u.d;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Banner extends FrameLayout implements ViewPager.OnPageChangeListener {
    private b A;
    private ViewPager.OnPageChangeListener B;
    private h.y.a.p.u.g.a C;
    private int D;
    private int E;
    private d F;
    private final Runnable G;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f8222d;

    /* renamed from: e  reason: collision with root package name */
    private int f8223e;

    /* renamed from: f  reason: collision with root package name */
    private int f8224f;

    /* renamed from: g  reason: collision with root package name */
    private int f8225g;

    /* renamed from: h  reason: collision with root package name */
    private int f8226h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8227i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8228j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8229k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8230l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8231m;

    /* renamed from: n  reason: collision with root package name */
    private int f8232n;

    /* renamed from: o  reason: collision with root package name */
    private int f8233o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f8234p;
    private Drawable q;
    private int r;
    private int s;
    private int t;
    private List u;
    private h.y.a.p.u.f.a v;
    private List<ImageView> w;
    private Context x;
    private BannerViewPager y;
    private LinearLayout z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ Banner b;

        public a(Banner banner) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Banner f8235a;

        private b(Banner banner) {
        }

        private /* synthetic */ void c(int i2, View view) {
        }

        public /* synthetic */ void d(int i2, View view) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
        }

        public /* synthetic */ b(Banner banner, a aVar) {
        }
    }

    public Banner(Context context) {
    }

    private void B() {
    }

    private void D() {
    }

    private void M() {
    }

    private int R(int i2) {
    }

    public static /* synthetic */ int a(Banner banner) {
    }

    public static /* synthetic */ h.y.a.p.u.f.a b(Banner banner) {
    }

    public static /* synthetic */ int c(Banner banner, int i2) {
    }

    public static /* synthetic */ h.y.a.p.u.g.a d(Banner banner) {
    }

    public static /* synthetic */ int e(Banner banner) {
    }

    public static /* synthetic */ int f(Banner banner, int i2) {
    }

    public static /* synthetic */ BannerViewPager g(Banner banner) {
    }

    public static /* synthetic */ b h(Banner banner) {
    }

    public static /* synthetic */ boolean i(Banner banner) {
    }

    public static /* synthetic */ Runnable j(Banner banner) {
    }

    public static /* synthetic */ d k(Banner banner) {
    }

    public static /* synthetic */ int n(Banner banner) {
    }

    public static /* synthetic */ List o(Banner banner) {
    }

    private void p() {
    }

    private void q(Context context, AttributeSet attributeSet) {
    }

    private void r(Context context, AttributeSet attributeSet) {
    }

    private void s() {
    }

    public Banner A(@IntRange(from = 0) int i2) {
    }

    public Banner C(int i2) {
    }

    public Banner E(int i2, int i3) {
    }

    public Banner F(Drawable drawable, Drawable drawable2) {
    }

    public Banner G(boolean z) {
    }

    public Banner H(int i2) {
    }

    public Banner I(h.y.a.p.u.g.a aVar) {
    }

    public Banner J(ViewPager.OnPageChangeListener onPageChangeListener) {
    }

    public Banner K(boolean z, ViewPager.PageTransformer pageTransformer) {
    }

    public Banner L(List<?> list, h.y.a.p.u.f.a aVar) {
    }

    public Banner N(boolean z) {
    }

    public Banner O() {
    }

    public void P() {
    }

    public void Q() {
    }

    public void S(List<?> list) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
    }

    public boolean t() {
    }

    public boolean u() {
    }

    public boolean v() {
    }

    public void w() {
    }

    public Banner x(boolean z) {
    }

    public Banner y(Class<? extends ViewPager.PageTransformer> cls) {
    }

    public Banner z(int i2) {
    }

    public Banner(Context context, AttributeSet attributeSet) {
    }

    public Banner(Context context, AttributeSet attributeSet, int i2) {
    }
}
