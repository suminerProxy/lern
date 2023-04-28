package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MergeMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MergeMessageHolder extends MessageContentHolder {
    private LinearLayout mForwardMsgLayout;
    private TextView msgForwardContent;
    private TextView msgForwardTitle;

    public MergeMessageHolder(View view) {
        super(view);
        this.mForwardMsgLayout = (LinearLayout) view.findViewById(R.id.forward_msg_layout);
        this.msgForwardTitle = (TextView) view.findViewById(R.id.msg_forward_title);
        this.msgForwardContent = (TextView) view.findViewById(R.id.msg_forward_content);
        this.mForwardMsgLayout.setClickable(true);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.forward_msg_holder;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        if (tUIMessageBean == null) {
            return;
        }
        ChatFlowReactView chatFlowReactView = this.reactView;
        chatFlowReactView.setThemeColorId(TUIThemeManager.getAttrResId(chatFlowReactView.getContext(), R.attr.chat_react_other_text_color));
        if (!this.isForwardMode && !this.isReplyDetailMode) {
            if (tUIMessageBean.isSelf()) {
                if (this.properties.getRightBubble() != null && this.properties.getRightBubble().getConstantState() != null) {
                    this.msgArea.setBackground(this.properties.getRightBubble().getConstantState().newDrawable());
                } else {
                    this.msgArea.setBackgroundResource(R.drawable.chat_bubble_self_cavity_bg);
                }
            } else if (this.properties.getLeftBubble() != null && this.properties.getLeftBubble().getConstantState() != null) {
                this.msgArea.setBackground(this.properties.getLeftBubble().getConstantState().newDrawable());
            } else {
                this.msgArea.setBackgroundResource(R.drawable.chat_bubble_other_cavity_bg);
            }
        } else {
            this.msgArea.setBackgroundResource(R.drawable.chat_bubble_other_cavity_bg);
            this.statusImage.setVisibility(8);
        }
        MergeMessageBean mergeMessageBean = (MergeMessageBean) tUIMessageBean;
        String title = mergeMessageBean.getTitle();
        List<String> abstractList = mergeMessageBean.getAbstractList();
        this.msgForwardTitle.setText(title);
        String str = "";
        for (int i3 = 0; i3 < abstractList.size(); i3++) {
            if (i3 > 0) {
                str = str + "\n";
            }
            str = str + abstractList.get(i3);
        }
        this.msgForwardContent.setText(FaceManager.emojiJudge(str));
        if (this.isMultiSelectMode) {
            this.mForwardMsgLayout.setOnClickListener(new View.OnClickListener(this, i2, mergeMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MergeMessageHolder.1
                public final /* synthetic */ MergeMessageHolder this$0;
                public final /* synthetic */ MergeMessageBean val$messageBean;
                public final /* synthetic */ int val$position;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            return;
        }
        this.mForwardMsgLayout.setOnLongClickListener(new View.OnLongClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MergeMessageHolder.2
            public final /* synthetic */ MergeMessageHolder this$0;
            public final /* synthetic */ TUIMessageBean val$msg;
            public final /* synthetic */ int val$position;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
            }
        });
        this.mForwardMsgLayout.setOnClickListener(new View.OnClickListener(this, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MergeMessageHolder.3
            public final /* synthetic */ MergeMessageHolder this$0;
            public final /* synthetic */ TUIMessageBean val$msg;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        setMessageAreaPadding();
    }
}
