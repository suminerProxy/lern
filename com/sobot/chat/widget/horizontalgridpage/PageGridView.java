package com.sobot.chat.widget.horizontalgridpage;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PageGridView extends RecyclerView {
    private PageGridAdapter adapter;
    private int column;
    private int currentPage;
    private int itemHeight;
    private PagerGridLayoutManager layoutManager;
    private PageIndicatorView pageIndicatorView;
    private int row;
    private int scrollStatus;
    private float scrollX;
    private float swipeDistance;
    private int swipePercent;
    private int totalPage;
    private int validDistance;

    /* renamed from: com.sobot.chat.widget.horizontalgridpage.PageGridView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements PagerGridLayoutManager.PageListener {
        public final /* synthetic */ PageGridView this$0;

        public AnonymousClass1(PageGridView pageGridView) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager.PageListener
        public void onPageSelect(int i2) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager.PageListener
        public void onPageSizeChanged(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.widget.horizontalgridpage.PageGridView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ PageGridView this$0;
        public final /* synthetic */ int val$index;

        public AnonymousClass2(PageGridView pageGridView, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public PageGridView(Context context, int[] iArr, int i2, int i3) {
    }

    public static /* synthetic */ PagerGridLayoutManager access$000(PageGridView pageGridView) {
    }

    public static /* synthetic */ PageIndicatorView access$100(PageGridView pageGridView) {
    }

    public static /* synthetic */ int access$202(PageGridView pageGridView, int i2) {
    }

    public int getCurrentPage() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public /* bridge */ /* synthetic */ RecyclerView.LayoutManager getLayoutManager() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
    }

    public void setCurrentPage(int i2) {
    }

    public void setIndicator(PageIndicatorView pageIndicatorView) {
    }

    public void setLayoutManager(PagerGridLayoutManager pagerGridLayoutManager) {
    }

    public void setSelectItem(int i2) {
    }

    public void update() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public PagerGridLayoutManager getLayoutManager() {
    }
}
