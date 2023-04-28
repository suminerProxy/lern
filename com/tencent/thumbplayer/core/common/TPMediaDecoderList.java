package com.tencent.thumbplayer.core.common;

import android.media.MediaCodecInfo;
import com.tencent.thumbplayer.core.thirdparties.LocalCache;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class TPMediaDecoderList {
    private static final String MEDIA_DECODER_INFO_KEY = "DecoderInfos_Key";
    private static String MEDIA_DECODER_VERSION = "2.27.0.1016.min";
    private static final String MEDIA_DECODER_VERSION_KEY = "Version_Key";
    private static final String TAG = "TPMediaDecoderList";
    private static TPMediaDecoderInfo[] sDecoderInfos;

    private static String buildCacheDecoderVersion() {
    }

    private static void cacheDecoderInfos(LocalCache localCache, TPMediaDecoderInfo[] tPMediaDecoderInfoArr) {
    }

    private static void cacheVersion(LocalCache localCache, String str) {
    }

    private static TPMediaDecoderInfo[] getCachedDecoderInfos(LocalCache localCache) {
    }

    private static String getCachedVersion(LocalCache localCache) {
    }

    private static final MediaCodecInfo[] getCodecInfos() {
    }

    private static final TPMediaDecoderInfo[] getLocalCacheMediaCodecList(LocalCache localCache) {
    }

    private static final TPMediaDecoderInfo[] getSystemMediaCodecList() {
    }

    public static final synchronized TPMediaDecoderInfo[] getTPMediaDecoderInfos(LocalCache localCache) {
    }

    private static final TPMediaDecoderInfo[] initCodecList(LocalCache localCache) {
    }

    private static final void storeLocalCacheMediaCodecList(LocalCache localCache, TPMediaDecoderInfo[] tPMediaDecoderInfoArr) {
    }
}
