package com.sobot.chat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class DropdownListView extends ListView implements AbsListView.OnScrollListener {
    private static final int DONE = 3;
    private static final int LOADING = 4;
    private static final int PULL_To_REFRESH = 1;
    private static final int RATIO = 3;
    private static final int REFRESHING = 2;
    private static final int RELEASE_To_REFRESH = 0;
    private static final String TAG = "listview";
    private DropdownListScrollListener dropdownListScrollListener;
    private int firstItemIndex;
    private FrameLayout fl;
    private int headContentHeight;
    private int headContentWidth;
    private LinearLayout headView;
    private LayoutInflater inflater;
    private boolean isBack;
    private boolean isRecored;
    private boolean isRefreshableHeader;
    private ProgressBar progressBar;
    private boolean pullRefreshEnable;
    private OnRefreshListenerHeader refreshListenerHeader;
    private int startY;
    private int state;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface DropdownListScrollListener {
        void onScroll(AbsListView absListView, int i2, int i3, int i4);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnRefreshListenerFooter {
        void onRefresh();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnRefreshListenerHeader {
        void onRefresh();
    }

    public DropdownListView(Context context) {
    }

    private void changeHeaderViewByState() {
    }

    private void init(Context context) {
    }

    private void measureView(View view) {
    }

    private void onRefresh() {
    }

    public void onRefreshCompleteHeader() {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void setAdapter(BaseAdapter baseAdapter) {
    }

    public void setDropdownListScrollListener(DropdownListScrollListener dropdownListScrollListener) {
    }

    public void setOnRefreshListenerHead(OnRefreshListenerHeader onRefreshListenerHeader) {
    }

    public void setPullRefreshEnable(boolean z) {
    }

    public DropdownListView(Context context, AttributeSet attributeSet) {
    }
}
