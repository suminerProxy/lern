package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspMediaTrack {
    private static final String AAC_CODECS_PREFIX = "mp4a.40.";
    private static final String GENERIC_CONTROL_ATTR = "*";
    private static final String H264_CODECS_PREFIX = "avc1.";
    private static final String PARAMETER_PROFILE_LEVEL_ID = "profile-level-id";
    private static final String PARAMETER_SPROP_PARAMS = "sprop-parameter-sets";
    public final RtpPayloadFormat payloadFormat;
    public final Uri uri;

    public RtspMediaTrack(MediaDescription mediaDescription, Uri sessionUri) {
    }

    private static Uri extractTrackUri(Uri sessionUri, String controlAttributeString) {
    }

    @VisibleForTesting
    public static RtpPayloadFormat generatePayloadFormat(MediaDescription mediaDescription) {
    }

    private static byte[] getH264InitializationDataFromParameterSet(String parameterSet) {
    }

    private static int inferChannelCount(int encodingParameter, String mimeType) {
    }

    private static void processAacFmtpAttribute(Format.Builder formatBuilder, ImmutableMap<String, String> fmtpAttributes, int channelCount, int sampleRate) {
    }

    private static void processH264FmtpAttribute(Format.Builder formatBuilder, ImmutableMap<String, String> fmtpAttributes) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int hashCode() {
    }
}
