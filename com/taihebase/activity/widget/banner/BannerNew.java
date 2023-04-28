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
public class BannerNew extends FrameLayout implements ViewPager.OnPageChangeListener {
    private Context A;
    private BannerViewPager B;
    private LinearLayout C;
    private b D;
    private ViewPager.OnPageChangeListener E;
    private h.y.a.p.u.g.a F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private d M;
    private final Runnable N;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f8236d;

    /* renamed from: e  reason: collision with root package name */
    private int f8237e;

    /* renamed from: f  reason: collision with root package name */
    private int f8238f;

    /* renamed from: g  reason: collision with root package name */
    private int f8239g;

    /* renamed from: h  reason: collision with root package name */
    private int f8240h;

    /* renamed from: i  reason: collision with root package name */
    private int f8241i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8242j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8243k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8244l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8245m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f8246n;

    /* renamed from: o  reason: collision with root package name */
    private int f8247o;

    /* renamed from: p  reason: collision with root package name */
    private int f8248p;
    private Drawable q;
    private Drawable r;
    private int s;
    private int t;
    private int u;
    private int v;
    private List<String> w;
    private List x;
    private h.y.a.p.u.f.a y;
    private List<ImageView> z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ BannerNew b;

        public a(BannerNew bannerNew) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerNew f8249a;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements View.OnClickListener {
            public final /* synthetic */ int b;
            public final /* synthetic */ b c;

            public a(b bVar, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        private b(BannerNew bannerNew) {
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

        public /* synthetic */ b(BannerNew bannerNew, a aVar) {
        }
    }

    public BannerNew(Context context) {
    }

    private void B() {
    }

    private void D() {
    }

    private void L() {
    }

    private int Q(int i2) {
    }

    public static /* synthetic */ int a(BannerNew bannerNew) {
    }

    public static /* synthetic */ h.y.a.p.u.f.a b(BannerNew bannerNew) {
    }

    public static /* synthetic */ int c(BannerNew bannerNew, int i2) {
    }

    public static /* synthetic */ h.y.a.p.u.g.a d(BannerNew bannerNew) {
    }

    public static /* synthetic */ int e(BannerNew bannerNew) {
    }

    public static /* synthetic */ int f(BannerNew bannerNew, int i2) {
    }

    public static /* synthetic */ BannerViewPager g(BannerNew bannerNew) {
    }

    public static /* synthetic */ boolean h(BannerNew bannerNew) {
    }

    public static /* synthetic */ b i(BannerNew bannerNew) {
    }

    public static /* synthetic */ Runnable j(BannerNew bannerNew) {
    }

    public static /* synthetic */ d k(BannerNew bannerNew) {
    }

    public static /* synthetic */ int n(BannerNew bannerNew) {
    }

    public static /* synthetic */ List o(BannerNew bannerNew) {
    }

    private void p() {
    }

    private void q(Context context, AttributeSet attributeSet) {
    }

    private void r(Context context, AttributeSet attributeSet) {
    }

    private void s() {
    }

    public BannerNew A(@IntRange(from = 0) int i2) {
    }

    public BannerNew C(int i2) {
    }

    public BannerNew E(int i2, int i3) {
    }

    public BannerNew F(Drawable drawable, Drawable drawable2) {
    }

    public BannerNew G(boolean z) {
    }

    public BannerNew H(int i2) {
    }

    public BannerNew I(h.y.a.p.u.g.a aVar) {
    }

    public BannerNew J(boolean z, ViewPager.PageTransformer pageTransformer) {
    }

    public BannerNew K(List<?> list, h.y.a.p.u.f.a aVar) {
    }

    public BannerNew M(boolean z) {
    }

    public BannerNew N() {
    }

    public void O() {
    }

    public void P() {
    }

    public void R(List<?> list) {
    }

    public void S(List<?> list, List<String> list2) {
    }

    public void T(int i2) {
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

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
    }

    public boolean t() {
    }

    public boolean u() {
    }

    public void v() {
    }

    public BannerNew w(boolean z) {
    }

    public BannerNew x(Class<? extends ViewPager.PageTransformer> cls) {
    }

    public BannerNew y(int i2) {
    }

    public BannerNew z(List<String> list) {
    }

    public BannerNew(Context context, AttributeSet attributeSet) {
    }

    public BannerNew(Context context, AttributeSet attributeSet, int i2) {
    }
}
