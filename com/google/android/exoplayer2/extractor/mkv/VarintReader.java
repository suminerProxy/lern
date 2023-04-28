package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = null;
    private int length;
    private final byte[] scratch;
    private int state;

    public static long assembleVarint(byte[] varintBytes, int varintLength, boolean removeLengthMask) {
    }

    public static int parseUnsignedVarintLength(int firstByte) {
    }

    public int getLastLength() {
    }

    public long readUnsignedVarint(ExtractorInput input, boolean allowEndOfInput, boolean removeLengthMask, int maximumAllowedLength) throws IOException {
    }

    public void reset() {
    }
}
