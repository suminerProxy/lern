package com.sobot.chat.widget.horizontalgridpage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HorizontalGridPage extends LinearLayout {
    public int currentIndex;
    public PageGridView gridView;
    public PageIndicatorView indicatorView;
    public Context mContext;

    public HorizontalGridPage(Context context) {
    }

    private int dip2px(int i2) {
    }

    public void init(PageBuilder pageBuilder, int i2) {
    }

    public boolean isFirstPage() {
    }

    public boolean isLastPage() {
    }

    public void selectCurrentItem() {
    }

    public void selectLastPage() {
    }

    public void selectPreviousPage() {
    }

    public void setAdapter(PageGridAdapter pageGridAdapter, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void setPageListener(PagerGridLayoutManager.PageListener pageListener) {
    }

    public void setSelectItem(int i2) {
    }

    public HorizontalGridPage(Context context, AttributeSet attributeSet) {
    }

    public HorizontalGridPage(Context context, AttributeSet attributeSet, int i2) {
    }
}
