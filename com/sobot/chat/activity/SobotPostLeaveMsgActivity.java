package com.sobot.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.api.model.BaseCode;
import com.sobot.chat.api.model.SobotOfflineLeaveMsgModel;
import com.sobot.chat.widget.dialog.SobotFreeAccountTipDialog;
import com.sobot.network.http.callback.StringResultCallBack;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostLeaveMsgActivity extends SobotBaseActivity implements View.OnClickListener {
    private static final String EXTRA_MSG_LEAVE_CONTENT = "EXTRA_MSG_LEAVE_CONTENT";
    private static final String EXTRA_MSG_LEAVE_CONTENT_TXT = "EXTRA_MSG_LEAVE_CONTENT_TXT";
    public static final int EXTRA_MSG_LEAVE_REQUEST_CODE = 109;
    private static final String EXTRA_MSG_LEAVE_TXT = "EXTRA_MSG_LEAVE_TXT";
    private static final String EXTRA_MSG_UID = "EXTRA_MSG_UID";
    private String mUid;
    private String skillGroupId;
    private SobotFreeAccountTipDialog sobotFreeAccountTipDialog;
    private Button sobot_btn_submit;
    private EditText sobot_post_et_content;
    private TextView sobot_tv_leaveExplain;
    private TextView sobot_tv_post_msg;
    private TextView sobot_tv_problem_description;

    /* renamed from: com.sobot.chat.activity.SobotPostLeaveMsgActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotPostLeaveMsgActivity this$0;

        public AnonymousClass1(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPostLeaveMsgActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StringResultCallBack<SobotOfflineLeaveMsgModel> {
        public final /* synthetic */ SobotPostLeaveMsgActivity this$0;

        public AnonymousClass2(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotOfflineLeaveMsgModel sobotOfflineLeaveMsgModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotOfflineLeaveMsgModel sobotOfflineLeaveMsgModel) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPostLeaveMsgActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StringResultCallBack<BaseCode> {
        public final /* synthetic */ SobotPostLeaveMsgActivity this$0;
        public final /* synthetic */ String val$content;

        public AnonymousClass3(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(BaseCode baseCode) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(BaseCode baseCode) {
        }
    }

    public static /* synthetic */ SobotFreeAccountTipDialog access$000(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity) {
    }

    public static /* synthetic */ TextView access$100(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity) {
    }

    public static /* synthetic */ EditText access$200(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity) {
    }

    public static /* synthetic */ TextView access$300(SobotPostLeaveMsgActivity sobotPostLeaveMsgActivity) {
    }

    public static String getResultContent(Intent intent) {
    }

    public static Intent newIntent(Context context, String str, String str2, String str3) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initBundleData(Bundle bundle) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
