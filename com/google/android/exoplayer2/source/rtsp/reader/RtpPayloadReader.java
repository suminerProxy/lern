package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface RtpPayloadReader {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Factory {
        RtpPayloadReader createPayloadReader(RtpPayloadFormat payloadFormat);
    }

    void consume(ParsableByteArray data, long timestamp, int sequenceNumber, boolean rtpMarker) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, int trackId);

    void onReceivingFirstPacket(long timestamp, int sequenceNumber);

    void seek(long nextRtpTimestamp, long timeUs);
}
