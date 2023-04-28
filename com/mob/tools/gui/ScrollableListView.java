package com.mob.tools.gui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.mob.tools.gui.Scrollable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ScrollableListView extends ListView implements Scrollable {
    private Scrollable.OnScrollListener osListener;
    private boolean pullEnable;

    /* renamed from: com.mob.tools.gui.ScrollableListView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Scrollable.OnScrollListener {
        public final /* synthetic */ ScrollableListView this$0;

        public AnonymousClass1(ScrollableListView scrollableListView) {
        }

        @Override // com.mob.tools.gui.Scrollable.OnScrollListener
        public void onScrollChanged(Scrollable scrollable, int i2, int i3, int i4, int i5) {
        }
    }

    public ScrollableListView(Context context) {
    }

    public static /* synthetic */ boolean access$002(ScrollableListView scrollableListView, boolean z) {
    }

    private void init(Context context) {
    }

    @Override // android.widget.AbsListView, android.view.View
    public int computeVerticalScrollOffset() {
    }

    public boolean isReadyToPull() {
    }

    public ScrollableListView(Context context, AttributeSet attributeSet) {
    }

    public ScrollableListView(Context context, AttributeSet attributeSet, int i2) {
    }
}
