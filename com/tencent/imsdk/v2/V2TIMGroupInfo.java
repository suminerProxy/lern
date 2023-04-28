package com.tencent.imsdk.v2;

import com.tencent.imsdk.group.GroupInfo;
import java.io.Serializable;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMGroupInfo implements Serializable {
    public static final String GROUP_TYPE_INTERNAL_CHATROOM = "ChatRoom";
    public static final String GROUP_TYPE_INTERNAL_PRIVATE = "Private";
    public static final int V2TIM_GROUP_ADD_ANY = 2;
    public static final int V2TIM_GROUP_ADD_AUTH = 1;
    public static final int V2TIM_GROUP_ADD_FORBID = 0;
    private final String TAG;
    private GroupInfo groupInfo;
    private int modifyFlag;

    public long getCreateTime() {
    }

    public Map<String, byte[]> getCustomInfo() {
    }

    public String getFaceUrl() {
    }

    public int getGroupAddOpt() {
    }

    public String getGroupID() {
    }

    public GroupInfo getGroupInfo() {
    }

    public String getGroupName() {
    }

    public String getGroupType() {
    }

    public String getIntroduction() {
    }

    public long getJoinTime() {
    }

    public long getLastInfoTime() {
    }

    public long getLastMessageTime() {
    }

    public int getMemberCount() {
    }

    public long getMemberMaxCount() {
    }

    public int getModifyFlag() {
    }

    public String getNotification() {
    }

    public int getOnlineCount() {
    }

    public String getOwner() {
    }

    public int getRecvOpt() {
    }

    public int getRole() {
    }

    public boolean isAllMuted() {
    }

    public boolean isSupportTopic() {
    }

    public void setAllMuted(boolean z) {
    }

    public void setCustomInfo(Map<String, byte[]> map) {
    }

    public void setFaceUrl(String str) {
    }

    public void setGroupAddOpt(int i2) {
    }

    public void setGroupID(String str) {
    }

    public void setGroupInfo(GroupInfo groupInfo) {
    }

    public void setGroupName(String str) {
    }

    public void setGroupType(String str) {
    }

    public void setIntroduction(String str) {
    }

    public void setModifyFlag(int i2) {
    }

    public void setNotification(String str) {
    }

    public void setSupportTopic(boolean z) {
    }
}
