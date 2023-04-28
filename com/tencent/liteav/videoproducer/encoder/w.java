package com.tencent.liteav.videoproducer.encoder;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.encoder.be;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RequiresApi(api = 18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w {
    private long A;
    private boolean B;
    private double C;
    private long D;
    private long E;
    private long F;
    private long G;
    private long H;
    private final AtomicLong I;
    private final List<Long> J;
    private final AtomicLong K;

    /* renamed from: a  reason: collision with root package name */
    public String f12657a;
    public final Bundle b;
    public com.tencent.liteav.base.util.b c;

    /* renamed from: d  reason: collision with root package name */
    public MediaCodec f12658d;

    /* renamed from: e  reason: collision with root package name */
    public be.a f12659e;

    /* renamed from: f  reason: collision with root package name */
    public VideoEncodeParams f12660f;

    /* renamed from: g  reason: collision with root package name */
    public long f12661g;

    /* renamed from: h  reason: collision with root package name */
    public com.tencent.liteav.base.util.t f12662h;

    /* renamed from: i  reason: collision with root package name */
    public ServerVideoProducerConfig f12663i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12664j;

    /* renamed from: k  reason: collision with root package name */
    public final Deque<Long> f12665k;

    /* renamed from: l  reason: collision with root package name */
    public int f12666l;

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f12667m;

    /* renamed from: n  reason: collision with root package name */
    public final Runnable f12668n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final IVideoReporter f12669o;

    /* renamed from: p  reason: collision with root package name */
    private final VideoProducerDef.StreamType f12670p;
    private byte[] q;
    private boolean r;
    private long s;
    private long t;
    private long u;
    private int v;
    private final Deque<Long> w;
    private long x;
    private long y;
    private long z;

    public w(Bundle bundle, @NonNull IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
    }

    public static /* synthetic */ void b(w wVar) {
    }

    @SuppressLint({"NewApi"})
    private void c() {
    }

    private void d() {
    }

    private long e() {
    }

    public final void a(long j2) {
    }

    public final void b() {
    }

    private static byte[] b(byte[] bArr) {
    }

    public static /* synthetic */ void a(w wVar) {
    }

    public final void a(String str) {
    }

    public final void a() {
    }

    private MediaCodec b(String str) throws Exception {
    }

    @SuppressLint({"NewApi"})
    public final Surface a(VideoEncodeParams videoEncodeParams) {
    }

    private boolean a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    private static byte[] a(byte[] bArr) {
    }

    public final void a(MediaCodec mediaCodec) {
    }
}
