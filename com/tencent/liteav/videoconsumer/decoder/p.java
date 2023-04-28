package com.tencent.liteav.videoconsumer.decoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.h;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.decoder.av;
import java.util.Deque;
import org.json.JSONArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p implements SurfaceTexture.OnFrameAvailableListener, av {

    /* renamed from: a  reason: collision with root package name */
    private static final EncodedVideoFrame f12264a = null;
    @NonNull
    private final com.tencent.liteav.base.util.p b;
    @NonNull
    private final IVideoReporter c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONArray f12265d;

    /* renamed from: e  reason: collision with root package name */
    private volatile com.tencent.liteav.base.util.b f12266e;

    /* renamed from: f  reason: collision with root package name */
    private MediaCodec f12267f;

    /* renamed from: g  reason: collision with root package name */
    private aw f12268g;

    /* renamed from: h  reason: collision with root package name */
    private final MediaCodec.BufferInfo f12269h;

    /* renamed from: i  reason: collision with root package name */
    private final Deque<EncodedVideoFrame> f12270i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12271j;

    /* renamed from: k  reason: collision with root package name */
    private com.tencent.liteav.videobase.b.e f12272k;

    /* renamed from: l  reason: collision with root package name */
    private int f12273l;

    /* renamed from: m  reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.l f12274m;

    /* renamed from: n  reason: collision with root package name */
    private SurfaceTexture f12275n;

    /* renamed from: o  reason: collision with root package name */
    private Surface f12276o;

    /* renamed from: p  reason: collision with root package name */
    private VideoDecoderDef.ConsumerScene f12277p;
    private boolean q;
    private o r;
    private boolean s;
    private com.tencent.liteav.base.util.t t;
    private MediaFormat u;

    public p(@NonNull com.tencent.liteav.base.util.p pVar, boolean z, @Nullable JSONArray jSONArray, @NonNull IVideoReporter iVideoReporter) {
    }

    public static /* synthetic */ void a(p pVar, VideoDecoderDef.ConsumerScene consumerScene) {
    }

    private void b() {
    }

    private void c() {
    }

    private void d() {
    }

    public static /* synthetic */ void d(p pVar) {
    }

    private boolean e() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void abandonDecodingFrames() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void decode(EncodedVideoFrame encodedVideoFrame) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final av.a getDecoderType() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void initialize() {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void signalEndOfStream() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void start(Object obj, aw awVar) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void stop() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.av
    public final void uninitialize() {
    }

    public p(@NonNull MediaFormat mediaFormat, @Nullable JSONArray jSONArray, @NonNull IVideoReporter iVideoReporter) {
    }

    private boolean a(Object obj) {
    }

    public static /* synthetic */ void b(p pVar) {
    }

    public static /* synthetic */ void c(p pVar) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public MediaCodec f12278a;
        public h.c b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public Exception f12279d;

        private a() {
        }

        public /* synthetic */ a(byte b) {
        }
    }

    private static void a(MediaCodec mediaCodec) {
    }

    private void a() {
    }

    public static /* synthetic */ void a(p pVar, ServerVideoConsumerConfig serverVideoConsumerConfig) {
    }

    public static /* synthetic */ void a(p pVar) {
    }

    public static /* synthetic */ void a(p pVar, SurfaceTexture surfaceTexture) {
    }

    private void a(h.c cVar, String str, Object... objArr) {
    }

    private void a(Runnable runnable) {
    }

    private boolean a(a aVar, boolean z, MediaFormat mediaFormat) {
    }

    public static /* synthetic */ void a(p pVar, EncodedVideoFrame encodedVideoFrame) {
    }

    public static /* synthetic */ void a(p pVar, Object obj, aw awVar) {
    }
}
