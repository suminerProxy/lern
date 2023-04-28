package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PsDurationReader {
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;
    private long durationUs;
    private long firstScrValue;
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private long lastScrValue;
    private final ParsableByteArray packetBuffer;
    private final TimestampAdjuster scrTimestampAdjuster;

    private static boolean checkMarkerBits(byte[] scrBytes) {
    }

    private int finishReadDuration(ExtractorInput input) {
    }

    private int peekIntAtPosition(byte[] data, int position) {
    }

    private int readFirstScrValue(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
    }

    private long readFirstScrValueFromBuffer(ParsableByteArray packetBuffer) {
    }

    private int readLastScrValue(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
    }

    private long readLastScrValueFromBuffer(ParsableByteArray packetBuffer) {
    }

    public static long readScrValueFromPack(ParsableByteArray packetBuffer) {
    }

    private static long readScrValueFromPackHeader(byte[] scrBytes) {
    }

    public long getDurationUs() {
    }

    public TimestampAdjuster getScrTimestampAdjuster() {
    }

    public boolean isDurationReadFinished() {
    }

    public int readDuration(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
    }
}
