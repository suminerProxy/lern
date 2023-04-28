package com.tencent.qcloud.tuikit.tuigroup.bean;

import com.tencent.imsdk.v2.V2TIMGroupApplication;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupApplyInfo implements Serializable {
    public static final int APPLIED = 1;
    public static final int REFUSED = -1;
    public static final int UNHANDLED = 0;
    private int status;
    private V2TIMGroupApplication timGroupApplication;

    public GroupApplyInfo(V2TIMGroupApplication v2TIMGroupApplication) {
    }

    public String getFromUser() {
    }

    public String getFromUserNickName() {
    }

    public V2TIMGroupApplication getGroupApplication() {
    }

    public String getRequestMsg() {
    }

    public int getStatus() {
    }

    public boolean isStatusHandled() {
    }

    public void setStatus(int i2) {
    }
}
