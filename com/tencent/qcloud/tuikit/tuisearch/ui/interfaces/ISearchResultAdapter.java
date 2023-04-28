package com.tencent.qcloud.tuikit.tuisearch.ui.interfaces;

import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ISearchResultAdapter {
    void onDataSourceChanged(List<SearchDataBean> list, int i2);

    void onIsShowAllChanged(boolean z);

    void onTotalCountChanged(int i2);
}
