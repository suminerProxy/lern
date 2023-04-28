package com.sobot.chat.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.adapter.StViewPagerAdapter;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.fragment.SobotBaseFragment;
import com.sobot.chat.fragment.SobotPostMsgFragment;
import com.sobot.chat.widget.PagerSlidingTab;
import com.sobot.chat.widget.dialog.SobotFreeAccountTipDialog;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPostMsgActivity extends SobotBaseActivity implements View.OnClickListener {
    public static final String SOBOT_ACTION_SHOW_COMPLETED_VIEW = "sobot_action_show_completed_view";
    private boolean flag_exit_sdk;
    private int flag_exit_type;
    private StViewPagerAdapter mAdapter;
    private String mCompanyId;
    private SobotLeaveMsgConfig mConfig;
    private String mCustomerId;
    private List<SobotBaseFragment> mFragments;
    private String mGroupId;
    private boolean mIsCreateSuccess;
    private boolean mIsShowTicket;
    private LinearLayout mLlCompleted;
    private SobotPostMsgFragment mPostMsgFragment;
    private MessageReceiver mReceiver;
    private TextView mTvCompleted;
    private TextView mTvLeaveMsgCreateSuccess;
    private TextView mTvLeaveMsgCreateSuccessDes;
    private TextView mTvTicket;
    private String mUid;
    private ViewPager mViewPager;
    private LinearLayout mllContainer;
    private ImageView psgBackIv;
    private SobotFreeAccountTipDialog sobotFreeAccountTipDialog;
    private PagerSlidingTab sobot_pst_indicator;

    /* renamed from: com.sobot.chat.activity.SobotPostMsgActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotPostMsgActivity this$0;

        public AnonymousClass1(SobotPostMsgActivity sobotPostMsgActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MessageReceiver extends BroadcastReceiver {
        public final /* synthetic */ SobotPostMsgActivity this$0;

        public MessageReceiver(SobotPostMsgActivity sobotPostMsgActivity) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    public static /* synthetic */ SobotFreeAccountTipDialog access$000(SobotPostMsgActivity sobotPostMsgActivity) {
    }

    public static /* synthetic */ LinearLayout access$100(SobotPostMsgActivity sobotPostMsgActivity) {
    }

    public static /* synthetic */ ViewPager access$200(SobotPostMsgActivity sobotPostMsgActivity) {
    }

    public static /* synthetic */ LinearLayout access$300(SobotPostMsgActivity sobotPostMsgActivity) {
    }

    public static /* synthetic */ boolean access$402(SobotPostMsgActivity sobotPostMsgActivity, boolean z) {
    }

    private void initReceiver() {
    }

    private void showTicketInfo() {
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }
}
