package com.tencent.qcloud.tuikit.tuichat.bean;

import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfo extends ChatInfo {
    public static final String GROUP_TYPE_AVCHATROOM = "AVChatRoom";
    public static final String GROUP_TYPE_COMMUNITY = "Community";
    public static final String GROUP_TYPE_MEETING = "Meeting";
    public static final String GROUP_TYPE_PUBLIC = "Public";
    public static final String GROUP_TYPE_WORK = "Work";
    private String groupName;
    private String groupType;
    private int joinType;
    private int memberCount;
    private List<GroupMemberInfo> memberDetails;
    private boolean messageReceiveOption;
    private String notice;
    private String owner;

    public GroupInfo covertTIMGroupDetailInfo(V2TIMGroupInfoResult v2TIMGroupInfoResult) {
    }

    public String getGroupName() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo
    public String getGroupType() {
    }

    public int getJoinType() {
    }

    public int getMemberCount() {
    }

    public List<GroupMemberInfo> getMemberDetails() {
    }

    public boolean getMessageReceiveOption() {
    }

    public String getNotice() {
    }

    public boolean isOwner() {
    }

    public void setGroupName(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo
    public void setGroupType(String str) {
    }

    public void setJoinType(int i2) {
    }

    public void setMemberCount(int i2) {
    }

    public void setMemberDetails(List<GroupMemberInfo> list) {
    }

    public void setMessageReceiveOption(boolean z) {
    }

    public void setNotice(String str) {
    }

    public void setOwner(String str) {
    }
}
