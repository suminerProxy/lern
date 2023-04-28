package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.SobotQuestionRecommend;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RobotQRMessageHolder extends MessageHolderBase {
    private HorizontalScrollView sobot_horizontal_scrollview;
    private LinearLayout sobot_horizontal_scrollview_layout;
    private TextView tv_title;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class QuestionRecommendViewHolder implements View.OnClickListener {
        public Context mContext;
        public SobotQuestionRecommend.SobotQRMsgBean mQrMsgBean;
        public SobotMsgAdapter.SobotMsgCallBack msgCallBack;
        public LinearLayout sobotLayout;
        public ImageView sobotThumbnail;
        public TextView sobotTitle;

        public /* synthetic */ QuestionRecommendViewHolder(Context context, View view, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack, AnonymousClass1 anonymousClass1) {
        }

        public void bindData(Context context, SobotQuestionRecommend.SobotQRMsgBean sobotQRMsgBean, boolean z) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        private QuestionRecommendViewHolder(Context context, View view, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
        }
    }

    public RobotQRMessageHolder(Context context, View view) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }
}
