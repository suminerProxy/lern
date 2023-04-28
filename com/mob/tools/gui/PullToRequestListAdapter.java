package com.mob.tools.gui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import android.widget.ListView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class PullToRequestListAdapter extends PullToRequestBaseListAdapter {
    private PullToRequestBaseAdapter adapter;
    private boolean fling;
    private ScrollableListView listView;
    private OnListStopScrollListener osListener;
    private boolean pullUpReady;

    /* renamed from: com.mob.tools.gui.PullToRequestListAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements AbsListView.OnScrollListener {
        private int firstVisibleItem;
        public final /* synthetic */ PullToRequestListAdapter this$0;
        private int visibleItemCount;

        public AnonymousClass1(PullToRequestListAdapter pullToRequestListAdapter) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    public PullToRequestListAdapter(PullToRequestView pullToRequestView) {
    }

    public static /* synthetic */ boolean access$002(PullToRequestListAdapter pullToRequestListAdapter, boolean z) {
    }

    public static /* synthetic */ OnListStopScrollListener access$100(PullToRequestListAdapter pullToRequestListAdapter) {
    }

    public static /* synthetic */ PullToRequestBaseAdapter access$200(PullToRequestListAdapter pullToRequestListAdapter) {
    }

    public static /* synthetic */ boolean access$302(PullToRequestListAdapter pullToRequestListAdapter, boolean z) {
    }

    public static /* synthetic */ ScrollableListView access$400(PullToRequestListAdapter pullToRequestListAdapter) {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public Scrollable getBodyView() {
    }

    public ListView getListView() {
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

    public ScrollableListView onNewListView(Context context) {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public void onScroll(Scrollable scrollable, int i2, int i3, int i4) {
    }

    public void setDivider(Drawable drawable) {
    }

    public void setDividerHeight(int i2) {
    }
}
