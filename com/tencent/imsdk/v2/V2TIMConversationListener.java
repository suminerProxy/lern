package com.tencent.imsdk.v2;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class V2TIMConversationListener {
    public void onConversationChanged(List<V2TIMConversation> list) {
    }

    public void onConversationGroupCreated(String str, List<V2TIMConversation> list) {
    }

    public void onConversationGroupDeleted(String str) {
    }

    public void onConversationGroupNameChanged(String str, String str2) {
    }

    public void onConversationsAddedToGroup(String str, List<V2TIMConversation> list) {
    }

    public void onConversationsDeletedFromGroup(String str, List<V2TIMConversation> list) {
    }

    public void onNewConversation(List<V2TIMConversation> list) {
    }

    public void onSyncServerFailed() {
    }

    public void onSyncServerFinish() {
    }

    public void onSyncServerStart() {
    }

    public void onTotalUnreadMessageCountChanged(long j2) {
    }
}
