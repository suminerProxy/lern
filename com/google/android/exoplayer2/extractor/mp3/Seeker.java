package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Seeker extends SeekMap {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
        public long getDataEndPosition() {
        }

        @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
        public long getTimeUs(long position) {
        }
    }

    long getDataEndPosition();

    long getTimeUs(long position);
}
