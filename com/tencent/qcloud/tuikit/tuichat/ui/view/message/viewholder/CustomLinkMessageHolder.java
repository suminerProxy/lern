package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.view.View;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomLinkMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomLinkMessageHolder extends MessageContentHolder {
    public static final String TAG = "CustomLinkMessageHolder";
    private TextView linkView;
    private TextView textView;

    public CustomLinkMessageHolder(View view) {
        super(view);
        this.textView = (TextView) view.findViewById(R.id.test_custom_message_tv);
        this.linkView = (TextView) view.findViewById(R.id.link_tv);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.test_custom_message_layout1;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        String str;
        String str2 = "";
        if (tUIMessageBean instanceof CustomLinkMessageBean) {
            CustomLinkMessageBean customLinkMessageBean = (CustomLinkMessageBean) tUIMessageBean;
            str2 = customLinkMessageBean.getText();
            str = customLinkMessageBean.getLink();
        } else {
            str = "";
        }
        if (!tUIMessageBean.isSelf()) {
            TextView textView = this.textView;
            textView.setTextColor(textView.getResources().getColor(TUIThemeManager.getAttrResId(this.textView.getContext(), R.attr.chat_other_custom_msg_text_color)));
            this.linkView.setTextColor(this.textView.getResources().getColor(TUIThemeManager.getAttrResId(this.textView.getContext(), R.attr.chat_other_custom_msg_link_color)));
        } else {
            TextView textView2 = this.textView;
            textView2.setTextColor(textView2.getResources().getColor(TUIThemeManager.getAttrResId(this.textView.getContext(), R.attr.chat_self_custom_msg_text_color)));
            this.linkView.setTextColor(this.textView.getResources().getColor(TUIThemeManager.getAttrResId(this.textView.getContext(), R.attr.chat_self_custom_msg_link_color)));
        }
        this.textView.setText(str2);
        this.msgContentFrame.setClickable(true);
        this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, str) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CustomLinkMessageHolder.1
            public final /* synthetic */ CustomLinkMessageHolder this$0;
            public final /* synthetic */ String val$finalLink;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }
}
