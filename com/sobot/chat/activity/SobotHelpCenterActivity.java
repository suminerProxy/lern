package com.sobot.chat.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseHelpCenterActivity;
import com.sobot.chat.adapter.SobotHelpCenterAdapter;
import com.sobot.chat.api.model.StCategoryModel;
import com.sobot.chat.widget.SobotAutoGridView;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotHelpCenterActivity extends SobotBaseHelpCenterActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private SobotHelpCenterAdapter mAdapter;
    private View mBottomBtn;
    private View mEmptyView;
    private SobotAutoGridView mGridView;
    private TextView tvNoData;
    private TextView tvNoDataDescribe;
    private TextView tvOnlineService;
    private TextView tv_sobot_layout_online_service;
    private TextView tv_sobot_layout_online_tel;

    /* renamed from: com.sobot.chat.activity.SobotHelpCenterActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<List<StCategoryModel>> {
        public final /* synthetic */ SobotHelpCenterActivity this$0;

        public AnonymousClass1(SobotHelpCenterActivity sobotHelpCenterActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<StCategoryModel> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<StCategoryModel> list) {
        }
    }

    public static /* synthetic */ View access$000(SobotHelpCenterActivity sobotHelpCenterActivity) {
    }

    public static /* synthetic */ SobotAutoGridView access$100(SobotHelpCenterActivity sobotHelpCenterActivity) {
    }

    public static /* synthetic */ SobotHelpCenterAdapter access$200(SobotHelpCenterActivity sobotHelpCenterActivity) {
    }

    public static /* synthetic */ SobotHelpCenterAdapter access$202(SobotHelpCenterActivity sobotHelpCenterActivity, SobotHelpCenterAdapter sobotHelpCenterAdapter) {
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }
}
