package com.google.android.exoplayer2.drm;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.HttpDataSource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {
    @GuardedBy("lock")
    private MediaItem.DrmConfiguration drmConfiguration;
    @Nullable
    private HttpDataSource.Factory drmHttpDataSourceFactory;
    private final Object lock;
    @GuardedBy("lock")
    private DrmSessionManager manager;
    @Nullable
    private String userAgent;

    @RequiresApi(18)
    private DrmSessionManager createManager(MediaItem.DrmConfiguration drmConfiguration) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    public DrmSessionManager get(MediaItem mediaItem) {
    }

    public void setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
    }

    public void setDrmUserAgent(@Nullable String userAgent) {
    }
}
