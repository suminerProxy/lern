package com.tencent.qcloud.tuikit.tuichat.ui.interfaces;

import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IMessageAdapter {
    void onDataSourceChanged(List<TUIMessageBean> list);

    void onScrollToEnd();

    void onViewNeedRefresh(int i2, int i3);

    void onViewNeedRefresh(int i2, TUIMessageBean tUIMessageBean);
}
