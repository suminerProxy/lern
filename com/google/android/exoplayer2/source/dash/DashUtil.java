package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DashUtil {
    private DashUtil() {
    }

    public static DataSpec buildDataSpec(String baseUrl, RangedUri requestUri, @Nullable String cacheKey, int flags) {
    }

    @Nullable
    private static Representation getFirstRepresentation(Period period, int type) {
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int trackType, Representation representation, int baseUrlIndex) throws IOException {
    }

    @Nullable
    public static Format loadFormatWithDrmInitData(DataSource dataSource, Period period) throws IOException {
    }

    private static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, int baseUrlIndex, boolean loadIndex) throws IOException {
    }

    public static DashManifest loadManifest(DataSource dataSource, Uri uri) throws IOException {
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int trackType, Representation representation, int baseUrlIndex) throws IOException {
    }

    private static ChunkExtractor newChunkExtractor(int trackType, Format format) {
    }

    public static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, boolean loadIndex) throws IOException {
    }

    public static DataSpec buildDataSpec(Representation representation, RangedUri requestUri, int flags) {
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int trackType, Representation representation) throws IOException {
    }

    private static void loadInitializationData(DataSource dataSource, Representation representation, int baseUrlIndex, ChunkExtractor chunkExtractor, RangedUri requestUri) throws IOException {
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int trackType, Representation representation) throws IOException {
    }
}
