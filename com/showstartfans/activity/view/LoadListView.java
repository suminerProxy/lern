package com.showstartfans.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LoadListView extends ListView {
    private BaseAdapter b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private b f6845d;

    /* renamed from: e  reason: collision with root package name */
    private AbsListView.OnScrollListener f6846e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6847f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6848g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6849h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements AbsListView.OnScrollListener {
        private int b;
        public final /* synthetic */ LoadListView c;

        public a(LoadListView loadListView) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a();
    }

    public LoadListView(Context context) {
    }

    public static /* synthetic */ AbsListView.OnScrollListener a(LoadListView loadListView) {
    }

    public static /* synthetic */ boolean b(LoadListView loadListView) {
    }

    public static /* synthetic */ BaseAdapter c(LoadListView loadListView) {
    }

    public static /* synthetic */ b d(LoadListView loadListView) {
    }

    public static /* synthetic */ boolean e(LoadListView loadListView) {
    }

    public static /* synthetic */ boolean f(LoadListView loadListView, boolean z) {
    }

    public static /* synthetic */ boolean g(LoadListView loadListView) {
    }

    private void h() {
    }

    @Override // android.widget.ListView
    public void addHeaderView(View view) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public void setAdapter(BaseAdapter baseAdapter) {
    }

    public void setIsNoMoreData(boolean z) {
    }

    public void setOnRefreshListener(b bVar) {
    }

    public void setOnScrollListener_LoadListView(AbsListView.OnScrollListener onScrollListener) {
    }

    public LoadListView(Context context, AttributeSet attributeSet) {
    }

    public LoadListView(Context context, AttributeSet attributeSet, int i2) {
    }
}
