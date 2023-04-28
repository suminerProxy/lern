package com.tencent.qcloud.tuikit.tuichat.interfaces;

import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class C2CChatEventListener {
    public void addMessage(TUIMessageBean tUIMessageBean, String str) {
    }

    public void clearC2CMessage(String str) {
    }

    public void exitC2CChat(String str) {
    }

    public void handleRevoke(String str) {
    }

    public void onFriendNameChanged(String str, String str2) {
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
