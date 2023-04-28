package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TsDurationReader {
    private long durationUs;
    private long firstPcrValue;
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private long lastPcrValue;
    private final ParsableByteArray packetBuffer;
    private final TimestampAdjuster pcrTimestampAdjuster;
    private final int timestampSearchBytes;

    public TsDurationReader(int timestampSearchBytes) {
    }

    private int finishReadDuration(ExtractorInput input) {
    }

    private int readFirstPcrValue(ExtractorInput input, PositionHolder seekPositionHolder, int pcrPid) throws IOException {
    }

    private long readFirstPcrValueFromBuffer(ParsableByteArray packetBuffer, int pcrPid) {
    }

    private int readLastPcrValue(ExtractorInput input, PositionHolder seekPositionHolder, int pcrPid) throws IOException {
    }

    private long readLastPcrValueFromBuffer(ParsableByteArray packetBuffer, int pcrPid) {
    }

    public long getDurationUs() {
    }

    public TimestampAdjuster getPcrTimestampAdjuster() {
    }

    public boolean isDurationReadFinished() {
    }

    public int readDuration(ExtractorInput input, PositionHolder seekPositionHolder, int pcrPid) throws IOException {
    }
}
