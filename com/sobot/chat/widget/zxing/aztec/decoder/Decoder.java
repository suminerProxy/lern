package com.sobot.chat.widget.zxing.aztec.decoder;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.aztec.AztecDetectorResult;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.common.DecoderResult;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Decoder {
    private static final String[] DIGIT_TABLE = null;
    private static final String[] LOWER_TABLE = null;
    private static final String[] MIXED_TABLE = null;
    private static final String[] PUNCT_TABLE = null;
    private static final String[] UPPER_TABLE = null;
    private AztecDetectorResult ddata;

    /* renamed from: com.sobot.chat.widget.zxing.aztec.decoder.Decoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$zxing$aztec$decoder$Decoder$Table = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class Table {
        private static final /* synthetic */ Table[] $VALUES = null;
        public static final Table BINARY = null;
        public static final Table DIGIT = null;
        public static final Table LOWER = null;
        public static final Table MIXED = null;
        public static final Table PUNCT = null;
        public static final Table UPPER = null;

        private Table(String str, int i2) {
        }

        public static Table valueOf(String str) {
        }

        public static Table[] values() {
        }
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
    }

    private boolean[] correctBits(boolean[] zArr) throws FormatException {
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
    }

    private static String getCharacter(Table table, int i2) {
    }

    private static String getEncodedData(boolean[] zArr) {
    }

    private static Table getTable(char c) {
    }

    public static String highLevelDecode(boolean[] zArr) {
    }

    private static byte readByte(boolean[] zArr, int i2) {
    }

    private static int readCode(boolean[] zArr, int i2, int i3) {
    }

    private static int totalBitsInLayer(int i2, boolean z) {
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
    }
}
