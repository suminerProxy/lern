package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtpDataLoadable implements Loader.Loadable {
    private final EventListener eventListener;
    private RtpExtractor extractor;
    private volatile boolean loadCancelled;
    private volatile long nextRtpTimestamp;
    private final ExtractorOutput output;
    private volatile long pendingSeekPositionUs;
    private final Handler playbackThreadHandler;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    public final RtspMediaTrack rtspMediaTrack;
    public final int trackId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface EventListener {
        void onTransportReady(String transport, RtpDataChannel rtpDataChannel);
    }

    public RtpDataLoadable(int trackId, RtspMediaTrack rtspMediaTrack, EventListener eventListener, ExtractorOutput output, RtpDataChannel.Factory rtpDataChannelFactory) {
    }

    private /* synthetic */ void a(String str, RtpDataChannel rtpDataChannel) {
    }

    public /* synthetic */ void b(String str, RtpDataChannel rtpDataChannel) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
    }

    public void resetForSeek() {
    }

    public void seekToUs(long positionUs, long nextRtpTimestamp) {
    }

    public void setSequenceNumber(int sequenceNumber) {
    }

    public void setTimestamp(long timestamp) {
    }
}
