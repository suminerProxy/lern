package com.tencent.qcloud.tuikit.tuigroup.ui.interfaces;

import android.content.Context;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupApplyInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IGroupApplyLayout {
    Context getContext();

    void onDataSetChanged();

    void onGroupApplyInfoListChanged(List<GroupApplyInfo> list);
}
