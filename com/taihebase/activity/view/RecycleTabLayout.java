package com.taihebase.activity.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RecycleTabLayout extends RecyclerView {
    public static final long B = 200;
    public static final float C = 0.6f;
    public static final float D = 0.001f;
    public boolean A;
    public Paint b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f8017d;

    /* renamed from: e  reason: collision with root package name */
    public int f8018e;

    /* renamed from: f  reason: collision with root package name */
    public int f8019f;

    /* renamed from: g  reason: collision with root package name */
    public int f8020g;

    /* renamed from: h  reason: collision with root package name */
    public int f8021h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8022i;

    /* renamed from: j  reason: collision with root package name */
    public int f8023j;

    /* renamed from: k  reason: collision with root package name */
    public int f8024k;

    /* renamed from: l  reason: collision with root package name */
    public int f8025l;

    /* renamed from: m  reason: collision with root package name */
    public int f8026m;

    /* renamed from: n  reason: collision with root package name */
    public int f8027n;

    /* renamed from: o  reason: collision with root package name */
    public LinearLayoutManager f8028o;

    /* renamed from: p  reason: collision with root package name */
    public e f8029p;
    public ViewPager q;
    public c<?> r;
    public int s;
    public int t;
    public int u;
    private int v;
    private int w;
    public float x;
    public float y;
    public boolean z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class TabTextView extends AppCompatTextView {
        public TabTextView(Context context) {
        }

        public ColorStateList a(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecycleTabLayout f8030a;

        public a(RecycleTabLayout recycleTabLayout, Context context) {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ RecycleTabLayout c;

        public b(RecycleTabLayout recycleTabLayout, int i2) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class c<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public ViewPager f8031a;
        public int b;

        public c(ViewPager viewPager) {
        }

        public int c() {
        }

        public ViewPager d() {
        }

        public void e(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d extends c<a> {

        /* renamed from: n  reason: collision with root package name */
        public static final int f8032n = 2;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f8033d;

        /* renamed from: e  reason: collision with root package name */
        public int f8034e;

        /* renamed from: f  reason: collision with root package name */
        public int f8035f;

        /* renamed from: g  reason: collision with root package name */
        public int f8036g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8037h;

        /* renamed from: i  reason: collision with root package name */
        public int f8038i;

        /* renamed from: j  reason: collision with root package name */
        private int f8039j;

        /* renamed from: k  reason: collision with root package name */
        private int f8040k;

        /* renamed from: l  reason: collision with root package name */
        private int f8041l;

        /* renamed from: m  reason: collision with root package name */
        private int f8042m;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public TextView f8043a;
            public final /* synthetic */ d b;

            /* renamed from: com.taihebase.activity.view.RecycleTabLayout$d$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public class View$OnClickListenerC0148a implements View.OnClickListener {
                public final /* synthetic */ d b;
                public final /* synthetic */ a c;

                public View$OnClickListenerC0148a(a aVar, d dVar) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }

            public a(d dVar, View view) {
            }
        }

        public d(ViewPager viewPager) {
        }

        public RecyclerView.LayoutParams f() {
        }

        public void g(a aVar, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        public a h(ViewGroup viewGroup, int i2) {
        }

        public void i(int i2) {
        }

        public void j(int i2) {
        }

        public void k(int i2) {
        }

        public void l(int i2) {
        }

        public void m(int i2, int i3, int i4, int i5) {
        }

        public void n(boolean z, int i2) {
        }

        public void o(int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class e extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public RecycleTabLayout f8044a;
        public LinearLayoutManager b;
        public int c;

        public e(RecycleTabLayout recycleTabLayout, LinearLayoutManager linearLayoutManager) {
        }

        public void a() {
        }

        public void b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class f implements ViewPager.OnPageChangeListener {
        private final RecycleTabLayout b;
        private int c;

        public f(RecycleTabLayout recycleTabLayout) {
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
    }

    public RecycleTabLayout(Context context) {
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
    }

    public boolean b() {
    }

    public void c(int i2) {
    }

    public void d(int i2, float f2, boolean z) {
    }

    public void e(int i2, boolean z) {
    }

    public void f(int i2) {
    }

    public void g(int i2, float f2, float f3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setAutoSelectionMode(boolean z) {
    }

    public void setIndicatorColor(int i2) {
    }

    public void setIndicatorHeight(int i2) {
    }

    public void setPositionThreshold(float f2) {
    }

    public void setUpWithAdapter(c<?> cVar) {
    }

    public void setUpWithViewPager(ViewPager viewPager) {
    }

    public RecycleTabLayout(Context context, AttributeSet attributeSet) {
    }

    public RecycleTabLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
