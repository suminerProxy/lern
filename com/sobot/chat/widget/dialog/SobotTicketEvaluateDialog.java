package com.sobot.chat.widget.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.sobot.chat.api.model.SobotUserTicketEvaluate;
import com.sobot.chat.widget.SobotEditTextLayout;
import com.sobot.chat.widget.dialog.base.SobotActionSheet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTicketEvaluateDialog extends SobotActionSheet {
    private LinearLayout coustom_pop_layout;
    private Activity mContext;
    private SobotUserTicketEvaluate mEvaluate;
    private SobotEditTextLayout setl_submit_content;
    private EditText sobot_add_content;
    private Button sobot_close_now;
    private LinearLayout sobot_negativeButton;
    private RatingBar sobot_ratingBar;
    private TextView sobot_ratingBar_title;
    private TextView sobot_tv_evaluate_title;

    /* renamed from: com.sobot.chat.widget.dialog.SobotTicketEvaluateDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotTicketEvaluateDialog this$0;

        public AnonymousClass1(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotTicketEvaluateDialog$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements RatingBar.OnRatingBarChangeListener {
        public final /* synthetic */ SobotTicketEvaluateDialog this$0;

        public AnonymousClass2(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f2, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotTicketEvaluateDialog$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SobotTicketEvaluateDialog this$0;

        public AnonymousClass3(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotTicketEvaluateCallback {
        void submitEvaluate(int i2, String str);
    }

    public SobotTicketEvaluateDialog(Activity activity) {
    }

    public static /* synthetic */ RatingBar access$000(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
    }

    public static /* synthetic */ SobotUserTicketEvaluate access$100(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
    }

    public static /* synthetic */ TextView access$200(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
    }

    public static /* synthetic */ Activity access$300(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
    }

    public static /* synthetic */ EditText access$400(SobotTicketEvaluateDialog sobotTicketEvaluateDialog) {
    }

    private void setViewListener() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public View getDialogContainer() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public String getLayoutStrName() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public void initData() {
    }

    @Override // com.sobot.chat.widget.dialog.base.SobotActionSheet
    public void initView() {
    }

    public SobotTicketEvaluateDialog(Activity activity, SobotUserTicketEvaluate sobotUserTicketEvaluate) {
    }
}
