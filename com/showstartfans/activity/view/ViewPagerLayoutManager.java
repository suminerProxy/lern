package com.showstartfans.activity.view;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ViewPagerLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private PagerSnapHelper f7099a;
    private b b;
    private RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    private int f7100d;

    /* renamed from: e  reason: collision with root package name */
    private int f7101e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.OnChildAttachStateChangeListener f7102f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements RecyclerView.OnChildAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewPagerLayoutManager f7103a;

        public a(ViewPagerLayoutManager viewPagerLayoutManager) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a(int i2, boolean z);

        void onInitComplete();

        void onPageRelease(boolean z, int i2);
    }

    public ViewPagerLayoutManager(Context context, int i2) {
    }

    public static /* synthetic */ b i(ViewPagerLayoutManager viewPagerLayoutManager) {
    }

    private void init() {
    }

    public static /* synthetic */ int j(ViewPagerLayoutManager viewPagerLayoutManager) {
    }

    public void k(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i2) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    public void setOnViewPagerListener(b bVar) {
    }

    public ViewPagerLayoutManager(Context context, int i2, boolean z) {
    }
}
