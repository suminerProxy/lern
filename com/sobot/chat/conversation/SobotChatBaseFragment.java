package com.sobot.chat.conversation;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ListView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.ResultCallBack;
import com.sobot.chat.api.enumtype.CustomerState;
import com.sobot.chat.api.model.BaseCode;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.CommonModelBase;
import com.sobot.chat.api.model.ConsultingContent;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.OrderCardContentModel;
import com.sobot.chat.api.model.SobotConnCusParam;
import com.sobot.chat.api.model.SobotLocationModel;
import com.sobot.chat.api.model.SobotQueryFormModel;
import com.sobot.chat.api.model.SobotQuestionRecommend;
import com.sobot.chat.api.model.SobotUserTicketInfoFlag;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.api.model.ZhiChiMessage;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.core.channel.LimitQueue;
import com.sobot.chat.fragment.SobotBaseFragment;
import com.sobot.chat.notchlib.INotchScreen;
import com.sobot.network.http.callback.StringResultCallBack;
import java.io.File;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotChatBaseFragment extends SobotBaseFragment implements SensorEventListener {
    public static final int CANCEL_VOICE = 2;
    public static final int SEND_TEXT = 0;
    public static final int SEND_VOICE = 0;
    public static final int UPDATE_TEXT = 1;
    public static final int UPDATE_TEXT_VOICE = 2;
    public static final int UPDATE_VOICE = 1;
    private SensorManager _sensorManager;
    private Map<String, String> ackParams;
    private String adminFace;
    private AudioManager audioManager;
    public String currentUserName;
    public int current_client_model;
    public boolean customTimeTask;
    public CustomerState customerState;
    public boolean inPolling;
    public Information info;
    public ZhiChiInitModeBase initModel;
    private TimerTask inputTimerTask;
    private Timer inputtingListener;
    public boolean isAboveZero;
    public int isChatLock;
    public boolean isHasRequestQueryFrom;
    private boolean isQueryFroming;
    public boolean isRemindTicketInfo;
    private boolean isSendInput;
    public boolean isWritePollingLog;
    public boolean is_startCustomTimerTask;
    private String lastInputStr;
    public Context mAppContext;
    private Sensor mProximiny;
    public SobotMsgAdapter messageAdapter;
    public int noReplyTimeCustoms;
    public int noReplyTimeUserInfo;
    public int paseReplyTimeCustoms;
    public int paseReplyTimeUserInfo;
    private PollingHandler pollingHandler;
    private Map<String, String> pollingParams;
    private Runnable pollingRun;
    private String puid;
    private LimitQueue<String> receiveMsgQueue;
    public int remindRobotMessageTimes;
    public int serviceOutTimeTipCount;
    public TimerTask taskCustom;
    private TimerTask taskUserInfo;
    public Timer timerCustom;
    private Timer timerUserInfo;
    private String uid;
    public boolean userInfoTimeTask;

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(SobotChatBaseFragment sobotChatBaseFragment, View view) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass10 implements ResultCallBack<ZhiChiMessage> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ String val$filePath;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$voiceMsgId;
        public final /* synthetic */ String val$voiceTimeLongStr;

        public AnonymousClass10(SobotChatBaseFragment sobotChatBaseFragment, Handler handler, String str, String str2, String str3) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass11 implements ResultCallBack<ZhiChiMessage> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ String val$filePath;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$voiceMsgId;
        public final /* synthetic */ String val$voiceTimeLongStr;

        public AnonymousClass11(SobotChatBaseFragment sobotChatBaseFragment, Handler handler, String str, String str2, String str3) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass12 extends TimerTask {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$12$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements StringResultCallBack<CommonModel> {
            public final /* synthetic */ AnonymousClass12 this$1;

            public AnonymousClass1(AnonymousClass12 anonymousClass12) {
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

        public AnonymousClass12(SobotChatBaseFragment sobotChatBaseFragment) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass13 implements StringResultCallBack<SobotQueryFormModel> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ boolean val$isCloseInquiryFrom;
        public final /* synthetic */ SobotConnCusParam val$param;

        public AnonymousClass13(SobotChatBaseFragment sobotChatBaseFragment, boolean z, SobotConnCusParam sobotConnCusParam) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotQueryFormModel sobotQueryFormModel) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotQueryFormModel sobotQueryFormModel) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass14 implements StringResultCallBack<ZhiChiMessageBase> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ Information val$info;
        public final /* synthetic */ ZhiChiInitModeBase val$initModel;

        public AnonymousClass14(SobotChatBaseFragment sobotChatBaseFragment, ZhiChiInitModeBase zhiChiInitModeBase, Handler handler, Information information) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass15 implements StringResultCallBack<SobotUserTicketInfoFlag> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ Handler val$handler;

        public AnonymousClass15(SobotChatBaseFragment sobotChatBaseFragment, Handler handler) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotUserTicketInfoFlag sobotUserTicketInfoFlag) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotUserTicketInfoFlag sobotUserTicketInfoFlag) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass16 implements StringResultCallBack<SobotQuestionRecommend> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ ZhiChiInitModeBase val$initModel;

        public AnonymousClass16(SobotChatBaseFragment sobotChatBaseFragment, ZhiChiInitModeBase zhiChiInitModeBase, Handler handler) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotQuestionRecommend sobotQuestionRecommend) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotQuestionRecommend sobotQuestionRecommend) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass17 implements Runnable {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        public AnonymousClass17(SobotChatBaseFragment sobotChatBaseFragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass18 implements StringResultCallBack<BaseCode> {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        public AnonymousClass18(SobotChatBaseFragment sobotChatBaseFragment) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass19 implements StringResultCallBack<BaseCode> {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        public AnonymousClass19(SobotChatBaseFragment sobotChatBaseFragment) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends TimerTask {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        public AnonymousClass2(SobotChatBaseFragment sobotChatBaseFragment) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass20 implements StringResultCallBack<BaseCode> {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        public AnonymousClass20(SobotChatBaseFragment sobotChatBaseFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(BaseCode baseCode) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(BaseCode baseCode) {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends TimerTask {
        public final /* synthetic */ SobotChatBaseFragment this$0;

        public AnonymousClass3(SobotChatBaseFragment sobotChatBaseFragment) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements StringResultCallBack<ZhiChiMessageBase> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$msgId;

        public AnonymousClass4(SobotChatBaseFragment sobotChatBaseFragment, String str, Handler handler) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements StringResultCallBack<CommonModelBase> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$mid;

        public AnonymousClass5(SobotChatBaseFragment sobotChatBaseFragment, String str, Handler handler) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements StringResultCallBack<CommonModelBase> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ ConsultingContent val$consultingContent;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$mid;

        public AnonymousClass6(SobotChatBaseFragment sobotChatBaseFragment, String str, ConsultingContent consultingContent, Handler handler) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements StringResultCallBack<CommonModelBase> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$mid;
        public final /* synthetic */ OrderCardContentModel val$orderCardContent;

        public AnonymousClass7(SobotChatBaseFragment sobotChatBaseFragment, String str, OrderCardContentModel orderCardContentModel, Handler handler) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements StringResultCallBack<CommonModelBase> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ String val$finalMsgId;
        public final /* synthetic */ Handler val$handler;

        public AnonymousClass8(SobotChatBaseFragment sobotChatBaseFragment, String str, Handler handler) {
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

    /* renamed from: com.sobot.chat.conversation.SobotChatBaseFragment$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass9 implements StringResultCallBack<BaseCode> {
        public final /* synthetic */ SobotChatBaseFragment this$0;
        public final /* synthetic */ String val$finalMsgId;
        public final /* synthetic */ Handler val$handler;

        public AnonymousClass9(SobotChatBaseFragment sobotChatBaseFragment, String str, Handler handler) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class PollingHandler extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ boolean access$000(SobotChatBaseFragment sobotChatBaseFragment) {
    }

    public static /* synthetic */ boolean access$002(SobotChatBaseFragment sobotChatBaseFragment, boolean z) {
    }

    public static /* synthetic */ String access$100(SobotChatBaseFragment sobotChatBaseFragment) {
    }

    public static /* synthetic */ String access$102(SobotChatBaseFragment sobotChatBaseFragment, String str) {
    }

    public static /* synthetic */ boolean access$202(SobotChatBaseFragment sobotChatBaseFragment, boolean z) {
    }

    public static /* synthetic */ void access$300(SobotChatBaseFragment sobotChatBaseFragment, Handler handler, ZhiChiInitModeBase zhiChiInitModeBase, Information information) {
    }

    public static /* synthetic */ void access$400(SobotChatBaseFragment sobotChatBaseFragment) {
    }

    public static /* synthetic */ Runnable access$500(SobotChatBaseFragment sobotChatBaseFragment) {
    }

    public static /* synthetic */ PollingHandler access$600(SobotChatBaseFragment sobotChatBaseFragment) {
    }

    public static /* synthetic */ void access$700(SobotChatBaseFragment sobotChatBaseFragment, Context context, String str) {
    }

    public static /* synthetic */ Map access$800(SobotChatBaseFragment sobotChatBaseFragment) {
    }

    private PollingHandler getPollingHandler() {
    }

    private void initAudioManager() {
    }

    private void pollingMsg() {
    }

    private void questionRecommend(Handler handler, ZhiChiInitModeBase zhiChiInitModeBase, Information information) {
    }

    private void responseAck(Context context, String str) {
    }

    public void cancelUiVoiceMessage(SobotMsgAdapter sobotMsgAdapter, Message message) {
    }

    public void clearCache() {
    }

    public void connectCustomerService(SobotConnCusParam sobotConnCusParam) {
    }

    public void connectCustomerService(SobotConnCusParam sobotConnCusParam, boolean z) {
    }

    public void customerServiceOffline(ZhiChiInitModeBase zhiChiInitModeBase, int i2) {
    }

    @Override // com.sobot.chat.fragment.SobotBaseFragment
    public void displayInNotch(View view) {
    }

    public void finish() {
    }

    public String getAdminFace() {
    }

    public abstract String getSendMessageStr();

    public boolean isActive() {
    }

    public boolean isUserBlack() {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    public void pollingMsgForOne() {
    }

    public void processAutoSendMsg(Information information) {
    }

    public void processNewTicketMsg(Handler handler) {
    }

    public void remindRobotMessage(Handler handler, ZhiChiInitModeBase zhiChiInitModeBase, Information information) {
    }

    public void requestQueryFrom(SobotConnCusParam sobotConnCusParam, boolean z) {
    }

    public void restartInputListener() {
    }

    public void restartMyTimeTask(Handler handler) {
    }

    public void sendHttpCardMsg(String str, String str2, Handler handler, String str3, ConsultingContent consultingContent) {
    }

    public void sendHttpCustomServiceMessage(String str, String str2, String str3, Handler handler, String str4) {
    }

    public void sendHttpOrderCardMsg(String str, String str2, Handler handler, String str3, OrderCardContentModel orderCardContentModel) {
    }

    public void sendHttpRobotMessage(String str, String str2, String str3, String str4, Handler handler, int i2, String str5, String str6) {
    }

    public void sendLocation(String str, SobotLocationModel sobotLocationModel, Handler handler, boolean z) {
    }

    public void sendMessageWithLogic(String str, String str2, ZhiChiInitModeBase zhiChiInitModeBase, Handler handler, int i2, int i3, String str3) {
    }

    public void sendMsg(String str) {
    }

    public void sendMuitidiaLeaveMsg(String str, String str2, Handler handler, boolean z) {
    }

    public void sendNewMsgToHandler(ZhiChiMessageBase zhiChiMessageBase, Handler handler, int i2) {
    }

    public void sendTextMessageToHandler(String str, String str2, Handler handler, int i2, int i3) {
    }

    public void sendVoice(String str, String str2, String str3, String str4, String str5, Handler handler) {
    }

    public void sendVoiceMessageToHandler(String str, String str2, String str3, int i2, int i3, Handler handler) {
    }

    public void setAdminFace(String str) {
    }

    public void setTimeTaskMethod(Handler handler) {
    }

    public void startCustomTimeTask(Handler handler) {
    }

    public void startInputListener() {
    }

    public void startPolling() {
    }

    public void startUserInfoTimeTask(Handler handler) {
    }

    public void stopCustomTimeTask() {
    }

    public void stopInputListener() {
    }

    public void stopPolling() {
    }

    public void stopUserInfoTimeTask() {
    }

    public void updateMessageStatus(SobotMsgAdapter sobotMsgAdapter, Message message) {
    }

    public void updateMsgToHandler(String str, Handler handler, int i2) {
    }

    public void updateUiMessage(SobotMsgAdapter sobotMsgAdapter, Message message) {
    }

    public void updateUiMessageBefore(SobotMsgAdapter sobotMsgAdapter, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void updateUiMessageStatus(SobotMsgAdapter sobotMsgAdapter, String str, int i2, int i3) {
    }

    public void updateVoiceStatusMessage(SobotMsgAdapter sobotMsgAdapter, Message message) {
    }

    public void uploadFile(File file, Handler handler, ListView listView, SobotMsgAdapter sobotMsgAdapter, boolean z) {
    }

    public void uploadVideo(File file, Uri uri, SobotMsgAdapter sobotMsgAdapter) {
    }

    public void sendTextMessageToHandler(String str, String str2, Handler handler, int i2, int i3, int i4, String str3) {
    }

    public void updateUiMessage(SobotMsgAdapter sobotMsgAdapter, ZhiChiMessageBase zhiChiMessageBase) {
    }
}
