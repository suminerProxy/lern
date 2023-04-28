package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotMuitiLeavemsgMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private ZhiChiMessageBase mMessage;
    private ProgressBar sobot_msgProgressBar;
    private ImageView sobot_msgStatus;
    private LinearLayout sobot_text_ll;

    /* renamed from: com.sobot.chat.viewHolder.SobotMuitiLeavemsgMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
        public final /* synthetic */ SobotMuitiLeavemsgMessageHolder this$0;

        public AnonymousClass1(SobotMuitiLeavemsgMessageHolder sobotMuitiLeavemsgMessageHolder) {
        }

        @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
        public void onReSend() {
        }
    }

    public SobotMuitiLeavemsgMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(SobotMuitiLeavemsgMessageHolder sobotMuitiLeavemsgMessageHolder) {
    }

    public static /* synthetic */ ZhiChiMessageBase access$100(SobotMuitiLeavemsgMessageHolder sobotMuitiLeavemsgMessageHolder) {
    }

    private void refreshUi() {
    }

    private void setMsgContent(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
