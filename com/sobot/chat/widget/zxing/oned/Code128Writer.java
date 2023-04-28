package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import java.util.Collection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class CType {
        private static final /* synthetic */ CType[] $VALUES = null;
        public static final CType FNC_1 = null;
        public static final CType ONE_DIGIT = null;
        public static final CType TWO_DIGITS = null;
        public static final CType UNCODABLE = null;

        private CType(String str, int i2) {
        }

        public static CType valueOf(String str) {
        }

        public static CType[] values() {
        }
    }

    private static int chooseCode(CharSequence charSequence, int i2, int i3) {
    }

    private static CType findCType(CharSequence charSequence, int i2) {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
    }
}
