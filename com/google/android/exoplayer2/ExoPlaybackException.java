package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.MediaPeriodId;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final Bundleable.Creator<ExoPlaybackException> CREATOR = null;
    private static final int FIELD_IS_RECOVERABLE = 1006;
    private static final int FIELD_RENDERER_FORMAT = 1004;
    private static final int FIELD_RENDERER_FORMAT_SUPPORT = 1005;
    private static final int FIELD_RENDERER_INDEX = 1003;
    private static final int FIELD_RENDERER_NAME = 1002;
    private static final int FIELD_TYPE = 1001;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final boolean isRecoverable;
    @Nullable
    public final MediaPeriodId mediaPeriodId;
    @Nullable
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    @Nullable
    public final String rendererName;
    public final int type;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Type {
    }

    private ExoPlaybackException(int type, Throwable cause, int errorCode) {
    }

    public static /* synthetic */ ExoPlaybackException a(Bundle bundle) {
    }

    public static ExoPlaybackException createForRemote(String message) {
    }

    public static ExoPlaybackException createForRenderer(Throwable cause, String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport, boolean isRecoverable, int errorCode) {
    }

    public static ExoPlaybackException createForSource(IOException cause, int errorCode) {
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException cause) {
    }

    private static String deriveMessage(int type, @Nullable String customMessage, @Nullable String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport) {
    }

    @CheckResult
    public ExoPlaybackException copyWithMediaPeriodId(@Nullable MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException that) {
    }

    public Exception getRendererException() {
    }

    public IOException getSourceException() {
    }

    public RuntimeException getUnexpectedException() {
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    private ExoPlaybackException(int type, @Nullable Throwable cause, @Nullable String customMessage, int errorCode, @Nullable String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport, boolean isRecoverable) {
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException cause, int errorCode) {
    }

    private ExoPlaybackException(Bundle bundle) {
    }

    private ExoPlaybackException(String message, @Nullable Throwable cause, int errorCode, int type, @Nullable String rendererName, int rendererIndex, @Nullable Format rendererFormat, int rendererFormatSupport, @Nullable MediaPeriodId mediaPeriodId, long timestampMs, boolean isRecoverable) {
    }
}
