package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface be {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a extends VideoEncoderDef.VideoEncoderDataListener {
        void a();

        void a(String str);

        void a(boolean z, int i2);
    }

    void ackRPSRecvFrameIndex(int i2, int i3);

    void encodeFrame(PixelFrame pixelFrame, Rotation rotation, boolean z);

    VideoEncodeParams getEncodeParams();

    VideoEncoderDef.a getEncoderType();

    void initialize();

    void restartIDRFrame();

    void setBitrate(int i2);

    void setFps(int i2);

    void setRPSIFrameFPS(int i2);

    void setRPSNearestREFSize(int i2);

    void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig);

    void signalEndOfStream();

    boolean start(VideoEncodeParams videoEncodeParams, a aVar);

    void stop();

    void takeSnapshot(TakeSnapshotListener takeSnapshotListener);

    void uninitialize();
}
