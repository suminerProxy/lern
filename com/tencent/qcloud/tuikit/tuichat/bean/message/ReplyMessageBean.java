package com.tencent.qcloud.tuikit.tuichat.bean.message;

import com.tencent.qcloud.tuikit.tuichat.bean.ReplyPreviewBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ReplyMessageBean extends QuoteMessageBean {
    private final String msgRootId;

    public ReplyMessageBean(ReplyPreviewBean replyPreviewBean) {
        super(replyPreviewBean);
        this.msgRootId = replyPreviewBean.getMessageRootID();
    }

    public String getMsgRootId() {
        return this.msgRootId;
    }
}
