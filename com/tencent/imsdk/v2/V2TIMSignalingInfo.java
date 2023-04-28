package com.tencent.imsdk.v2;

import com.tencent.imsdk.signaling.SignalingInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMSignalingInfo implements Serializable {
    public static final int SIGNALING_ACTION_TYPE_ACCEPT_INVITE = 3;
    public static final int SIGNALING_ACTION_TYPE_CANCEL_INVITE = 2;
    public static final int SIGNALING_ACTION_TYPE_INVITE = 1;
    public static final int SIGNALING_ACTION_TYPE_INVITE_TIMEOUT = 5;
    public static final int SIGNALING_ACTION_TYPE_REJECT_INVITE = 4;
    private SignalingInfo signalingInfo;

    public int getActionType() {
    }

    public String getData() {
    }

    public String getGroupID() {
    }

    public String getInviteID() {
    }

    public List<String> getInviteeList() {
    }

    public String getInviter() {
    }

    public SignalingInfo getSignalingInfo() {
    }

    public int getTimeout() {
    }

    public void setActionType(int i2) {
    }

    public void setData(String str) {
    }

    public void setGroupID(String str) {
    }

    public void setInviteID(String str) {
    }

    public void setInviteeList(List<String> list) {
    }

    public void setInviter(String str) {
    }

    public void setSignalingInfo(SignalingInfo signalingInfo) {
    }

    public void setTimeout(int i2) {
    }
}
