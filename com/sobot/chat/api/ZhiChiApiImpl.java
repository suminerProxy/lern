package com.sobot.chat.api;

import android.content.Context;
import android.os.AsyncTask;
import com.sobot.chat.api.model.BaseCode;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.CommonModelBase;
import com.sobot.chat.api.model.ConsultingContent;
import com.sobot.chat.api.model.Information;
import com.sobot.chat.api.model.OrderCardContentModel;
import com.sobot.chat.api.model.PostParamModel;
import com.sobot.chat.api.model.SatisfactionSet;
import com.sobot.chat.api.model.SobotCityResult;
import com.sobot.chat.api.model.SobotCommentParam;
import com.sobot.chat.api.model.SobotConnCusParam;
import com.sobot.chat.api.model.SobotLableInfoList;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.api.model.SobotLeaveMsgParamModel;
import com.sobot.chat.api.model.SobotLeaveReplyModel;
import com.sobot.chat.api.model.SobotLocationModel;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import com.sobot.chat.api.model.SobotOfflineLeaveMsgModel;
import com.sobot.chat.api.model.SobotPostMsgTemplate;
import com.sobot.chat.api.model.SobotQueryFormModel;
import com.sobot.chat.api.model.SobotQuestionRecommend;
import com.sobot.chat.api.model.SobotRobot;
import com.sobot.chat.api.model.SobotRobotGuess;
import com.sobot.chat.api.model.SobotUserTicketInfo;
import com.sobot.chat.api.model.SobotUserTicketInfoFlag;
import com.sobot.chat.api.model.StCategoryModel;
import com.sobot.chat.api.model.StDocModel;
import com.sobot.chat.api.model.StHelpDocModel;
import com.sobot.chat.api.model.StUserDealTicketInfo;
import com.sobot.chat.api.model.ZhiChiCidsModel;
import com.sobot.chat.api.model.ZhiChiGroup;
import com.sobot.chat.api.model.ZhiChiHistoryMessage;
import com.sobot.chat.api.model.ZhiChiInitModeBase;
import com.sobot.chat.api.model.ZhiChiMessage;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.api.model.ZhiChiWorkModel;
import com.sobot.chat.core.HttpUtils;
import com.sobot.network.http.callback.StringResultCallBack;
import com.sobot.network.http.upload.SobotUploadTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ZhiChiApiImpl implements ZhiChiApi {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7546a = null;
    private Context b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f7547d;

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass25 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SobotMsgCenterModel f7568a;
        public final /* synthetic */ String b;
        public final /* synthetic */ StringResultCallBack c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f7569d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Map f7570e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7571f;

        public AnonymousClass25(ZhiChiApiImpl zhiChiApiImpl, SobotMsgCenterModel sobotMsgCenterModel, String str, StringResultCallBack stringResultCallBack, Object obj, Map map) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$39  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass39 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7587a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass39(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$48  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass48 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7597a;
        public final /* synthetic */ Exception b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7598d;

        public AnonymousClass48(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack, Exception exc, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$49  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass49 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7599a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ ZhiChiApiImpl c;

        public AnonymousClass49(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack, Object obj) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7606a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass6(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }
    }

    private ZhiChiApiImpl() {
    }

    public static /* synthetic */ Context a(ZhiChiApiImpl zhiChiApiImpl) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void addTicketSatisfactionScoreInfo(Object obj, String str, String str2, String str3, int i2, String str4, StringResultCallBack<String> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public SobotUploadTask addUploadFileTask(boolean z, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void authSensitive(Object obj, String str, String str2, StringResultCallBack<CommonModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void chatSendMsgToRoot(String str, String str2, int i2, String str3, String str4, String str5, Map<String, String> map, StringResultCallBack<ZhiChiMessageBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void checkUserTicketInfo(Object obj, String str, String str2, String str3, StringResultCallBack<SobotUserTicketInfoFlag> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void comment(Object obj, String str, String str2, SobotCommentParam sobotCommentParam, StringResultCallBack<CommonModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void config(Object obj, String str) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void connChannel(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void connnect(Object obj, SobotConnCusParam sobotConnCusParam, StringResultCallBack<ZhiChiMessageBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void deleteHisMsg(Object obj, String str, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void disconnChannel() {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void fileUploadForPostMsg(Object obj, String str, String str2, String str3, ResultCallBack<ZhiChiMessage> resultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getCategoryList(Object obj, String str, StringResultCallBack<List<StCategoryModel>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getChatDetailByCid(Object obj, String str, String str2, StringResultCallBack<ZhiChiHistoryMessage> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getGroupList(Object obj, String str, String str2, StringResultCallBack<ZhiChiGroup> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getHelpDocByCategoryId(Object obj, String str, String str2, StringResultCallBack<List<StDocModel>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getHelpDocByDocId(Object obj, String str, String str2, StringResultCallBack<StHelpDocModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getLableInfoList(Object obj, String str, StringResultCallBack<List<SobotLableInfoList>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getLeavePostOfflineConfig(Object obj, String str, String str2, StringResultCallBack<SobotOfflineLeaveMsgModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getMsgTemplateConfig(Object obj, String str, String str2, StringResultCallBack<SobotLeaveMsgConfig> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public List<SobotMsgCenterModel> getPlatformList(Object obj, String str, String str2) throws IOException {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getRobotSwitchList(Object obj, String str, StringResultCallBack<List<SobotRobot>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getTemplateFieldsInfo(Object obj, String str, String str2, StringResultCallBack<SobotLeaveMsgParamModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getUserDealTicketInfoList(Object obj, String str, String str2, String str3, StringResultCallBack<List<StUserDealTicketInfo>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getUserTicketInfoList(Object obj, String str, String str2, String str3, StringResultCallBack<List<SobotUserTicketInfo>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getUserTicketReplyInfo(Object obj, String str, String str2, StringResultCallBack<List<SobotLeaveReplyModel>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void getWsTemplate(Object obj, String str, String str2, StringResultCallBack<ArrayList<SobotPostMsgTemplate>> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void input(String str, String str2, StringResultCallBack<CommonModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void insertSysMsg(Object obj, String str, String str2, String str3, String str4, StringResultCallBack<BaseCode> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void isWork(String str, String str2, StringResultCallBack<ZhiChiWorkModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void leaveMsg(Object obj, String str, String str2, String str3, StringResultCallBack<BaseCode> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public synchronized void logCollect(Context context, String str, boolean z) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void msgAck(Object obj, Map map, StringResultCallBack<BaseCode> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void out(String str, String str2, StringResultCallBack<CommonModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void pollingMsg(Object obj, Map map, String str, StringResultCallBack<BaseCode> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void postMsg(Object obj, PostParamModel postParamModel, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void queryCids(Object obj, String str, long j2, StringResultCallBack<ZhiChiCidsModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void queryCity(Object obj, String str, String str2, StringResultCallBack<SobotCityResult> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void queryFormConfig(Object obj, String str, StringResultCallBack<SobotQueryFormModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void questionRecommend(Object obj, String str, Map<String, String> map, StringResultCallBack<SobotQuestionRecommend> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void rbAnswerComment(Object obj, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void reconnectChannel() {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void removeMerchant(Object obj, String str, String str2, SobotMsgCenterModel sobotMsgCenterModel, StringResultCallBack<SobotMsgCenterModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void replyTicketContent(Object obj, String str, String str2, String str3, String str4, String str5, StringResultCallBack<String> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void robotGuess(Object obj, String str, String str2, String str3, StringResultCallBack<SobotRobotGuess> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void robotGuide(Object obj, String str, String str2, int i2, StringResultCallBack<ZhiChiMessageBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void satisfactionMessage(Object obj, String str, ResultCallBack<SatisfactionSet> resultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sendCardMsg(ConsultingContent consultingContent, String str, String str2, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sendFile(String str, String str2, String str3, String str4, ResultCallBack<ZhiChiMessage> resultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sendLocation(Object obj, SobotLocationModel sobotLocationModel, String str, String str2, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sendMsgToCoutom(String str, String str2, String str3, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sendOrderCardMsg(OrderCardContentModel orderCardContentModel, String str, String str2, StringResultCallBack<CommonModelBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sendVoiceToRobot(String str, String str2, String str3, String str4, String str5, ResultCallBack<ZhiChiMessage> resultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void sobotInit(Object obj, Information information, StringResultCallBack<ZhiChiInitModeBase> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void submitForm(Object obj, String str, String str2, StringResultCallBack<CommonModel> stringResultCallBack) {
    }

    @Override // com.sobot.chat.api.ZhiChiApi
    public void updateUserTicketReplyInfo(Object obj, String str, String str2, String str3) {
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass17 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7558a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass17(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7561a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass2(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$38  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass38 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7586a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass38(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$44  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass44 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7593a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass44(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$46  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass46 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7595a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass46(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass9 extends AsyncTask<Void, Void, String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7609a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ZhiChiApiImpl c;

        /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$9$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements HttpUtils.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AnonymousClass9 f7610a;

            public AnonymousClass1(AnonymousClass9 anonymousClass9) {
            }

            @Override // com.sobot.chat.core.HttpUtils.a
            public void a(int i2) {
            }

            @Override // com.sobot.chat.core.HttpUtils.a
            public void a(Exception exc, String str, int i2) {
            }

            @Override // com.sobot.chat.core.HttpUtils.a
            public void a(String str) {
            }
        }

        public AnonymousClass9(ZhiChiApiImpl zhiChiApiImpl, String str, Context context) {
        }

        public String a(Void... voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ String doInBackground(Void[] voidArr) {
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(String str) {
        }

        public void a(String str) {
        }
    }

    public static /* synthetic */ String a() {
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$53  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass53 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7604a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7605d;

        public AnonymousClass53(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack, Map map, String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    public static /* synthetic */ void a(ZhiChiApiImpl zhiChiApiImpl, Exception exc, String str, StringResultCallBack stringResultCallBack) {
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass13 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ResultCallBack f7554a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass13(ZhiChiApiImpl zhiChiApiImpl, ResultCallBack resultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass16 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7557a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass16(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass29 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7575a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass29(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7576a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass3(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass30 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7577a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass30(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$37  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass37 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7585a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass37(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$41  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass41 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7590a;

        public AnonymousClass41(ZhiChiApiImpl zhiChiApiImpl) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$42  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass42 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7591a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass42(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$43  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass43 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7592a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass43(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$47  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass47 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7596a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass47(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7600a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass5(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7608a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass8(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    public ZhiChiApiImpl(Context context) {
    }

    public static /* synthetic */ void a(ZhiChiApiImpl zhiChiApiImpl, Object obj, StringResultCallBack stringResultCallBack) {
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f7548a;
        public final /* synthetic */ String b;
        public final /* synthetic */ StringResultCallBack c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7549d;

        public AnonymousClass1(ZhiChiApiImpl zhiChiApiImpl, Map map, String str, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass10 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7550a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass10(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass14 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7555a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass14(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass18 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7559a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass18(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass19 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7560a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass19(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass20 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7562a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass20(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass22 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7564a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass22(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass24 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7567a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass24(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass26 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7572a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass26(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass27 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7573a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass27(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass28 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7574a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass28(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass31 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7578a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass31(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass32 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7579a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass32(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass33 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7580a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass33(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass35 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7583a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass35(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass36 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7584a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass36(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7588a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass4(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$45  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass45 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7594a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass45(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$50  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass50 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7601a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass50(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$51  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass51 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ResultCallBack f7602a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ZhiChiApiImpl c;

        public AnonymousClass51(ZhiChiApiImpl zhiChiApiImpl, ResultCallBack resultCallBack, long j2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7607a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass7(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    private void a(Exception exc, String str, StringResultCallBack stringResultCallBack) {
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass11 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ResultCallBack f7551a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ZhiChiApiImpl c;

        public AnonymousClass11(ZhiChiApiImpl zhiChiApiImpl, ResultCallBack resultCallBack, long j2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$40  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass40 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f7589a;
        public final /* synthetic */ StringResultCallBack b;
        public final /* synthetic */ ZhiChiApiImpl c;

        public AnonymousClass40(ZhiChiApiImpl zhiChiApiImpl, List list, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    private void a(Object obj, StringResultCallBack stringResultCallBack) {
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass15 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ResultCallBack f7556a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ZhiChiApiImpl c;

        public AnonymousClass15(ZhiChiApiImpl zhiChiApiImpl, ResultCallBack resultCallBack, long j2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$52  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass52 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7603a;
        public final /* synthetic */ ZhiChiApiImpl b;

        public AnonymousClass52(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass23 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7565a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7566d;

        public AnonymousClass23(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack, Map map, String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass34 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7581a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7582d;

        public AnonymousClass34(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack, Map map, String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass21 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7563a;

        public AnonymousClass21(ZhiChiApiImpl zhiChiApiImpl) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.api.ZhiChiApiImpl$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass12 implements HttpUtils.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringResultCallBack f7552a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ZhiChiApiImpl f7553d;

        public AnonymousClass12(ZhiChiApiImpl zhiChiApiImpl, StringResultCallBack stringResultCallBack, Map map, String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(String str) {
        }

        @Override // com.sobot.chat.core.HttpUtils.a
        public void a(Exception exc, String str, int i2) {
        }
    }
}
