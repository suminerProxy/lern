package com.sobot.chat.activity;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotSikllAdapter;
import com.sobot.chat.api.ZhiChiApi;
import com.sobot.chat.api.model.SobotConnCusParam;
import com.sobot.chat.api.model.ZhiChiGroup;
import com.sobot.chat.api.model.ZhiChiGroupBase;
import com.sobot.chat.presenter.StPostMsgPresenter;
import com.sobot.chat.widget.horizontalgridpage.SobotRecyclerCallBack;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotSkillGroupActivity extends SobotDialogBaseActivity {
    private String appkey;
    private String companyId;
    private String customerId;
    private boolean flag_exit_sdk;
    private List<ZhiChiGroupBase> list_skill;
    private StPostMsgPresenter mPressenter;
    private int mType;
    private int msgFlag;
    private String msgTmp;
    private String msgTxt;
    private SobotConnCusParam param;
    private SobotSikllAdapter sobotSikllAdapter;
    private LinearLayout sobot_btn_cancle;
    private RecyclerView sobot_rcy_skill;
    private TextView sobot_tv_title;
    private int transferType;
    private String uid;
    private ZhiChiApi zhiChiApi;

    /* renamed from: com.sobot.chat.activity.SobotSkillGroupActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements SobotRecyclerCallBack {
        public final /* synthetic */ SobotSkillGroupActivity this$0;

        public AnonymousClass1(SobotSkillGroupActivity sobotSkillGroupActivity) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.SobotRecyclerCallBack
        public void onItemClickListener(View view, int i2) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.SobotRecyclerCallBack
        public void onItemLongClickListener(View view, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotSkillGroupActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotSkillGroupActivity this$0;

        public AnonymousClass2(SobotSkillGroupActivity sobotSkillGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotSkillGroupActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StringResultCallBack<ZhiChiGroup> {
        public final /* synthetic */ SobotSkillGroupActivity this$0;

        public AnonymousClass3(SobotSkillGroupActivity sobotSkillGroupActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(ZhiChiGroup zhiChiGroup) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ZhiChiGroup zhiChiGroup) {
        }
    }

    public static /* synthetic */ List access$000(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ List access$002(SobotSkillGroupActivity sobotSkillGroupActivity, List list) {
    }

    public static /* synthetic */ int access$100(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ SobotConnCusParam access$200(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ int access$300(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ void access$400(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ SobotSikllAdapter access$500(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ RecyclerView access$600(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    public static /* synthetic */ TextView access$700(SobotSkillGroupActivity sobotSkillGroupActivity) {
    }

    private void finishPageOrSDK() {
    }

    private void sendCloseIntent(int i2) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.sobot.chat.activity.base.SobotDialogBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.sobot.chat.activity.base.SobotDialogBaseActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }
}
