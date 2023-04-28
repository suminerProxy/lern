package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.viewpager.widget.ViewPager;
import com.opensource.svgaplayer.SVGAImageView;
import com.showstartfans.activity.model.FindVideoChannelBean;
import h.s.a.h;
import h.s.a.j;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SlideIconXMTabLayout extends HorizontalScrollView {
    private final int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7016d;

    /* renamed from: e  reason: collision with root package name */
    private int f7017e;

    /* renamed from: f  reason: collision with root package name */
    private int f7018f;

    /* renamed from: g  reason: collision with root package name */
    private int f7019g;

    /* renamed from: h  reason: collision with root package name */
    private int f7020h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPager f7021i;

    /* renamed from: j  reason: collision with root package name */
    private final LinearLayout f7022j;

    /* renamed from: k  reason: collision with root package name */
    private List<FindVideoChannelBean> f7023k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SVGAImageView f7024a;
        public final /* synthetic */ SlideIconXMTabLayout b;

        public a(SlideIconXMTabLayout slideIconXMTabLayout, SVGAImageView sVGAImageView) {
        }

        @Override // h.s.a.h.d
        public void a(@NotNull j jVar) {
        }

        @Override // h.s.a.h.d
        public void onError() {
        }
    }

    public SlideIconXMTabLayout(Context context) {
    }

    public static /* synthetic */ List a(SlideIconXMTabLayout slideIconXMTabLayout) {
    }

    public static /* synthetic */ LinearLayout b(SlideIconXMTabLayout slideIconXMTabLayout) {
    }

    public static /* synthetic */ int c(SlideIconXMTabLayout slideIconXMTabLayout) {
    }

    public static /* synthetic */ int d(SlideIconXMTabLayout slideIconXMTabLayout) {
    }

    public static /* synthetic */ int e(SlideIconXMTabLayout slideIconXMTabLayout) {
    }

    public static /* synthetic */ int f(SlideIconXMTabLayout slideIconXMTabLayout) {
    }

    private View g(boolean z) {
    }

    private void h(Context context, AttributeSet attributeSet) {
    }

    private /* synthetic */ void i(int i2, View view) {
    }

    public /* synthetic */ void j(int i2, View view) {
    }

    public void k() {
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    public void setDataList(List<FindVideoChannelBean> list) {
    }

    public void setupWithViewPager(ViewPager viewPager) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements ViewPager.OnPageChangeListener {
        private int b;
        public final /* synthetic */ SlideIconXMTabLayout c;

        private b(SlideIconXMTabLayout slideIconXMTabLayout) {
        }

        private /* synthetic */ void a(TextView textView, float f2) {
        }

        private /* synthetic */ void c(TextView textView, float f2) {
        }

        public /* synthetic */ void b(TextView textView, float f2) {
        }

        public /* synthetic */ void d(TextView textView, float f2) {
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

        public /* synthetic */ b(SlideIconXMTabLayout slideIconXMTabLayout, a aVar) {
        }
    }

    public SlideIconXMTabLayout(Context context, AttributeSet attributeSet) {
    }

    public SlideIconXMTabLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
