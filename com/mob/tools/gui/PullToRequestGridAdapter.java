package com.mob.tools.gui;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.GridView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class PullToRequestGridAdapter extends PullToRequestBaseListAdapter {
    private PullToRequestBaseAdapter adapter;
    private boolean fling;
    private ScrollableGridView gridView;
    private OnListStopScrollListener osListener;
    private boolean pullUpReady;

    /* renamed from: com.mob.tools.gui.PullToRequestGridAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements AbsListView.OnScrollListener {
        private int firstVisibleItem;
        public final /* synthetic */ PullToRequestGridAdapter this$0;
        private int visibleItemCount;

        public AnonymousClass1(PullToRequestGridAdapter pullToRequestGridAdapter) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    public PullToRequestGridAdapter(PullToRequestView pullToRequestView) {
    }

    public static /* synthetic */ boolean access$002(PullToRequestGridAdapter pullToRequestGridAdapter, boolean z) {
    }

    public static /* synthetic */ OnListStopScrollListener access$100(PullToRequestGridAdapter pullToRequestGridAdapter) {
    }

    public static /* synthetic */ PullToRequestBaseAdapter access$200(PullToRequestGridAdapter pullToRequestGridAdapter) {
    }

    public static /* synthetic */ boolean access$302(PullToRequestGridAdapter pullToRequestGridAdapter, boolean z) {
    }

    public static /* synthetic */ ScrollableGridView access$400(PullToRequestGridAdapter pullToRequestGridAdapter) {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public Scrollable getBodyView() {
    }

    public GridView getGridView() {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public boolean isFling() {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public boolean isPullDownReady() {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public boolean isPullUpReady() {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void notifyDataSetChanged() {
    }

    public ScrollableGridView onNewGridView(Context context) {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public void onScroll(Scrollable scrollable, int i2, int i3, int i4) {
    }

    public void setColumnWidth(int i2) {
    }

    public void setHorizontalSpacing(int i2) {
    }

    public void setNumColumns(int i2) {
    }

    public void setStretchMode(int i2) {
    }

    public void setVerticalSpacing(int i2) {
    }
}
