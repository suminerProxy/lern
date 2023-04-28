package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspSessionTiming {
    public static final RtspSessionTiming DEFAULT = null;
    private static final long LIVE_START_TIME = 0;
    private static final Pattern NPT_RANGE_PATTERN = null;
    private static final String START_TIMING_NTP_FORMAT = "npt=%.3f-";
    public final long startTimeMs;
    public final long stopTimeMs;

    private RtspSessionTiming(long startTimeMs, long stopTimeMs) {
    }

    public static String getOffsetStartTimeTiming(long offsetStartTimeMs) {
    }

    public static RtspSessionTiming parseTiming(String sdpRangeAttribute) throws ParserException {
    }

    public long getDurationMs() {
    }

    public boolean isLive() {
    }
}
