package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private final EventMessageEncoder eventMessageEncoder;
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private long pendingSeekPositionUs;
    private final Format upstreamFormat;

    public EventSampleStream(EventStream eventStream, Format upstreamFormat, boolean eventStreamAppendable) {
    }

    public String eventStreamId() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
    }

    public void seekToUs(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long positionUs) {
    }

    public void updateEventStream(EventStream eventStream, boolean eventStreamAppendable) {
    }
}
