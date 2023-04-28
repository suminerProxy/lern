package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface av {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12217a = null;
        public static final a b = null;
        public static final a c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ a[] f12218d = null;
        public int mValue;

        private a(String str, int i2, int i3) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    void abandonDecodingFrames();

    void decode(EncodedVideoFrame encodedVideoFrame);

    a getDecoderType();

    void initialize();

    void setScene(VideoDecoderDef.ConsumerScene consumerScene);

    void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig);

    void signalEndOfStream();

    void start(Object obj, aw awVar);

    void stop();

    void uninitialize();
}
