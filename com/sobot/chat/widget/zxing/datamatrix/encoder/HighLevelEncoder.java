package com.sobot.chat.widget.zxing.datamatrix.encoder;

import com.sobot.chat.widget.zxing.Dimension;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HighLevelEncoder {
    public static final int ASCII_ENCODATION = 0;
    public static final int BASE256_ENCODATION = 5;
    public static final int C40_ENCODATION = 1;
    public static final char C40_UNLATCH = 254;
    public static final int EDIFACT_ENCODATION = 4;
    public static final char LATCH_TO_ANSIX12 = 238;
    public static final char LATCH_TO_BASE256 = 231;
    public static final char LATCH_TO_C40 = 230;
    public static final char LATCH_TO_EDIFACT = 240;
    public static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    private static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = 237;
    private static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    private static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = 129;
    public static final int TEXT_ENCODATION = 2;
    public static final char UPPER_SHIFT = 235;
    public static final int X12_ENCODATION = 3;
    public static final char X12_UNLATCH = 254;

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i2) {
    }

    public static String encodeHighLevel(String str) {
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i2, byte[] bArr) {
    }

    private static int getMinimumCount(byte[] bArr) {
    }

    public static void illegalCharacter(char c) {
    }

    public static boolean isDigit(char c) {
    }

    public static boolean isExtendedASCII(char c) {
    }

    private static boolean isNativeC40(char c) {
    }

    private static boolean isNativeEDIFACT(char c) {
    }

    private static boolean isNativeText(char c) {
    }

    private static boolean isNativeX12(char c) {
    }

    private static boolean isSpecialB256(char c) {
    }

    private static boolean isX12TermSep(char c) {
    }

    public static int lookAheadTest(CharSequence charSequence, int i2, int i3) {
    }

    private static char randomize253State(char c, int i2) {
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
    }
}
