package com.google.android.exoplayer2.text.ssa;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.ssa.SsaStyle;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    public static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = null;
    public static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaDecoder";
    @Nullable
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaDecoder() {
    }

    private static int addCuePlacerholderByTime(long timeUs, List<Long> sortedCueTimesUs, List<List<Cue>> cues) {
    }

    private static float computeDefaultLineOrPosition(int anchor) {
    }

    private static Cue createCue(String text, @Nullable SsaStyle style, SsaStyle.Overrides styleOverrides, float screenWidth, float screenHeight) {
    }

    private void parseDialogueLine(String dialogueLine, SsaDialogueFormat format, List<List<Cue>> cues, List<Long> cueTimesUs) {
    }

    private void parseEventBody(ParsableByteArray data, List<List<Cue>> cues, List<Long> cueTimesUs) {
    }

    private void parseHeader(ParsableByteArray data) {
    }

    private void parseScriptInfo(ParsableByteArray data) {
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray data) {
    }

    private static long parseTimecodeUs(String timeString) {
    }

    private static int toLineAnchor(int alignment) {
    }

    private static int toPositionAnchor(int alignment) {
    }

    @Nullable
    private static Layout.Alignment toTextAlignment(int alignment) {
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) {
    }

    public SsaDecoder(@Nullable List<byte[]> initializationData) {
    }
}
