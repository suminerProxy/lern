package com.tencent.qcloud.tuikit.tuiconversation.ui.view;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.component.UnreadCountTextView;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationCommonHolder extends ConversationBaseHolder {
    public TextView atInfoText;
    public ConversationIconView conversationIconView;
    public ImageView disturbView;
    private boolean isForwardMode;
    public LinearLayout leftItemLayout;
    public ImageView messageFailed;
    public ImageView messageSending;
    public RelativeLayout messageStatusLayout;
    public TextView messageText;
    public CheckBox multiSelectCheckBox;
    private boolean showFoldedStyle;
    public TextView timelineText;
    public TextView titleText;
    public UnreadCountTextView unreadText;
    public View userStatusView;

    public ConversationCommonHolder(View view) {
    }

    @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationBaseHolder
    public void layoutViews(ConversationInfo conversationInfo, int i2) {
    }

    public void setForwardMode(boolean z) {
    }

    public void setShowFoldedStyle(boolean z) {
    }
}
