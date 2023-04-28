package com.tencent.imsdk.v2;

import com.tencent.imsdk.relationship.FriendCheckResult;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMFriendCheckResult implements Serializable {
    public static final int V2TIM_FRIEND_RELATION_TYPE_BOTH_WAY = 3;
    public static final int V2TIM_FRIEND_RELATION_TYPE_IN_MY_FRIEND_LIST = 1;
    public static final int V2TIM_FRIEND_RELATION_TYPE_IN_OTHER_FRIEND_LIST = 2;
    public static final int V2TIM_FRIEND_RELATION_TYPE_NONE = 0;
    private FriendCheckResult friendCheckResult;

    public int getResultCode() {
    }

    public String getResultInfo() {
    }

    public int getResultType() {
    }

    public String getUserID() {
    }

    public void setFriendCheckResult(FriendCheckResult friendCheckResult) {
    }
}
