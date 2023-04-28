package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MediaSourceFactory {
    @Deprecated
    MediaSource createMediaSource(Uri uri);

    MediaSource createMediaSource(MediaItem mediaItem);

    int[] getSupportedTypes();

    @Deprecated
    MediaSourceFactory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory);

    @Deprecated
    MediaSourceFactory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager);

    MediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider);

    @Deprecated
    MediaSourceFactory setDrmUserAgent(@Nullable String userAgent);

    MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy);

    @Deprecated
    MediaSourceFactory setStreamKeys(@Nullable List<StreamKey> streamKeys);
}
