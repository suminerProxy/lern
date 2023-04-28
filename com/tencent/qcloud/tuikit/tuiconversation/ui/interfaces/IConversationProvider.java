package com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces;

import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IConversationProvider {
    boolean addConversations(List<ConversationInfo> list);

    void attachAdapter(IConversationListAdapter iConversationListAdapter);

    boolean deleteConversations(List<ConversationInfo> list);

    List<ConversationInfo> getDataSource();

    boolean updateConversations(List<ConversationInfo> list);
}
