package com.tencent.imsdk.manager;

import com.tencent.imsdk.relationship.UserInfo;
import com.tencent.imsdk.relationship.UserStatus;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface SDKListener {
    void onConnectFailed(int i2, String str);

    void onConnectSuccess();

    void onConnecting();

    void onKickedOffline();

    void onLog(int i2, String str);

    void onSelfInfoUpdated(UserInfo userInfo);

    void onUserSigExpired();

    void onUserStatusChanged(List<UserStatus> list);
}
