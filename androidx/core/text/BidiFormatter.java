package androidx.core.text;

import java.util.Locale;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    public static final BidiFormatter DEFAULT_LTR_INSTANCE = null;
    public static final BidiFormatter DEFAULT_RTL_INSTANCE = null;
    public static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC = null;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING = null;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING = null;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DirectionalityEstimator {
        private static final byte[] DIR_TYPE_CACHE = null;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final CharSequence text;

        public DirectionalityEstimator(CharSequence charSequence, boolean z) {
        }

        private static byte getCachedDirectionality(char c) {
        }

        private byte skipEntityBackward() {
        }

        private byte skipEntityForward() {
        }

        private byte skipTagBackward() {
        }

        private byte skipTagForward() {
        }

        public byte dirTypeBackward() {
        }

        public byte dirTypeForward() {
        }

        public int getEntryDir() {
        }

        public int getExitDir() {
        }
    }

    public BidiFormatter(boolean z, int i2, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
    }

    private static int getEntryDir(CharSequence charSequence) {
    }

    private static int getExitDir(CharSequence charSequence) {
    }

    public static BidiFormatter getInstance() {
    }

    public static boolean isRtlLocale(Locale locale) {
    }

    private String markAfter(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
    }

    private String markBefore(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
    }

    public boolean getStereoReset() {
    }

    public boolean isRtl(String str) {
    }

    public boolean isRtlContext() {
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z) {
        }

        private void initialize(boolean z) {
        }

        public BidiFormatter build() {
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        }

        public Builder stereoReset(boolean z) {
        }

        public Builder(boolean z) {
        }

        public Builder(Locale locale) {
        }
    }

    public static BidiFormatter getInstance(boolean z) {
    }

    public boolean isRtl(CharSequence charSequence) {
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
    }

    public static BidiFormatter getInstance(Locale locale) {
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
    }

    public String unicodeWrap(String str, boolean z) {
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z) {
    }

    public String unicodeWrap(String str) {
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
    }
}
