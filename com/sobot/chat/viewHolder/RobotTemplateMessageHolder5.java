package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RobotTemplateMessageHolder5 extends MessageHolderBase {
    public ZhiChiMessageBase message;
    private LinearLayout sobot_ll_transferBtn;
    private TextView sobot_template5_msg;
    private TextView sobot_template5_title;
    private TextView sobot_tv_transferBtn;

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder5$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder5 this$0;

        public AnonymousClass1(RobotTemplateMessageHolder5 robotTemplateMessageHolder5) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder5$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder5 this$0;

        public AnonymousClass2(RobotTemplateMessageHolder5 robotTemplateMessageHolder5) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder5$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder5 this$0;

        public AnonymousClass3(RobotTemplateMessageHolder5 robotTemplateMessageHolder5) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    public RobotTemplateMessageHolder5(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(RobotTemplateMessageHolder5 robotTemplateMessageHolder5) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$100(RobotTemplateMessageHolder5 robotTemplateMessageHolder5) {
    }

    public static /* synthetic */ void access$200(RobotTemplateMessageHolder5 robotTemplateMessageHolder5, boolean z) {
    }

    private void checkShowTransferBtn() {
    }

    private void doRevaluate(boolean z) {
    }

    private void setFailureView() {
    }

    private void setSuccessView() {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void hideRevaluateBtn() {
    }

    public void hideTransferBtn() {
    }

    public void refreshRevaluateItem() {
    }

    public void showDislikeWordView() {
    }

    public void showLikeWordView() {
    }

    public void showRevaluateBtn() {
    }

    public void showTransferBtn() {
    }
}
