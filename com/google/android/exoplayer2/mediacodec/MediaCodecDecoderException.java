package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MediaCodecDecoderException extends DecoderException {
    @Nullable
    public final MediaCodecInfo codecInfo;
    @Nullable
    public final String diagnosticInfo;

    public MediaCodecDecoderException(Throwable cause, @Nullable MediaCodecInfo codecInfo) {
    }

    @Nullable
    @RequiresApi(21)
    private static String getDiagnosticInfoV21(Throwable cause) {
    }
}
