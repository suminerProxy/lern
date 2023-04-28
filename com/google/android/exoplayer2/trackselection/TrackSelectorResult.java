package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.RendererConfiguration;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TrackSelectorResult {
    @Nullable
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurations, ExoTrackSelection[] selections, @Nullable Object info) {
    }

    public boolean isEquivalent(@Nullable TrackSelectorResult other) {
    }

    public boolean isRendererEnabled(int index) {
    }

    public boolean isEquivalent(@Nullable TrackSelectorResult other, int index) {
    }
}
