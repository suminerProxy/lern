package com.tencent.qcloud.tuikit.tuichat.component.noticelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NoticeLayout extends RelativeLayout implements INoticeLayout {
    private boolean mAwaysShow;
    private TextView mContentExtraText;
    private TextView mContentText;
    private RelativeLayout mNoticeLayout;

    public NoticeLayout(Context context) {
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.noticelayout.INoticeLayout
    public void alwaysShow(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.noticelayout.INoticeLayout
    public TextView getContent() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.noticelayout.INoticeLayout
    public TextView getContentExtra() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.noticelayout.INoticeLayout
    public RelativeLayout getParentLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.noticelayout.INoticeLayout
    public void setOnNoticeClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public NoticeLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public NoticeLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
