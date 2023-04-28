package com.tencent.qcloud.tuikit.tuichat.component.noticelayout;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface INoticeLayout {
    void alwaysShow(boolean z);

    TextView getContent();

    TextView getContentExtra();

    RelativeLayout getParentLayout();

    void setOnNoticeClickListener(View.OnClickListener onClickListener);
}
