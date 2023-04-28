package com.sobot.chat.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.adapter.SobotMsgCenterAdapter;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import com.sobot.chat.handler.SobotMsgCenterHandler;
import com.sobot.chat.receiver.SobotMsgCenterReceiver;
import com.sobot.chat.utils.SobotCompareNewMsgTime;
import com.sobot.network.http.callback.StringResultCallBack;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotConsultationListActivity extends SobotBaseActivity implements SobotMsgCenterHandler.SobotMsgCenterCallBack {
    private static final int REFRESH_DATA = 1;
    private SobotMsgCenterAdapter adapter;
    private String currentUid;
    private List<SobotMsgCenterModel> datas;
    private LocalBroadcastManager localBroadcastManager;
    private SobotCompareNewMsgTime mCompareNewMsgTime;
    private SHandler mHandler;
    private SobotMessageReceiver receiver;
    private ListView sobot_ll_msg_center;

    /* renamed from: com.sobot.chat.activity.SobotConsultationListActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SobotConsultationListActivity this$0;

        public AnonymousClass1(SobotConsultationListActivity sobotConsultationListActivity) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotConsultationListActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements AdapterView.OnItemLongClickListener {
        public final /* synthetic */ SobotConsultationListActivity this$0;

        /* renamed from: com.sobot.chat.activity.SobotConsultationListActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements DialogInterface.OnClickListener {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ int val$position;

            /* renamed from: com.sobot.chat.activity.SobotConsultationListActivity$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public class C01431 implements StringResultCallBack<SobotMsgCenterModel> {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C01431(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.sobot.network.http.callback.StringResultCallBack
                public void onFailure(Exception exc, String str) {
                }

                @Override // com.sobot.network.http.callback.StringResultCallBack
                public /* bridge */ /* synthetic */ void onSuccess(SobotMsgCenterModel sobotMsgCenterModel) {
                }

                /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
                public void onSuccess2(SobotMsgCenterModel sobotMsgCenterModel) {
                }
            }

            public AnonymousClass1(AnonymousClass2 anonymousClass2, int i2) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        public AnonymousClass2(SobotConsultationListActivity sobotConsultationListActivity) {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SHandler extends Handler {
        public WeakReference<Activity> mActivityReference;

        public SHandler(Activity activity) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class SobotMessageReceiver extends SobotMsgCenterReceiver {
        public final /* synthetic */ SobotConsultationListActivity this$0;

        public SobotMessageReceiver(SobotConsultationListActivity sobotConsultationListActivity) {
        }

        @Override // com.sobot.chat.receiver.SobotMsgCenterReceiver
        public List<SobotMsgCenterModel> getMsgCenterDatas() {
        }

        @Override // com.sobot.chat.receiver.SobotMsgCenterReceiver
        public void onDataChanged(SobotMsgCenterModel sobotMsgCenterModel) {
        }
    }

    public static /* synthetic */ List access$000(SobotConsultationListActivity sobotConsultationListActivity) {
    }

    public static /* synthetic */ SobotMsgCenterAdapter access$100(SobotConsultationListActivity sobotConsultationListActivity) {
    }

    public static /* synthetic */ SobotMsgCenterAdapter access$102(SobotConsultationListActivity sobotConsultationListActivity, SobotMsgCenterAdapter sobotMsgCenterAdapter) {
    }

    public static /* synthetic */ ListView access$200(SobotConsultationListActivity sobotConsultationListActivity) {
    }

    public static /* synthetic */ String access$300(SobotConsultationListActivity sobotConsultationListActivity) {
    }

    public static /* synthetic */ SobotCompareNewMsgTime access$400(SobotConsultationListActivity sobotConsultationListActivity) {
    }

    public static /* synthetic */ void access$500(SobotConsultationListActivity sobotConsultationListActivity, List list) {
    }

    private void initBrocastReceiver() {
    }

    private void sendDatasOnUi(List<SobotMsgCenterModel> list) {
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

    @Override // com.sobot.chat.handler.SobotMsgCenterHandler.SobotMsgCenterCallBack
    public void onAllDataSuccess(List<SobotMsgCenterModel> list) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.sobot.chat.handler.SobotMsgCenterHandler.SobotMsgCenterCallBack
    public void onLocalDataSuccess(List<SobotMsgCenterModel> list) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    public void refershItemData(SobotMsgCenterModel sobotMsgCenterModel) {
    }
}
