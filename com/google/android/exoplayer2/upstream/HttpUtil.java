package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HttpUtil {
    private static final Pattern CONTENT_RANGE_WITH_SIZE = null;
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = null;
    private static final String TAG = "HttpUtil";

    private HttpUtil() {
    }

    @Nullable
    public static String buildRangeRequestHeader(long position, long length) {
    }

    public static long getContentLength(@Nullable String contentLengthHeader, @Nullable String contentRangeHeader) {
    }

    public static long getDocumentSize(@Nullable String contentRangeHeader) {
    }
}
