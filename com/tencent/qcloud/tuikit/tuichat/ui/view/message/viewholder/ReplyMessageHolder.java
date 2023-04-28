package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ReplyMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TextReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.TUIReplyQuoteView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.TextReplyQuoteView;
import com.tencent.qcloud.tuikit.tuichat.util.ChatMessageParser;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ReplyMessageHolder extends MessageContentHolder {
    private View line;
    private View originMsgLayout;
    private FrameLayout quoteFrameLayout;
    private LinearLayout replyContainer;
    private TextView replyContentTv;
    private TextView senderNameTv;

    public ReplyMessageHolder(View view) {
        super(view);
        this.senderNameTv = (TextView) view.findViewById(R.id.sender_tv);
        this.replyContainer = (LinearLayout) view.findViewById(R.id.reply_container);
        this.replyContentTv = (TextView) view.findViewById(R.id.reply_content_tv);
        this.originMsgLayout = view.findViewById(R.id.origin_msg_abs_layout);
        this.quoteFrameLayout = (FrameLayout) view.findViewById(R.id.quote_frame_layout);
        this.line = view.findViewById(R.id.reply_line);
    }

    private void performMsgAbstract(ReplyMessageBean replyMessageBean, int i2) {
        TUIMessageBean originMessageBean = replyMessageBean.getOriginMessageBean();
        TUIReplyQuoteBean replyQuoteBean = replyMessageBean.getReplyQuoteBean();
        if (originMessageBean != null) {
            performQuote(replyQuoteBean, replyMessageBean);
        } else {
            performNotFound(replyQuoteBean, replyMessageBean);
        }
        this.originMsgLayout.setOnClickListener(new View.OnClickListener(this, i2, replyMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ReplyMessageHolder.4
            public final /* synthetic */ ReplyMessageHolder this$0;
            public final /* synthetic */ int val$position;
            public final /* synthetic */ ReplyMessageBean val$replyMessageBean;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }

    private void performNotFound(TUIReplyQuoteBean tUIReplyQuoteBean, ReplyMessageBean replyMessageBean) {
        String msgTypeStr = ChatMessageParser.getMsgTypeStr(tUIReplyQuoteBean.getMessageType());
        String defaultAbstract = tUIReplyQuoteBean.getDefaultAbstract();
        if (ChatMessageParser.isFileType(tUIReplyQuoteBean.getMessageType())) {
            defaultAbstract = "";
        }
        TextReplyQuoteBean textReplyQuoteBean = new TextReplyQuoteBean();
        textReplyQuoteBean.setText(msgTypeStr + defaultAbstract);
        TextReplyQuoteView textReplyQuoteView = new TextReplyQuoteView(this.itemView.getContext());
        textReplyQuoteView.onDrawReplyQuote(textReplyQuoteBean);
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            textReplyQuoteView.setSelf(replyMessageBean.isSelf());
        } else {
            textReplyQuoteView.setSelf(false);
        }
        this.quoteFrameLayout.removeAllViews();
        this.quoteFrameLayout.addView(textReplyQuoteView);
    }

    private void performQuote(TUIReplyQuoteBean tUIReplyQuoteBean, ReplyMessageBean replyMessageBean) {
        Class<? extends TUIReplyQuoteView> replyQuoteViewClass = tUIReplyQuoteBean.getReplyQuoteViewClass();
        if (replyQuoteViewClass != null) {
            TUIReplyQuoteView tUIReplyQuoteView = null;
            try {
                tUIReplyQuoteView = replyQuoteViewClass.getConstructor(Context.class).newInstance(this.itemView.getContext());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
            if (tUIReplyQuoteView != null) {
                tUIReplyQuoteView.onDrawReplyQuote(tUIReplyQuoteBean);
                this.quoteFrameLayout.removeAllViews();
                this.quoteFrameLayout.addView(tUIReplyQuoteView);
                if (!this.isForwardMode && !this.isReplyDetailMode) {
                    tUIReplyQuoteView.setSelf(replyMessageBean.isSelf());
                } else {
                    tUIReplyQuoteView.setSelf(false);
                }
            }
        }
    }

    private void setThemeColor(TUIMessageBean tUIMessageBean) {
        Context context = this.itemView.getContext();
        Resources resources = this.itemView.getResources();
        if (!this.isReplyDetailMode && !this.isForwardMode && tUIMessageBean.isSelf()) {
            this.originMsgLayout.setBackgroundColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_self_reply_quote_bg_color)));
            this.senderNameTv.setTextColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_self_reply_quote_text_color)));
            this.replyContentTv.setTextColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_self_reply_text_color)));
            this.line.setBackgroundColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_self_reply_line_bg_color)));
            return;
        }
        this.originMsgLayout.setBackgroundColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_other_reply_quote_bg_color)));
        this.senderNameTv.setTextColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_other_reply_quote_text_color)));
        this.replyContentTv.setTextColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_other_reply_text_color)));
        this.line.setBackgroundColor(resources.getColor(TUIThemeManager.getAttrResId(context, R.attr.chat_other_reply_line_bg_color)));
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_reply;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        tUIMessageBean.setSelectText(tUIMessageBean.getExtra());
        ReplyMessageBean replyMessageBean = (ReplyMessageBean) tUIMessageBean;
        String extra = replyMessageBean.getContentMessageBean().getExtra();
        String originMsgSender = replyMessageBean.getOriginMsgSender();
        TextView textView = this.senderNameTv;
        textView.setText(originMsgSender + ":");
        FaceManager.handlerEmojiText(this.replyContentTv, extra, false);
        performMsgAbstract(replyMessageBean, i2);
        this.msgArea.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ReplyMessageHolder.1
            public final /* synthetic */ ReplyMessageHolder this$0;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        });
        this.msgContentFrame.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ReplyMessageHolder.2
            public final /* synthetic */ ReplyMessageHolder this$0;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        });
        this.originMsgLayout.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.ReplyMessageHolder.3
            public final /* synthetic */ ReplyMessageHolder this$0;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        });
        setThemeColor(tUIMessageBean);
        if (this.isForwardMode || this.isReplyDetailMode) {
            return;
        }
        setSelectableTextHelper(tUIMessageBean, this.replyContentTv, i2, TextUtils.isEmpty(extra) ? false : FaceManager.handlerEmojiText(this.replyContentTv, extra, false));
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void setGravity(boolean z) {
        super.setGravity(z);
    }
}
