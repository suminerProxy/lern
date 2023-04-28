package com.tencent.thumbplayer.api;

import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPDrmInfo {
    @TPNativeKeyMap.MapReportDrmType(8)
    public static final int TP_PLAYER_DRM_TYPE_CHACHA20 = 8;
    @TPNativeKeyMap.MapReportDrmType(64)
    public static final int TP_PLAYER_DRM_TYPE_CHINA_DRM = 64;
    @TPNativeKeyMap.MapReportDrmType(-1)
    public static final int TP_PLAYER_DRM_TYPE_NONE = -1;
    @TPNativeKeyMap.MapReportDrmType(4)
    public static final int TP_PLAYER_DRM_TYPE_TAIHE = 4;
    @TPNativeKeyMap.MapReportDrmType(32)
    public static final int TP_PLAYER_DRM_TYPE_WIDEVINE = 32;
    public int drmAbility;
    public String drmComponentName;
    public long drmGetKeyReqEndTimeMs;
    public long drmGetKeyReqStartTimeMs;
    public long drmGetProvisionReqEndTimeMs;
    public long drmGetProvisionReqStartTimeMs;
    public long drmOpenSessionEndTimeMs;
    public long drmOpenSessionStartTimeMs;
    public long drmPrepareEndTimeMs;
    public long drmPrepareStartTimeMs;
    public long drmProvideKeyRespEndTimeMs;
    public long drmProvideKeyRespStartTimeMs;
    public long drmProvideProvisionRespEndTimeMs;
    public long drmProvideProvisionRespStartTimeMs;
    public long drmRecvKeyRespTimeMs;
    public long drmRecvProvisionRespTimeMs;
    public int drmSecureLevel;
    public long drmSendKeyReqTimeMs;
    public long drmSendProvisionReqTimeMs;
    public int drmSupportSecureDecoder;
    public int drmSupportSecureDecrypt;
    @TPPlayerDrmType
    public int drmType;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface TPPlayerDrmType {
    }
}
