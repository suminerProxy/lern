package com.sobot.chat.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.sobot.chat.adapter.SobotPicListAdapter;
import com.sobot.chat.api.ResultCallBack;
import com.sobot.chat.api.model.CommonModelBase;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.SobotFieldModel;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.api.model.SobotLeaveMsgParamModel;
import com.sobot.chat.api.model.ZhiChiMessage;
import com.sobot.chat.api.model.ZhiChiUploadAppFileModelResult;
import com.sobot.chat.listener.ISobotCusField;
import com.sobot.chat.utils.ChatUtils;
import com.sobot.chat.widget.dialog.SobotDeleteWorkOrderDialog;
import com.sobot.chat.widget.dialog.SobotSelectPicDialog;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostMsgFragment extends SobotBaseFragment implements View.OnClickListener, ISobotCusField {
    private SobotPicListAdapter adapter;
    private TextView email_hint_input_label;
    private boolean flag_exit_sdk;
    private int flag_exit_type;
    @SuppressLint({"HandlerLeak"})
    public Handler handler;
    private Information information;
    private View.OnClickListener itemsOnClick;
    private SobotLeaveMsgConfig mConfig;
    private ArrayList<SobotFieldModel> mCusAddFields;
    private ArrayList<SobotFieldModel> mFields;
    private String mGroupId;
    private View mRootView;
    private SobotSelectPicDialog menuWindow;
    private TextView phone_hint_input_label;
    private ArrayList<ZhiChiUploadAppFileModelResult> pic_list;
    public SobotDeleteWorkOrderDialog seleteMenuWindow;
    private ChatUtils.SobotSendFileListener sendFileListener;
    private Button sobot_btn_submit;
    private LinearLayout sobot_enclosure_container;
    private EditText sobot_et_content;
    private View sobot_frist_line;
    private LinearLayout sobot_ll_content_img;
    private View sobot_phone_line;
    private LinearLayout sobot_post_customer_field;
    private View sobot_post_customer_line;
    private View sobot_post_customer_sec_line;
    private EditText sobot_post_email;
    private TextView sobot_post_email_lable;
    private RelativeLayout sobot_post_email_rl;
    private TextView sobot_post_lable;
    private LinearLayout sobot_post_msg_layout;
    private GridView sobot_post_msg_pic;
    private EditText sobot_post_phone;
    private TextView sobot_post_phone_lable;
    private RelativeLayout sobot_post_phone_rl;
    private TextView sobot_post_question_lable;
    private View sobot_post_question_line;
    private LinearLayout sobot_post_question_ll;
    private View sobot_post_question_sec_line;
    private TextView sobot_post_question_type;
    private EditText sobot_post_title;
    private TextView sobot_post_title_lable;
    private View sobot_post_title_line;
    private RelativeLayout sobot_post_title_rl;
    private View sobot_post_title_sec_line;
    private TextView sobot_tv_post_msg;
    private TextView sobot_tv_problem_description;
    private TextView title_hint_input_lable;
    private String uid;

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends Handler {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass1(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass10 implements SobotPicListAdapter.ViewClickListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$10$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass10 this$1;

            public AnonymousClass1(AnonymousClass10 anonymousClass10) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass10(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // com.sobot.chat.adapter.SobotPicListAdapter.ViewClickListener
        public void clickView(View view, int i2, int i3) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass11 implements View.OnClickListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass11(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass12 implements ChatUtils.SobotSendFileListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$12$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements ResultCallBack<ZhiChiMessage> {
            public final /* synthetic */ AnonymousClass12 this$1;
            public final /* synthetic */ String val$filePath;

            public AnonymousClass1(AnonymousClass12 anonymousClass12, String str) {
            }

            @Override // com.sobot.chat.api.ResultCallBack
            public void onFailure(Exception exc, String str) {
            }

            @Override // com.sobot.chat.api.ResultCallBack
            public void onLoading(long j2, long j3, boolean z) {
            }

            @Override // com.sobot.chat.api.ResultCallBack
            public /* bridge */ /* synthetic */ void onSuccess(ZhiChiMessage zhiChiMessage) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(ZhiChiMessage zhiChiMessage) {
            }
        }

        public AnonymousClass12(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // com.sobot.chat.utils.ChatUtils.SobotSendFileListener
        public void onError() {
        }

        @Override // com.sobot.chat.utils.ChatUtils.SobotSendFileListener
        public void onSuccess(String str) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass13 implements View.OnClickListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass13(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass2(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnFocusChangeListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass3(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass4(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements View.OnFocusChangeListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass5(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass6(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements View.OnFocusChangeListener {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass7(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements StringResultCallBack<SobotLeaveMsgParamModel> {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass8(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotLeaveMsgParamModel sobotLeaveMsgParamModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotLeaveMsgParamModel sobotLeaveMsgParamModel) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotPostMsgFragment$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass9 implements StringResultCallBack<CommonModelBase> {
        public final /* synthetic */ SobotPostMsgFragment this$0;

        public AnonymousClass9(SobotPostMsgFragment sobotPostMsgFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(CommonModelBase commonModelBase) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(CommonModelBase commonModelBase) {
        }
    }

    public static /* synthetic */ int access$000(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ void access$100(SobotPostMsgFragment sobotPostMsgFragment, boolean z) {
    }

    public static /* synthetic */ TextView access$1000(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ TextView access$1100(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ View access$1200(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ View access$1300(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ ArrayList access$1400(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ ArrayList access$1402(SobotPostMsgFragment sobotPostMsgFragment, ArrayList arrayList) {
    }

    public static /* synthetic */ LinearLayout access$1500(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ SobotSelectPicDialog access$1600(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ SobotSelectPicDialog access$1602(SobotPostMsgFragment sobotPostMsgFragment, SobotSelectPicDialog sobotSelectPicDialog) {
    }

    public static /* synthetic */ View.OnClickListener access$1700(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ SobotPicListAdapter access$1800(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ ArrayList access$1900(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ boolean access$200(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ LinearLayout access$2000(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ SobotLeaveMsgConfig access$2100(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ String access$2200(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ EditText access$300(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ TextView access$400(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ TextView access$500(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ EditText access$600(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ TextView access$700(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ TextView access$800(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    public static /* synthetic */ EditText access$900(SobotPostMsgFragment sobotPostMsgFragment) {
    }

    private void checkSubmit() {
    }

    private void editTextSetHint() {
    }

    private void finishPageOrSDK(boolean z) {
    }

    private void initPicListView() {
    }

    private void msgFilter() {
    }

    public static SobotPostMsgFragment newInstance(Bundle bundle) {
    }

    private void postMsg(String str, String str2, String str3) {
    }

    private void setCusFieldValue() {
    }

    public String getFileStr() {
    }

    public void initData() {
    }

    public void initView(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void onBackPress() {
    }

    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.listener.ISobotCusField
    public void onClickCusField(View view, int i2, SobotFieldModel sobotFieldModel) {
    }

    @Override // com.sobot.chat.fragment.SobotBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    public void showHint(String str) {
    }
}
