package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    @Nullable
    public final String codecs;
    @Nullable
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private HevcConfig(@Nullable List<byte[]> initializationData, int nalUnitLengthFieldLength, @Nullable String codecs) {
    }

    public static HevcConfig parse(ParsableByteArray data) throws ParserException {
    }
}
