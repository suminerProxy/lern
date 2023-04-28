package com.google.android.exoplayer2.util;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    private static int[] getUriIndices(String uriString) {
    }

    public static boolean isAbsolute(@Nullable String uri) {
    }

    private static String removeDotSegments(StringBuilder uri, int offset, int limit) {
    }

    public static Uri removeQueryParameter(Uri uri, String queryParameterName) {
    }

    public static String resolve(@Nullable String baseUri, @Nullable String referenceUri) {
    }

    public static Uri resolveToUri(@Nullable String baseUri, @Nullable String referenceUri) {
    }
}
