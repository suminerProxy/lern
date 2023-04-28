package com.sobot.chat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.SobotCityResult;
import com.sobot.chat.api.model.SobotFieldModel;
import com.sobot.chat.api.model.SobotProvinInfo;
import com.sobot.chat.api.model.SobotQueryFormModel;
import com.sobot.chat.listener.ISobotCusField;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotQueryFromActivity extends SobotBaseActivity implements ISobotCusField, View.OnClickListener {
    private boolean isSubmitting;
    private String mActiveTransfer;
    private String mDocId;
    private ArrayList<SobotFieldModel> mField;
    private SobotProvinInfo.SobotProvinceModel mFinalData;
    private String mGroupId;
    private String mGroupName;
    private Bundle mIntentBundleData;
    private String mKeyword;
    private String mKeywordId;
    private SobotQueryFormModel mQueryFormModel;
    private int mTransferType;
    private String mUid;
    private String mUnknownQuestion;
    private Button sobot_btn_submit;
    private LinearLayout sobot_container;
    private TextView sobot_tv_doc;
    private TextView sobot_tv_safety;

    /* renamed from: com.sobot.chat.activity.SobotQueryFromActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<CommonModel> {
        public final /* synthetic */ SobotQueryFromActivity this$0;

        public AnonymousClass1(SobotQueryFromActivity sobotQueryFromActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(CommonModel commonModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(CommonModel commonModel) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotQueryFromActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StringResultCallBack<SobotCityResult> {
        public final /* synthetic */ SobotQueryFromActivity this$0;
        public final /* synthetic */ SobotFieldModel val$cusField;

        public AnonymousClass2(SobotQueryFromActivity sobotQueryFromActivity, SobotFieldModel sobotFieldModel) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotCityResult sobotCityResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotCityResult sobotCityResult) {
        }
    }

    public static /* synthetic */ boolean access$002(SobotQueryFromActivity sobotQueryFromActivity, boolean z) {
    }

    public static /* synthetic */ void access$100(SobotQueryFromActivity sobotQueryFromActivity) {
    }

    private void backPressed() {
    }

    private boolean checkInput(ArrayList<SobotFieldModel> arrayList) {
    }

    private void initIntent(Bundle bundle) {
    }

    private void saveIntentWithFinish() {
    }

    private void submit() {
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
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.listener.ISobotCusField
    public void onClickCusField(View view, int i2, SobotFieldModel sobotFieldModel) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }
}
