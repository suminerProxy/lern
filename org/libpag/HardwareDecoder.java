package org.libpag;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HardwareDecoder {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f29808a = null;
    private VideoSurface b;
    private MediaCodec c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29809d;

    /* renamed from: e  reason: collision with root package name */
    private MediaCodec.BufferInfo f29810e;

    /* renamed from: f  reason: collision with root package name */
    private int f29811f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f29812g;

    private static HardwareDecoder Create(MediaFormat mediaFormat) {
    }

    public static /* synthetic */ AtomicInteger access$000() {
    }

    public static /* synthetic */ MediaCodec access$100(HardwareDecoder hardwareDecoder) {
    }

    public static /* synthetic */ MediaCodec access$102(HardwareDecoder hardwareDecoder, MediaCodec mediaCodec) {
    }

    public static /* synthetic */ VideoSurface access$200(HardwareDecoder hardwareDecoder) {
    }

    private int dequeueInputBuffer() {
    }

    private int dequeueOutputBuffer() {
    }

    private ByteBuffer getInputBuffer(int i2) {
    }

    private VideoSurface getVideoSurface() {
    }

    private int onDecodeFrame() {
    }

    private int onEndOfStream() {
    }

    private void onFlush() {
    }

    private void onRelease() {
    }

    private boolean onRenderFrame() {
    }

    private int onSendBytes(ByteBuffer byteBuffer, long j2) {
    }

    private long presentationTime() {
    }

    private int queueInputBuffer(int i2, int i3, int i4, long j2, int i5) {
    }

    private void releaseAsync(Runnable runnable) {
    }

    private void releaseDecoder() {
    }

    private void releaseOutputBuffer() {
    }

    private int releaseOutputBuffer(int i2, boolean z) {
    }
}
