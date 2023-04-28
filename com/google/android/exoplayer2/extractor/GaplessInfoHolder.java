package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class GaplessInfoHolder {
    private static final Pattern GAPLESS_COMMENT_PATTERN = null;
    private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay;
    public int encoderPadding;

    private boolean setFromComment(String data) {
    }

    public boolean hasGaplessInfo() {
    }

    public boolean setFromMetadata(Metadata metadata) {
    }

    public boolean setFromXingHeaderValue(int value) {
    }
}
