package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class OggPacket {
    private int currentSegmentIndex;
    private final ParsableByteArray packetArray;
    private final OggPageHeader pageHeader;
    private boolean populated;
    private int segmentCount;

    private int calculatePacketSize(int startSegmentIndex) {
    }

    public OggPageHeader getPageHeader() {
    }

    public ParsableByteArray getPayload() {
    }

    public boolean populate(ExtractorInput input) throws IOException {
    }

    public void reset() {
    }

    public void trimPayload() {
    }
}
