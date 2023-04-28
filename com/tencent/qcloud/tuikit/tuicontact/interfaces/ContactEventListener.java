package com.tencent.qcloud.tuikit.tuicontact.interfaces;

import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ContactEventListener {
    public void onBlackListAdd(List<ContactItemBean> list) {
    }

    public void onBlackListDeleted(List<String> list) {
    }

    public void onFriendApplicationListAdded(List<FriendApplicationBean> list) {
    }

    public void onFriendApplicationListDeleted(List<String> list) {
    }

    public void onFriendApplicationListRead() {
    }

    public void onFriendInfoChanged(List<ContactItemBean> list) {
    }

    public void onFriendListAdded(List<ContactItemBean> list) {
    }

    public void onFriendListDeleted(List<String> list) {
    }

    public void onFriendRemarkChanged(String str, String str2) {
    }

    public void onUserStatusChanged(List<V2TIMUserStatus> list) {
    }

    public void refreshUserStatusFragmentUI() {
    }
}
