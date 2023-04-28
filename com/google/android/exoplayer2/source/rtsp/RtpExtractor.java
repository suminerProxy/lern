package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtpExtractor implements Extractor {
    private boolean firstPacketRead;
    private volatile int firstSequenceNumber;
    private volatile long firstTimestamp;
    @GuardedBy("lock")
    private boolean isSeekPending;
    private final Object lock;
    @GuardedBy("lock")
    private long nextRtpTimestamp;
    private ExtractorOutput output;
    private final RtpPayloadReader payloadReader;
    @GuardedBy("lock")
    private long playbackStartTimeUs;
    private final RtpPacketReorderingQueue reorderingQueue;
    private final ParsableByteArray rtpPacketDataBuffer;
    private final ParsableByteArray rtpPacketScratchBuffer;
    private final int trackId;

    public RtpExtractor(RtpPayloadFormat payloadFormat, int trackId) {
    }

    private static long getCutoffTimeMs(long packetArrivalTimeMs) {
    }

    public boolean hasReadFirstRtpPacket() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
    }

    public void preSeek() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long nextRtpTimestamp, long playbackStartTimeUs) {
    }

    public void setFirstSequenceNumber(int firstSequenceNumber) {
    }

    public void setFirstTimestamp(long firstTimestamp) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) {
    }
}
