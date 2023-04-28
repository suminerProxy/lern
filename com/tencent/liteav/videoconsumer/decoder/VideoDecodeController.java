package com.tencent.liteav.videoconsumer.decoder;

import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.decoder.av;
import com.tencent.liteav.videoconsumer.decoder.d;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class VideoDecodeController implements aw {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    public final IVideoReporter f12157a;
    @NonNull
    public final d b;
    @NonNull
    public final at c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12158d;

    /* renamed from: e  reason: collision with root package name */
    public com.tencent.liteav.base.util.t f12159e;

    /* renamed from: f  reason: collision with root package name */
    public a f12160f;

    /* renamed from: g  reason: collision with root package name */
    public Object f12161g;

    /* renamed from: h  reason: collision with root package name */
    public com.tencent.liteav.videobase.b.e f12162h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12163i;

    /* renamed from: j  reason: collision with root package name */
    public av f12164j;

    /* renamed from: k  reason: collision with root package name */
    public JSONArray f12165k;

    /* renamed from: l  reason: collision with root package name */
    public VideoDecoderDef.ConsumerScene f12166l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicInteger f12167m;

    /* renamed from: n  reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.k f12168n;

    /* renamed from: o  reason: collision with root package name */
    public ServerVideoConsumerConfig f12169o;

    /* renamed from: p  reason: collision with root package name */
    public final com.tencent.liteav.videobase.utils.l f12170p;
    private com.tencent.liteav.base.util.b q;
    private final d.InterfaceC0201d r;

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.VideoDecodeController$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12171a = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class DecodeStrategy {

        /* renamed from: a  reason: collision with root package name */
        public static final DecodeStrategy f12172a = null;
        public static final DecodeStrategy b = null;
        public static final DecodeStrategy c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final DecodeStrategy f12173d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final DecodeStrategy[] f12174e = null;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ DecodeStrategy[] f12175f = null;
        private final int mValue;

        private DecodeStrategy(String str, int i2, int i3) {
        }

        public static DecodeStrategy a(int i2) {
        }

        public static DecodeStrategy valueOf(String str) {
        }

        public static DecodeStrategy[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a extends aw {
    }

    public VideoDecodeController(@NonNull IVideoReporter iVideoReporter, boolean z) {
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final av.a d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final boolean h() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public final void onAbandonDecodingFramesCompleted() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public final void onDecodeCompleted() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public final void onDecodeFailed() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public final void onDecodeFrame(PixelFrame pixelFrame, long j2) {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public final void onFrameEnqueuedToDecoder() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public final void onRequestKeyFrame() {
    }

    public final void b(EncodedVideoFrame encodedVideoFrame) {
    }

    public final void a(Object obj) {
    }

    public final void a(a aVar) {
    }

    public final void a(EncodedVideoFrame encodedVideoFrame) {
    }

    public final void a(EncodedVideoFrame encodedVideoFrame, av.a aVar) {
    }

    public final boolean a(Runnable runnable) {
    }
}
