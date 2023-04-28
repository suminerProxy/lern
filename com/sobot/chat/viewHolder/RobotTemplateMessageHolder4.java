package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RobotTemplateMessageHolder4 extends MessageHolderBase {
    public ZhiChiMessageBase message;
    private LinearLayout sobot_ll_transferBtn;
    private TextView sobot_template4_anchor;
    private TextView sobot_template4_summary;
    private TextView sobot_template4_temp_title;
    private ImageView sobot_template4_thumbnail;
    private TextView sobot_template4_title;
    private TextView sobot_tv_transferBtn;

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder4$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder4 this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ Map val$interfaceRet;

        public AnonymousClass1(RobotTemplateMessageHolder4 robotTemplateMessageHolder4, Map map, Context context) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder4$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder4 this$0;

        public AnonymousClass2(RobotTemplateMessageHolder4 robotTemplateMessageHolder4) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder4$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder4 this$0;

        public AnonymousClass3(RobotTemplateMessageHolder4 robotTemplateMessageHolder4) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder4$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder4 this$0;

        public AnonymousClass4(RobotTemplateMessageHolder4 robotTemplateMessageHolder4) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    public RobotTemplateMessageHolder4(Context context, View view) {
    }

    public static /* synthetic */ Context access$000(RobotTemplateMessageHolder4 robotTemplateMessageHolder4) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$100(RobotTemplateMessageHolder4 robotTemplateMessageHolder4) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$200(RobotTemplateMessageHolder4 robotTemplateMessageHolder4) {
    }

    public static /* synthetic */ void access$300(RobotTemplateMessageHolder4 robotTemplateMessageHolder4, boolean z) {
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
