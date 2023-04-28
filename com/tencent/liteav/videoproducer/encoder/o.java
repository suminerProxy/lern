package com.tencent.liteav.videoproducer.encoder;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.h;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.encoder.be;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

@TargetApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o implements be, be.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f12628a;
    @NonNull
    private final IVideoReporter b;
    @NonNull
    private final com.tencent.liteav.base.util.p c;

    /* renamed from: d  reason: collision with root package name */
    private final w f12629d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f12630e;

    /* renamed from: f  reason: collision with root package name */
    private com.tencent.liteav.videobase.b.e f12631f;

    /* renamed from: g  reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.j f12632g;

    /* renamed from: h  reason: collision with root package name */
    private VideoEncodeParams f12633h;

    /* renamed from: i  reason: collision with root package name */
    private long f12634i;

    /* renamed from: j  reason: collision with root package name */
    private volatile Handler f12635j;

    /* renamed from: k  reason: collision with root package name */
    private volatile be.a f12636k;

    /* renamed from: l  reason: collision with root package name */
    private com.tencent.liteav.videobase.b.c f12637l;

    /* renamed from: m  reason: collision with root package name */
    private final com.tencent.liteav.videobase.utils.l f12638m;

    public o(Bundle bundle, @NonNull IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
    }

    private boolean a(Object obj, Surface surface) {
    }

    private void b() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be.a
    public final void a(boolean z, int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void ackRPSRecvFrameIndex(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void encodeFrame(PixelFrame pixelFrame, Rotation rotation, boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final VideoEncodeParams getEncodeParams() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final VideoEncoderDef.a getEncoderType() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void initialize() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
    public final void onEncodedFail(h.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
    public final void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.VideoEncoderDataListener
    public final void onOutputFormatChanged(MediaFormat mediaFormat) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void restartIDRFrame() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void setBitrate(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void setFps(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void setRPSIFrameFPS(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void setRPSNearestREFSize(int i2) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void signalEndOfStream() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final boolean start(VideoEncodeParams videoEncodeParams, be.a aVar) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void stop() {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void takeSnapshot(TakeSnapshotListener takeSnapshotListener) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be
    public final void uninitialize() {
    }

    private void a(Runnable runnable) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be.a
    public final void a() {
    }

    public static /* synthetic */ void a(o oVar) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be.a
    public final void a(String str) {
    }

    public static /* synthetic */ void a(o oVar, String str) {
    }

    public static /* synthetic */ void a(o oVar, MediaFormat mediaFormat) {
    }

    public static /* synthetic */ void a(o oVar, EncodedVideoFrame encodedVideoFrame, boolean z) {
    }

    public static /* synthetic */ void a(o oVar, h.a aVar) {
    }
}
