package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TransferRtpDataChannel extends BaseDataSource implements RtpDataChannel, RtspMessageChannel.InterleavedBinaryDataListener {
    private static final String DEFAULT_TCP_TRANSPORT_FORMAT = "RTP/AVP/TCP;unicast;interleaved=%d-%d";
    private int channelNumber;
    private final LinkedBlockingQueue<byte[]> packetQueue;
    private final long pollTimeoutMs;
    private byte[] unreadData;

    public TransferRtpDataChannel(long pollTimeoutMs) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public int getLocalPort() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public String getTransport() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.InterleavedBinaryDataListener
    public void onInterleavedBinaryDataReceived(byte[] data) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) {
    }
}
