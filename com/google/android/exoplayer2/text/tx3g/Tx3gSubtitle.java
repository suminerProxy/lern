package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Tx3gSubtitle implements Subtitle {
    public static final Tx3gSubtitle EMPTY = null;
    private final List<Cue> cues;

    public Tx3gSubtitle(Cue cue) {
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

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long timeUs) {
    }

    private Tx3gSubtitle() {
    }
}
