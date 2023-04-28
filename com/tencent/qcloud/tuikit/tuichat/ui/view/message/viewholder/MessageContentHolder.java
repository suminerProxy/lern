package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuicore.component.gatherimage.UserIconView;
import com.tencent.qcloud.tuicore.util.DateTimeUtil;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReactBean;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageRepliesBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.config.TUIChatConfigs;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class MessageContentHolder extends MessageBaseHolder {
    public boolean isForwardMode;
    public boolean isMultiSelectMode;
    public TextView isReadText;
    public boolean isReplyDetailMode;
    public UserIconView leftUserIcon;
    private List<TUIMessageBean> mDataSource;
    public TextView messageDetailsTimeTv;
    public LinearLayout msgContentLinear;
    public ChatPresenter presenter;
    public UserIconView rightUserIcon;
    public SelectTextHelper selectableTextHelper;
    public ProgressBar sendingProgress;
    public ImageView statusImage;
    public TextView unreadAudioText;
    public TextView usernameText;

    public MessageContentHolder(View view) {
        super(view);
        this.isForwardMode = false;
        this.isReplyDetailMode = false;
        this.isMultiSelectMode = false;
        this.mDataSource = new ArrayList();
        this.leftUserIcon = (UserIconView) view.findViewById(R.id.left_user_icon_view);
        this.rightUserIcon = (UserIconView) view.findViewById(R.id.right_user_icon_view);
        this.usernameText = (TextView) view.findViewById(R.id.user_name_tv);
        this.msgContentLinear = (LinearLayout) view.findViewById(R.id.msg_content_ll);
        this.statusImage = (ImageView) view.findViewById(R.id.message_status_iv);
        this.sendingProgress = (ProgressBar) view.findViewById(R.id.message_sending_pb);
        this.isReadText = (TextView) view.findViewById(R.id.is_read_tv);
        this.unreadAudioText = (TextView) view.findViewById(R.id.audio_unread);
        this.messageDetailsTimeTv = (TextView) view.findViewById(R.id.msg_detail_time_tv);
    }

    private void setReactContent(TUIMessageBean tUIMessageBean) {
        MessageReactBean messageReactBean = tUIMessageBean.getMessageReactBean();
        if (messageReactBean != null && messageReactBean.getReactSize() > 0) {
            this.reactView.setVisibility(0);
            this.reactView.setData(messageReactBean);
            this.reactView.setOnLongClickListener(new View.OnLongClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.10
                public final /* synthetic */ MessageContentHolder this$0;
                public final /* synthetic */ TUIMessageBean val$messageBean;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                }
            });
            if (!this.isForwardMode) {
                this.reactView.setReactOnClickListener(new ChatFlowReactView.ReactOnClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.11
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$messageBean;

                    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView.ReactOnClickListener
                    public void onClick(String str) {
                    }
                });
            } else {
                this.reactView.setOnLongClickListener(null);
            }
        } else {
            this.reactView.setVisibility(8);
            this.reactView.setOnLongClickListener(null);
        }
        if (tUIMessageBean.isSelf() && !this.isForwardMode && !this.isReplyDetailMode) {
            this.reactView.setThemeColorId(0);
            return;
        }
        ChatFlowReactView chatFlowReactView = this.reactView;
        chatFlowReactView.setThemeColorId(TUIThemeManager.getAttrResId(chatFlowReactView.getContext(), R.attr.chat_react_other_text_color));
    }

    private void setReplyContent(TUIMessageBean tUIMessageBean) {
        MessageRepliesBean messageRepliesBean = tUIMessageBean.getMessageRepliesBean();
        if (messageRepliesBean != null && messageRepliesBean.getRepliesSize() > 0) {
            TextView textView = (TextView) this.msgReplyDetailLayout.findViewById(R.id.reply_num);
            textView.setText(textView.getResources().getString(R.string.chat_reply_num, Integer.valueOf(messageRepliesBean.getRepliesSize())));
            this.msgReplyDetailLayout.setVisibility(0);
            this.msgReplyDetailLayout.setOnClickListener(new View.OnClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.9
                public final /* synthetic */ MessageContentHolder this$0;
                public final /* synthetic */ TUIMessageBean val$messageBean;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        } else {
            this.msgReplyDetailLayout.setVisibility(8);
            this.msgReplyDetailLayout.setOnClickListener(null);
        }
        if (!this.isReplyDetailMode) {
            this.messageDetailsTimeTv.setVisibility(8);
            return;
        }
        this.messageDetailsTimeTv.setText(DateTimeUtil.getTimeFormatText(new Date(tUIMessageBean.getMessageTime() * 1000)));
        this.messageDetailsTimeTv.setVisibility(0);
        this.msgReplyDetailLayout.setVisibility(8);
    }

    private void showReadText(TUIMessageBean tUIMessageBean) {
        if (tUIMessageBean.isGroup()) {
            this.isReadText.setVisibility(0);
            if (tUIMessageBean.isAllRead()) {
                this.isReadText.setText(R.string.has_all_read);
                return;
            } else if (tUIMessageBean.isUnread()) {
                TextView textView = this.isReadText;
                textView.setTextColor(textView.getResources().getColor(TUIThemeManager.getAttrResId(this.isReadText.getContext(), R.attr.chat_read_receipt_text_color)));
                this.isReadText.setText(R.string.unread);
                this.isReadText.setOnClickListener(new View.OnClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.12
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
                return;
            } else {
                long readCount = tUIMessageBean.getReadCount();
                if (readCount > 0) {
                    TextView textView2 = this.isReadText;
                    textView2.setText(textView2.getResources().getString(R.string.someone_has_read, Long.valueOf(readCount)));
                    TextView textView3 = this.isReadText;
                    textView3.setTextColor(textView3.getResources().getColor(TUIThemeManager.getAttrResId(this.isReadText.getContext(), R.attr.chat_read_receipt_text_color)));
                    this.isReadText.setOnClickListener(new View.OnClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.13
                        public final /* synthetic */ MessageContentHolder this$0;
                        public final /* synthetic */ TUIMessageBean val$msg;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                        }
                    });
                    return;
                }
                return;
            }
        }
        this.isReadText.setVisibility(0);
        if (tUIMessageBean.isPeerRead()) {
            this.isReadText.setText(R.string.has_read);
            return;
        }
        this.isReadText.setText(R.string.unread);
        TextView textView4 = this.isReadText;
        textView4.setTextColor(textView4.getResources().getColor(TUIThemeManager.getAttrResId(this.isReadText.getContext(), R.attr.chat_read_receipt_text_color)));
        this.isReadText.setOnClickListener(new View.OnClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.14
            public final /* synthetic */ MessageContentHolder this$0;
            public final /* synthetic */ TUIMessageBean val$msg;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }

    public List<TUIMessageBean> getDataSource() {
        return this.mDataSource;
    }

    public abstract void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2);

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public void layoutViews(TUIMessageBean tUIMessageBean, int i2) {
        super.layoutViews(tUIMessageBean, i2);
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                this.leftUserIcon.setVisibility(8);
                this.rightUserIcon.setVisibility(0);
            } else {
                this.leftUserIcon.setVisibility(0);
                this.rightUserIcon.setVisibility(8);
            }
        } else {
            this.leftUserIcon.setVisibility(0);
            this.rightUserIcon.setVisibility(8);
        }
        if (this.properties.getAvatar() != 0) {
            this.leftUserIcon.setDefaultImageResId(this.properties.getAvatar());
            this.rightUserIcon.setDefaultImageResId(this.properties.getAvatar());
        } else {
            UserIconView userIconView = this.leftUserIcon;
            Context context = userIconView.getContext();
            int i3 = R.attr.core_default_user_icon;
            userIconView.setDefaultImageResId(TUIThemeManager.getAttrResId(context, i3));
            UserIconView userIconView2 = this.rightUserIcon;
            userIconView2.setDefaultImageResId(TUIThemeManager.getAttrResId(userIconView2.getContext(), i3));
        }
        if (this.properties.getAvatarRadius() != 0) {
            this.leftUserIcon.setRadius(this.properties.getAvatarRadius());
            this.rightUserIcon.setRadius(this.properties.getAvatarRadius());
        } else {
            int dip2px = ScreenUtil.dip2px(4.0f);
            this.leftUserIcon.setRadius(dip2px);
            this.rightUserIcon.setRadius(dip2px);
        }
        if (this.properties.getAvatarSize() != null && this.properties.getAvatarSize().length == 2) {
            ViewGroup.LayoutParams layoutParams = this.leftUserIcon.getLayoutParams();
            layoutParams.width = this.properties.getAvatarSize()[0];
            layoutParams.height = this.properties.getAvatarSize()[1];
            this.leftUserIcon.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.rightUserIcon.getLayoutParams();
            layoutParams2.width = this.properties.getAvatarSize()[0];
            layoutParams2.height = this.properties.getAvatarSize()[1];
            this.rightUserIcon.setLayoutParams(layoutParams2);
        }
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                if (this.properties.getRightNameVisibility() == 0) {
                    this.usernameText.setVisibility(8);
                } else {
                    this.usernameText.setVisibility(this.properties.getRightNameVisibility());
                }
            } else if (this.properties.getLeftNameVisibility() == 0) {
                if (tUIMessageBean.isGroup()) {
                    this.usernameText.setVisibility(0);
                } else {
                    this.usernameText.setVisibility(8);
                }
            } else {
                this.usernameText.setVisibility(this.properties.getLeftNameVisibility());
            }
        } else {
            this.usernameText.setVisibility(0);
        }
        if (this.properties.getNameFontColor() != 0) {
            this.usernameText.setTextColor(this.properties.getNameFontColor());
        }
        if (this.properties.getNameFontSize() != 0) {
            this.usernameText.setTextSize(this.properties.getNameFontSize());
        }
        if (!TextUtils.isEmpty(tUIMessageBean.getNameCard())) {
            this.usernameText.setText(tUIMessageBean.getNameCard());
        } else if (!TextUtils.isEmpty(tUIMessageBean.getFriendRemark())) {
            this.usernameText.setText(tUIMessageBean.getFriendRemark());
        } else if (!TextUtils.isEmpty(tUIMessageBean.getNickName())) {
            this.usernameText.setText(tUIMessageBean.getNickName());
        } else {
            this.usernameText.setText(tUIMessageBean.getSender());
        }
        if (!TextUtils.isEmpty(tUIMessageBean.getFaceUrl())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(tUIMessageBean.getFaceUrl());
            if (!this.isForwardMode && !this.isReplyDetailMode) {
                if (tUIMessageBean.isSelf()) {
                    this.rightUserIcon.setIconUrls(arrayList);
                } else {
                    this.leftUserIcon.setIconUrls(arrayList);
                }
            } else {
                this.leftUserIcon.setIconUrls(arrayList);
            }
        } else {
            this.rightUserIcon.setIconUrls(null);
            this.leftUserIcon.setIconUrls(null);
        }
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                if (tUIMessageBean.getStatus() != 3 && tUIMessageBean.getStatus() != 2 && !tUIMessageBean.isPeerRead()) {
                    this.sendingProgress.setVisibility(0);
                } else {
                    this.sendingProgress.setVisibility(8);
                }
            } else {
                this.sendingProgress.setVisibility(8);
            }
        } else {
            this.sendingProgress.setVisibility(8);
        }
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                if (this.properties.getRightBubble() != null && this.properties.getRightBubble().getConstantState() != null) {
                    this.msgArea.setBackground(this.properties.getRightBubble().getConstantState().newDrawable());
                } else {
                    this.msgArea.setBackgroundResource(TUIThemeManager.getAttrResId(this.itemView.getContext(), R.attr.chat_bubble_self_bg));
                }
            } else if (this.properties.getLeftBubble() != null && this.properties.getLeftBubble().getConstantState() != null) {
                this.msgArea.setBackground(this.properties.getLeftBubble().getConstantState().newDrawable());
            } else {
                this.msgArea.setBackgroundResource(TUIThemeManager.getAttrResId(this.itemView.getContext(), R.attr.chat_bubble_other_bg));
            }
            if (this.onItemClickListener != null) {
                this.msgContentFrame.setOnLongClickListener(new View.OnLongClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.1
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                    }
                });
                this.msgArea.setOnLongClickListener(new View.OnLongClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.2
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                    }
                });
                this.leftUserIcon.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.3
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
                this.leftUserIcon.setOnLongClickListener(new View.OnLongClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.4
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                    }
                });
                this.rightUserIcon.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.5
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            if (tUIMessageBean.getStatus() == 3) {
                this.statusImage.setVisibility(0);
                this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.6
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
                this.statusImage.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.7
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            } else {
                this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.8
                    public final /* synthetic */ MessageContentHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
                this.statusImage.setVisibility(8);
            }
        } else {
            this.msgArea.setBackgroundResource(TUIThemeManager.getAttrResId(this.itemView.getContext(), R.attr.chat_bubble_other_bg));
            this.statusImage.setVisibility(8);
        }
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                setGravity(false);
                this.msgContentLinear.removeView(this.msgAreaAndReply);
                this.msgContentLinear.addView(this.msgAreaAndReply);
            } else {
                setGravity(true);
                this.msgContentLinear.removeView(this.msgAreaAndReply);
                this.msgContentLinear.addView(this.msgAreaAndReply, 0);
            }
        } else {
            setGravity(true);
            this.msgContentLinear.removeView(this.msgAreaAndReply);
            this.msgContentLinear.addView(this.msgAreaAndReply);
        }
        RelativeLayout relativeLayout = this.rightGroupLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.msgContentLinear.setVisibility(0);
        TextView textView = this.isReadText;
        textView.setTextColor(textView.getResources().getColor(R.color.text_gray1));
        this.isReadText.setOnClickListener(null);
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (TUIChatConfigs.getConfigs().getGeneralConfig().isShowRead()) {
                if (tUIMessageBean.isSelf() && 2 == tUIMessageBean.getStatus()) {
                    if (!tUIMessageBean.isNeedReadReceipt()) {
                        this.isReadText.setVisibility(8);
                    } else {
                        showReadText(tUIMessageBean);
                    }
                } else {
                    this.isReadText.setVisibility(8);
                }
            }
            this.unreadAudioText.setVisibility(8);
        } else {
            this.isReadText.setVisibility(8);
            this.unreadAudioText.setVisibility(8);
        }
        if (this.isReplyDetailMode) {
            this.chatTimeText.setVisibility(8);
        }
        setReplyContent(tUIMessageBean);
        setReactContent(tUIMessageBean);
        setMessageAreaPadding();
        layoutVariableViews(tUIMessageBean, i2);
    }

    public void onRecycled() {
    }

    public void resetSelectableText() {
        SelectTextHelper selectTextHelper = this.selectableTextHelper;
        if (selectTextHelper != null) {
            selectTextHelper.reset();
        }
    }

    public void setDataSource(List<TUIMessageBean> list) {
        if (list == null || list.isEmpty()) {
            this.mDataSource = null;
        }
        ArrayList arrayList = new ArrayList();
        for (TUIMessageBean tUIMessageBean : list) {
            int msgType = tUIMessageBean.getMsgType();
            if (msgType == 3 || msgType == 5) {
                arrayList.add(tUIMessageBean);
            }
        }
        this.mDataSource = arrayList;
    }

    public void setGravity(boolean z) {
        int i2 = z ? GravityCompat.START : GravityCompat.END;
        this.msgAreaAndReply.setGravity(i2);
        ViewGroup.LayoutParams layoutParams = this.msgContentFrame.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i2;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i2;
        }
        this.msgContentFrame.setLayoutParams(layoutParams);
    }

    public void setMessageAreaPadding() {
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.chat_message_area_padding_left_right);
        int dimensionPixelSize2 = this.itemView.getResources().getDimensionPixelSize(R.dimen.chat_message_area_padding_top_bottom);
        this.msgArea.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public void setPresenter(ChatPresenter chatPresenter) {
        this.presenter = chatPresenter;
    }

    public void setSelectableTextHelper(TUIMessageBean tUIMessageBean, TextView textView, int i2, boolean z) {
        SelectTextHelper build = new SelectTextHelper.Builder(textView).setCursorHandleColor(ServiceInitializer.getAppContext().getResources().getColor(R.color.font_blue)).setCursorHandleSizeInDp(18.0f).setSelectedColor(ServiceInitializer.getAppContext().getResources().getColor(R.color.test_blue)).setSelectAll(true).setIsEmoji(z).setScrollShow(false).setSelectedAllNoPop(true).setMagnifierShow(false).build();
        this.selectableTextHelper = build;
        build.setSelectListener(new SelectTextHelper.OnSelectListener(this, tUIMessageBean, i2) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder.15
            public final /* synthetic */ MessageContentHolder this$0;
            public final /* synthetic */ TUIMessageBean val$msg;
            public final /* synthetic */ int val$position;

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onClick(View view) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onClickUrl(String str) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onDismiss() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onDismissCustomPop() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onLongClick(View view) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onReset() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onScrolling() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onSelectAllShowCustomPop() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.SelectTextHelper.OnSelectListener
            public void onTextSelected(CharSequence charSequence) {
            }
        });
    }

    public void startShowUnread(TUIMessageBean tUIMessageBean) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("messageBean", tUIMessageBean);
        bundle.putSerializable("chatInfo", this.presenter.getChatInfo());
        TUICore.startActivity("MessageReceiptDetailActivity", bundle);
    }
}
