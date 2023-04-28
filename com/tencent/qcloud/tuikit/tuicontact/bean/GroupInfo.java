package com.tencent.qcloud.tuikit.tuicontact.bean;

import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfo extends ChatInfo {
    public static final int ERR_SVR_GROUP_ALLREADY_MEMBER = 10013;
    public static final int ERR_SVR_GROUP_FULL_MEMBER_COUNT = 10014;
    public static final int ERR_SVR_GROUP_NOT_FOUND = 10010;
    public static final int ERR_SVR_GROUP_PERMISSION_DENY = 10007;
    private boolean communitySupportTopic;
    private String faceUrl;
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

    public String getFaceUrl() {
    }

    public String getGroupName() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.bean.ChatInfo
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

    public boolean isCommunitySupportTopic() {
    }

    public boolean isOwner() {
    }

    public void setCommunitySupportTopic(boolean z) {
    }

    public void setFaceUrl(String str) {
    }

    public void setGroupName(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.bean.ChatInfo
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
