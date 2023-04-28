package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(@Nullable String message, @Nullable Throwable cause, boolean contentIsMalformed, int dataType) {
    }

    public static ParserException createForMalformedContainer(@Nullable String message, @Nullable Throwable cause) {
    }

    public static ParserException createForMalformedDataOfUnknownType(@Nullable String message, @Nullable Throwable cause) {
    }

    public static ParserException createForMalformedManifest(@Nullable String message, @Nullable Throwable cause) {
    }

    public static ParserException createForManifestWithUnsupportedFeature(@Nullable String message, @Nullable Throwable cause) {
    }

    public static ParserException createForUnsupportedContainerFeature(@Nullable String message) {
    }
}
