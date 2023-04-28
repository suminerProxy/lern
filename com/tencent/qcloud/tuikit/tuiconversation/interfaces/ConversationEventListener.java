package com.tencent.qcloud.tuikit.tuiconversation.interfaces;

import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ConversationEventListener {
    void clearConversationMessage(String str, boolean z);

    void clearFoldMarkAndDeleteConversation(String str);

    void deleteConversation(String str, boolean z);

    long getUnreadTotal();

    boolean isTopConversation(String str);

    void onConversationChanged(List<ConversationInfo> list);

    void onFriendRemarkChanged(String str, String str2);

    void onNewConversation(List<ConversationInfo> list);

    void onReceiveMessage(String str, boolean z);

    void onSyncServerFinish();

    void onUserStatusChanged(List<V2TIMUserStatus> list);

    void refreshUserStatusFragmentUI();

    void setConversationTop(String str, boolean z, IUIKitCallback<Void> iUIKitCallback);

    void updateTotalUnreadMessageCount(long j2);
}
