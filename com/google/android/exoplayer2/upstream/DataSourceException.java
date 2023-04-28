package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DataSourceException extends IOException {
    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int reason) {
    }

    public static boolean isCausedByPositionOutOfRange(IOException e2) {
    }

    public DataSourceException(@Nullable Throwable cause, int reason) {
    }

    public DataSourceException(@Nullable String message, int reason) {
    }

    public DataSourceException(@Nullable String message, @Nullable Throwable cause, int reason) {
    }
}
