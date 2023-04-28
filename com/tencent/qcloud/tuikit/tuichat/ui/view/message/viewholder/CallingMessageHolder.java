package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CallingMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CallingMessageHolder extends TextMessageHolder {
    private LinearLayout mCallingLayout;
    private ImageView mLeftView;
    private ImageView mRightView;
    private TextView msgBodyText;

    public CallingMessageHolder(View view) {
        super(view);
        this.msgBodyText = (TextView) view.findViewById(R.id.msg_body_tv);
        this.mLeftView = (ImageView) view.findViewById(R.id.left_icon);
        this.mRightView = (ImageView) view.findViewById(R.id.right_icon);
        this.mCallingLayout = (LinearLayout) view.findViewById(R.id.calling_layout);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TextMessageHolder, com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.message_adapter_content_calling;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.TextMessageHolder, com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        super.layoutVariableViews(tUIMessageBean, i2);
        if (tUIMessageBean instanceof CallingMessageBean) {
            CallingMessageBean callingMessageBean = (CallingMessageBean) tUIMessageBean;
            if (tUIMessageBean.isSelf()) {
                this.mLeftView.setVisibility(8);
                this.mRightView.setVisibility(0);
                if (callingMessageBean.getCallType() == 1) {
                    this.mRightView.setImageResource(R.drawable.ic_audio_call);
                } else if (callingMessageBean.getCallType() == 2) {
                    this.mRightView.setImageResource(R.drawable.ic_self_video_call);
                }
            } else {
                this.mRightView.setVisibility(8);
                this.mLeftView.setVisibility(0);
                if (callingMessageBean.getCallType() == 1) {
                    this.mLeftView.setImageResource(R.drawable.ic_audio_call);
                } else if (callingMessageBean.getCallType() == 2) {
                    this.mLeftView.setImageResource(R.drawable.ic_other_video_call);
                }
            }
            if (callingMessageBean.getCallType() == 1 || callingMessageBean.getCallType() == 2) {
                this.mCallingLayout.setOnClickListener(new View.OnClickListener(this, i2, tUIMessageBean) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CallingMessageHolder.1
                    public final /* synthetic */ CallingMessageHolder this$0;
                    public final /* synthetic */ TUIMessageBean val$msg;
                    public final /* synthetic */ int val$position;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }
}
