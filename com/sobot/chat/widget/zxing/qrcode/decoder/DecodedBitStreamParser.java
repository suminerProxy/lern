package com.sobot.chat.widget.zxing.qrcode.decoder;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.BitSource;
import com.sobot.chat.widget.zxing.common.CharacterSetECI;
import com.sobot.chat.widget.zxing.common.DecoderResult;
import java.util.Collection;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = null;
    private static final int GB2312_SUBSET = 1;

    /* renamed from: com.sobot.chat.widget.zxing.qrcode.decoder.DecodedBitStreamParser$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$sobot$chat$widget$zxing$qrcode$decoder$Mode = null;
    }

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
    }

    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb, int i2, boolean z) throws FormatException {
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuilder sb, int i2, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
    }

    private static void decodeHanziSegment(BitSource bitSource, StringBuilder sb, int i2) throws FormatException {
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb, int i2) throws FormatException {
    }

    private static void decodeNumericSegment(BitSource bitSource, StringBuilder sb, int i2) throws FormatException {
    }

    private static int parseECIValue(BitSource bitSource) throws FormatException {
    }

    private static char toAlphaNumericChar(int i2) throws FormatException {
    }
}
