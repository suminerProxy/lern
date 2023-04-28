package com.sobot.chat.widget.zxing.pdf417.decoder;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.DecoderResult;
import com.sobot.chat.widget.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900 = null;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final char[] MIXED_CHARS = null;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final char[] PUNCT_CHARS = null;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;

    /* renamed from: com.sobot.chat.widget.zxing.pdf417.decoder.DecodedBitStreamParser$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES = null;
        public static final Mode ALPHA = null;
        public static final Mode ALPHA_SHIFT = null;
        public static final Mode LOWER = null;
        public static final Mode MIXED = null;
        public static final Mode PUNCT = null;
        public static final Mode PUNCT_SHIFT = null;

        private Mode(String str, int i2) {
        }

        public static Mode valueOf(String str) {
        }

        public static Mode[] values() {
        }
    }

    private DecodedBitStreamParser() {
    }

    private static int byteCompaction(int i2, int[] iArr, Charset charset, int i3, StringBuilder sb) {
    }

    public static DecoderResult decode(int[] iArr, String str) throws FormatException {
    }

    private static String decodeBase900toBase10(int[] iArr, int i2) throws FormatException {
    }

    public static int decodeMacroBlock(int[] iArr, int i2, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
    }

    private static void decodeTextCompaction(int[] iArr, int[] iArr2, int i2, StringBuilder sb) {
    }

    private static int numericCompaction(int[] iArr, int i2, StringBuilder sb) throws FormatException {
    }

    private static int textCompaction(int[] iArr, int i2, StringBuilder sb) {
    }
}
