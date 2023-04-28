package com.taihebase.activity.widget.indicator.recycleindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import h.y.a.p.x.a.a;
import h.y.a.p.x.a.c;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RecycleViewCircleIndicator extends h.y.a.p.x.a.a {

    /* renamed from: p  reason: collision with root package name */
    private RecyclerView f8299p;
    private SnapHelper q;
    private c r;
    private final RecyclerView.OnScrollListener s;
    private final RecyclerView.AdapterDataObserver t;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecycleViewCircleIndicator f8300a;

        public a(RecycleViewCircleIndicator recycleViewCircleIndicator) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public RecycleViewCircleIndicator(Context context) {
    }

    public static /* synthetic */ c o(RecycleViewCircleIndicator recycleViewCircleIndicator) {
    }

    public static /* synthetic */ RecyclerView p(RecycleViewCircleIndicator recycleViewCircleIndicator) {
    }

    public static /* synthetic */ void q(RecycleViewCircleIndicator recycleViewCircleIndicator) {
    }

    private void s() {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void b(int i2) {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void e(@DrawableRes int i2) {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void f(@DrawableRes int i2, @DrawableRes int i3) {
    }

    public RecyclerView.AdapterDataObserver getAdapterDataObserver() {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void i(int i2, int i3) {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void l(h.y.a.p.x.a.b bVar) {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void m(@ColorInt int i2) {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void n(@ColorInt int i2, @ColorInt int i3) {
    }

    public void r(@NonNull RecyclerView recyclerView, @NonNull SnapHelper snapHelper) {
    }

    @Override // h.y.a.p.x.a.a
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable a.InterfaceC0422a interfaceC0422a) {
    }

    public void setOnPagerSelect(c cVar) {
    }

    public int t(@Nullable RecyclerView.LayoutManager layoutManager) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends RecyclerView.AdapterDataObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecycleViewCircleIndicator f8301a;

        public b(RecycleViewCircleIndicator recycleViewCircleIndicator) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
        }
    }

    public RecycleViewCircleIndicator(Context context, AttributeSet attributeSet) {
    }

    public RecycleViewCircleIndicator(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public RecycleViewCircleIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
