package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UdpDataSourceRtpDataChannelFactory implements RtpDataChannel.Factory {
    private final long socketTimeoutMs;

    public UdpDataSourceRtpDataChannelFactory(long socketTimeoutMs) {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int trackId) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel.Factory createFallbackDataChannelFactory() {
    }
}
