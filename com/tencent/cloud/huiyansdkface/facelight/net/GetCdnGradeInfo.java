package com.tencent.cloud.huiyansdkface.facelight.net;

import com.tencent.cloud.huiyansdkface.facelight.config.cdn.WbUiTips;
import com.tencent.cloud.huiyansdkface.wehttp2.WeLog;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GetCdnGradeInfo {

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.net.GetCdnGradeInfo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements WeLog.Logger {
        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeLog.Logger
        public void log(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GetGradeInfoResponse implements Serializable {
        public String actCheckNextTime;
        public List<String> androidBanTuringList;
        public List<String> androidBanTuringVersion;
        public String androidEyeOpenRate;
        public String androidFaceAreaMax;
        public String androidFaceAreaMin;
        public String androidFacePitchMax;
        public String androidFacePitchMin;
        public String androidFacePointsPercent;
        public String androidFacePointsVis;
        public String androidFaceRollMax;
        public String androidFaceRollMin;
        public String androidFaceYawMax;
        public String androidFaceYawMin;
        public int androidHighPixelThreshold;
        public String androidLightScore;
        public String androidLuxDefault;
        public boolean androidUseHighPixelNew;
        public String authBackVisibleTime;
        public String dialogType;
        public String encodeOutOfTime;
        public String enterDetectWaitTime;
        public String gradeQueryInterval;
        public String gradeRetryCount;
        public String gradeTimeoutInterval;
        public String isCamCanRetry;
        public String isDetectCloseEye;
        public String kyc_auth_tip_know_and_agree;
        public String kyc_auth_tip_line1;
        public String kyc_auth_tip_line2;
        public String kyc_auth_tip_line3;
        public String kyc_auth_tip_read_and_agree;
        public String kyc_auth_tip_refuse_no_use;
        public String kyc_auth_tip_use_cam_reason;
        public String kyc_auth_tip_user_auth;
        public Map<String, WbUiTips> languageSet;
        public List<String> notPlayVoiceList;
        public String outOfTime;
        public String previewVoiceTime;
        public List<String> recordList;
        public String recordTime;
        public String recordYTVideo;
        public String returnUserImage;
        public String skipGuideTipVoice;
        public specialSet[] specialAppIdSet;
        public String turingTime;
        public String uploadYTVideo;
        public String useTuringSDK_and;
        public String verifyBackVisibleTime;
        public String version;
        public String ytVideoValidFrames;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class specialSet {
        public String actCheckNextTime;
        public String androidFaceAreaMax;
        public String androidFaceAreaMin;
        public String androidFacePitchMax;
        public String androidFacePitchMin;
        public String androidFacePointsPercent;
        public String androidFacePointsVis;
        public String androidFaceRollMax;
        public String androidFaceRollMin;
        public String androidFaceYawMax;
        public String androidFaceYawMin;
        public int androidHighPixelThreshold;
        public List<String> appIdSet;
        public String authBackVisibleTime;
        public String dialogType;
        public String enterDetectWaitTime;
        public String isCamCanRetry;
        public String isDetectCloseEye;
        public String kyc_auth_tip_know_and_agree;
        public String kyc_auth_tip_line1;
        public String kyc_auth_tip_line2;
        public String kyc_auth_tip_line3;
        public String kyc_auth_tip_read_and_agree;
        public String kyc_auth_tip_refuse_no_use;
        public String kyc_auth_tip_use_cam_reason;
        public String kyc_auth_tip_user_auth;
        public String outOfTime;
        public String recordTime;
        public String recordYTVideo;
        public String returnUserImage;
        public String skipGuideTipVoice;
        public String turingTime;
        public String uploadYTVideo;
        public String useTuringSDK_and;
        public String verifyBackVisibleTime;
        public String ytVideoValidFrames;
    }

    public static void requestExec(String str, WeReq.Callback<GetGradeInfoResponse> callback) {
    }
}
