package com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces;

import android.view.View;
import com.tencent.qcloud.tuicore.component.interfaces.ILayout;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IConversationLayout extends ILayout {
    void clearConversationMessage(ConversationInfo conversationInfo);

    void clearUnreadStatusOfFoldItem();

    void deleteConversation(ConversationInfo conversationInfo);

    View getConversationList();

    void hideFoldedItem(boolean z);

    void markConversationHidden(ConversationInfo conversationInfo);

    void markConversationUnread(ConversationInfo conversationInfo, boolean z);

    void setConversationTop(ConversationInfo conversationInfo, IUIKitCallback iUIKitCallback);
}
