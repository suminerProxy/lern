package com.tencent.imsdk.message;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class MessageListener {
    public void onReceiveC2CMessageReceipt(List<C2CMessageReceipt> list) {
    }

    public void onReceiveGroupMessageReceipt(List<GroupMessageReceipt> list) {
    }

    public void onReceiveMessageExtensionsChanged(MessageKey messageKey, List<MessageExtension> list) {
    }

    public void onReceiveMessageExtensionsDeleted(MessageKey messageKey, List<MessageExtension> list) {
    }

    public void onReceiveMessageModified(List<Message> list) {
    }

    public void onReceiveMessageRevoked(List<MessageKey> list) {
    }

    public void onReceiveNewMessage(List<Message> list) {
    }
}
