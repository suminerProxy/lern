package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface AudioRendererEventListener {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EventDispatcher {
        @Nullable
        private final Handler handler;
        @Nullable
        private final AudioRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener listener) {
        }

        private /* synthetic */ void a(Exception exc) {
        }

        private /* synthetic */ void c(Exception exc) {
        }

        private /* synthetic */ void e(String str, long j2, long j3) {
        }

        private /* synthetic */ void g(String str) {
        }

        private /* synthetic */ void i(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void k(DecoderCounters decoderCounters) {
        }

        private /* synthetic */ void m(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        private /* synthetic */ void o(long j2) {
        }

        private /* synthetic */ void q(boolean z) {
        }

        private /* synthetic */ void s(int i2, long j2, long j3) {
        }

        public void audioCodecError(Exception audioCodecError) {
        }

        public void audioSinkError(Exception audioSinkError) {
        }

        public /* synthetic */ void b(Exception exc) {
        }

        public /* synthetic */ void d(Exception exc) {
        }

        public void decoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        }

        public void decoderReleased(String decoderName) {
        }

        public void disabled(DecoderCounters counters) {
        }

        public void enabled(DecoderCounters decoderCounters) {
        }

        public /* synthetic */ void f(String str, long j2, long j3) {
        }

        public /* synthetic */ void h(String str) {
        }

        public void inputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public /* synthetic */ void j(DecoderCounters decoderCounters) {
        }

        public /* synthetic */ void l(DecoderCounters decoderCounters) {
        }

        public /* synthetic */ void n(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public /* synthetic */ void p(long j2) {
        }

        public void positionAdvancing(long playoutStartSystemTimeMs) {
        }

        public /* synthetic */ void r(boolean z) {
        }

        public void skipSilenceEnabledChanged(boolean skipSilenceEnabled) {
        }

        public /* synthetic */ void t(int i2, long j2, long j3) {
        }

        public void underrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        }
    }

    void onAudioCodecError(Exception audioCodecError);

    void onAudioDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs);

    void onAudioDecoderReleased(String decoderName);

    void onAudioDisabled(DecoderCounters counters);

    void onAudioEnabled(DecoderCounters counters);

    @Deprecated
    void onAudioInputFormatChanged(Format format);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long playoutStartSystemTimeMs);

    void onAudioSinkError(Exception audioSinkError);

    void onAudioUnderrun(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs);

    void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled);
}
