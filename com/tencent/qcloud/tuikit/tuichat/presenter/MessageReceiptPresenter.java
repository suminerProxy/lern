package com.tencent.qcloud.tuikit.tuichat.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.GroupMessageReadMembersInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.model.ChatProvider;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageReceiptPresenter {
    public static final int GET_MEMBERS_COUNT = 100;
    private final ChatProvider provider;

    public void getGroupMessageReadMembers(TUIMessageBean tUIMessageBean, boolean z, long j2, IUIKitCallback<GroupMessageReadMembersInfo> iUIKitCallback) {
    }

    public void getGroupMessageReadReceipt(TUIMessageBean tUIMessageBean, IUIKitCallback<List<MessageReceiptInfo>> iUIKitCallback) {
    }
}
