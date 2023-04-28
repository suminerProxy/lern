package com.flyco.tablayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    private static final int D0 = 2;
    private static final int E0 = 0;
    private static final int F0 = 1;
    private static final int G0 = 2;
    private static final int W = 0;
    private static final int k0 = 1;
    private float A;
    private int B;
    private boolean C;
    private int D;
    private float E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private int P;
    private int Q;
    private boolean R;
    private float S;
    private Paint T;
    private SparseArray<Boolean> U;
    private h.k.a.b.b V;
    private Context b;
    private ViewPager c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<String> f3323d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f3324e;

    /* renamed from: f  reason: collision with root package name */
    private int f3325f;

    /* renamed from: g  reason: collision with root package name */
    private float f3326g;

    /* renamed from: h  reason: collision with root package name */
    private int f3327h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f3328i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f3329j;

    /* renamed from: k  reason: collision with root package name */
    private GradientDrawable f3330k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f3331l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f3332m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f3333n;

    /* renamed from: o  reason: collision with root package name */
    private Path f3334o;

    /* renamed from: p  reason: collision with root package name */
    private int f3335p;
    private float q;
    private boolean r;
    private float s;
    private int t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ SlidingTabLayout b;

        public a(SlidingTabLayout slidingTabLayout) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<Fragment> f3336a;
        private String[] b;
        public final /* synthetic */ SlidingTabLayout c;

        public b(SlidingTabLayout slidingTabLayout, FragmentManager fragmentManager, ArrayList<Fragment> arrayList, String[] strArr) {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i2) {
        }
    }

    public SlidingTabLayout(Context context) {
    }

    private void A() {
    }

    public static /* synthetic */ LinearLayout a(SlidingTabLayout slidingTabLayout) {
    }

    public static /* synthetic */ ViewPager b(SlidingTabLayout slidingTabLayout) {
    }

    public static /* synthetic */ boolean c(SlidingTabLayout slidingTabLayout) {
    }

    public static /* synthetic */ h.k.a.b.b d(SlidingTabLayout slidingTabLayout) {
    }

    private void f(int i2, String str, View view) {
    }

    private void g() {
    }

    private void p(Context context, AttributeSet attributeSet) {
    }

    private void q() {
    }

    private void z(int i2) {
    }

    public void e(String str) {
    }

    public int getCurrentTab() {
    }

    public int getDividerColor() {
    }

    public float getDividerPadding() {
    }

    public float getDividerWidth() {
    }

    public int getIndicatorColor() {
    }

    public float getIndicatorCornerRadius() {
    }

    public float getIndicatorHeight() {
    }

    public float getIndicatorMarginBottom() {
    }

    public float getIndicatorMarginLeft() {
    }

    public float getIndicatorMarginRight() {
    }

    public float getIndicatorMarginTop() {
    }

    public int getIndicatorStyle() {
    }

    public float getIndicatorWidth() {
    }

    public int getTabCount() {
    }

    public float getTabPadding() {
    }

    public float getTabWidth() {
    }

    public int getTextBold() {
    }

    public int getTextSelectColor() {
    }

    public int getTextUnselectColor() {
    }

    public float getTextsize() {
    }

    public float getUnSelectTextSize() {
    }

    public int getUnderlineColor() {
    }

    public float getUnderlineHeight() {
    }

    public int h(float f2) {
    }

    public MsgView i(int i2) {
    }

    public TextView j(int i2) {
    }

    public void k(int i2) {
    }

    public void m() {
    }

    public boolean n() {
    }

    public boolean o() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
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

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void r(int i2, boolean z) {
    }

    public void s(float f2, float f3, float f4, float f5) {
    }

    public void setCurrentTab(int i2) {
    }

    public void setDividerColor(int i2) {
    }

    public void setDividerPadding(float f2) {
    }

    public void setDividerWidth(float f2) {
    }

    public void setIndicatorColor(int i2) {
    }

    public void setIndicatorCornerRadius(float f2) {
    }

    public void setIndicatorGravity(int i2) {
    }

    public void setIndicatorHeight(float f2) {
    }

    public void setIndicatorStyle(int i2) {
    }

    public void setIndicatorWidth(float f2) {
    }

    public void setIndicatorWidthEqualTitle(boolean z) {
    }

    public void setOnTabSelectListener(h.k.a.b.b bVar) {
    }

    public void setSnapOnTabClick(boolean z) {
    }

    public void setTabPadding(float f2) {
    }

    public void setTabSpaceEqual(boolean z) {
    }

    public void setTabWidth(float f2) {
    }

    public void setTextAllCaps(boolean z) {
    }

    public void setTextBold(int i2) {
    }

    public void setTextSelectColor(int i2) {
    }

    public void setTextUnselectColor(int i2) {
    }

    public void setTextsize(float f2) {
    }

    public void setUnSelectTextSize(float f2) {
    }

    public void setUnderlineColor(int i2) {
    }

    public void setUnderlineGravity(int i2) {
    }

    public void setUnderlineHeight(float f2) {
    }

    public void setViewPager(ViewPager viewPager) {
    }

    public void t(int i2, float f2, float f3) {
    }

    public void u(ViewPager viewPager, String[] strArr) {
    }

    public void v(ViewPager viewPager, String[] strArr, FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
    }

    public void w(int i2) {
    }

    public void x(int i2, int i3) {
    }

    public int y(float f2) {
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
