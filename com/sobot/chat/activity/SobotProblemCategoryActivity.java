package com.sobot.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseHelpCenterActivity;
import com.sobot.chat.adapter.SobotCategoryAdapter;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.StCategoryModel;
import com.sobot.chat.api.model.StDocModel;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotProblemCategoryActivity extends SobotBaseHelpCenterActivity implements AdapterView.OnItemClickListener {
    public static final String EXTRA_KEY_CATEGORY = "EXTRA_KEY_CATEGORY";
    private SobotCategoryAdapter mAdapter;
    private StCategoryModel mCategory;
    private TextView mEmpty;
    private ListView mListView;

    /* renamed from: com.sobot.chat.activity.SobotProblemCategoryActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<List<StDocModel>> {
        public final /* synthetic */ SobotProblemCategoryActivity this$0;

        public AnonymousClass1(SobotProblemCategoryActivity sobotProblemCategoryActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<StDocModel> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<StDocModel> list) {
        }
    }

    public static /* synthetic */ SobotCategoryAdapter access$000(SobotProblemCategoryActivity sobotProblemCategoryActivity) {
    }

    public static /* synthetic */ SobotCategoryAdapter access$002(SobotProblemCategoryActivity sobotProblemCategoryActivity, SobotCategoryAdapter sobotCategoryAdapter) {
    }

    public static /* synthetic */ ListView access$100(SobotProblemCategoryActivity sobotProblemCategoryActivity) {
    }

    public static /* synthetic */ TextView access$200(SobotProblemCategoryActivity sobotProblemCategoryActivity) {
    }

    public static Intent newIntent(Context context, Information information, StCategoryModel stCategoryModel) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseHelpCenterActivity, com.sobot.chat.activity.base.SobotBaseActivity
    public void initBundleData(Bundle bundle) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }
}
