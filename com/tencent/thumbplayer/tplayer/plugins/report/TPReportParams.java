package com.tencent.thumbplayer.tplayer.plugins.report;

import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPReportParams {
    public static final int BUFFERING_REASON_BITRATE_JITTER = 1400109;
    public static final int BUFFERING_REASON_CDN_TIMEOUT = 1400103;
    public static final int BUFFERING_REASON_CDN_TIMEOUT_BUT_CONNECTED = 1400104;
    public static final int BUFFERING_REASON_DOWNLOAD_SHORT_TIME = 1400111;
    public static final int BUFFERING_REASON_DOWNLOAD_TASK = 1400101;
    public static final int BUFFERING_REASON_NETWORK_DEVICE_EXCEPTION = 1400102;
    public static final int BUFFERING_REASON_NETWORK_UNSTABLE = 1400100;
    public static final int BUFFERING_REASON_P2P_FASTER_THAN_HTTP = 1400110;
    public static final int BUFFERING_REASON_P2P_UPLOAD = 1400112;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT = 1400105;
    public static final int BUFFERING_REASON_RECEIVE_TIMEOUT_BUT_CONNECTED = 1400106;
    public static final int BUFFERING_REASON_SLOWLY_SPEED = 1400107;
    public static final int BUFFERING_REASON_SLOWLY_SPEED_BUT_CONNECTED = 1400108;
    public static final String ERROR_CODE_NO_ERROR = "0";
    public static final String JSON_KEY_VAL = "val";
    public static final int LIVE_STEP_FAILED = 150;
    public static final int LIVE_STEP_LOADING_SUCC = 205;
    public static final int LIVE_STEP_PLAY = 263;
    public static final int NETWORK_TYPE_2G = 2;
    public static final int NETWORK_TYPE_3G = 3;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_5G = 5;
    public static final int NETWORK_TYPE_ETHERNET = 10;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_WIFI = 1;
    public static final int PLAYER_STEP_BUFFERING = 35;
    public static final int PLAYER_STEP_FIRST_LOAD = 30;
    public static final int PLAYER_STEP_FIRST_RENDERING = 32;
    public static final int PLAYER_STEP_GET_CDN_URL = 15;
    public static final int PLAYER_STEP_INIT_PLAYER = 5;
    public static final int PLAYER_STEP_LOAD_SUBTITLE = 33;
    public static final int PLAYER_STEP_PLAY_DONE = 50;
    public static final int PLAYER_STEP_REDIRECT = 34;
    public static final int PLAYER_STEP_USER_SEEK = 40;
    public static final int PLAYER_TYPE_SYSTEM_PLAYER = 0;
    public static final int PLAYER_TYPE_THUMB_PLAYER = 1;
    public static final int PLAY_END_REASON_APP_EXIT = 2;
    public static final int PLAY_END_REASON_EOS = 0;
    public static final int PLAY_END_REASON_PLAYER_ERROR = 3;
    public static final int PLAY_END_REASON_USER_STOP = 1;
    public static final int PLAY_EVENT_NONE = 0;
    public static final int PLAY_EVENT_PAUSE_BY_DEVICE = 2;
    public static final int PLAY_EVENT_SCREEN_SHOT = 3;
    public static final int PLAY_EVENT_SEEK = 1;
    public static final int PLAY_SCENE_NORMAL_PLAY = 1;
    public static final int PLAY_SCENE_TRICK_PLAY = 2;
    public static final int PLAY_TYPE_LIVE = 1;
    public static final int PLAY_TYPE_UNKNOWN = -1;
    public static final int PLAY_TYPE_VOD = 0;
    public static final String PROP_KEY_DATA = "data";
    private static final String TAG = "TPReportParams";
    public static final int VIDEO_DL_TYPE_HLS = 3;
    public static final int VIDEO_DL_TYPE_MP4 = 1;
    private BufferingTotalParams bufferingTotalParams;
    private CommonParams commonParams;
    private FirstLoadParams firstLoadParams;
    private FirstRenderParams firstRenderParams;
    private GetCdnUrlParams getCdnParams;
    private PlayerInitParams initParams;
    private LiveExParam liveExParam;
    private LoadSubtitleParams loadSubtitleParams;
    private PlayDoneParams playDoneParams;
    private RedirectParams redirectParams;
    private UserSeekTotalParams userSeekTotalParams;
    private VodExParam vodExParam;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class BufferingOnceParams {
        public long bufferingPresentTimeLong;
        public long endTimeUnix;
        public String errCodeString;
        public int formatInt;
        public int lastEventInt;
        public int reasonInt;
        public int sceneInt;
        public long starTimeUnix;
        public final /* synthetic */ TPReportParams this$0;
        public String urlString;

        public BufferingOnceParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class BufferingTotalParams {
        public int bufferingCountInt;
        public int bufferingDurationInt;
        public List<BufferingOnceParams> bufferingOnceParamsList;
        public final /* synthetic */ TPReportParams this$0;

        public BufferingTotalParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class CommonParams {
        public String appVersionString;
        public int cdnIdInt;
        public String cdnIpString;
        public String cdnUipString;
        public String deviceNameString;
        public String deviceResolutionString;
        public int downloadTypeInt;
        public String flowIdString;
        public String guidString;
        public int loginTypeInt;
        public float mediaDurationFloat;
        public int mediaFormatInt;
        public int mediaRateInt;
        public String mediaResolutionString;
        public int networkSpeedInt;
        public int networkTypeInt;
        public int onlineInt;
        public String osVersionString;
        public int p2pInt;
        public String p2pVersionString;
        public long platformLong;
        public String playNoString;
        public int playTypeInt;
        public int playerTypeInt;
        public String playerVersionString;
        public String proto;
        public String protover;
        public String qqOpenIdString;
        public int scenesId;
        public int seqInt;
        public int signalStrengthInt;
        public int stepInt;
        public int testIdInt;
        public final /* synthetic */ TPReportParams this$0;
        public String uinString;
        public String uipString;
        public String vidString;
        public String wxOpenIdString;

        public CommonParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FirstLoadParams {
        public String cdnUrlString;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public String errCodeString;
        public long firstOpenTimeUnix;
        public long firstPacketReadTimeUnix;
        public long starTimeUnix;
        public final /* synthetic */ TPReportParams this$0;

        public FirstLoadParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FirstRenderParams {
        public long endTimeUnix;
        public String errCodeString;
        public long starTimeUnix;
        public final /* synthetic */ TPReportParams this$0;

        public FirstRenderParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class GetCdnUrlParams {
        public long endTimeUnix;
        public String errCodeString;
        public String proxyIpString;
        public long starTimeUnix;
        public final /* synthetic */ TPReportParams this$0;

        public GetCdnUrlParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class LiveExParam {
        public int adPlayLengthInt;
        public int blockCountInt;
        public int blockTimeInt;
        public String cdnServerString;
        public int connectTimeInt;
        public int contentIdInt;
        public String defSwitchString;
        public int deviceTypeInt;
        public int downSpeedInt;
        public String downloadServerIpString;
        public String downloadUrl;
        public int errCodeInt;
        public String extraInfoString;
        public int freeTypeInt;
        public String fullErrCodeString;
        public int getStreamDurationInt;
        public int getSyncFrameDurationInt;
        public int getUrlTimeInt;
        public int isLookBackInt;
        public int isStreamP2PInt;
        public int isUseP2PInt;
        public int isUserPayInt;
        public int liveDelayInt;
        public int liveProgramIdInt;
        public int liveTagInt;
        public int liveTypeInt;
        public long loadingTimeLong;
        public int maxSpeedInt;
        public int networkTypeInt;
        public int playTimeInt;
        public String playerVersionString;
        public int prePlayLengthInt;
        public int reconnectCntInt;
        public long reportTimeLong;
        public String spanId;
        public int streamIdInt;
        public int testSpeedInt;
        public final /* synthetic */ TPReportParams this$0;
        public String tuid;
        public String userIpString;
        public String userQQString;

        public LiveExParam(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class LoadSubtitleParams {
        public int bufferingDurationInt;
        public int cdnTypeInt;
        public int cgiUrlIndex;
        public long endTimeUnix;
        public String errCodeString;
        public long starTimeUnix;
        public String subtitleUrlString;
        public final /* synthetic */ TPReportParams this$0;

        public LoadSubtitleParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class PlayDoneParams {
        public long endTimeUnix;
        public String errCodeString;
        public float playDurationFloat;
        public int reasonInt;
        public final /* synthetic */ TPReportParams this$0;

        public PlayDoneParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class PlayerInitParams {
        public String errCodeString;
        public long playEndTimeUnix;
        public long playStarTimeUnix;
        public final /* synthetic */ TPReportParams this$0;

        public PlayerInitParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class RedirectParams {
        public int cdnTypeInt;
        public long endTimeUnix;
        public String errCodeString;
        public int redirectCountInt;
        public String redirectedUrlString;
        public long starTimeUnix;
        public final /* synthetic */ TPReportParams this$0;

        public RedirectParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class UserSeekOnceParams {
        public long endPresentTimeLong;
        public String errCodeString;
        public int formatInt;
        public long seekEndTimeUnix;
        public long seekStartTimeUnix;
        public long startPresentTimeLong;
        public final /* synthetic */ TPReportParams this$0;

        public UserSeekOnceParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class UserSeekTotalParams {
        public int seekBufferingCountInt;
        public int seekBufferingDurationInt;
        public List<UserSeekOnceParams> seekOnceParamsList;
        public int seekTotalCountInt;
        public final /* synthetic */ TPReportParams this$0;

        public UserSeekTotalParams(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class VodExParam {
        public int bizIdInt;
        public int clipInt;
        public int currentPlayInt;
        public int freeTypeInt;
        public int hasSubtitleInt;
        public int hevcLcInt;
        public int hitDownloaded;
        public int isSelectedSubtitleInt;
        public int multiTrackInt;
        public int optimizedPlayInt;
        public int statusInt;
        public final /* synthetic */ TPReportParams this$0;

        public VodExParam(TPReportParams tPReportParams) {
        }

        public void paramsToJson(JSONObject jSONObject) {
        }

        public void paramsToProperties(com.tencent.thumbplayer.b.a.a aVar) {
        }

        public void reset() {
        }
    }

    public BufferingOnceParams createBufferingOnceParams() {
    }

    public UserSeekOnceParams createUserSeekOnceParams() {
    }

    public BufferingTotalParams getBufferingTotalParams() {
    }

    public CommonParams getCommonParams() {
    }

    public FirstLoadParams getFirstLoadParams() {
    }

    public FirstRenderParams getFirstRenderParams() {
    }

    public GetCdnUrlParams getGetCdnParams() {
    }

    public PlayerInitParams getInitParams() {
    }

    public LiveExParam getLiveExParam() {
    }

    public LoadSubtitleParams getLoadSubtitleParams() {
    }

    public PlayDoneParams getPlayDoneParams() {
    }

    public RedirectParams getRedirectParams() {
    }

    public UserSeekTotalParams getUserSeekTotalParams() {
    }

    public VodExParam getVodExParam() {
    }

    public void resetAllParam() {
    }
}
