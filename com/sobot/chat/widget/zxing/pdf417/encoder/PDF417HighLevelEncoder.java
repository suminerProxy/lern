package com.sobot.chat.widget.zxing.pdf417.encoder;

import com.sobot.chat.widget.zxing.WriterException;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PDF417HighLevelEncoder {
    private static final int BYTE_COMPACTION = 1;
    private static final Charset DEFAULT_ENCODING = null;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED = null;
    private static final int NUMERIC_COMPACTION = 2;
    private static final byte[] PUNCTUATION = null;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = null;
    private static final byte[] TEXT_PUNCTUATION_RAW = null;

    /* renamed from: com.sobot.chat.widget.zxing.pdf417.encoder.PDF417HighLevelEncoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$zxing$pdf417$encoder$Compaction = null;
    }

    private PDF417HighLevelEncoder() {
    }

    private static int determineConsecutiveBinaryCount(String str, int i2, Charset charset) throws WriterException {
    }

    private static int determineConsecutiveDigitCount(CharSequence charSequence, int i2) {
    }

    private static int determineConsecutiveTextCount(CharSequence charSequence, int i2) {
    }

    private static void encodeBinary(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
    }

    public static String encodeHighLevel(String str, Compaction compaction, Charset charset) throws WriterException {
    }

    private static void encodeNumeric(String str, int i2, int i3, StringBuilder sb) {
    }

    private static int encodeText(CharSequence charSequence, int i2, int i3, StringBuilder sb, int i4) {
    }

    private static void encodingECI(int i2, StringBuilder sb) throws WriterException {
    }

    private static boolean isAlphaLower(char c) {
    }

    private static boolean isAlphaUpper(char c) {
    }

    private static boolean isDigit(char c) {
    }

    private static boolean isMixed(char c) {
    }

    private static boolean isPunctuation(char c) {
    }

    private static boolean isText(char c) {
    }
}
