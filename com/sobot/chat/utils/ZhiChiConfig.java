package com.sobot.chat.utils;

import com.sobot.chat.api.enumtype.CustomerState;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ZhiChiConfig implements Serializable {
    public String activityTitle;
    public String adminFace;
    public int bottomViewtype;
    public List<String> cids;
    public int currentCidPosition;
    public String currentUserName;
    public int current_client_model;
    public boolean customTimeTask;
    public CustomerState customerState;
    public boolean inPolling;
    private ZhiChiInitModeBase initModel;
    public boolean isAboveZero;
    public int isChatLock;
    public boolean isComment;
    public boolean isNoMoreHistoryMsg;
    public boolean isProcessAutoSendMsg;
    public boolean isShowQueueTip;
    public boolean isShowUnreadUi;
    private List<ZhiChiMessageBase> messageList;
    public int paseReplyTimeCustoms;
    public int paseReplyTimeUserInfo;
    public int queryCidsStatus;
    public int queueNum;
    public int remindRobotMessageTimes;
    public int showTimeVisiableCustomBtn;
    public String tempMsgContent;
    public boolean userInfoTimeTask;

    private void removeByAction(List<ZhiChiMessageBase> list, ZhiChiMessageBase zhiChiMessageBase, String str, String str2) {
    }

    public void addMessage(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void clearCache() {
    }

    public void clearInitModel() {
    }

    public void clearMessageList() {
    }

    public ZhiChiInitModeBase getInitModel() {
    }

    public List<ZhiChiMessageBase> getMessageList() {
    }

    public void hideItemTransferBtn() {
    }

    public void setInitModel(ZhiChiInitModeBase zhiChiInitModeBase) {
    }

    public void setMessageList(List<ZhiChiMessageBase> list) {
    }

    public String toString() {
    }
}
