package com.tencent.qcloud.tuikit.tuicontact.ui.interfaces;

import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IContactListView {
    void onDataSourceChanged(List<ContactItemBean> list);

    void onFriendApplicationChanged();
}
