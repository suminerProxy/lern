package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface HlsExtractorFactory {
    public static final HlsExtractorFactory DEFAULT = null;

    HlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster, Map<String, List<String>> responseHeaders, ExtractorInput sniffingExtractorInput) throws IOException;
}
