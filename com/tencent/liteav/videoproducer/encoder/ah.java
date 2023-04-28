package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.util.t;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videobase.videobase.h;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.encoder.be;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ah implements t.a, be.a {
    private static final PixelFrame b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f12547a;
    private final com.tencent.liteav.videobase.utils.i c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f12548d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12549e;

    /* renamed from: f  reason: collision with root package name */
    private com.tencent.liteav.base.util.b f12550f;

    /* renamed from: g  reason: collision with root package name */
    private com.tencent.liteav.base.util.t f12551g;

    /* renamed from: h  reason: collision with root package name */
    private be f12552h;

    /* renamed from: i  reason: collision with root package name */
    private VideoEncoderDef.VideoEncoderDataListener f12553i;

    /* renamed from: j  reason: collision with root package name */
    private Rotation f12554j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12555k;

    /* renamed from: l  reason: collision with root package name */
    private ServerVideoProducerConfig f12556l;

    /* renamed from: m  reason: collision with root package name */
    private long f12557m;

    /* renamed from: n  reason: collision with root package name */
    private long f12558n;

    /* renamed from: o  reason: collision with root package name */
    private long f12559o;

    /* renamed from: p  reason: collision with root package name */
    private long f12560p;
    private boolean q;
    private boolean r;
    private boolean s;
    @NonNull
    private final IVideoReporter t;
    @NonNull
    private final c u;
    @NonNull
    private final com.tencent.liteav.videobase.utils.g v;
    @NonNull
    private final bd w;
    @NonNull
    private final VideoProducerDef.StreamType x;
    private final boolean y;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.ah$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ah f12561a;

        public AnonymousClass1(ah ahVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.ah$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12562a = null;
    }

    public ah(@NonNull IVideoReporter iVideoReporter, @NonNull VideoProducerDef.StreamType streamType, boolean z) {
    }

    public static /* synthetic */ void a(ah ahVar, double d2) {
    }

    public static /* synthetic */ void e(ah ahVar) {
    }

    public static /* synthetic */ void f(ah ahVar) {
    }

    public static /* synthetic */ boolean g(ah ahVar) {
    }

    public static /* synthetic */ String h(ah ahVar) {
    }

    public static /* synthetic */ com.tencent.liteav.base.util.b i(ah ahVar) {
    }

    public static /* synthetic */ boolean j(ah ahVar) {
    }

    public static /* synthetic */ com.tencent.liteav.base.util.b k(ah ahVar) {
    }

    private CodecType l() {
    }

    private VideoEncoderDef.ReferenceStrategy m() {
    }

    private void n() {
    }

    private void o() {
    }

    @Override // com.tencent.liteav.base.util.t.a
    public final void a_() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
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

    public static /* synthetic */ void a(ah ahVar, TakeSnapshotListener takeSnapshotListener) {
    }

    public static /* synthetic */ void c(ah ahVar) {
    }

    private boolean g() {
    }

    private void h() {
    }

    private void i() {
    }

    private void j() {
    }

    private VideoEncoderDef.a k() {
    }

    public final void e() {
    }

    public static /* synthetic */ void d(ah ahVar) {
    }

    public static /* synthetic */ void a(ah ahVar, ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public final void a(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public final void a(VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
    }

    public final void a(PixelFrame pixelFrame) {
    }

    public final VideoEncodeParams f() {
    }

    private void b(PixelFrame pixelFrame) {
    }

    private void a(@NonNull VideoEncoderDef.a aVar) {
    }

    public static /* synthetic */ void b(ah ahVar, int i2) {
    }

    public static /* synthetic */ VideoEncodeParams b(ah ahVar) throws Exception {
    }

    public final void a(VideoEncoderDef.EncodeStrategy encodeStrategy) {
    }

    public static /* synthetic */ void a(ah ahVar, VideoEncoderDef.EncodeStrategy encodeStrategy) {
    }

    public final void a(Rotation rotation) {
    }

    public static /* synthetic */ void a(ah ahVar, Rotation rotation) {
    }

    public static /* synthetic */ void a(ah ahVar, boolean z) {
    }

    public final void a(boolean z) {
    }

    public static /* synthetic */ void a(ah ahVar, int i2) {
    }

    public static /* synthetic */ void a(ah ahVar, int i2, int i3) {
    }

    private void a(long j2, long j3) {
    }

    public final void a(VideoEncodeParams videoEncodeParams) {
    }

    public final void a(Runnable runnable, String str) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be.a
    public final void a() {
    }

    public static /* synthetic */ void a(ah ahVar) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be.a
    public final void a(String str) {
    }

    public static /* synthetic */ void a(ah ahVar, String str) {
    }

    @Override // com.tencent.liteav.videoproducer.encoder.be.a
    public final void a(boolean z, int i2) {
    }

    public static /* synthetic */ void a(ah ahVar, boolean z, int i2) {
    }

    public static /* synthetic */ void a(ah ahVar, boolean z, EncodedVideoFrame encodedVideoFrame) {
    }

    public static /* synthetic */ void a(ah ahVar, h.a aVar) {
    }

    public static /* synthetic */ void a(ah ahVar, VideoEncodeParams videoEncodeParams) {
    }

    public static /* synthetic */ void a(ah ahVar, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
    }
}
