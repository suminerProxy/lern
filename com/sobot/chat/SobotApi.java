package com.sobot.chat;

import android.content.Context;
import com.sobot.chat.api.enumtype.SobotChatAvatarDisplayMode;
import com.sobot.chat.api.enumtype.SobotChatTitleDisplayMode;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.ConsultingContent;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.OrderCardContentModel;
import com.sobot.chat.api.model.SobotLocationModel;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import com.sobot.chat.api.model.SobotTransferOperatorParam;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.listener.HyperlinkListener;
import com.sobot.chat.listener.NewHyperlinkListener;
import com.sobot.chat.listener.SobotChatStatusListener;
import com.sobot.chat.listener.SobotLeaveMsgListener;
import com.sobot.chat.listener.SobotOrderCardListener;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotApi {
    private static String Tag = "SobotApi";

    /* renamed from: com.sobot.chat.SobotApi$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ String val$appkey;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$uid;

        public AnonymousClass1(Context context, String str, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.SobotApi$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 implements StringResultCallBack<CommonModel> {
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

    /* renamed from: com.sobot.chat.SobotApi$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass3 implements StringResultCallBack<ZhiChiInitModeBase> {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ Information val$info;
        public final /* synthetic */ boolean val$isOnlyShowTicket;

        public AnonymousClass3(Context context, Information information, boolean z) {
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

    public static void cancleAllNotification(Context context) {
    }

    public static void clearAllUnreadCount(Context context, String str) {
    }

    public static void clearMsgCenterList(Context context, String str) {
    }

    public static void disSobotChannel(Context context) {
    }

    public static void exitSobotChat(Context context) {
    }

    public static List<SobotMsgCenterModel> getMsgCenterList(Context context, String str) {
    }

    public static boolean getSwitchMarkStatus(int i2) {
    }

    public static int getUnreadMsg(Context context, String str) {
    }

    @Deprecated
    public static void hideHistoryMsg(Context context, long j2) {
    }

    public static void initPlatformUnion(Context context, String str, String str2) {
    }

    public static void initSobotChannel(Context context, String str) {
    }

    public static void initSobotSDK(Context context, String str, String str2) {
    }

    public static boolean isActiveOperator(Context context, String str) {
    }

    public static void openSobotHelpCenter(Context context, Information information) {
    }

    public static void replacePhoneNumberPattern(String str) {
    }

    public static void replaceWebUrlPattern(String str) {
    }

    public static void sendCardMsg(Context context, ConsultingContent consultingContent) {
    }

    public static void sendLocation(Context context, SobotLocationModel sobotLocationModel) {
    }

    public static void sendOrderCardMsg(Context context, OrderCardContentModel orderCardContentModel) {
    }

    public static void sendTextMsg(Context context, String str) {
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

    public static void setHyperlinkListener(HyperlinkListener hyperlinkListener) {
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

    public static void startMsgCenter(Context context, String str) {
    }

    public static void startSobotChat(Context context, Information information) {
    }

    public static void startToPostMsgActivty(Context context, Information information, boolean z) {
    }

    public static void transfer2Operator(Context context, SobotTransferOperatorParam sobotTransferOperatorParam) {
    }
}
