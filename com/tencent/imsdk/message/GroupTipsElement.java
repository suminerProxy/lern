package com.tencent.imsdk.message;

import com.tencent.imsdk.group.GroupInfoChangeItem;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.group.GroupMemberInfoChangeItem;
import com.tencent.imsdk.relationship.UserInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupTipsElement extends MessageBaseElement {
    public static final int GROUP_TIPS_TYPE_GRANT_ADMINISTRATOR = 4;
    public static final int GROUP_TIPS_TYPE_GROUP_INFO_CHANGE = 6;
    public static final int GROUP_TIPS_TYPE_GROUP_MEMBER_INFO_CHANGE = 7;
    public static final int GROUP_TIPS_TYPE_JOIN = 1;
    public static final int GROUP_TIPS_TYPE_KICK = 3;
    public static final int GROUP_TIPS_TYPE_NONE = 0;
    public static final int GROUP_TIPS_TYPE_QUIT = 2;
    public static final int GROUP_TIPS_TYPE_REVOKE_ADMINISTRATOR = 5;
    private String groupID;
    private List<GroupInfoChangeItem> groupInfoChangeItemList;
    private int groupMemberCount;
    private List<GroupMemberInfoChangeItem> groupMemberInfoChangeItemList;
    private int groupTipsType;
    private String groupType;
    private GroupMemberInfo operatorGroupMemberInfo;
    private String operatorPlatForm;
    private String operatorUserID;
    private UserInfo operatorUserInfo;
    private List<GroupMemberInfo> targetGroupMemberInfoList;
    private List<String> targetUserIDList;
    private List<UserInfo> targetUserInfoList;

    public void addGroupInfoChangeItem(GroupInfoChangeItem groupInfoChangeItem) {
    }

    public void addGroupMemberInfoChangeItem(GroupMemberInfoChangeItem groupMemberInfoChangeItem) {
    }

    public void addTargetGroupMemberInfo(GroupMemberInfo groupMemberInfo) {
    }

    public void addTargetUserID(String str) {
    }

    public void addTargetUserInfo(UserInfo userInfo) {
    }

    public String getGroupID() {
    }

    public List<GroupInfoChangeItem> getGroupInfoChangeItemList() {
    }

    public int getGroupMemberCount() {
    }

    public List<GroupMemberInfoChangeItem> getGroupMemberInfoChangeItemList() {
    }

    public int getGroupTipsType() {
    }

    public String getGroupType() {
    }

    public GroupMemberInfo getOperatorGroupMemberInfo() {
    }

    public String getOperatorPlatForm() {
    }

    public String getOperatorUserID() {
    }

    public UserInfo getOperatorUserInfo() {
    }

    public List<GroupMemberInfo> getTargetGroupMemberInfoList() {
    }

    public List<String> getTargetUserIDList() {
    }

    public List<UserInfo> getTargetUserInfoList() {
    }
}
