package com.tencent.imsdk.group;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoModifyParam implements Serializable {
    private GroupInfo groupInfo;
    private long modifyFlag;

    public GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public long getModifyFlag() {
        return this.modifyFlag;
    }

    public void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public void setModifyFlag(long j2) {
        this.modifyFlag = j2;
    }
}
