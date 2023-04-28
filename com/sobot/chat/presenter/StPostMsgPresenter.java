package com.sobot.chat.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.sobot.chat.api.ZhiChiApi;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.api.model.SobotPostMsgTemplate;
import com.sobot.chat.widget.dialog.SobotPostMsgTmpListDialog;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StPostMsgPresenter {
    public static final String INTENT_KEY_COMPANYID = "intent_key_companyid";
    public static final String INTENT_KEY_CONFIG = "intent_key_config";
    public static final String INTENT_KEY_CUSTOMERID = "intent_key_customerid";
    public static final String INTENT_KEY_CUS_FIELDS = "intent_key_cus_fields";
    public static final String INTENT_KEY_GROUPID = "intent_key_groupid";
    public static final String INTENT_KEY_IS_SHOW_TICKET = "intent_key_is_show_ticket";
    public static final String INTENT_KEY_UID = "intent_key_uid";
    public ZhiChiApi mApi;
    private Object mCancelTag;
    private Context mContext;
    private ObtainTemplateListDelegate mDelegate;
    private SobotPostMsgTmpListDialog mDialog;
    private boolean mIsActive;
    private boolean mIsRunning;

    /* renamed from: com.sobot.chat.presenter.StPostMsgPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<ArrayList<SobotPostMsgTemplate>> {
        public final /* synthetic */ StPostMsgPresenter this$0;
        public final /* synthetic */ boolean val$flag_exit_sdk;
        public final /* synthetic */ boolean val$isShowTicket;
        public final /* synthetic */ String val$uid;

        /* renamed from: com.sobot.chat.presenter.StPostMsgPresenter$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C01451 implements SobotPostMsgTmpListDialog.SobotDialogListener {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C01451(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.sobot.chat.widget.dialog.SobotPostMsgTmpListDialog.SobotDialogListener
            public void onListItemClick(SobotPostMsgTemplate sobotPostMsgTemplate) {
            }
        }

        /* renamed from: com.sobot.chat.presenter.StPostMsgPresenter$1$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass2 implements DialogInterface.OnDismissListener {
            public final /* synthetic */ AnonymousClass1 this$1;

            public AnonymousClass2(AnonymousClass1 anonymousClass1) {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
            }
        }

        public AnonymousClass1(StPostMsgPresenter stPostMsgPresenter, String str, boolean z, boolean z2) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(ArrayList<SobotPostMsgTemplate> arrayList) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ArrayList<SobotPostMsgTemplate> arrayList) {
        }
    }

    /* renamed from: com.sobot.chat.presenter.StPostMsgPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StringResultCallBack<SobotLeaveMsgConfig> {
        public final /* synthetic */ StPostMsgPresenter this$0;
        public final /* synthetic */ String val$uid;

        public AnonymousClass2(StPostMsgPresenter stPostMsgPresenter, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotLeaveMsgConfig sobotLeaveMsgConfig) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotLeaveMsgConfig sobotLeaveMsgConfig) {
        }
    }

    /* renamed from: com.sobot.chat.presenter.StPostMsgPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StringResultCallBack<SobotLeaveMsgConfig> {
        public final /* synthetic */ StPostMsgPresenter this$0;
        public final /* synthetic */ String val$uid;

        public AnonymousClass3(StPostMsgPresenter stPostMsgPresenter, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotLeaveMsgConfig sobotLeaveMsgConfig) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotLeaveMsgConfig sobotLeaveMsgConfig) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface ObtainTemplateListDelegate {
        void onSuccess(Intent intent);
    }

    private StPostMsgPresenter() {
    }

    public static /* synthetic */ boolean access$000(StPostMsgPresenter stPostMsgPresenter) {
    }

    public static /* synthetic */ boolean access$102(StPostMsgPresenter stPostMsgPresenter, boolean z) {
    }

    public static /* synthetic */ Context access$200(StPostMsgPresenter stPostMsgPresenter) {
    }

    public static /* synthetic */ SobotPostMsgTmpListDialog access$300(StPostMsgPresenter stPostMsgPresenter) {
    }

    public static /* synthetic */ SobotPostMsgTmpListDialog access$302(StPostMsgPresenter stPostMsgPresenter, SobotPostMsgTmpListDialog sobotPostMsgTmpListDialog) {
    }

    public static /* synthetic */ void access$400(StPostMsgPresenter stPostMsgPresenter, Exception exc, String str) {
    }

    public static /* synthetic */ ObtainTemplateListDelegate access$500(StPostMsgPresenter stPostMsgPresenter) {
    }

    public static StPostMsgPresenter newInstance(Object obj, Context context) {
    }

    private void processReqFailure(Exception exc, String str) {
    }

    public void destory() {
    }

    public Intent newPostMsgIntent(String str, SobotLeaveMsgConfig sobotLeaveMsgConfig) {
    }

    public void obtainTemplateList(String str, String str2, boolean z, boolean z2, ObtainTemplateListDelegate obtainTemplateListDelegate) {
    }

    public void obtainTmpConfig(String str, String str2) {
    }

    public void obtainTmpConfigToMuItiPostMsg(String str, String str2) {
    }

    public SobotPostMsgTmpListDialog showTempListDialog(Activity activity, ArrayList<SobotPostMsgTemplate> arrayList, SobotPostMsgTmpListDialog.SobotDialogListener sobotDialogListener) {
    }

    private StPostMsgPresenter(Object obj, Context context) {
    }
}
