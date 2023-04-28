package com.tencent.imsdk.v2;

import com.tencent.imsdk.group.GroupInfo;
import com.tencent.imsdk.group.GroupInfoChangeItem;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMGroupChangeInfo implements Serializable {
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_CUSTOM = 6;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_FACE_URL = 4;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_GROUP_ADD_OPT = 11;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_INTRODUCTION = 2;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_NAME = 1;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_NOTIFICATION = 3;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_OWNER = 5;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_RECEIVE_MESSAGE_OPT = 10;
    public static final int V2TIM_GROUP_INFO_CHANGE_TYPE_SHUT_UP_ALL = 8;
    public static final int V2TIM_GROUP_INFO_INVALID = 0;
    private GroupInfoChangeItem groupInfoChangeItem = new GroupInfoChangeItem();

    public boolean getBoolValue() {
        return this.groupInfoChangeItem.getBoolValueChanged();
    }

    public GroupInfoChangeItem getGroupInfoChangeItem() {
        return this.groupInfoChangeItem;
    }

    public int getIntValue() {
        if (this.groupInfoChangeItem.getGroupInfoChangeType() == 11) {
            int intValueChanged = this.groupInfoChangeItem.getIntValueChanged();
            if (intValueChanged == GroupInfo.GROUP_ADD_OPTION_ALLOW_ANY) {
                return 2;
            }
            if (intValueChanged == GroupInfo.GROUP_ADD_OPTION_FORBID_ANY) {
                return 0;
            }
            return intValueChanged == GroupInfo.GROUP_ADD_OPTION_NEED_AUTHENTICATION ? 1 : 2;
        }
        return this.groupInfoChangeItem.getIntValueChanged();
    }

    public String getKey() {
        return this.groupInfoChangeItem.getCustomInfoKey();
    }

    public int getType() {
        return this.groupInfoChangeItem.getGroupInfoChangeType();
    }

    public String getValue() {
        return this.groupInfoChangeItem.getValueChanged();
    }

    public void setGroupInfoChangeItem(GroupInfoChangeItem groupInfoChangeItem) {
        this.groupInfoChangeItem = groupInfoChangeItem;
    }
}
