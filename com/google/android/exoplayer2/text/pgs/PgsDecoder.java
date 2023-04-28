package com.google.android.exoplayer2.text.pgs;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.zip.Inflater;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private final ParsableByteArray buffer;
    private final CueBuilder cueBuilder;
    private final ParsableByteArray inflatedBuffer;
    @Nullable
    private Inflater inflater;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CueBuilder {
        private final ParsableByteArray bitmapData;
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private final int[] colors;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;

        public static /* synthetic */ void access$000(CueBuilder cueBuilder, ParsableByteArray parsableByteArray, int i2) {
        }

        public static /* synthetic */ void access$100(CueBuilder cueBuilder, ParsableByteArray parsableByteArray, int i2) {
        }

        public static /* synthetic */ void access$200(CueBuilder cueBuilder, ParsableByteArray parsableByteArray, int i2) {
        }

        private void parseBitmapSection(ParsableByteArray buffer, int sectionLength) {
        }

        private void parseIdentifierSection(ParsableByteArray buffer, int sectionLength) {
        }

        private void parsePaletteSection(ParsableByteArray buffer, int sectionLength) {
        }

        @Nullable
        public Cue build() {
        }

        public void reset() {
        }
    }

    private void maybeInflateData(ParsableByteArray buffer) {
    }

    @Nullable
    private static Cue readNextSection(ParsableByteArray buffer, CueBuilder cueBuilder) {
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] data, int size, boolean reset) throws SubtitleDecoderException {
    }
}
