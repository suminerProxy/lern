package com.tencent.qcloud.tuikit.tuichat.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMSignalingInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tencent.txlive.zhibo.TCConstants;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CallModel implements Cloneable, Serializable {
    public static String SIGNALING_EXTRA_KEY_BUSINESS_ID = null;
    public static String SIGNALING_EXTRA_KEY_CALL_END = null;
    public static String SIGNALING_EXTRA_KEY_CALL_TYPE = null;
    public static String SIGNALING_EXTRA_KEY_LINE_BUSY = null;
    public static String SIGNALING_EXTRA_KEY_ROOM_ID = null;
    public static String SIGNALING_EXTRA_KEY_VERSION = null;
    public static String SIGNALING_EXTRA_VALUE_BUSINESS_ID = null;
    private static final String TAG = null;
    public static final int VIDEO_CALL_ACTION_ACCEPT = 7;
    public static final int VIDEO_CALL_ACTION_DIALING = 1;
    public static final int VIDEO_CALL_ACTION_ERROR = -1;
    public static final int VIDEO_CALL_ACTION_HANGUP = 5;
    public static final int VIDEO_CALL_ACTION_LINE_BUSY = 6;
    public static final int VIDEO_CALL_ACTION_REJECT = 3;
    public static final int VIDEO_CALL_ACTION_SPONSOR_CANCEL = 2;
    public static final int VIDEO_CALL_ACTION_SPONSOR_TIMEOUT = 4;
    public static final int VIDEO_CALL_ACTION_SWITCH_TO_AUDIO = 8;
    public static final int VIDEO_CALL_ACTION_SWITCH_TO_AUDIO_ACCEPT = 9;
    public static final int VIDEO_CALL_ACTION_UNKNOWN = 0;
    public static final int VIDEO_CALL_ACTION_UNKNOWN_INVITE = 10;
    @SerializedName("action")
    public int action;
    @SerializedName(TUIConstants.Message.CUSTOM_BUSINESS_ID_KEY)
    public String bussinessID;
    @SerializedName("call_id")
    public String callId;
    @SerializedName(TUIConstants.Message.CALLING_TYPE_KEY)
    public int callType;
    @SerializedName("code")
    public int code;
    public String data;
    @SerializedName("duration")
    public int duration;
    @SerializedName("group_id")
    public String groupId;
    @SerializedName("invited_list")
    public List<String> invitedList;
    @SerializedName(TCConstants.ROOM_ID)
    public int roomId;
    public String sender;
    public int timeout;
    public long timestamp;
    @SerializedName("version")
    public int version;

    public static CallModel convert2VideoCallData(V2TIMMessage v2TIMMessage) {
    }

    private static void handleAccept(V2TIMSignalingInfo v2TIMSignalingInfo, CallModel callModel, Map map) {
    }

    private static void handleInvite(V2TIMMessage v2TIMMessage, V2TIMSignalingInfo v2TIMSignalingInfo, Gson gson, CallModel callModel, Map map) {
    }
}
