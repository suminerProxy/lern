package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    private RtspTrackTiming(long rtpTimestamp, int sequenceNumber, Uri uri) {
    }

    public static ImmutableList<RtspTrackTiming> parseTrackTiming(String rtpInfoString) throws ParserException {
    }
}
