package com.tencent.qcloud.tuikit.tuichat.ui.interfaces;

import com.tencent.qcloud.tuikit.tuichat.bean.MessageRepliesBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IReplyMessageHandler {
    void onRepliesMessageFound(Map<MessageRepliesBean.ReplyBean, TUIMessageBean> map);

    void updateData(TUIMessageBean tUIMessageBean);
}
