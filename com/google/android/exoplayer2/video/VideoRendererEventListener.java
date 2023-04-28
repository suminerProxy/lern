package com.google.android.exoplayer2.video;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface VideoRendererEventListener {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EventDispatcher {
        @Nullable
        private final Handler handler;
        @Nullable
        private final VideoRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener listener) {
        }

        private /* synthetic */ void a(String str, long j2, long j3) {
        }

        private /* synthetic */ void c(String str) {
        }

        private /* synthetic */ void e(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void g(int i2, long j2) {
        }

        private /* synthetic */ void i(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void k(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        private /* synthetic */ void m(Object obj, long j2) {
        }

        private /* synthetic */ void o(long j2, int i2) {
        }

        private /* synthetic */ void q(Exception exc) {
        }

        private /* synthetic */ void s(VideoSize videoSize) {
        }

        public /* synthetic */ void b(String str, long j2, long j3) {
        }

        public /* synthetic */ void d(String str) {
        }

        public void decoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        }

        public void decoderReleased(String decoderName) {
        }

        public void disabled(DecoderCounters counters) {
        }

        public void droppedFrames(int droppedFrameCount, long elapsedMs) {
        }

        public void enabled(DecoderCounters decoderCounters) {
        }

        public /* synthetic */ void f(DecoderCounters decoderCounters) {
        }

        public /* synthetic */ void h(int i2, long j2) {
        }

        public void inputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public /* synthetic */ void j(DecoderCounters decoderCounters) {
        }

        public /* synthetic */ void l(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public /* synthetic */ void n(Object obj, long j2) {
        }

        public /* synthetic */ void p(long j2, int i2) {
        }

        public /* synthetic */ void r(Exception exc) {
        }

        public void renderedFirstFrame(Object output) {
        }

        public void reportVideoFrameProcessingOffset(long totalProcessingOffsetUs, int frameCount) {
        }

        public /* synthetic */ void t(VideoSize videoSize) {
        }

        public void videoCodecError(Exception videoCodecError) {
        }

        public void videoSizeChanged(VideoSize videoSize) {
        }
    }

    void onDroppedFrames(int count, long elapsedMs);

    void onRenderedFirstFrame(Object output, long renderTimeMs);

    void onVideoCodecError(Exception videoCodecError);

    void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void onVideoDecoderReleased(String decoderName);

    void onVideoDisabled(DecoderCounters counters);

    void onVideoEnabled(DecoderCounters counters);

    void onVideoFrameProcessingOffset(long totalProcessingOffsetUs, int frameCount);

    @Deprecated
    void onVideoInputFormatChanged(Format format);

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(VideoSize videoSize);
}
