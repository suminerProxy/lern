package com.tencent.imsdk.group;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupMemberInfoModifyParam implements Serializable {
    private GroupMemberInfo memberInfo;
    private long modifyFlag;

    public GroupMemberInfo getMemberInfo() {
        return this.memberInfo;
    }

    public long getModifyFlag() {
        return this.modifyFlag;
    }

    public void setMemberInfo(GroupMemberInfo groupMemberInfo) {
        this.memberInfo = groupMemberInfo;
    }

    public void setModifyFlag(long j2) {
        this.modifyFlag = j2;
    }
}
