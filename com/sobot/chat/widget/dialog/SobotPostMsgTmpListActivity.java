package com.sobot.chat.widget.dialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotPostMsgTmpListAdapter;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.api.model.SobotPostMsgTemplate;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostMsgTmpListActivity extends SobotDialogBaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private ArrayList<SobotPostMsgTemplate> mDatas;
    private SobotPostMsgTmpListAdapter mListAdapter;
    private GridView sobot_gv;
    private LinearLayout sobot_negativeButton;
    private TextView sobot_tv_title;

    /* renamed from: com.sobot.chat.widget.dialog.SobotPostMsgTmpListActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<SobotLeaveMsgConfig> {
        public final /* synthetic */ SobotPostMsgTmpListActivity this$0;

        public AnonymousClass1(SobotPostMsgTmpListActivity sobotPostMsgTmpListActivity) {
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

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }
}
