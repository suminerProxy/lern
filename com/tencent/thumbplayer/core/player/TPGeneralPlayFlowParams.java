package com.tencent.thumbplayer.core.player;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPGeneralPlayFlowParams {
    public static final int TP_DRM_TYPE_CHACHA20 = 8;
    public static final int TP_DRM_TYPE_CHINA_DRM = 64;
    public static final int TP_DRM_TYPE_FAIRPLAY = 16;
    public static final int TP_DRM_TYPE_NONE = -1;
    public static final int TP_DRM_TYPE_TAIHE = 4;
    public static final int TP_DRM_TYPE_WIDEVINE = 32;
    public TPPlayerBaseMediaParams mPlayerBaseMediaParams;
    public TPPlayerConfigParams mPlayerConfigParams;
    public TPPlayerDrmParams mPlayerDrmParams;
    public TPPlayerGeneralTrackingParams mPlayerGeneralTrackingParams;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TPDrmType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPPlayerBaseMediaParams {
        public int mAudioDecoderType;
        public int mAudioEncodeFormat;
        public int mAudioRenderType;
        public int mDemuxerType;
        public long mDurationMs;
        public String mFormatContainer;
        public int mHlsSourceType;
        public int mSubtitleEncodeFormat;
        public int mVideoDecoderType;
        public int mVideoEncodeFormat;
        public float mVideoFrameRate;
        public int mVideoHeight;
        public int mVideoRenderType;
        public long mVideoStreamBitrateKBps;
        public int mVideoWidth;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPPlayerConfigParams {
        public long mBufferMaxTotalDurationMs;
        public long mBufferMinTotalDurationMs;
        public int mBufferType;
        public long mMaxBufferingTimeMs;
        public long mMinBufferingDurationMs;
        public long mMinBufferingTimeMs;
        public long mPreloadTotalDurationMs;
        public int mReduceLatencyAction;
        public float mReduceLatencyPlaySpeed;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPPlayerDrmParams {
        public String mComponentName;
        public int mDrmAbility;
        @TPDrmType
        public int mDrmType;
        public long mGetKeyReqETimeMs;
        public long mGetKeyReqSTimeMs;
        public long mGetProvisionReqETimeMs;
        public long mGetProvisionReqSTimeMs;
        public long mOpenSessionETimeMs;
        public long mOpenSessionSTimeMs;
        public long mPrepareETimeMs;
        public long mPrepareSTimeMs;
        public long mProvideKeyRespETimeMs;
        public long mProvideKeyRespSTimeMs;
        public long mProvideProvisionRespETimeMs;
        public long mProvideProvisionRespSTimeMs;
        public long mRecvKeyRespTimeMs;
        public long mRecvProvisionRespTimeMs;
        public int mSecureLevel;
        public long mSendKeyReqTimeMs;
        public long mSendProvisionReqTimeMs;
        public int mSupportSecureDecoder;
        public int mSupportSecureDecrypt;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TPPlayerGeneralTrackingParams {
        public long mCoreApiPrepareStartTimeMs;
        public long mCorePrepareExecuteTimeMs;
        public long mFindStreamInfoSuccessTimeMs;
        public long mFirstAudioDecoderStartTimeMs;
        public long mFirstAudioFrameRenderTimeMs;
        public long mFirstAudioPacketReadTimeMs;
        public long mFirstClipOpenedTimeMs;
        public long mFirstVideoDecoderStartTimeMs;
        public long mFirstVideoFrameRenderTimeMs;
        public long mFirstVideoPacketReadTimeMs;
        public long mInitFirstClipPositionTimeMs;
        public long mOpenDataSourceStartTimeMs;
        public long mPrepareDoneTimeMs;
    }
}
