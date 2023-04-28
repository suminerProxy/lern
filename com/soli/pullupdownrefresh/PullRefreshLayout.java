package com.soli.pullupdownrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.soli.pullupdownrefresh.Header.RefreshEyeBlinkHeader;
import com.soli.pullupdownrefresh.ptr.PtrFrameLayout;
import h.v.a.d;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PullRefreshLayout extends PtrFrameLayout implements SkinCompatSupportable {
    private AppBarLayout D0;
    private RefreshEyeBlinkHeader M;
    private d N;
    private c O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private View S;
    private float T;
    private float U;
    private int V;
    private SkinCompatBackgroundHelper W;
    private View k0;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ PullRefreshLayout c;

        public a(PullRefreshLayout pullRefreshLayout, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends h.v.a.f.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PullRefreshLayout f7748a;

        public b(PullRefreshLayout pullRefreshLayout) {
        }

        @Override // h.v.a.f.a, h.v.a.f.b
        public boolean a(PtrFrameLayout ptrFrameLayout, View view, View view2) {
        }

        @Override // h.v.a.f.b
        public void b(PtrFrameLayout ptrFrameLayout) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(boolean z);

        void b();
    }

    public PullRefreshLayout(Context context) {
    }

    public static /* synthetic */ View P(PullRefreshLayout pullRefreshLayout, View view) {
    }

    public static /* synthetic */ void Q(PullRefreshLayout pullRefreshLayout) {
    }

    public static /* synthetic */ View R(PullRefreshLayout pullRefreshLayout) {
    }

    public static /* synthetic */ c S(PullRefreshLayout pullRefreshLayout) {
    }

    private void T() {
    }

    private void U(AttributeSet attributeSet) {
    }

    private /* synthetic */ void V(boolean z) {
    }

    private void a0() {
    }

    private void b0() {
    }

    private d getLoadMoreAction() {
    }

    @Override // com.soli.pullupdownrefresh.ptr.PtrFrameLayout
    public void B() {
    }

    public /* synthetic */ void W(boolean z) {
    }

    public void X() {
    }

    public void Y() {
    }

    public void Z() {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    @Override // com.soli.pullupdownrefresh.ptr.PtrFrameLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // com.soli.pullupdownrefresh.ptr.PtrFrameLayout, android.view.View
    public void onFinishInflate() {
    }

    public void setAnimationColor(int i2) {
    }

    public void setAutoScrollAllowLoadMore(boolean z) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
    }

    public void setBarLayout(AppBarLayout appBarLayout) {
    }

    public void setCanLoadMore(boolean z) {
    }

    public void setPageSize(int i2) {
    }

    public void setPreventHortinal(boolean z) {
    }

    public void setPreventScroll(boolean z) {
    }

    public void setRefreshListener(c cVar) {
    }

    public void setView(View view) {
    }

    @Override // com.soli.pullupdownrefresh.ptr.PtrFrameLayout
    public void v(boolean z, byte b2, h.v.a.f.f.a aVar) {
    }

    public PullRefreshLayout(Context context, AttributeSet attributeSet) {
    }

    public PullRefreshLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
