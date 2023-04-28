package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class VorbisReader extends StreamReader {
    @Nullable
    private VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;
    @Nullable
    private VorbisUtil.VorbisIdHeader vorbisIdHeader;
    @Nullable
    private VorbisSetup vorbisSetup;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class VorbisSetup {
        public final VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final VorbisUtil.VorbisIdHeader idHeader;
        public final VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(VorbisUtil.VorbisIdHeader idHeader, VorbisUtil.CommentHeader commentHeader, byte[] setupHeaderData, VorbisUtil.Mode[] modes, int iLogModes) {
        }
    }

    @VisibleForTesting
    public static void appendNumberOfSamples(ParsableByteArray buffer, long packetSampleCount) {
    }

    private static int decodeBlockSize(byte firstByteOfAudioPacket, VorbisSetup vorbisSetup) {
    }

    @VisibleForTesting
    public static int readBits(byte src, int length, int leastSignificantBitIndex) {
    }

    public static boolean verifyBitstreamType(ParsableByteArray data) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public void onSeekEnd(long currentGranule) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray packet) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean readHeaders(ParsableByteArray packet, long position, StreamReader.SetupData setupData) throws IOException {
    }

    @Nullable
    @VisibleForTesting
    public VorbisSetup readSetupHeaders(ParsableByteArray scratch) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public void reset(boolean headerData) {
    }
}
