package com.sobot.chat.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.ResultCallBack;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.SobotEvaluateModel;
import com.sobot.chat.api.model.SobotLocationModel;
import com.sobot.chat.api.model.SobotMultiDiaRespInfo;
import com.sobot.chat.api.model.SobotQuestionRecommend;
import com.sobot.chat.api.model.SobotUserTicketEvaluate;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.api.model.ZhiChiMessage;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.api.model.ZhiChiPushMessage;
import com.sobot.chat.widget.dialog.SobotEvaluateDialog;
import com.sobot.chat.widget.dialog.SobotRobotListDialog;
import com.sobot.chat.widget.dialog.SobotTicketEvaluateDialog;
import com.sobot.network.http.callback.StringResultCallBack;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ChatUtils {

    /* renamed from: com.sobot.chat.utils.ChatUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Activity val$act;
        public final /* synthetic */ boolean val$isFinish;

        public AnonymousClass1(Activity activity, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.utils.ChatUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 implements ResultCallBack<ZhiChiMessage> {
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$id;
        public final /* synthetic */ ListView val$lv_message;
        public final /* synthetic */ SobotMsgAdapter val$messageAdapter;

        public AnonymousClass2(String str, Handler handler, SobotMsgAdapter sobotMsgAdapter, ListView listView) {
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

    /* renamed from: com.sobot.chat.utils.ChatUtils$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass3 implements StringResultCallBack<CommonModel> {
        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(CommonModel commonModel) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(CommonModel commonModel) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotSendFileListener {
        void onError();

        void onSuccess(String str);
    }

    public static void callUp(String str, Context context) {
    }

    public static boolean checkConfigChange(Context context, String str, Information information) {
    }

    public static boolean checkManualType(String str, String str2) {
    }

    private static String formatQuestionStr(String[] strArr, Map<String, String> map, SobotMultiDiaRespInfo sobotMultiDiaRespInfo) {
    }

    public static String getCurrentCid(ZhiChiInitModeBase zhiChiInitModeBase, List<String> list, int i2) {
    }

    public static ZhiChiMessageBase getCustomEvaluateMode(ZhiChiPushMessage zhiChiPushMessage) {
    }

    public static int getFileIcon(Context context, int i2) {
    }

    public static int getFileType(File file) {
    }

    public static ZhiChiMessageBase getInLineHint(String str) {
    }

    public static ZhiChiMessageBase getLeaveMsgTip(String str) {
    }

    public static ZhiChiMessageBase getLocationModel(String str, SobotLocationModel sobotLocationModel) {
    }

    public static String getLogicAvatar(Context context, boolean z, String str, String str2) {
    }

    public static String getLogicTitle(Context context, boolean z, String str, String str2) {
    }

    public static String getMessageContentByOutLineType(Context context, ZhiChiInitModeBase zhiChiInitModeBase, int i2) {
    }

    public static ZhiChiMessageBase getMuitidiaLeaveMsgModel(String str, String str2) {
    }

    public static String getMultiMsgTitle(SobotMultiDiaRespInfo sobotMultiDiaRespInfo) {
    }

    public static ZhiChiMessageBase getNoticeModel(Context context, ZhiChiInitModeBase zhiChiInitModeBase) {
    }

    public static ZhiChiMessageBase getQuestionRecommendData(ZhiChiInitModeBase zhiChiInitModeBase, SobotQuestionRecommend sobotQuestionRecommend) {
    }

    public static int getResDrawableId(Context context, String str) {
    }

    public static int getResId(Context context, String str) {
    }

    public static int getResLayoutId(Context context, String str) {
    }

    public static String getResString(Context context, String str) {
    }

    public static int getResStringId(Context context, String str) {
    }

    public static ZhiChiMessageBase getRobotTransferTip(Context context, ZhiChiInitModeBase zhiChiInitModeBase) {
    }

    public static ZhiChiMessageBase getServiceAcceptTip(Context context, String str) {
    }

    public static ZhiChiMessageBase getServiceHelloTip(String str, String str2, String str3) {
    }

    public static ZhiChiMessageBase getTipByText(String str) {
    }

    public static ZhiChiMessageBase getUnreadMode(Context context) {
    }

    public static ZhiChiMessageBase getUploadFileModel(Context context, String str, File file) {
    }

    public static ZhiChiMessageBase getUploadVideoModel(Context context, String str, File file, String str2) {
    }

    public static TextView initAnswerItemTextView(Context context, boolean z) {
    }

    public static boolean isEvaluationCompletedExit(Context context, boolean z, int i2) {
    }

    public static boolean isFreeAccount(int i2) {
    }

    private static boolean isNeedWarning(String str, int i2) {
    }

    public static boolean isQuestionFlag(SobotEvaluateModel sobotEvaluateModel) {
    }

    public static void msgLogicalProcess(ZhiChiInitModeBase zhiChiInitModeBase, SobotMsgAdapter sobotMsgAdapter, ZhiChiPushMessage zhiChiPushMessage) {
    }

    public static File openCamera(Activity activity) {
    }

    public static void openSelectPic(Activity activity) {
    }

    public static void openSelectVedio(Activity activity) {
    }

    public static void saveLastMsgInfo(Context context, Information information, String str, ZhiChiInitModeBase zhiChiInitModeBase, List<ZhiChiMessageBase> list) {
    }

    public static void saveOptionSet(Context context, Information information) {
    }

    public static void sendImageMessageToHandler(String str, Handler handler, String str2) {
    }

    public static void sendMultiRoundQuestions(Context context, SobotMultiDiaRespInfo sobotMultiDiaRespInfo, Map<String, String> map, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
    }

    public static void sendPicByFilePath(Context context, String str, SobotSendFileListener sobotSendFileListener, boolean z) {
    }

    public static void sendPicByUri(Context context, Handler handler, Uri uri, ZhiChiInitModeBase zhiChiInitModeBase, ListView listView, SobotMsgAdapter sobotMsgAdapter, boolean z) {
    }

    public static void sendPicByUriPost(Context context, Uri uri, SobotSendFileListener sobotSendFileListener, boolean z) {
    }

    public static void sendPicLimitBySize(String str, String str2, String str3, Handler handler, Context context, ListView listView, SobotMsgAdapter sobotMsgAdapter, boolean z) {
    }

    public static void sendPicture(Context context, String str, String str2, String str3, Handler handler, String str4, ListView listView, SobotMsgAdapter sobotMsgAdapter) {
    }

    public static SobotEvaluateDialog showEvaluateDialog(Activity activity, boolean z, boolean z2, boolean z3, ZhiChiInitModeBase zhiChiInitModeBase, int i2, int i3, String str, int i4, int i5, String str2, boolean z4, boolean z5) {
    }

    public static SobotRobotListDialog showRobotListDialog(Activity activity, ZhiChiInitModeBase zhiChiInitModeBase, SobotRobotListDialog.SobotRobotListListener sobotRobotListListener) {
    }

    public static void showThankDialog(Activity activity, Handler handler, boolean z) {
    }

    public static SobotTicketEvaluateDialog showTicketEvaluateDialog(Activity activity, SobotUserTicketEvaluate sobotUserTicketEvaluate) {
    }

    public static void updateProgressPartly(int i2, int i3, ListView listView) {
    }

    public static void userLogout(Context context) {
    }

    public static File openCamera(Activity activity, Fragment fragment) {
    }

    public static void openSelectPic(Activity activity, Fragment fragment) {
    }

    public static void openSelectVedio(Activity activity, Fragment fragment) {
    }
}
