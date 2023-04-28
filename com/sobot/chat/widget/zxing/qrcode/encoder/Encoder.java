package com.sobot.chat.widget.zxing.qrcode.encoder;

import com.sobot.chat.widget.zxing.EncodeHintType;
import com.sobot.chat.widget.zxing.WriterException;
import com.sobot.chat.widget.zxing.common.BitArray;
import com.sobot.chat.widget.zxing.common.CharacterSetECI;
import com.sobot.chat.widget.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sobot.chat.widget.zxing.qrcode.decoder.Mode;
import com.sobot.chat.widget.zxing.qrcode.decoder.Version;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Encoder {
    private static final int[] ALPHANUMERIC_TABLE = null;
    public static final String DEFAULT_BYTE_MODE_ENCODING = "ISO-8859-1";

    /* renamed from: com.sobot.chat.widget.zxing.qrcode.encoder.Encoder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$zxing$qrcode$decoder$Mode = null;
    }

    private Encoder() {
    }

    public static void append8BitBytes(String str, BitArray bitArray, String str2) throws WriterException {
    }

    public static void appendAlphanumericBytes(CharSequence charSequence, BitArray bitArray) throws WriterException {
    }

    public static void appendBytes(String str, Mode mode, BitArray bitArray, String str2) throws WriterException {
    }

    private static void appendECI(CharacterSetECI characterSetECI, BitArray bitArray) {
    }

    public static void appendKanjiBytes(String str, BitArray bitArray) throws WriterException {
    }

    public static void appendLengthInfo(int i2, Version version, Mode mode, BitArray bitArray) throws WriterException {
    }

    public static void appendModeInfo(Mode mode, BitArray bitArray) {
    }

    public static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
    }

    private static int calculateBitsNeeded(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
    }

    private static int calculateMaskPenalty(ByteMatrix byteMatrix) {
    }

    private static int chooseMaskPattern(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) throws WriterException {
    }

    public static Mode chooseMode(String str) {
    }

    private static Version chooseVersion(int i2, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
    }

    public static byte[] generateECBytes(byte[] bArr, int i2) {
    }

    public static int getAlphanumericCode(int i2) {
    }

    public static void getNumDataBytesAndNumECBytesForBlockID(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) throws WriterException {
    }

    public static BitArray interleaveWithECBytes(BitArray bitArray, int i2, int i3, int i4) throws WriterException {
    }

    private static boolean isOnlyDoubleByteKanji(String str) {
    }

    private static Version recommendVersion(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) throws WriterException {
    }

    public static void terminateBits(int i2, BitArray bitArray) throws WriterException {
    }

    private static boolean willFit(int i2, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
    }

    private static Mode chooseMode(String str, String str2) {
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
    }
}
