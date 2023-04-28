package com.google.android.exoplayer2.source.chunk;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Chunk implements Loader.Loadable {
    public final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    public final long endTimeUs;
    public final long loadTaskId;
    public final long startTimeUs;
    public final Format trackFormat;
    @Nullable
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int type;

    public Chunk(DataSource dataSource, DataSpec dataSpec, int type, Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long startTimeUs, long endTimeUs) {
    }

    public final long bytesLoaded() {
    }

    public final long getDurationUs() {
    }

    public final Map<String, List<String>> getResponseHeaders() {
    }

    public final Uri getUri() {
    }
}
