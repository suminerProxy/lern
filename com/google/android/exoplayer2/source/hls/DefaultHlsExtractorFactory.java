package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = null;
    private final boolean exposeCea608WhenMissingDeclarations;
    private final int payloadReaderFactoryFlags;

    public DefaultHlsExtractorFactory() {
    }

    private static void addFileTypeIfValidAndNotPresent(int fileType, List<Integer> fileTypes) {
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    private Extractor createExtractorByFileType(int fileType, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster) {
    }

    private static FragmentedMp4Extractor createFragmentedMp4Extractor(TimestampAdjuster timestampAdjuster, Format format, @Nullable List<Format> muxedCaptionFormats) {
    }

    private static TsExtractor createTsExtractor(int userProvidedPayloadReaderFactoryFlags, boolean exposeCea608WhenMissingDeclarations, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster) {
    }

    private static boolean isFmp4Variant(Format format) {
    }

    private static boolean sniffQuietly(Extractor extractor, ExtractorInput input) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ HlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List muxedCaptionFormats, TimestampAdjuster timestampAdjuster, Map responseHeaders, ExtractorInput sniffingExtractorInput) throws IOException {
    }

    public DefaultHlsExtractorFactory(int payloadReaderFactoryFlags, boolean exposeCea608WhenMissingDeclarations) {
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public BundledHlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster, Map<String, List<String>> responseHeaders, ExtractorInput sniffingExtractorInput) throws IOException {
    }
}
