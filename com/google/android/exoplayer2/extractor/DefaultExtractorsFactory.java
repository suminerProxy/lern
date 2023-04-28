package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = null;
    @Nullable
    private static final Constructor<? extends Extractor> FLAC_EXTENSION_EXTRACTOR_CONSTRUCTOR = null;
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private int tsMode;
    private int tsTimestampSearchBytes;

    private void addExtractorsForFileType(int fileType, List<Extractor> extractors) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors() {
    }

    public synchronized DefaultExtractorsFactory setAdtsExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setAmrExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean constantBitrateSeekingEnabled) {
    }

    public synchronized DefaultExtractorsFactory setFlacExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setMatroskaExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setMp3ExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setMp4ExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setTsExtractorFlags(int flags) {
    }

    public synchronized DefaultExtractorsFactory setTsExtractorMode(int mode) {
    }

    public synchronized DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int timestampSearchBytes) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors(Uri uri, Map<String, List<String>> responseHeaders) {
    }
}
