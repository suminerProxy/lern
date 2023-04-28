package com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TUIReplyQuoteView extends FrameLayout {
    public TUIReplyQuoteView(Context context) {
    }

    public abstract int getLayoutResourceId();

    public abstract void onDrawReplyQuote(TUIReplyQuoteBean tUIReplyQuoteBean);

    public void setSelf(boolean z) {
    }
}
