package com.sobot.chat;

import android.content.Context;
import com.sobot.chat.api.enumtype.SobotChatAvatarDisplayMode;
import com.sobot.chat.api.enumtype.SobotChatTitleDisplayMode;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.ConsultingContent;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.OrderCardContentModel;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.api.model.SobotLeaveReplyModel;
import com.sobot.chat.api.model.SobotLocationModel;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import com.sobot.chat.api.model.SobotTransferOperatorParam;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.core.HttpUtils;
import com.sobot.chat.listener.HyperlinkListener;
import com.sobot.chat.listener.NewHyperlinkListener;
import com.sobot.chat.listener.SobotChatStatusListener;
import com.sobot.chat.listener.SobotFunctionClickListener;
import com.sobot.chat.listener.SobotLeaveMsgListener;
import com.sobot.chat.listener.SobotNoReadLeaveReplyListener;
import com.sobot.chat.listener.SobotOrderCardListener;
import com.sobot.network.http.callback.StringResultCallBack;
import java.io.File;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ZCSobotApi {
    private static String Tag;

    /* renamed from: com.sobot.chat.ZCSobotApi$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements StringResultCallBack<ZhiChiInitModeBase> {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ Information val$info;
        public final /* synthetic */ boolean val$isOnlyShowTicket;

        /* renamed from: com.sobot.chat.ZCSobotApi$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C01411 implements StringResultCallBack<SobotLeaveMsgConfig> {
            public final /* synthetic */ AnonymousClass1 this$0;
            public final /* synthetic */ ZhiChiInitModeBase val$initModel;
            public final /* synthetic */ List val$sobotFieldModels;

            public C01411(AnonymousClass1 anonymousClass1, ZhiChiInitModeBase zhiChiInitModeBase, List list) {
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

        public AnonymousClass1(Context context, Information information, boolean z) {
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

    /* renamed from: com.sobot.chat.ZCSobotApi$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 implements StringResultCallBack<List<SobotLeaveReplyModel>> {
        public final /* synthetic */ SobotNoReadLeaveReplyListener val$noReadLeaveReplyListener;
        public final /* synthetic */ List val$sobotLeaveReplyModels;

        public AnonymousClass2(List list, SobotNoReadLeaveReplyListener sobotNoReadLeaveReplyListener) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<SobotLeaveReplyModel> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SobotLeaveReplyModel> list) {
        }
    }

    /* renamed from: com.sobot.chat.ZCSobotApi$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass3 implements StringResultCallBack<CommonModel> {
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

    /* renamed from: com.sobot.chat.ZCSobotApi$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass4 implements Runnable {
        public final /* synthetic */ String val$appkey;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$partnerid;

        public AnonymousClass4(Context context, String str, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.ZCSobotApi$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass5 implements HttpUtils.FileCallBack {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$language;
        public final /* synthetic */ String val$languagePath;

        public AnonymousClass5(String str, Context context, String str2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void inProgress(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onError(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onResponse(File file) {
        }
    }

    public static void cancleAllNotification(Context context) {
    }

    public static void checkIMConnected(Context context, String str) {
    }

    public static void clearMsgCenterList(Context context, String str) {
    }

    public static void clearUnReadNumber(Context context, String str) {
    }

    public static void closeIMConnection(Context context) {
    }

    public static void connectCustomerService(Context context, SobotTransferOperatorParam sobotTransferOperatorParam) {
    }

    public static String getAppName(Context context) {
    }

    public static String getAppVersion(Context context) {
    }

    public static Information getCurrentInfoSetting(Context context) {
    }

    public static void getLastLeaveReplyMessage(Context context, String str, SobotNoReadLeaveReplyListener sobotNoReadLeaveReplyListener) {
    }

    public static String getLastMessage(Context context) {
    }

    public static List<SobotMsgCenterModel> getMsgCenterList(Context context, String str) {
    }

    public static String getPhoneType() {
    }

    public static boolean getSwitchMarkStatus(int i2) {
    }

    public static String getSystem() {
    }

    public static int getUnReadMessage(Context context, String str) {
    }

    public static String getUserUUID(Context context) {
    }

    public static String getVersion(Context context) {
    }

    @Deprecated
    public static void hideHistoryMsg(Context context, long j2) {
    }

    public static void hideTimemsgForMessageList(Context context, boolean z) {
    }

    public static void initPlatformUnion(Context context, String str, String str2) {
    }

    public static void initSobotSDK(Context context, String str, String str2) {
    }

    public static boolean isActiveOperator(Context context, String str) {
    }

    public static void openLeave(Context context, Information information, boolean z) {
    }

    public static void openZCChat(Context context, Information information) {
    }

    public static void openZCChatListView(Context context, String str) {
    }

    public static void openZCServiceCenter(Context context, Information information) {
    }

    public static void outCurrentUserZCLibInfo(Context context) {
    }

    public static String readLogFileDateString(String str) {
    }

    public static void replacePhoneNumberPattern(String str) {
    }

    public static void replaceWebUrlPattern(String str) {
    }

    public static void sendLeaveReplyNotification(Context context, SobotLeaveReplyModel sobotLeaveReplyModel, int i2, int i3) {
    }

    public static void sendLocation(Context context, SobotLocationModel sobotLocationModel) {
    }

    public static void sendMessageToUser(Context context, String str, String str2) {
    }

    public static void sendOrderGoodsInfo(Context context, OrderCardContentModel orderCardContentModel) {
    }

    public static void sendProductInfo(Context context, ConsultingContent consultingContent) {
    }

    public static void sendTextToRobot(Context context, String str) {
    }

    public static void sendTextToUser(Context context, String str) {
    }

    public static void setAdmin_Hello_Word(Context context, String str) {
    }

    public static void setAdmin_Offline_Title(Context context, String str) {
    }

    public static void setAdmin_Tip_Word(Context context, String str) {
    }

    public static void setChatAvatarDisplayMode(Context context, SobotChatAvatarDisplayMode sobotChatAvatarDisplayMode, String str, boolean z) {
    }

    public static void setChatStatusListener(SobotChatStatusListener sobotChatStatusListener) {
    }

    public static void setChatTitleDisplayMode(Context context, SobotChatTitleDisplayMode sobotChatTitleDisplayMode, String str, boolean z) {
    }

    @Deprecated
    public static void setCustomAdminHelloWord(Context context, String str) {
    }

    @Deprecated
    public static void setCustomAdminNonelineTitle(Context context, String str) {
    }

    @Deprecated
    public static void setCustomAdminTipWord(Context context, String str) {
    }

    @Deprecated
    public static void setCustomRobotHelloWord(Context context, String str) {
    }

    @Deprecated
    public static void setCustomUserOutWord(Context context, String str) {
    }

    @Deprecated
    public static void setCustomUserTipWord(Context context, String str) {
    }

    public static void setEvaluationCompletedExit(Context context, boolean z) {
    }

    @Deprecated
    public static void setFlowCompanyId(Context context, String str) {
    }

    @Deprecated
    public static void setFlowGroupId(Context context, String str) {
    }

    @Deprecated
    public static void setFlowType(Context context, String str) {
    }

    public static void setFlow_Company_Id(Context context, String str) {
    }

    public static void setFlow_GroupId(Context context, String str) {
    }

    public static void setFlow_Type(Context context, String str) {
    }

    public static void setFunctionClickListener(SobotFunctionClickListener sobotFunctionClickListener) {
    }

    public static void setHyperlinkListener(HyperlinkListener hyperlinkListener) {
    }

    public static void setInternationalLanguage(Context context, String str, boolean z, boolean z2) {
    }

    public static void setNewHyperlinkListener(NewHyperlinkListener newHyperlinkListener) {
    }

    public static void setNotificationFlag(Context context, boolean z, int i2, int i3) {
    }

    @Deprecated
    public static void setOrderCardListener(SobotOrderCardListener sobotOrderCardListener) {
    }

    public static void setRobot_Hello_Word(Context context, String str) {
    }

    public static void setScope_time(Context context, long j2) {
    }

    public static void setShowDebug(Boolean bool) {
    }

    public static void setSobotLeaveMsgListener(SobotLeaveMsgListener sobotLeaveMsgListener) {
    }

    public static void setSwitchMarkStatus(int i2, boolean z) {
    }

    public static void setUser_Out_Word(Context context, String str) {
    }

    public static void setUser_Tip_Word(Context context, String str) {
    }
}
