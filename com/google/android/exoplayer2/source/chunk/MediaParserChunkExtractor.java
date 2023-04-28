package com.google.android.exoplayer2.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import java.io.IOException;
import java.util.List;

@RequiresApi(30)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = null;
    private static final String TAG = "MediaPrsrChunkExtractor";
    private final DummyTrackOutput dummyTrackOutput;
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;
    @Nullable
    private Format[] sampleFormats;
    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final TrackOutputProviderAdapter trackOutputProviderAdapter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class TrackOutputProviderAdapter implements ExtractorOutput {
        public final /* synthetic */ MediaParserChunkExtractor this$0;

        private TrackOutputProviderAdapter(final MediaParserChunkExtractor this$0) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int id, int type) {
        }

        public /* synthetic */ TrackOutputProviderAdapter(MediaParserChunkExtractor mediaParserChunkExtractor, AnonymousClass1 anonymousClass1) {
        }
    }

    @SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int primaryTrackType, Format manifestFormat, List<Format> closedCaptionFormats) {
    }

    public static /* synthetic */ ChunkExtractor a(int i2, Format format, boolean z, List list, TrackOutput trackOutput) {
    }

    public static /* synthetic */ ChunkExtractor.TrackOutputProvider access$100(MediaParserChunkExtractor mediaParserChunkExtractor) {
    }

    public static /* synthetic */ DummyTrackOutput access$200(MediaParserChunkExtractor mediaParserChunkExtractor) {
    }

    public static /* synthetic */ Format[] access$302(MediaParserChunkExtractor mediaParserChunkExtractor, Format[] formatArr) {
    }

    public static /* synthetic */ OutputConsumerAdapterV30 access$400(MediaParserChunkExtractor mediaParserChunkExtractor) {
    }

    private void maybeExecutePendingSeek() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long startTimeUs, long endTimeUs) {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput input) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
    }
}
