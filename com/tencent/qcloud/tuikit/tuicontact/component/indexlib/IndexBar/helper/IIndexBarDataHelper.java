package com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.helper;

import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IIndexBarDataHelper {
    IIndexBarDataHelper convert(List<? extends BaseIndexPinyinBean> list);

    IIndexBarDataHelper fillInexTag(List<? extends BaseIndexPinyinBean> list);

    IIndexBarDataHelper getSortedIndexDatas(List<? extends BaseIndexPinyinBean> list, List<String> list2);

    IIndexBarDataHelper sortSourceDatas(List<? extends BaseIndexPinyinBean> list);
}
