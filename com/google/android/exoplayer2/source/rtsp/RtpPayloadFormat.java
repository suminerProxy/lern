package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtpPayloadFormat {
    private static final String RTP_MEDIA_AC3 = "AC3";
    private static final String RTP_MEDIA_H264 = "H264";
    private static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    public final int clockRate;
    public final ImmutableMap<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    public RtpPayloadFormat(Format format, int rtpPayloadType, int clockRate, Map<String, String> fmtpParameters) {
    }

    public static String getMimeTypeFromRtpMediaType(String mediaType) {
    }

    public static boolean isFormatSupported(MediaDescription mediaDescription) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int hashCode() {
    }
}
