package com.tencent.qcloud.tuikit.tuichat.interfaces;

import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class GroupChatEventListener {
    public void addMessage(TUIMessageBean tUIMessageBean, String str) {
    }

    public void clearGroupMessage(String str) {
    }

    public void exitGroupChat(String str) {
    }

    public void handleRevoke(String str) {
    }

    public void onApplied(int i2) {
    }

    public void onGroupForceExit(String str) {
    }

    public void onGroupNameChanged(String str, String str2) {
    }

    public void onMessageChanged(TUIMessageBean tUIMessageBean) {
    }

    public void onReadReport(List<MessageReceiptInfo> list) {
    }

    public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
    }

    public void onRecvNewMessage(TUIMessageBean tUIMessageBean) {
    }
}
