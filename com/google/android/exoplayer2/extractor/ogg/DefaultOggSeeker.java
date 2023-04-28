package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final OggPageHeader pageHeader;
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class OggSeekMap implements SeekMap {
        public final /* synthetic */ DefaultOggSeeker this$0;

        private OggSeekMap(final DefaultOggSeeker this$0) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
        }

        public /* synthetic */ OggSeekMap(DefaultOggSeeker defaultOggSeeker, AnonymousClass1 anonymousClass1) {
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long payloadStartPosition, long payloadEndPosition, long firstPayloadPageSize, long firstPayloadPageGranulePosition, boolean firstPayloadPageIsLastPage) {
    }

    public static /* synthetic */ StreamReader access$100(DefaultOggSeeker defaultOggSeeker) {
    }

    public static /* synthetic */ long access$200(DefaultOggSeeker defaultOggSeeker) {
    }

    public static /* synthetic */ long access$300(DefaultOggSeeker defaultOggSeeker) {
    }

    public static /* synthetic */ long access$400(DefaultOggSeeker defaultOggSeeker) {
    }

    private long getNextSeekPosition(ExtractorInput input) throws IOException {
    }

    private void skipToPageOfTargetGranule(ExtractorInput input) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    @Nullable
    public /* bridge */ /* synthetic */ SeekMap createSeekMap() {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public long read(ExtractorInput input) throws IOException {
    }

    @VisibleForTesting
    public long readGranuleOfLastPage(ExtractorInput input) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public void startSeek(long targetGranule) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    @Nullable
    public OggSeekMap createSeekMap() {
    }
}
