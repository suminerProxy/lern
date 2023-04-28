package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TextMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TextMessageHolder extends MessageContentHolder {
    public TextView msgBodyText;

    public TextMessageHolder(View view) {
        super(view);
        this.msgBodyText = (TextView) view.findViewById(R.id.msg_body_tv);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_text;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        boolean handlerEmojiText;
        if (tUIMessageBean instanceof TextMessageBean) {
            TextMessageBean textMessageBean = (TextMessageBean) tUIMessageBean;
            if (!this.isForwardMode && !this.isReplyDetailMode && textMessageBean.isSelf()) {
                this.msgBodyText.setTextColor(this.msgBodyText.getResources().getColor(TUIThemeManager.getAttrResId(this.msgBodyText.getContext(), R.attr.chat_self_msg_text_color)));
            } else {
                this.msgBodyText.setTextColor(this.msgBodyText.getResources().getColor(TUIThemeManager.getAttrResId(this.msgBodyText.getContext(), R.attr.chat_other_msg_text_color)));
            }
            this.msgBodyText.setVisibility(0);
            if (this.properties.getChatContextFontSize() != 0) {
                this.msgBodyText.setTextSize(this.properties.getChatContextFontSize());
            }
            if (textMessageBean.isSelf()) {
                if (this.properties.getRightChatContentFontColor() != 0) {
                    this.msgBodyText.setTextColor(this.properties.getRightChatContentFontColor());
                }
            } else if (this.properties.getLeftChatContentFontColor() != 0) {
                this.msgBodyText.setTextColor(this.properties.getLeftChatContentFontColor());
            }
            this.msgArea.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TextMessageHolder.1
                public final /* synthetic */ TextMessageHolder this$0;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                }
            });
            if (textMessageBean.getText() != null) {
                handlerEmojiText = FaceManager.handlerEmojiText(this.msgBodyText, textMessageBean.getText(), false);
            } else if (!TextUtils.isEmpty(textMessageBean.getExtra())) {
                handlerEmojiText = FaceManager.handlerEmojiText(this.msgBodyText, textMessageBean.getExtra(), false);
            } else {
                handlerEmojiText = FaceManager.handlerEmojiText(this.msgBodyText, ServiceInitializer.getAppContext().getString(R.string.no_support_msg), false);
            }
            if (this.isForwardMode || this.isReplyDetailMode) {
                return;
            }
            setSelectableTextHelper(tUIMessageBean, this.msgBodyText, i2, handlerEmojiText);
        }
    }
}
