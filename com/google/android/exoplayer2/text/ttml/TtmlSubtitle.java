package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TtmlSubtitle implements Subtitle {
    private final long[] eventTimesUs;
    private final Map<String, TtmlStyle> globalStyles;
    private final Map<String, String> imageMap;
    private final Map<String, TtmlRegion> regionMap;
    private final TtmlNode root;

    public TtmlSubtitle(TtmlNode root, Map<String, TtmlStyle> globalStyles, Map<String, TtmlRegion> regionMap, Map<String, String> imageMap) {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long timeUs) {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int index) {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
    }

    @VisibleForTesting
    public Map<String, TtmlStyle> getGlobalStyles() {
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long timeUs) {
    }

    @VisibleForTesting
    public TtmlNode getRoot() {
    }
}
