package com.sobot.chat.api.apiUtils;

import com.sobot.chat.api.model.BaseCode;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.SatisfactionSet;
import com.sobot.chat.api.model.SobotCityResult;
import com.sobot.chat.api.model.SobotConfigModel;
import com.sobot.chat.api.model.SobotConfigResult;
import com.sobot.chat.api.model.SobotCusFieldConfig;
import com.sobot.chat.api.model.SobotCusFieldDataInfo;
import com.sobot.chat.api.model.SobotFieldModel;
import com.sobot.chat.api.model.SobotLableInfoList;
import com.sobot.chat.api.model.SobotLeaveMsgConfig;
import com.sobot.chat.api.model.SobotLeaveMsgConfigResult;
import com.sobot.chat.api.model.SobotLeaveMsgParamBaseModel;
import com.sobot.chat.api.model.SobotLeaveMsgParamModel;
import com.sobot.chat.api.model.SobotLeaveReplyModel;
import com.sobot.chat.api.model.SobotMsgCenterModel;
import com.sobot.chat.api.model.SobotMultiDiaRespInfo;
import com.sobot.chat.api.model.SobotOfflineLeaveMsgBaseModel;
import com.sobot.chat.api.model.SobotPostMsgTemplateResult;
import com.sobot.chat.api.model.SobotProvinInfo;
import com.sobot.chat.api.model.SobotQueryFormModel;
import com.sobot.chat.api.model.SobotQueryFormModelResult;
import com.sobot.chat.api.model.SobotQuestionRecommend;
import com.sobot.chat.api.model.SobotQuestionRecommendResult;
import com.sobot.chat.api.model.SobotRobot;
import com.sobot.chat.api.model.SobotRobotGuess;
import com.sobot.chat.api.model.SobotRobotGuessResult;
import com.sobot.chat.api.model.SobotTypeModel;
import com.sobot.chat.api.model.SobotUserTicketEvaluate;
import com.sobot.chat.api.model.SobotUserTicketInfo;
import com.sobot.chat.api.model.SobotUserTicketInfoFlag;
import com.sobot.chat.api.model.SobotUserTicketInfoResult;
import com.sobot.chat.api.model.StCategoryModel;
import com.sobot.chat.api.model.StDocModel;
import com.sobot.chat.api.model.StHelpDocModel;
import com.sobot.chat.api.model.StUserDealTicketInfo;
import com.sobot.chat.api.model.StUserDealTicketInfoResult;
import com.sobot.chat.api.model.ZhiChiCidsModelResult;
import com.sobot.chat.api.model.ZhiChiGroup;
import com.sobot.chat.api.model.ZhiChiHistoryMessage;
import com.sobot.chat.api.model.ZhiChiHistorySDKMsg;
import com.sobot.chat.api.model.ZhiChiInitModel;
import com.sobot.chat.api.model.ZhiChiMessage;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.api.model.ZhiChiPushMessage;
import com.sobot.chat.api.model.ZhiChiReplyAnswer;
import com.sobot.chat.api.model.ZhiChiWorkResult;
import com.sobot.network.http.model.UploadFileResult;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GsonUtil {
    public static int changeFileType(int i2) {
    }

    public static Method convertGetter(Class cls, String str, Class<?>... clsArr) {
    }

    private static String filterNull(String str) {
    }

    private static String filterNullStr(String str) {
    }

    public static boolean isEmpty(Object obj) {
    }

    public static boolean isMultiRoundSession(ZhiChiMessageBase zhiChiMessageBase) {
    }

    private static boolean isSobotMultiDiaRespFor1511(ZhiChiReplyAnswer zhiChiReplyAnswer) {
    }

    private static List<Map<String, String>> jsonArray2Map(JSONArray jSONArray) {
    }

    public static ZhiChiReplyAnswer jsonNewMessage(ZhiChiPushMessage zhiChiPushMessage, ZhiChiMessageBase zhiChiMessageBase, String str, String str2, ZhiChiReplyAnswer zhiChiReplyAnswer) {
    }

    public static BaseCode jsonToBaseCode(String str) {
    }

    public static CommonModel jsonToCommonModel(String str) {
    }

    public static SobotCusFieldConfig jsonToCusFieldConfig(String str) {
    }

    public static SobotCusFieldDataInfo jsonToCusFieldDataInfo(String str) {
    }

    public static SobotFieldModel jsonToFieldModel(String str) {
    }

    public static List<SobotLableInfoList> jsonToLableInfoList(String str) {
    }

    public static SobotLeaveMsgConfig jsonToLeaveMsgConfig(String str) {
    }

    public static SobotLeaveMsgConfigResult jsonToLeaveMsgConfigResult(String str) {
    }

    public static SobotLeaveMsgParamBaseModel jsonToLeaveMsgParamBaseModel(String str) {
    }

    public static SobotLeaveMsgParamModel jsonToLeaveMsgParamModel(String str) {
    }

    public static List<SobotLeaveReplyModel> jsonToLeaveReplyModelListResult(String str) {
    }

    public static List<SobotCusFieldDataInfo> jsonToListCusfield(String str) {
    }

    public static ArrayList<SobotFieldModel> jsonToListFieldModel(String str) {
    }

    public static ArrayList<StCategoryModel> jsonToListStCategoryModel(JSONArray jSONArray) {
    }

    public static ArrayList<StDocModel> jsonToListStDocModel(JSONArray jSONArray) {
    }

    public static ArrayList<StUserDealTicketInfo> jsonToListStUserDealTicketInfo(JSONArray jSONArray) {
    }

    public static ArrayList<SobotTypeModel> jsonToListTypeModel(String str) {
    }

    public static ArrayList<SobotUserTicketInfo> jsonToListUserTicketInfo(JSONArray jSONArray) {
    }

    public static List<SobotMsgCenterModel> jsonToMsgCenterModel(String str) {
    }

    public static SobotOfflineLeaveMsgBaseModel jsonToOfflineLeaveMsgModel(String str) {
    }

    private static ArrayList<SobotProvinInfo.SobotProvinceModel> jsonToProvinces(String str, int i2) {
    }

    public static SobotQueryFormModel jsonToQueryFormModel(String str) {
    }

    private static SobotRobotGuess jsonToRobotGuess(String str) {
    }

    public static SobotRobotGuessResult jsonToRobotGuessResult(String str) {
    }

    public static List<SobotRobot> jsonToRobotListResult(String str) {
    }

    public static SatisfactionSet jsonToSatisfactionSet(String str) {
    }

    public static SobotProvinInfo jsonToSobotCity(String str) {
    }

    public static SobotCityResult jsonToSobotCityResult(String str) {
    }

    private static SobotConfigModel jsonToSobotConfigModel(String str) {
    }

    public static SobotConfigResult jsonToSobotConfigResult(String str) {
    }

    private static SobotMultiDiaRespInfo jsonToSobotMultiDiaRespInfo(ZhiChiReplyAnswer zhiChiReplyAnswer, String str) {
    }

    public static SobotPostMsgTemplateResult jsonToSobotPostMsgTemplate(String str) {
    }

    private static SobotQuestionRecommend jsonToSobotQR(String str) {
    }

    public static SobotQuestionRecommendResult jsonToSobotQRResult(String str) {
    }

    public static SobotQueryFormModelResult jsonToSobotQueryFormModelResult(String str) {
    }

    public static SobotUserTicketInfoFlag jsonToSobotUserTicketInfoFlag(String str) {
    }

    public static SobotUserTicketInfoResult jsonToSobotUserTicketInfoResult(String str) {
    }

    public static BaseCode<List<StCategoryModel>> jsonToStCategoryModelResult(String str) {
    }

    public static BaseCode<List<StDocModel>> jsonToStDocModelResult(String str) {
    }

    public static BaseCode<StHelpDocModel> jsonToStHelpDocModelResult(String str) {
    }

    public static StUserDealTicketInfoResult jsonToStUserDealTicketInfoResult(String str) {
    }

    public static ArrayList<SobotUserTicketEvaluate.TicketScoreInfooListBean> jsonToTicketScoreInfooList(JSONArray jSONArray) {
    }

    public static SobotTypeModel jsonToTypeModel(String str) {
    }

    public static ZhiChiCidsModelResult jsonToZhiChiCidsModel(String str) {
    }

    public static ZhiChiGroup jsonToZhiChiGroup(String str) {
    }

    public static ZhiChiHistoryMessage jsonToZhiChiHistoryMessage(String str) {
    }

    private static ZhiChiHistorySDKMsg jsonToZhiChiHistorySDKMsg(ZhiChiMessageBase zhiChiMessageBase, String str, String str2) {
    }

    public static ZhiChiInitModel jsonToZhiChiInitModel(String str) {
    }

    public static ZhiChiMessage jsonToZhiChiMessage(String str) {
    }

    public static ZhiChiMessageBase jsonToZhiChiMessageBase(String str) {
    }

    public static ZhiChiPushMessage jsonToZhiChiPushMessage(String str) {
    }

    public static ZhiChiReplyAnswer jsonToZhiChiPushMsg(ZhiChiPushMessage zhiChiPushMessage, String str, String str2) {
    }

    public static ZhiChiReplyAnswer jsonToZhiChiReplyAnswer(ZhiChiMessageBase zhiChiMessageBase, String str, String str2, boolean z, String str3) {
    }

    public static ZhiChiWorkResult jsonToZhiChiWorkResult(String str) {
    }

    public static String map2Json(Map<String, String> map) {
    }

    public static String map2JsonByObjectMap(Map map) {
    }

    public static String map2Str(Map<String, String> map) {
    }

    public static UploadFileResult obtainUploadFileResult(String str) {
    }

    public static <T> JSONArray praseList2Json(List<T> list) {
    }

    private static boolean isMultiRoundSession(String str) {
    }

    private static boolean isMultiRoundSession(ZhiChiHistorySDKMsg zhiChiHistorySDKMsg) {
    }
}
