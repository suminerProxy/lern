package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int id, long size) {
        }

        public static ChunkHeader peek(ExtractorInput input, ParsableByteArray scratch) throws IOException {
        }
    }

    private WavHeaderReader() {
    }

    @Nullable
    public static WavHeader peek(ExtractorInput input) throws IOException {
    }

    public static Pair<Long, Long> skipToData(ExtractorInput input) throws IOException {
    }
}
