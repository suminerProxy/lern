package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    @Nullable
    @ColorInt
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int nameIndex, int alignmentIndex, int primaryColorIndex, int fontSizeIndex, int boldIndex, int italicIndex, int underlineIndex, int strikeoutIndex, int length) {
        }

        @Nullable
        public static Format fromFormatLine(String styleFormatLine) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Overrides {
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = null;
        private static final Pattern BRACES_PATTERN = null;
        private static final Pattern MOVE_PATTERN = null;
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = null;
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        @Nullable
        public final PointF position;

        private Overrides(int alignment, @Nullable PointF position) {
        }

        private static int parseAlignmentOverride(String braceContents) {
        }

        public static Overrides parseFromDialogue(String text) {
        }

        @Nullable
        private static PointF parsePosition(String styleOverride) {
        }

        public static String stripStyleOverrides(String dialogueLine) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface SsaAlignment {
    }

    private SsaStyle(String name, int alignment, @Nullable @ColorInt Integer primaryColor, float fontSize, boolean bold, boolean italic, boolean underline, boolean strikeout) {
    }

    public static /* synthetic */ int access$000(String str) {
    }

    @Nullable
    public static SsaStyle fromStyleLine(String styleLine, Format format) {
    }

    private static boolean isValidAlignment(int alignment) {
    }

    private static int parseAlignment(String alignmentStr) {
    }

    private static boolean parseBooleanValue(String booleanValue) {
    }

    @Nullable
    @ColorInt
    public static Integer parseColor(String ssaColorExpression) {
    }

    private static float parseFontSize(String fontSize) {
    }
}
