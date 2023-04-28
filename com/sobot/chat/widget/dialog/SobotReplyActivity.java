package com.sobot.chat.widget.dialog;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.sobot.chat.activity.base.SobotDialogBaseActivity;
import com.sobot.chat.adapter.SobotPicListAdapter;
import com.sobot.chat.api.ResultCallBack;
import com.sobot.chat.api.model.SobotUserTicketInfo;
import com.sobot.chat.api.model.ZhiChiMessage;
import com.sobot.chat.api.model.ZhiChiUploadAppFileModelResult;
import com.sobot.chat.listener.PermissionListener;
import com.sobot.chat.listener.PermissionListenerImpl;
import com.sobot.chat.notchlib.INotchScreen;
import com.sobot.chat.utils.ChatUtils;
import com.sobot.network.http.callback.StringResultCallBack;
import java.io.File;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotReplyActivity extends SobotDialogBaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private SobotPicListAdapter adapter;
    public File cameraFile;
    private View.OnClickListener itemsOnClick;
    private String mCompanyId;
    private SobotUserTicketInfo mTicketInfo;
    private String mUid;
    private SobotSelectPicDialog menuWindow;
    public PermissionListener permissionListener;
    private ArrayList<ZhiChiUploadAppFileModelResult> pic_list;
    public SobotDeleteWorkOrderDialog seleteMenuWindow;
    private ChatUtils.SobotSendFileListener sendFileListener;
    private Button sobotBtnSubmit;
    private LinearLayout sobotNegativeButton;
    private EditText sobotReplyEdit;
    private GridView sobotReplyMsgPic;
    private TextView sobotTvTitle;

    /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ SobotReplyActivity this$0;

        public AnonymousClass1(SobotReplyActivity sobotReplyActivity) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StringResultCallBack<String> {
        public final /* synthetic */ SobotReplyActivity this$0;

        public AnonymousClass2(SobotReplyActivity sobotReplyActivity) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements SobotPicListAdapter.ViewClickListener {
        public final /* synthetic */ SobotReplyActivity this$0;

        /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass3(SobotReplyActivity sobotReplyActivity) {
        }

        @Override // com.sobot.chat.adapter.SobotPicListAdapter.ViewClickListener
        public void clickView(View view, int i2, int i3) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ SobotReplyActivity this$0;

        /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 extends PermissionListenerImpl {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
            public void onPermissionSuccessListener() {
            }
        }

        /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$4$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass2 extends PermissionListenerImpl {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass2(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
            public void onPermissionSuccessListener() {
            }
        }

        /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$4$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass3 extends PermissionListenerImpl {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass3(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
            public void onPermissionSuccessListener() {
            }
        }

        public AnonymousClass4(SobotReplyActivity sobotReplyActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements ChatUtils.SobotSendFileListener {
        public final /* synthetic */ SobotReplyActivity this$0;

        /* renamed from: com.sobot.chat.widget.dialog.SobotReplyActivity$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements ResultCallBack<ZhiChiMessage> {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ String val$filePath;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, String str) {
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

        public AnonymousClass5(SobotReplyActivity sobotReplyActivity) {
        }

        @Override // com.sobot.chat.utils.ChatUtils.SobotSendFileListener
        public void onError() {
        }

        @Override // com.sobot.chat.utils.ChatUtils.SobotSendFileListener
        public void onSuccess(String str) {
        }
    }

    public static /* synthetic */ EditText access$000(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ ArrayList access$100(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ SobotSelectPicDialog access$200(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ SobotSelectPicDialog access$202(SobotReplyActivity sobotReplyActivity, SobotSelectPicDialog sobotSelectPicDialog) {
    }

    public static /* synthetic */ View.OnClickListener access$300(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ SobotPicListAdapter access$400(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ boolean access$500(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ boolean access$600(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ boolean access$700(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ String access$800(SobotReplyActivity sobotReplyActivity) {
    }

    public static /* synthetic */ String access$900(SobotReplyActivity sobotReplyActivity) {
    }

    private void initPicListView() {
    }

    public void addPicView(ZhiChiUploadAppFileModelResult zhiChiUploadAppFileModelResult) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    public String getFileStr() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    public boolean isShouldHideInput(View view, MotionEvent motionEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.sobot.chat.activity.base.SobotDialogBaseActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public void showHint(String str) {
    }
}
