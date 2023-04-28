package com.sobot.chat.widget.dialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotRobotListAdapter;
import com.sobot.chat.api.model.SobotRobot;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotRobotListActivity extends SobotDialogBaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private final String CANCEL_TAG;
    private SobotRobotListAdapter mListAdapter;
    private String mRobotFlag;
    private String mUid;
    private GridView sobot_gv;
    private LinearLayout sobot_negativeButton;
    private TextView sobot_tv_title;

    /* renamed from: com.sobot.chat.widget.dialog.SobotRobotListActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StringResultCallBack<List<SobotRobot>> {
        public final /* synthetic */ SobotRobotListActivity this$0;

        public AnonymousClass1(SobotRobotListActivity sobotRobotListActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<SobotRobot> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SobotRobot> list) {
        }
    }

    public static /* synthetic */ String access$000(SobotRobotListActivity sobotRobotListActivity) {
    }

    public static /* synthetic */ SobotRobotListAdapter access$100(SobotRobotListActivity sobotRobotListActivity) {
    }

    public static /* synthetic */ SobotRobotListAdapter access$102(SobotRobotListActivity sobotRobotListActivity, SobotRobotListAdapter sobotRobotListAdapter) {
    }

    public static /* synthetic */ GridView access$200(SobotRobotListActivity sobotRobotListActivity) {
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

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }
}
