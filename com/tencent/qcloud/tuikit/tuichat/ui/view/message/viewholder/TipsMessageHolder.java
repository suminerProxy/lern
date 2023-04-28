package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.TUIChatConstants;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TipsMessageBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TipsMessageHolder extends MessageBaseHolder {
    public TextView mChatTipsTv;
    public TextView mReEditText;

    public TipsMessageHolder(View view) {
        super(view);
        this.mChatTipsTv = (TextView) view.findViewById(R.id.chat_tips_tv);
        this.mReEditText = (TextView) view.findViewById(R.id.re_edit);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_tips;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void layoutViews(TUIMessageBean tUIMessageBean, int i2) {
        String nameCard;
        super.layoutViews(tUIMessageBean, i2);
        if (this.properties.getTipsMessageBubble() != null) {
            this.mChatTipsTv.setBackground(this.properties.getTipsMessageBubble());
        }
        if (this.properties.getTipsMessageFontColor() != 0) {
            this.mChatTipsTv.setTextColor(this.properties.getTipsMessageFontColor());
        }
        if (this.properties.getTipsMessageFontSize() != 0) {
            this.mChatTipsTv.setTextSize(this.properties.getTipsMessageFontSize());
        }
        if (tUIMessageBean.getStatus() == 275) {
            if (tUIMessageBean.isSelf()) {
                tUIMessageBean.setExtra(ServiceInitializer.getAppContext().getString(R.string.revoke_tips_you));
            } else if (tUIMessageBean.isGroup()) {
                if (TextUtils.isEmpty(tUIMessageBean.getNameCard())) {
                    nameCard = tUIMessageBean.getSender();
                } else {
                    nameCard = tUIMessageBean.getNameCard();
                }
                String covert2HTMLString = TUIChatConstants.covert2HTMLString(nameCard);
                tUIMessageBean.setExtra(covert2HTMLString + ServiceInitializer.getAppContext().getString(R.string.revoke_tips));
            } else {
                tUIMessageBean.setExtra(ServiceInitializer.getAppContext().getString(R.string.revoke_tips_other));
            }
        }
        this.mReEditText.setVisibility(8);
        if (tUIMessageBean.getStatus() == 275) {
            if (tUIMessageBean.getExtra() != null) {
                this.mChatTipsTv.setText(Html.fromHtml(tUIMessageBean.getExtra()));
            }
            if (tUIMessageBean.isSelf() && tUIMessageBean.getMsgType() == 1) {
                if (((int) (V2TIMManager.getInstance().getServerTime() - tUIMessageBean.getMessageTime())) < 120) {
                    this.mReEditText.setVisibility(0);
                    this.mReEditText.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TipsMessageHolder.1
                        public final /* synthetic */ TipsMessageHolder this$0;
                        public final /* synthetic */ TUIMessageBean val$msg;
                        public final /* synthetic */ int val$position;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                        }
                    });
                    return;
                }
                this.mReEditText.setVisibility(8);
            }
        } else if (tUIMessageBean instanceof TipsMessageBean) {
            this.mChatTipsTv.setText(Html.fromHtml(((TipsMessageBean) tUIMessageBean).getText()));
        }
    }
}
