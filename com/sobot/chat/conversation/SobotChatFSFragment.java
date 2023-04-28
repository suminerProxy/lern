package com.sobot.chat.conversation;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.BaseCode;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.CommonModelBase;
import com.sobot.chat.api.model.ConsultingContent;
import com.sobot.chat.api.model.OrderCardContentModel;
import com.sobot.chat.api.model.SobotConnCusParam;
import com.sobot.chat.api.model.SobotKeyWordTransfer;
import com.sobot.chat.api.model.SobotLableInfoList;
import com.sobot.chat.api.model.SobotRobot;
import com.sobot.chat.api.model.ZhiChiCidsModel;
import com.sobot.chat.api.model.ZhiChiGroup;
import com.sobot.chat.api.model.ZhiChiGroupBase;
import com.sobot.chat.api.model.ZhiChiHistoryMessage;
import com.sobot.chat.api.model.ZhiChiHistoryMessageBase;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.listener.PermissionListenerImpl;
import com.sobot.chat.presenter.StPostMsgPresenter;
import com.sobot.chat.utils.ExtAudioRecorder;
import com.sobot.chat.utils.ToastUtil;
import com.sobot.chat.voice.AudioPlayCallBack;
import com.sobot.chat.voice.AudioPlayPresenter;
import com.sobot.chat.widget.ClearHistoryDialog;
import com.sobot.chat.widget.ContainsEmojiEditText;
import com.sobot.chat.widget.DropdownListView;
import com.sobot.chat.widget.dialog.SobotBackDialog;
import com.sobot.chat.widget.dialog.SobotClearHistoryMsgDialog;
import com.sobot.chat.widget.dialog.SobotEvaluateDialog;
import com.sobot.chat.widget.dialog.SobotRobotListDialog;
import com.sobot.chat.widget.emoji.EmojiconNew;
import com.sobot.chat.widget.image.SobotRCImageView;
import com.sobot.chat.widget.kpswitch.util.KeyboardUtil;
import com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView;
import com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView;
import com.sobot.chat.widget.kpswitch.widget.KPSwitchFSPanelLinearLayout;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotChatFSFragment extends SobotChatBaseFragment implements View.OnClickListener, DropdownListView.OnRefreshListenerHeader, SobotMsgAdapter.SobotMsgCallBack, ContainsEmojiEditText.SobotAutoCompleteListener, ChattingPanelEmoticonView.SobotEmoticonClickListener, ChattingPanelUploadView.SobotPlusClickListener, SobotRobotListDialog.SobotRobotListListener {
    private static String preCurrentCid;
    private static int statusFlag;
    private AnimationDrawable animationDrawable;
    private ImageButton btn_emoticon_view;
    private ImageButton btn_model_edit;
    private ImageButton btn_model_voice;
    private LinearLayout btn_press_to_speak;
    private Button btn_reconnect;
    private Button btn_send;
    private ImageButton btn_set_mode_rengong;
    private Button btn_upload_view;
    private RelativeLayout chat_main;
    private List<String> cids;
    private SobotClearHistoryMsgDialog clearHistoryMsgDialog;
    private int currentCidPosition;
    public int currentPanelId;
    private int currentVoiceLong;
    private LinearLayout edittext_layout;
    private ContainsEmojiEditText et_sendmessage;
    private ExtAudioRecorder extAudioRecorder;
    @SuppressLint({"HandlerLeak"})
    public Handler handler;
    private ImageView icon_nonet;
    private ImageView image_endVoice;
    private ImageView image_reLoading;
    private boolean isAppInitEnd;
    private boolean isComment;
    private boolean isConnCustomerService;
    public boolean isCutVoice;
    private boolean isInGethistory;
    private boolean isNoMoreHistoryMsg;
    private boolean isSessionOver;
    private boolean isShowQueueTip;
    public ZhiChiMessageBase keyWordMessageBase;
    private List<ZhiChiGroupBase> list_group;
    private ProgressBar loading_anim_view;
    private LocalBroadcastManager localBroadcastManager;
    private LocalReceiver localReceiver;
    private DropdownListView lv_message;
    public AudioPlayCallBack mAudioPlayCallBack;
    public AudioPlayPresenter mAudioPlayPresenter;
    public SobotRCImageView mAvatarIV;
    private int mBottomViewtype;
    private SobotEvaluateDialog mEvaluateDialog;
    private String mFileName;
    private ViewTreeObserver.OnGlobalLayoutListener mKPSwitchListener;
    private KPSwitchFSPanelLinearLayout mPanelRoot;
    private StPostMsgPresenter mPostMsgPresenter;
    private SobotRobotListDialog mRobotListDialog;
    public TextView mTitleTextView;
    private int mUnreadNum;
    private List<ZhiChiMessageBase> messageList;
    private ImageView mic_image;
    private ImageView mic_image_animate;
    private int minRecordTime;
    public RelativeLayout net_status_remide;
    private TextView notReadInfo;
    private String offlineMsgAdminId;
    private int offlineMsgConnectFlag;
    private int queryCidsStatus;
    private int queueNum;
    private int queueTimes;
    private MyMessageReceiver receiver;
    private int recordDownTime;
    private LinearLayout recording_container;
    private TextView recording_hint;
    private ImageView recording_timeshort;
    public RelativeLayout relative;
    private TextView send_voice_robot_hint;
    private int showTimeVisiableCustomBtn;
    private SobotBackDialog sobotBackDialog;
    private RelativeLayout sobot_announcement;
    private TextView sobot_announcement_right_icon;
    private TextView sobot_announcement_title;
    public ProgressBar sobot_conn_loading;
    public LinearLayout sobot_container_conn_status;
    private HorizontalScrollView sobot_custom_menu;
    private LinearLayout sobot_custom_menu_linearlayout;
    public LinearLayout sobot_header_center_ll;
    private LinearLayout sobot_ll_bottom;
    private RelativeLayout sobot_ll_restart_talk;
    private LinearLayout sobot_ll_switch_robot;
    public TextView sobot_net_not_connect;
    public TextView sobot_title_conn_status;
    private TextView sobot_tv_close;
    private TextView sobot_tv_message;
    public TextView sobot_tv_right_second;
    public TextView sobot_tv_right_third;
    private TextView sobot_tv_satisfaction;
    private TextView sobot_tv_switch_robot;
    private TextView sobot_txt_restart_talk;
    public String tempMsgContent;
    private TextView textReConnect;
    private TextView txt_loading;
    private TextView txt_speak_content;
    public int type;
    private View view_model_split;
    private String voiceMsgId;
    public String voiceTimeLongStr;
    public Timer voiceTimer;
    public int voiceTimerLong;
    public TimerTask voiceTimerTask;
    private TextView voice_time_long;
    private LinearLayout voice_top_image;
    private FrameLayout welcome;

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass1(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass10(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass11 implements View.OnFocusChangeListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass11(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass12 implements TextWatcher {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass12(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass13 implements View.OnTouchListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass13(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass14 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass14(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass15 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass15(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass16 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass16(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass17 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass17(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass18 implements ExtAudioRecorder.AudioRecorderListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass18(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.utils.ExtAudioRecorder.AudioRecorderListener
        public void onHasPermission() {
        }

        @Override // com.sobot.chat.utils.ExtAudioRecorder.AudioRecorderListener
        public void onNoPermission() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass19 extends TimerTask {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ Handler val$handler;

        public AnonymousClass19(SobotChatFSFragment sobotChatFSFragment, Handler handler) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends Handler {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass2(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass20 implements StringResultCallBack<ZhiChiInitModeBase> {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass20(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(ZhiChiInitModeBase zhiChiInitModeBase) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ZhiChiInitModeBase zhiChiInitModeBase) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass21 implements StringResultCallBack<ZhiChiGroup> {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ SobotConnCusParam val$param;

        public AnonymousClass21(SobotChatFSFragment sobotChatFSFragment, SobotConnCusParam sobotConnCusParam) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass22 implements StringResultCallBack<ZhiChiMessageBase> {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ String val$activeTransfer;
        public final /* synthetic */ String val$docId;
        public final /* synthetic */ boolean val$isShowTips;
        public final /* synthetic */ String val$keyword;
        public final /* synthetic */ String val$keywordId;
        public final /* synthetic */ String val$unknownQuestion;

        /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$22$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements ToastUtil.OnAfterShowListener {
            public final /* synthetic */ AnonymousClass22 this$1;

            public AnonymousClass1(AnonymousClass22 anonymousClass22) {
            }

            @Override // com.sobot.chat.utils.ToastUtil.OnAfterShowListener
            public void doAfter() {
            }
        }

        /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$22$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass2 implements ToastUtil.OnAfterShowListener {
            public final /* synthetic */ AnonymousClass22 this$1;

            public AnonymousClass2(AnonymousClass22 anonymousClass22) {
            }

            @Override // com.sobot.chat.utils.ToastUtil.OnAfterShowListener
            public void doAfter() {
            }
        }

        public AnonymousClass22(SobotChatFSFragment sobotChatFSFragment, String str, String str2, boolean z, String str3, String str4, String str5) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(ZhiChiMessageBase zhiChiMessageBase) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ZhiChiMessageBase zhiChiMessageBase) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass23 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass23(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass24 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass24(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass25 implements StringResultCallBack<ZhiChiCidsModel> {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass25(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(ZhiChiCidsModel zhiChiCidsModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ZhiChiCidsModel zhiChiCidsModel) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass26 implements AudioPlayCallBack {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass26(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.voice.AudioPlayCallBack
        public void onPlayEnd(ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // com.sobot.chat.voice.AudioPlayCallBack
        public void onPlayStart(ZhiChiMessageBase zhiChiMessageBase) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass27 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ String val$leaveTemplateId;

        public AnonymousClass27(SobotChatFSFragment sobotChatFSFragment, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass28 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ ZhiChiMessageBase val$info;
        public final /* synthetic */ boolean val$isShow;

        public AnonymousClass28(SobotChatFSFragment sobotChatFSFragment, ZhiChiMessageBase zhiChiMessageBase, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass29 implements StringResultCallBack<CommonModelBase> {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;
        public final /* synthetic */ boolean val$revaluateFlag;

        /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$29$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements StringResultCallBack<BaseCode> {
            public final /* synthetic */ AnonymousClass29 this$1;

            public AnonymousClass1(AnonymousClass29 anonymousClass29) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public void onFailure(Exception exc, String str) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public /* bridge */ /* synthetic */ void onSuccess(BaseCode baseCode) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(BaseCode baseCode) {
            }
        }

        public AnonymousClass29(SobotChatFSFragment sobotChatFSFragment, ZhiChiMessageBase zhiChiMessageBase, boolean z) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(CommonModelBase commonModelBase) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(CommonModelBase commonModelBase) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass3(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass30 implements StringResultCallBack<CommonModel> {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass30(SobotChatFSFragment sobotChatFSFragment, ZhiChiMessageBase zhiChiMessageBase) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass31 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ Class val$clz;

        public AnonymousClass31(SobotChatFSFragment sobotChatFSFragment, Class cls) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass32 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass32(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass33 implements Runnable {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass33(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass34 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass34(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass35 implements ClearHistoryDialog.DialogOnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass35(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.widget.ClearHistoryDialog.DialogOnClickListener
        public void onSure() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass36 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$36$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements StringResultCallBack<CommonModelBase> {
            public final /* synthetic */ AnonymousClass36 this$1;

            public AnonymousClass1(AnonymousClass36 anonymousClass36) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public void onFailure(Exception exc, String str) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public /* bridge */ /* synthetic */ void onSuccess(CommonModelBase commonModelBase) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(CommonModelBase commonModelBase) {
            }
        }

        public AnonymousClass36(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$37  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass37 implements StPostMsgPresenter.ObtainTemplateListDelegate {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ boolean val$flag_exit_sdk;
        public final /* synthetic */ boolean val$isShowTicket;

        public AnonymousClass37(SobotChatFSFragment sobotChatFSFragment, boolean z, boolean z2) {
        }

        @Override // com.sobot.chat.presenter.StPostMsgPresenter.ObtainTemplateListDelegate
        public void onSuccess(Intent intent) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$38  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass38 implements StringResultCallBack<ZhiChiHistoryMessage> {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass38(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(ZhiChiHistoryMessage zhiChiHistoryMessage) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(ZhiChiHistoryMessage zhiChiHistoryMessage) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$39  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass39 extends PermissionListenerImpl {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass39(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass4(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$40  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass40 implements ExtAudioRecorder.AudioRecorderListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass40(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.utils.ExtAudioRecorder.AudioRecorderListener
        public void onHasPermission() {
        }

        @Override // com.sobot.chat.utils.ExtAudioRecorder.AudioRecorderListener
        public void onNoPermission() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$41  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass41 implements StringResultCallBack<List<SobotLableInfoList>> {
        public final /* synthetic */ SobotChatFSFragment this$0;
        public final /* synthetic */ int val$marginRight;

        /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$41$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass41 this$1;

            public AnonymousClass1(AnonymousClass41 anonymousClass41) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass41(SobotChatFSFragment sobotChatFSFragment, int i2) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<SobotLableInfoList> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SobotLableInfoList> list) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements KeyboardUtil.OnKeyboardShowingListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass5(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.widget.kpswitch.util.KeyboardUtil.OnKeyboardShowingListener
        public void onKeyboardShowing(boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 extends NoDoubleClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass6(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements DropdownListView.DropdownListScrollListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass7(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // com.sobot.chat.widget.DropdownListView.DropdownListScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass8(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatFSFragment$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public AnonymousClass9(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class LocalReceiver extends BroadcastReceiver {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public LocalReceiver(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyMessageReceiver extends BroadcastReceiver {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public MyMessageReceiver(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class PressToSpeakListen implements View.OnTouchListener {
        public final /* synthetic */ SobotChatFSFragment this$0;

        public PressToSpeakListen(SobotChatFSFragment sobotChatFSFragment) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    public static /* synthetic */ TextView access$000(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageView access$100(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$1000(SobotChatFSFragment sobotChatFSFragment, String str, String str2, String str3, boolean z) {
    }

    public static /* synthetic */ void access$1100(SobotChatFSFragment sobotChatFSFragment, String str, String str2, String str3, boolean z, int i2, String str4, String str5, String str6) {
    }

    public static /* synthetic */ void access$1200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$1300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ int access$1400(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ TextView access$1500(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageView access$1600(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageView access$1700(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageView access$1800(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ LinearLayout access$1900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ Button access$200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ int access$2000(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ int access$2002(SobotChatFSFragment sobotChatFSFragment, int i2) {
    }

    public static /* synthetic */ int access$2100(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ TextView access$2200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ TextView access$2300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ LinearLayout access$2400(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ List access$2500(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ TextView access$2600(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$2700(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageButton access$2800(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ContainsEmojiEditText access$2900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ProgressBar access$300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ Button access$3000(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ Button access$3100(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ KPSwitchFSPanelLinearLayout access$3200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$3300(SobotChatFSFragment sobotChatFSFragment, boolean z, int i2) {
    }

    public static /* synthetic */ AnimationDrawable access$3400(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$3500(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ String access$3600(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ String access$3602(SobotChatFSFragment sobotChatFSFragment, String str) {
    }

    public static /* synthetic */ void access$3700(SobotChatFSFragment sobotChatFSFragment, int i2, String str) {
    }

    public static /* synthetic */ boolean access$3802(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ void access$3900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ TextView access$400(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$4000(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$4100(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$4200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$4300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ int access$4402(SobotChatFSFragment sobotChatFSFragment, int i2) {
    }

    public static /* synthetic */ String access$4502(SobotChatFSFragment sobotChatFSFragment, String str) {
    }

    public static /* synthetic */ void access$4600(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$4700(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageButton access$4800(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageButton access$4900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$500(SobotChatFSFragment sobotChatFSFragment, int i2) {
    }

    public static /* synthetic */ ImageButton access$5000(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$5100(SobotChatFSFragment sobotChatFSFragment, String str, String str2, String str3, boolean z, String str4) {
    }

    public static /* synthetic */ boolean access$5202(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ void access$5300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ List access$5400(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ List access$5402(SobotChatFSFragment sobotChatFSFragment, List list) {
    }

    public static /* synthetic */ void access$5500(SobotChatFSFragment sobotChatFSFragment, SobotConnCusParam sobotConnCusParam, int i2) {
    }

    public static /* synthetic */ void access$5600(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ boolean access$5702(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ int access$5802(int i2) {
    }

    public static /* synthetic */ String access$5902(String str) {
    }

    public static /* synthetic */ DropdownListView access$600(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$6000(SobotChatFSFragment sobotChatFSFragment, String str, String str2, boolean z) {
    }

    public static /* synthetic */ void access$6100(SobotChatFSFragment sobotChatFSFragment, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
    }

    public static /* synthetic */ void access$6200(SobotChatFSFragment sobotChatFSFragment, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public static /* synthetic */ void access$6300(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ int access$6402(SobotChatFSFragment sobotChatFSFragment, int i2) {
    }

    public static /* synthetic */ boolean access$6500(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ boolean access$6502(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ void access$6600(SobotChatFSFragment sobotChatFSFragment, String str, int i2, String str2, boolean z) {
    }

    public static /* synthetic */ int access$6702(SobotChatFSFragment sobotChatFSFragment, int i2) {
    }

    public static /* synthetic */ List access$6800(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ List access$6802(SobotChatFSFragment sobotChatFSFragment, List list) {
    }

    public static /* synthetic */ StPostMsgPresenter access$6900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ TextView access$700(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$7000(SobotChatFSFragment sobotChatFSFragment, Class cls) {
    }

    public static /* synthetic */ void access$7100(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ SobotBackDialog access$7200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ SobotClearHistoryMsgDialog access$7300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ boolean access$7402(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ void access$7500(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ int access$7608(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$7700(SobotChatFSFragment sobotChatFSFragment, List list) {
    }

    public static /* synthetic */ int access$7802(SobotChatFSFragment sobotChatFSFragment, int i2) {
    }

    public static /* synthetic */ void access$7900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$800(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ FrameLayout access$8000(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$8100(SobotChatFSFragment sobotChatFSFragment, String str, String str2) {
    }

    public static /* synthetic */ boolean access$8200(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ boolean access$8202(SobotChatFSFragment sobotChatFSFragment, boolean z) {
    }

    public static /* synthetic */ void access$8300(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$8400(SobotChatFSFragment sobotChatFSFragment, int i2, String str) {
    }

    public static /* synthetic */ LinearLayout access$8500(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ ImageView access$8600(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$8700(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$8800(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ LinearLayout access$8900(SobotChatFSFragment sobotChatFSFragment) {
    }

    public static /* synthetic */ void access$900(SobotChatFSFragment sobotChatFSFragment, SobotKeyWordTransfer sobotKeyWordTransfer) {
    }

    public static /* synthetic */ HorizontalScrollView access$9000(SobotChatFSFragment sobotChatFSFragment) {
    }

    private void addKeyWordTipMsg(SobotKeyWordTransfer sobotKeyWordTransfer) {
    }

    private void applyUIConfig() {
    }

    private void connCustomerServiceBlack(boolean z) {
    }

    private void connCustomerServiceFail(boolean z) {
    }

    private void connCustomerServiceSuccess(ZhiChiMessageBase zhiChiMessageBase) {
    }

    private void createConsultingContent(int i2) {
    }

    private void createCustomerQueue(String str, int i2, String str2, boolean z) {
    }

    private void createCustomerService(String str, String str2) {
    }

    private void createOrderCardContent(int i2) {
    }

    private void customerInit(int i2) {
    }

    private void doKeepsessionInit(int i2) {
    }

    private void editModelToVoice(int i2, String str) {
    }

    private void getAnnouncement() {
    }

    private void getGroupInfo(SobotConnCusParam sobotConnCusParam) {
    }

    private String getPanelViewTag(View view) {
    }

    private void gotoLastItem() {
    }

    private void hideRobotVoiceHint() {
    }

    private void initBrocastReceiver() {
    }

    private void initListener() {
    }

    private void initSdk(boolean z, int i2) {
    }

    private void initView(View view) {
    }

    private void keepSession(List<ZhiChiMessageBase> list) {
    }

    private void loadUnreadNum() {
    }

    public static SobotChatFSFragment newInstance(Bundle bundle) {
    }

    private void onLoad() {
    }

    private void onlyCustomPaidui() {
    }

    private void processPlatformAppId() {
    }

    private void queryCids() {
    }

    private <T> void refreshItemByCategory(Class<T> cls) {
    }

    private void resetBtnUploadAndSend() {
    }

    private void resetUser(int i2) {
    }

    private void restMultiMsg() {
    }

    private void saveCache() {
    }

    private void sendMsgToRobot(ZhiChiMessageBase zhiChiMessageBase, int i2, int i3, String str) {
    }

    private void sendVoiceMap(int i2, String str) {
    }

    private void setPanelView(View view, int i2) {
    }

    private void setToolBar() {
    }

    private void setupListView() {
    }

    private void showAudioRecorder() {
    }

    private void showCaiToCustomerTip() {
    }

    private void showCustomerOfflineTip() {
    }

    private void showCustomerUanbleTip() {
    }

    private void showData(List<ZhiChiHistoryMessageBase> list) {
    }

    private void showEmotionBtn() {
    }

    private void showHint(String str) {
    }

    private void showInLineHint(String str) {
    }

    private void showInitError() {
    }

    private void showLeaveMsg() {
    }

    private void showLogicTitle(String str, String str2, boolean z) {
    }

    private void showNoHistory() {
    }

    private void showOutlineTip(ZhiChiInitModeBase zhiChiInitModeBase, int i2) {
    }

    private void showRobotLayout() {
    }

    private void showRobotVoiceHint() {
    }

    private void showSwitchRobotBtn() {
    }

    private void showTransferCustomer() {
    }

    private void sobotCustomMenu() {
    }

    private void startMicAnimate() {
    }

    private void startVoice() {
    }

    private void stopVoice() {
    }

    private void transfer2Custom(String str, String str2, String str3, boolean z) {
    }

    private void transfer2CustomBySkillId(SobotConnCusParam sobotConnCusParam, int i2) {
    }

    private void updateFloatUnreadIcon() {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void addMessage(ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView.SobotEmoticonClickListener
    public void backspace() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView.SobotPlusClickListener
    public void btnCameraPicture() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView.SobotPlusClickListener
    public void btnPicture() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView.SobotPlusClickListener
    public void btnSatisfaction() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView.SobotPlusClickListener
    public void btnVedio() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView.SobotPlusClickListener
    public void chooseFile() {
    }

    public void clearHistory() {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void clickAudioItem(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void closeVoiceWindows(int i2) {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment
    public void connectCustomerService(SobotConnCusParam sobotConnCusParam, boolean z) {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment
    public void customerServiceOffline(ZhiChiInitModeBase zhiChiInitModeBase, int i2) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void doClickTransferBtn(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void doEmoticonBtn2Blur() {
    }

    public void doEmoticonBtn2Focus() {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void doEvaluate(boolean z, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void doRevaluate(boolean z, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public String getActivityTitle() {
    }

    public void getHistoryMessage(boolean z) {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment
    public String getSendMessageStr() {
    }

    public void hideItemTransferBtn() {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void hidePanelAndKeyboard() {
    }

    public void hideReLoading() {
    }

    public void initData() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView.SobotEmoticonClickListener
    public void inputEmoticon(EmojiconNew emojiconNew) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void mulitDiaToLeaveMsg(String str) {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void onBackPress() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public void onCloseMenuClick() {
    }

    @Override // com.sobot.chat.fragment.SobotBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // com.sobot.chat.fragment.SobotBaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    public void onLeftBackColseClick() {
    }

    public void onLeftMenuClick() {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // com.sobot.chat.widget.DropdownListView.OnRefreshListenerHeader
    public void onRefresh() {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
    }

    public void onRightMenuClick(View view) {
    }

    @Override // com.sobot.chat.widget.ContainsEmojiEditText.SobotAutoCompleteListener
    public void onRobotGuessComplete(String str) {
    }

    @Override // com.sobot.chat.widget.dialog.SobotRobotListDialog.SobotRobotListListener
    public void onSobotRobotListItemClick(SobotRobot sobotRobot) {
    }

    public void pressSpeakSwitchPanelAndKeyboard(View view) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void removeMessageByMsgId(String str) {
    }

    public void resetEmoticonBtn() {
    }

    public void sendCardMsg(ConsultingContent consultingContent) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void sendConsultingContent() {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void sendMessage(String str) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void sendMessageToRobot(ZhiChiMessageBase zhiChiMessageBase, int i2, int i3, String str) {
    }

    @Override // com.sobot.chat.conversation.SobotChatBaseFragment
    public void sendMsg(String str) {
    }

    public void sendOrderCardMsg(OrderCardContentModel orderCardContentModel) {
    }

    public void sendVoiceTimeTask(Handler handler) {
    }

    public void setAvatar(String str, boolean z) {
    }

    public void setBottomView(int i2) {
    }

    public void setShowNetRemind(boolean z) {
    }

    public void setTitle(CharSequence charSequence, boolean z) {
    }

    public void showVoiceAnim(ZhiChiMessageBase zhiChiMessageBase, boolean z) {
    }

    public void showVoiceBtn() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView.SobotPlusClickListener
    public void startToPostMsgActivty(boolean z) {
    }

    public void startVoiceTimeTask(Handler handler) {
    }

    public void stopVoiceTimeTask() {
    }

    public void submitEvaluation(boolean z, int i2, int i3, String str) {
    }

    public void switchEmoticonBtn() {
    }

    public void switchPanelAndKeyboard(View view, View view2, View view3) {
    }

    public void voiceCuttingMethod() {
    }

    private void sendMsgToRobot(ZhiChiMessageBase zhiChiMessageBase, int i2, int i3, String str, String str2) {
    }

    private void transfer2Custom(String str, String str2, String str3, boolean z, String str4) {
    }

    public void hidePanelAndKeyboard(KPSwitchFSPanelLinearLayout kPSwitchFSPanelLinearLayout) {
    }

    @Override // com.sobot.chat.adapter.SobotMsgAdapter.SobotMsgCallBack
    public void sendMessageToRobot(ZhiChiMessageBase zhiChiMessageBase, int i2, int i3, String str, String str2) {
    }

    public void startToPostMsgActivty(boolean z, boolean z2) {
    }

    private void transfer2Custom(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
    }

    private void transfer2Custom(String str, String str2, String str3, boolean z, int i2, String str4, String str5, String str6) {
    }

    public void setAvatar(int i2, boolean z) {
    }

    public void doClickTransferBtn() {
    }
}
