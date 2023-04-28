package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private final OggPacket oggPacket;
    private OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private SetupData setupData;
    private int state;
    private long targetGranule;
    private TrackOutput trackOutput;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SetupData {
        public Format format;
        public OggSeeker oggSeeker;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnseekableOggSeeker implements OggSeeker {
        private UnseekableOggSeeker() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public long read(ExtractorInput input) {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public void startSeek(long targetGranule) {
        }

        public /* synthetic */ UnseekableOggSeeker(AnonymousClass1 anonymousClass1) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void assertInitialized() {
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean readHeaders(ExtractorInput input) throws IOException {
    }

    @RequiresNonNull({"trackOutput"})
    private int readHeadersAndUpdateState(ExtractorInput input) throws IOException {
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int readPayload(ExtractorInput input, PositionHolder seekPosition) throws IOException {
    }

    public long convertGranuleToTime(long granule) {
    }

    public long convertTimeToGranule(long timeUs) {
    }

    public void init(ExtractorOutput output, TrackOutput trackOutput) {
    }

    public void onSeekEnd(long currentGranule) {
    }

    public abstract long preparePayload(ParsableByteArray packet);

    public final int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean readHeaders(ParsableByteArray packet, long position, SetupData setupData) throws IOException;

    public void reset(boolean headerData) {
    }

    public final void seek(long position, long timeUs) {
    }
}
