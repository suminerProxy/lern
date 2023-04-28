package com.tencent.qcloud.tuikit.tuichat.bean.message.reply;

import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.TUIReplyQuoteView;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TUIReplyQuoteBean implements Serializable {
    public String defaultAbstract;
    private TUIMessageBean messageBean;
    public int messageType;

    public String getDefaultAbstract() {
    }

    public TUIMessageBean getMessageBean() {
    }

    public int getMessageType() {
    }

    public Class<? extends TUIReplyQuoteView> getReplyQuoteViewClass() {
    }

    public abstract void onProcessReplyQuoteBean(TUIMessageBean tUIMessageBean);

    public void setDefaultAbstract(String str) {
    }

    public void setMessageBean(TUIMessageBean tUIMessageBean) {
    }

    public void setMessageType(int i2) {
    }
}
