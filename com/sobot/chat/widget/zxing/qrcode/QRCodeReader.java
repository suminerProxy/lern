package com.sobot.chat.widget.zxing.qrcode;

import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Reader;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.common.BitMatrix;
import com.sobot.chat.widget.zxing.qrcode.decoder.Decoder;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class QRCodeReader implements Reader {
    private static final ResultPoint[] NO_POINTS = null;
    private final Decoder decoder;

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) throws NotFoundException {
    }

    private static float moduleSize(int[] iArr, BitMatrix bitMatrix) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
    }

    public final Decoder getDecoder() {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }
}
