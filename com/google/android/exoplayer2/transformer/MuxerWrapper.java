package com.google.android.exoplayer2.transformer;

import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;

@RequiresApi(18)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MuxerWrapper {
    private static final long MAX_TRACK_WRITE_AHEAD_US = 0;
    private boolean isReady;
    private long minTrackTimeUs;
    private final Muxer muxer;
    private int previousTrackType;
    private int trackCount;
    private int trackFormatCount;
    private final SparseIntArray trackTypeToIndex;
    private final SparseLongArray trackTypeToTimeUs;

    public MuxerWrapper(Muxer muxer) {
    }

    private boolean canWriteSampleOfType(int trackType) {
    }

    public void addTrackFormat(Format format) {
    }

    public void endTrack(int trackType) {
    }

    public int getTrackCount() {
    }

    public void registerTrack() {
    }

    public void release(boolean forCancellation) {
    }

    public boolean supportsSampleMimeType(@Nullable String mimeType) {
    }

    public boolean writeSample(int trackType, @Nullable ByteBuffer data, boolean isKeyFrame, long presentationTimeUs) {
    }
}
