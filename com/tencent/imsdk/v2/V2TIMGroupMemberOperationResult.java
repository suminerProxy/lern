package com.tencent.imsdk.v2;

import com.tencent.imsdk.group.GroupMemberOperationResult;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMGroupMemberOperationResult implements Serializable {
    public static final int OPERATION_RESULT_FAIL = 0;
    public static final int OPERATION_RESULT_INVALID = 2;
    public static final int OPERATION_RESULT_OVERLIMIT = 4;
    public static final int OPERATION_RESULT_PENDING = 3;
    public static final int OPERATION_RESULT_SUCC = 1;
    public GroupMemberOperationResult groupMemberOperationResult;

    public String getMemberID() {
    }

    public int getResult() {
    }

    public void setGroupMemberOperationResult(GroupMemberOperationResult groupMemberOperationResult) {
    }
}
