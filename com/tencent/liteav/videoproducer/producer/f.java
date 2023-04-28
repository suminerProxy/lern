package com.tencent.liteav.videoproducer.producer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import com.tencent.liteav.videoproducer.preprocessor.VideoPreprocessor;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import com.tencent.liteav.videoproducer.producer.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f implements CaptureSourceInterface.a, com.tencent.liteav.videoproducer.preprocessor.ah, d.a, com.tencent.rtmp.ui.a, com.tencent.rtmp.ui.b {
    private Rotation A;
    private GLConstants.MirrorMode B;
    private GLConstants.GLScaleType C;
    private volatile VideoRenderListener D;
    private com.tencent.liteav.videoconsumer.renderer.f E;
    private VideoRenderListener F;
    private com.tencent.liteav.videoconsumer.renderer.f G;
    private VideoRenderListener H;
    private a I;
    private final com.tencent.liteav.base.util.p J;
    private final com.tencent.liteav.base.util.p K;
    private final e L;
    private boolean M;
    private boolean N;
    private boolean O;
    private final com.tencent.liteav.base.util.p P;

    /* renamed from: a  reason: collision with root package name */
    public String f12823a;
    @NonNull
    public final IVideoReporter b;
    @NonNull
    public final VideoPreprocessor c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final BeautyProcessor f12824d;

    /* renamed from: e  reason: collision with root package name */
    public com.tencent.liteav.base.util.b f12825e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f12826f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private final Context f12827g;

    /* renamed from: h  reason: collision with root package name */
    private com.tencent.liteav.videobase.b.e f12828h;

    /* renamed from: i  reason: collision with root package name */
    private Object f12829i;

    /* renamed from: j  reason: collision with root package name */
    private ServerVideoProducerConfig f12830j;

    /* renamed from: k  reason: collision with root package name */
    private VideoProducerDef.GSensorMode f12831k;

    /* renamed from: l  reason: collision with root package name */
    private int f12832l;

    /* renamed from: m  reason: collision with root package name */
    private d f12833m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12834n;

    /* renamed from: o  reason: collision with root package name */
    private volatile CaptureSourceInterface.SourceType f12835o;

    /* renamed from: p  reason: collision with root package name */
    private CaptureSourceInterface f12836p;
    private CaptureSourceInterface.CaptureParams q;
    private final au r;
    private PixelFrame s;
    private final ConcurrentHashMap<VideoProducerDef.StreamType, GLConstants.Orientation> t;
    private Rotation u;
    private boolean v;
    private JSONArray w;
    private final Map<VideoProducerDef.StreamType, VideoEncoderDef.EncodeStrategy> x;
    @NonNull
    private final ConcurrentHashMap<VideoProducerDef.StreamType, com.tencent.liteav.videoproducer.encoder.ah> y;
    private DisplayTarget z;

    /* renamed from: com.tencent.liteav.videoproducer.producer.f$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends HashMap<VideoProducerDef.StreamType, VideoEncoderDef.EncodeStrategy> {
        public final /* synthetic */ f this$0;

        public AnonymousClass1(f fVar) {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.producer.f$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements VideoRenderListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f12837a;

        public AnonymousClass2(f fVar) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderFrame(PixelFrame pixelFrame) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.producer.f$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements VideoRenderListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f12838a;

        public AnonymousClass3(f fVar) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderFrame(PixelFrame pixelFrame) {
        }

        @Override // com.tencent.liteav.videoconsumer.renderer.VideoRenderListener
        public final void onRenderTargetSizeChanged(int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.producer.f$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12839a = null;
    }

    public f(@NonNull Context context, boolean z, @NonNull IVideoReporter iVideoReporter) {
    }

    public static /* synthetic */ void a(f fVar, PixelFrame pixelFrame) {
    }

    public static /* synthetic */ void b(f fVar) {
    }

    public static /* synthetic */ void c(f fVar) {
    }

    private void d() {
    }

    public static /* synthetic */ void d(f fVar) {
    }

    private void e() {
    }

    private void f() {
    }

    private void g() {
    }

    private List<com.tencent.liteav.videoconsumer.renderer.f> h() {
    }

    public static /* synthetic */ void a(f fVar, ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    private void c() {
    }

    public static /* synthetic */ void g(f fVar) {
    }

    public static /* synthetic */ void a(f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
    }

    public static /* synthetic */ void f(f fVar) {
    }

    public static /* synthetic */ void e(f fVar) {
    }

    public static /* synthetic */ void b(f fVar, boolean z) {
    }

    public static /* synthetic */ void b(f fVar, Rotation rotation) {
    }

    public static /* synthetic */ void b(f fVar, int i2, VideoProducerDef.StreamType streamType) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
    public final void b(boolean z) {
    }

    public static /* synthetic */ void a(f fVar, Bitmap bitmap, int i2) {
    }

    public static VideoEncoderDef.EncodeAbility b() {
    }

    public static /* synthetic */ void b(f fVar, VideoProducerDef.StreamType streamType) {
    }

    public static /* synthetic */ void a(f fVar, DisplayTarget displayTarget) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.StreamType streamType, VideoEncoderDef.EncodeStrategy encodeStrategy) {
    }

    public static /* synthetic */ void b(f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
    }

    public static /* synthetic */ void a(f fVar, String str) {
    }

    public static /* synthetic */ void a(f fVar, int i2, int i3) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.GSensorMode gSensorMode) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.HomeOrientation homeOrientation) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.StreamType streamType, GLConstants.Orientation orientation, VideoEncodeParams videoEncodeParams) {
    }

    public static /* synthetic */ void b(f fVar, PixelFrame pixelFrame) {
    }

    private VideoEncodeParams a(VideoEncodeParams videoEncodeParams) {
    }

    private void a(int i2) {
    }

    public static /* synthetic */ void a(f fVar, int i2, VideoProducerDef.StreamType streamType) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.StreamType streamType, int i2, int i3) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.StreamType streamType) {
    }

    public static /* synthetic */ void a(f fVar, GLConstants.MirrorMode mirrorMode) {
    }

    public static /* synthetic */ void a(f fVar, GLConstants.GLScaleType gLScaleType) {
    }

    public static /* synthetic */ void a(f fVar, Rotation rotation) {
    }

    public static /* synthetic */ void a(f fVar, TakeSnapshotListener takeSnapshotListener, SnapshotSourceType snapshotSourceType) {
    }

    public static /* synthetic */ void a(f fVar, PixelFrame pixelFrame, int i2, int i3) {
    }

    public static /* synthetic */ void a(f fVar) {
    }

    public static /* synthetic */ void a(f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
    }

    public static /* synthetic */ void a(f fVar, Bitmap bitmap, float f2, float f3, float f4) {
    }

    public static /* synthetic */ void a(f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
    }

    private void a(Object obj) {
    }

    private static void a(CaptureSourceInterface.CaptureParams captureParams) {
    }

    private void a(DisplayTarget displayTarget) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
    public final void a(boolean z) {
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
    public final void a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame) {
    }

    public static /* synthetic */ void a(f fVar, PixelFrame pixelFrame, CaptureSourceInterface captureSourceInterface) {
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.a
    public final void a() {
    }

    private void a(VideoRenderListener videoRenderListener) {
    }

    @Override // com.tencent.liteav.videoproducer.preprocessor.ah
    public final void a(int i2, PixelFrame pixelFrame) {
    }

    @Override // com.tencent.liteav.videoproducer.producer.d.a
    public final void a(Rotation rotation, int i2) {
    }

    public static /* synthetic */ void a(f fVar, Rotation rotation, int i2) {
    }

    @Override // com.tencent.rtmp.ui.a
    public final void a(int i2, int i3, int i4, int i5) {
    }

    public static /* synthetic */ void a(f fVar, Point point, int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.rtmp.ui.b
    public final void a(float f2) {
    }

    public static /* synthetic */ void a(f fVar, float f2) {
    }

    private void a(PixelFrame pixelFrame) {
    }

    private void a(PixelFrame pixelFrame, com.tencent.liteav.videoconsumer.renderer.f fVar) {
    }

    public final boolean a(Runnable runnable) {
    }

    private static com.tencent.liteav.videoproducer.capture.s a(CaptureSourceInterface captureSourceInterface) {
    }

    public static /* synthetic */ void a(f fVar, int i2, PixelFrame pixelFrame) {
    }

    public static /* synthetic */ void a(f fVar, VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
    }
}
