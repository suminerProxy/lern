package com.tencent.qcloud.tuikit.tuichat.ui.interfaces;

import android.view.View;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class OnItemClickListener {
    public void onMessageClick(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onMessageLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onReEditRevokeMessage(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onReactOnClick(String str, TUIMessageBean tUIMessageBean) {
    }

    public void onRecallClick(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onReplyDetailClick(TUIMessageBean tUIMessageBean) {
    }

    public void onReplyMessageClick(View view, int i2, QuoteMessageBean quoteMessageBean) {
    }

    public void onSendFailBtnClick(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onTextSelected(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
    }

    public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
    }
}
