package com.tencent.imsdk.relationship;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class FriendshipListener {
    public void OnBlackListAdded(List<FriendInfo> list) {
    }

    public void OnBlackListDeleted(List<String> list) {
    }

    public void OnFriendApplicationListAdded(List<FriendApplication> list) {
    }

    public void OnFriendApplicationListDelete(List<String> list) {
    }

    public void OnFriendApplicationListRead() {
    }

    public void OnFriendInfoChanged(List<FriendInfo> list) {
    }

    public void OnFriendListAdded(List<FriendInfo> list) {
    }

    public void OnFriendListDeleted(List<String> list) {
    }

    public void OnSelfInfoUpdated(UserInfo userInfo) {
    }

    public void OnUserStatusChanged(List<UserStatus> list) {
    }
}
