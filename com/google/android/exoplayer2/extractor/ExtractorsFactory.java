package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = null;

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> responseHeaders);
}
