package com.showstartfans.activity.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import h.u.a.u.w3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommentCollapsingToolbarLayout extends FrameLayout {
    private AppBarLayout.OnOffsetChangedListener b;
    private WindowInsetsCompat c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements AppBarLayout.OnOffsetChangedListener {
        public final /* synthetic */ CommentCollapsingToolbarLayout b;

        private c(CommentCollapsingToolbarLayout commentCollapsingToolbarLayout) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
        }

        public /* synthetic */ c(CommentCollapsingToolbarLayout commentCollapsingToolbarLayout, a aVar) {
        }
    }

    public CommentCollapsingToolbarLayout(Context context) {
    }

    public static /* synthetic */ w3 a(CommentCollapsingToolbarLayout commentCollapsingToolbarLayout, View view) {
    }

    public static /* synthetic */ int b(CommentCollapsingToolbarLayout commentCollapsingToolbarLayout, int i2, int i3, int i4) {
    }

    private int c(int i2, int i3, int i4) {
    }

    private w3 g(View view) {
    }

    private /* synthetic */ WindowInsetsCompat h(View view, WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public b d() {
    }

    public FrameLayout.LayoutParams e(ViewGroup.LayoutParams layoutParams) {
    }

    public final int f(View view) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public /* synthetic */ WindowInsetsCompat i(View view, WindowInsetsCompat windowInsetsCompat) {
    }

    public boolean j(Object obj, Object obj2) {
    }

    public WindowInsetsCompat k(WindowInsetsCompat windowInsetsCompat) {
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

    public CommentCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public CommentCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends FrameLayout.LayoutParams {
        private static final float c = 0.5f;

        /* renamed from: d  reason: collision with root package name */
        public static final int f6612d = 0;

        /* renamed from: e  reason: collision with root package name */
        public static final int f6613e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f6614f = 2;

        /* renamed from: a  reason: collision with root package name */
        public int f6615a;
        public float b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public @interface a {
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public int a() {
        }

        public float b() {
        }

        public void c(int i2) {
        }

        public void d(float f2) {
        }

        public b(int i2, int i3) {
        }

        public b(int i2, int i3, int i4) {
        }

        public b(ViewGroup.LayoutParams layoutParams) {
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        @RequiresApi(19)
        @TargetApi(19)
        public b(FrameLayout.LayoutParams layoutParams) {
        }
    }
}
