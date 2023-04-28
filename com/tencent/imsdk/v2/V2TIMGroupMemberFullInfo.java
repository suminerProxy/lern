package com.tencent.imsdk.v2;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMGroupMemberFullInfo extends V2TIMGroupMemberInfo {
    public static final int V2TIM_GROUP_MEMBER_FILTER_ADMIN = 2;
    public static final int V2TIM_GROUP_MEMBER_FILTER_ALL = 0;
    public static final int V2TIM_GROUP_MEMBER_FILTER_COMMON = 4;
    public static final int V2TIM_GROUP_MEMBER_FILTER_OWNER = 1;
    public static final int V2TIM_GROUP_MEMBER_ROLE_ADMIN = 300;
    public static final int V2TIM_GROUP_MEMBER_ROLE_MEMBER = 200;
    public static final int V2TIM_GROUP_MEMBER_ROLE_OWNER = 400;
    public static final int V2TIM_GROUP_MEMBER_UNDEFINED = 0;
    private final String TAG;
    private long modifyFlag;

    public Map<String, byte[]> getCustomInfo() {
    }

    public long getJoinTime() {
    }

    public long getModifyFlag() {
    }

    public long getMuteUntil() {
    }

    public int getRole() {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupMemberInfo
    public String getUserID() {
    }

    public void setCustomInfo(Map<String, byte[]> map) {
    }

    public void setNameCard(String str) {
    }

    public void setReceiveMessageOpt(int i2) {
    }

    public void setRole(int i2) {
    }

    public void setShutUpTime(long j2) {
    }

    public void setUserID(String str) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupMemberInfo
    public String toString() {
    }
}
