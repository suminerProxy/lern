package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.taihebase.activity.widget.Toolbar;
import h.u.a.u.w3;
import h.y.a.p.s;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MyCollapsingToolbarLayout extends FrameLayout {
    private AppBarLayout.OnOffsetChangedListener b;
    private WindowInsetsCompat c;

    /* renamed from: d  reason: collision with root package name */
    private Toolbar f6861d;

    /* renamed from: e  reason: collision with root package name */
    private int f6862e;

    /* renamed from: f  reason: collision with root package name */
    private int f6863f;

    /* renamed from: g  reason: collision with root package name */
    private c f6864g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements AppBarLayout.OnOffsetChangedListener {
        public final /* synthetic */ MyCollapsingToolbarLayout b;

        private b(MyCollapsingToolbarLayout myCollapsingToolbarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
        }

        public /* synthetic */ b(MyCollapsingToolbarLayout myCollapsingToolbarLayout, a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(int i2, AppBarLayout appBarLayout, int i3);
    }

    public MyCollapsingToolbarLayout(Context context) {
    }

    public static /* synthetic */ w3 a(MyCollapsingToolbarLayout myCollapsingToolbarLayout, View view) {
    }

    public static /* synthetic */ int b(MyCollapsingToolbarLayout myCollapsingToolbarLayout, int i2, int i3, int i4) {
    }

    public static /* synthetic */ int c(MyCollapsingToolbarLayout myCollapsingToolbarLayout) {
    }

    public static /* synthetic */ int d(MyCollapsingToolbarLayout myCollapsingToolbarLayout, int i2) {
    }

    public static /* synthetic */ int e(MyCollapsingToolbarLayout myCollapsingToolbarLayout, double d2, int i2) {
    }

    public static /* synthetic */ Toolbar f(MyCollapsingToolbarLayout myCollapsingToolbarLayout) {
    }

    public static /* synthetic */ c g(MyCollapsingToolbarLayout myCollapsingToolbarLayout) {
    }

    private int h(int i2, int i3, int i4) {
    }

    private int k(double d2, int i2) {
    }

    private w3 m(View view) {
    }

    private /* synthetic */ WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public s i() {
    }

    public FrameLayout.LayoutParams j(ViewGroup.LayoutParams layoutParams) {
    }

    public final int l(View view) {
    }

    public /* synthetic */ WindowInsetsCompat o(View view, WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public boolean p(Object obj, Object obj2) {
    }

    public WindowInsetsCompat q(WindowInsetsCompat windowInsetsCompat) {
    }

    public void setAddHeight(int i2) {
    }

    public void setHeightRange(int i2) {
    }

    public void setOffsetUpdateListenerMine(c cVar) {
    }

    public MyCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public MyCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }
}
