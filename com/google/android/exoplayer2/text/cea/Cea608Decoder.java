package com.google.android.exoplayer2.text.cea;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int[] BASIC_CHARACTER_SET = null;
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final int[] COLUMN_INDICES = null;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final boolean[] ODD_PARITY_BYTE_TABLE = null;
    private static final int[] ROW_INDICES = null;
    private static final int[] SPECIAL_CHARACTER_SET = null;
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = null;
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = null;
    private static final int[] STYLE_COLORS = null;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private final ParsableByteArray ccData;
    private final ArrayList<CueBuilder> cueBuilders;
    @Nullable
    private List<Cue> cues;
    private int currentChannel;
    private CueBuilder currentCueBuilder;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;
    @Nullable
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private final StringBuilder captionStringBuilder;
        private final List<CueStyle> cueStyles;
        private int indent;
        private final List<SpannableString> rolledUpCaptions;
        private int row;
        private int tabOffset;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int style, boolean underline, int start) {
            }
        }

        public CueBuilder(int captionMode, int captionRowCount) {
        }

        public static /* synthetic */ int access$002(CueBuilder cueBuilder, int i2) {
        }

        public static /* synthetic */ int access$100(CueBuilder cueBuilder) {
        }

        public static /* synthetic */ int access$102(CueBuilder cueBuilder, int i2) {
        }

        public static /* synthetic */ int access$202(CueBuilder cueBuilder, int i2) {
        }

        private SpannableString buildCurrentLine() {
        }

        private static void setColorSpan(SpannableStringBuilder builder, int start, int end, int color) {
        }

        private static void setItalicSpan(SpannableStringBuilder builder, int start, int end) {
        }

        private static void setUnderlineSpan(SpannableStringBuilder builder, int start, int end) {
        }

        public void append(char text) {
        }

        public void backspace() {
        }

        @Nullable
        public Cue build(int forcedPositionAnchor) {
        }

        public boolean isEmpty() {
        }

        public void reset(int captionMode) {
        }

        public void rollUp() {
        }

        public void setCaptionMode(int captionMode) {
        }

        public void setCaptionRowCount(int captionRowCount) {
        }

        public void setStyle(int style, boolean underline) {
        }
    }

    public Cea608Decoder(String mimeType, int accessibilityChannel, long validDataChannelTimeoutMs) {
    }

    public static /* synthetic */ int[] access$300() {
    }

    private static char getBasicChar(byte ccData) {
    }

    private static int getChannel(byte cc1) {
    }

    private List<Cue> getDisplayCues() {
    }

    private static char getExtendedEsFrChar(byte ccData) {
    }

    private static char getExtendedPtDeChar(byte ccData) {
    }

    private static char getExtendedWestEuropeanChar(byte cc1, byte cc2) {
    }

    private static char getSpecialNorthAmericanChar(byte ccData) {
    }

    private void handleMidrowCtrl(byte cc2) {
    }

    private void handleMiscCode(byte cc2) {
    }

    private void handlePreambleAddressCode(byte cc1, byte cc2) {
    }

    private static boolean isCtrlCode(byte cc1) {
    }

    private static boolean isExtendedWestEuropeanChar(byte cc1, byte cc2) {
    }

    private static boolean isMidrowCtrlCode(byte cc1, byte cc2) {
    }

    private static boolean isMiscCode(byte cc1, byte cc2) {
    }

    private static boolean isPreambleAddressCode(byte cc1, byte cc2) {
    }

    private static boolean isRepeatable(byte cc1) {
    }

    private boolean isRepeatedCommand(boolean captionValid, byte cc1, byte cc2) {
    }

    private static boolean isServiceSwitchCommand(byte cc1) {
    }

    private static boolean isSpecialNorthAmericanChar(byte cc1, byte cc2) {
    }

    private static boolean isTabCtrlCode(byte cc1, byte cc2) {
    }

    private static boolean isXdsControlCode(byte cc1) {
    }

    private void maybeUpdateIsInCaptionService(byte cc1, byte cc2) {
    }

    private void resetCueBuilders() {
    }

    private void setCaptionMode(int captionMode) {
    }

    private void setCaptionRowCount(int captionRowCount) {
    }

    private boolean shouldClearStuckCaptions() {
    }

    private boolean updateAndVerifyCurrentChannel(byte cc1) {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer inputBuffer) {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer inputBuffer) throws SubtitleDecoderException {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long positionUs) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
    }
}
