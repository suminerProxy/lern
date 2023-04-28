package com.tencent.imsdk.group;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupMemberOperationResult implements Serializable {
    public static int OPERATION_RESULT_FAIL = 1;
    public static int OPERATION_RESULT_INVALID = 3;
    public static int OPERATION_RESULT_OVERLIMIT = 5;
    public static int OPERATION_RESULT_PENDING = 4;
    public static int OPERATION_RESULT_SUCCESS = 2;
    private int status;
    private String userID;

    public int getStatus() {
    }

    public String getUserID() {
    }
}
