package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomEvaluationMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomEvaluationMessageHolder extends MessageContentHolder {
    public static final String TAG = "CustomEvaluationMessageHolder";
    private TextView contentView;
    private RatingBar ratingBar;
    private TextView textView;

    public CustomEvaluationMessageHolder(View view) {
        super(view);
        this.textView = (TextView) view.findViewById(R.id.test_custom_message_tv);
        this.contentView = (TextView) view.findViewById(R.id.link_tv);
        this.ratingBar = (RatingBar) view.findViewById(R.id.opreview_ratingbar);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.custom_evaluation_message_layout;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        int i3;
        String str;
        if (tUIMessageBean instanceof CustomEvaluationMessageBean) {
            CustomEvaluationMessageBean customEvaluationMessageBean = (CustomEvaluationMessageBean) tUIMessageBean;
            i3 = customEvaluationMessageBean.getScore();
            str = customEvaluationMessageBean.getContent();
        } else {
            i3 = 0;
            str = "";
        }
        this.textView.setText(ServiceInitializer.getAppContext().getString(R.string.custom_evaluation_message));
        this.msgContentFrame.setClickable(true);
        if (i3 == 0) {
            this.ratingBar.setVisibility(8);
        } else {
            this.ratingBar.setRating(i3);
            this.ratingBar.setNumStars(i3);
            this.ratingBar.setIsIndicator(true);
        }
        String str2 = TAG;
        TUIChatLog.d(str2, "score = " + i3);
        this.contentView.setText(str);
    }
}
