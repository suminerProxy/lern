package com.sobot.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.adapter.SobotTicketDetailAdapter;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.SobotUserTicketEvaluate;
import com.sobot.chat.api.model.SobotUserTicketInfo;
import com.sobot.chat.api.model.StUserDealTicketInfo;
import com.sobot.chat.api.model.ZhiChiUploadAppFileModelResult;
import com.sobot.chat.utils.ToastUtil;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTicketDetailActivity extends SobotBaseActivity implements View.OnClickListener {
    public static final String INTENT_KEY_COMPANYID = "intent_key_companyid";
    public static final String INTENT_KEY_TICKET_INFO = "intent_key_ticket_info";
    public static final String INTENT_KEY_UID = "intent_key_uid";
    private static final int REQUEST_REPLY_CODE = 4097;
    private int infoFlag;
    private Information information;
    private SobotTicketDetailAdapter mAdapter;
    private String mCompanyId;
    private SobotUserTicketEvaluate mEvaluate;
    private List<Object> mList;
    private ListView mListView;
    private SobotUserTicketInfo mTicketInfo;
    private String mUid;
    private ArrayList<ZhiChiUploadAppFileModelResult> pic_list;
    private String replyTempContent;
    private LinearLayout sobot_evaluate_ll;
    private TextView sobot_evaluate_tv;
    private LinearLayout sobot_reply_ll;
    private TextView sobot_reply_tv;

    /* renamed from: com.sobot.chat.activity.SobotTicketDetailActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotTicketDetailActivity this$0;

        public AnonymousClass1(SobotTicketDetailActivity sobotTicketDetailActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotTicketDetailActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotTicketDetailActivity this$0;

        public AnonymousClass2(SobotTicketDetailActivity sobotTicketDetailActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotTicketDetailActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StringResultCallBack<List<StUserDealTicketInfo>> {
        public final /* synthetic */ SobotTicketDetailActivity this$0;

        public AnonymousClass3(SobotTicketDetailActivity sobotTicketDetailActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<StUserDealTicketInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<StUserDealTicketInfo> list) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotTicketDetailActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements StringResultCallBack<String> {
        public final /* synthetic */ SobotTicketDetailActivity this$0;
        public final /* synthetic */ String val$remark;
        public final /* synthetic */ int val$score;

        public AnonymousClass4(SobotTicketDetailActivity sobotTicketDetailActivity, int i2, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotTicketDetailActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements StringResultCallBack<String> {
        public final /* synthetic */ SobotTicketDetailActivity this$0;
        public final /* synthetic */ String val$remark;
        public final /* synthetic */ int val$score;

        /* renamed from: com.sobot.chat.activity.SobotTicketDetailActivity$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements ToastUtil.OnAfterShowListener {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.sobot.chat.utils.ToastUtil.OnAfterShowListener
            public void doAfter() {
            }
        }

        public AnonymousClass5(SobotTicketDetailActivity sobotTicketDetailActivity, int i2, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    public static /* synthetic */ Information access$000(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ LinearLayout access$100(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ SobotUserTicketInfo access$200(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ SobotUserTicketEvaluate access$300(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ SobotUserTicketEvaluate access$302(SobotTicketDetailActivity sobotTicketDetailActivity, SobotUserTicketEvaluate sobotUserTicketEvaluate) {
    }

    public static /* synthetic */ String access$400(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ List access$500(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ SobotTicketDetailAdapter access$600(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ SobotTicketDetailAdapter access$602(SobotTicketDetailActivity sobotTicketDetailActivity, SobotTicketDetailAdapter sobotTicketDetailAdapter) {
    }

    public static /* synthetic */ ListView access$700(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static /* synthetic */ LinearLayout access$800(SobotTicketDetailActivity sobotTicketDetailActivity) {
    }

    public static Intent newIntent(Context context, String str, String str2, SobotUserTicketInfo sobotUserTicketInfo) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public void removeTicketId() {
    }

    public void submitEvaluate(int i2, String str) {
    }
}
