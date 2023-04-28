package com.tencent.imsdk.v2;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class V2TIMConversationManager {
    public static V2TIMConversationManager getInstance() {
        return V2TIMConversationManagerImpl.getInstance();
    }

    public abstract void addConversationListener(V2TIMConversationListener v2TIMConversationListener);

    public abstract void addConversationsToGroup(String str, List<String> list, V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback);

    public abstract void createConversationGroup(String str, List<String> list, V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback);

    public abstract void deleteConversation(String str, V2TIMCallback v2TIMCallback);

    public abstract void deleteConversationGroup(String str, V2TIMCallback v2TIMCallback);

    public abstract void deleteConversationsFromGroup(String str, List<String> list, V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback);

    public abstract void getConversation(String str, V2TIMValueCallback<V2TIMConversation> v2TIMValueCallback);

    public abstract void getConversationGroupList(V2TIMValueCallback<List<String>> v2TIMValueCallback);

    public abstract void getConversationList(long j2, int i2, V2TIMValueCallback<V2TIMConversationResult> v2TIMValueCallback);

    public abstract void getConversationList(List<String> list, V2TIMValueCallback<List<V2TIMConversation>> v2TIMValueCallback);

    public abstract void getConversationListByFilter(V2TIMConversationListFilter v2TIMConversationListFilter, V2TIMValueCallback<V2TIMConversationResult> v2TIMValueCallback);

    public abstract void getTotalUnreadMessageCount(V2TIMValueCallback<Long> v2TIMValueCallback);

    public abstract void markConversation(List<String> list, long j2, boolean z, V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback);

    public abstract void pinConversation(String str, boolean z, V2TIMCallback v2TIMCallback);

    public abstract void removeConversationListener(V2TIMConversationListener v2TIMConversationListener);

    public abstract void renameConversationGroup(String str, String str2, V2TIMCallback v2TIMCallback);

    public abstract void setConversationCustomData(List<String> list, String str, V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback);

    public abstract void setConversationDraft(String str, String str2, V2TIMCallback v2TIMCallback);

    @Deprecated
    public abstract void setConversationListener(V2TIMConversationListener v2TIMConversationListener);
}
