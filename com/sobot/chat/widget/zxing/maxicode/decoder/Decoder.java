package com.sobot.chat.widget.zxing.maxicode.decoder;

import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.common.DecoderResult;
import com.sobot.chat.widget.zxing.common.reedsolomon.ReedSolomonDecoder;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class Decoder {
    private static final int ALL = 0;
    private static final int EVEN = 1;
    private static final int ODD = 2;
    private final ReedSolomonDecoder rsDecoder;

    private void correctErrors(byte[] bArr, int i2, int i3, int i4, int i5) throws ChecksumException {
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
    }
}
