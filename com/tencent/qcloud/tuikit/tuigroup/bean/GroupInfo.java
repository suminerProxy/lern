package com.tencent.qcloud.tuikit.tuigroup.bean;

import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfo extends ChatInfo {
    public static final int GROUP_MEMBER_FILTER_ADMIN = 2;
    public static final int GROUP_MEMBER_FILTER_ALL = 0;
    public static final int GROUP_MEMBER_FILTER_COMMON = 4;
    public static final int GROUP_MEMBER_FILTER_OWNER = 1;
    public static final String GROUP_TYPE_AVCHATROOM = "AVChatRoom";
    public static final String GROUP_TYPE_COMMUNITY = "Community";
    public static final String GROUP_TYPE_MEETING = "Meeting";
    public static final String GROUP_TYPE_PUBLIC = "Public";
    public static final String GROUP_TYPE_WORK = "Work";
    private boolean canManagerGroup;
    private String faceUrl;
    private String groupName;
    private String groupType;
    private boolean isAllMuted;
    private int joinType;
    private long mNextSeq;
    private int memberCount;
    private List<GroupMemberInfo> memberDetails;
    private boolean messageReceiveOption;
    private String notice;
    private String owner;

    public GroupInfo covertTIMGroupDetailInfo(V2TIMGroupInfoResult v2TIMGroupInfoResult) {
    }

    public String getFaceUrl() {
    }

    public String getGroupName() {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.bean.ChatInfo
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

    public long getNextSeq() {
    }

    public String getNotice() {
    }

    public boolean isAllMuted() {
    }

    public boolean isCanManagerGroup() {
    }

    public boolean isOwner() {
    }

    public void setFaceUrl(String str) {
    }

    public void setGroupName(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.bean.ChatInfo
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

    public void setNextSeq(long j2) {
    }

    public void setNotice(String str) {
    }

    public void setOwner(String str) {
    }
}
