package com.tencent.qcloud.tuikit.tuisearch.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PageRecycleView extends RecyclerView {
    public OnLoadMoreHandler mHandler;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnLoadMoreHandler {
        boolean isListEnd(int i2);

        void loadMore();
    }

    public PageRecycleView(Context context) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i2) {
    }

    public void setLoadMoreMessageHandler(OnLoadMoreHandler onLoadMoreHandler) {
    }

    public PageRecycleView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public PageRecycleView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
