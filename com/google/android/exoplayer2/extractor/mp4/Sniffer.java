package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = null;
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int brand, boolean acceptHeic) {
    }

    public static boolean sniffFragmented(ExtractorInput input) throws IOException {
    }

    private static boolean sniffInternal(ExtractorInput input, boolean fragmented, boolean acceptHeic) throws IOException {
    }

    public static boolean sniffUnfragmented(ExtractorInput input) throws IOException {
    }

    public static boolean sniffUnfragmented(ExtractorInput input, boolean acceptHeic) throws IOException {
    }
}
