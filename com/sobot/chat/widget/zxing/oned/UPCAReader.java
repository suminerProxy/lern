package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.BarcodeFormat;
import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UPCAReader extends UPCEANReader {
    private final UPCEANReader ean13Reader;

    private static Result maybeReturnResult(Result result) throws FormatException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader, com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public Result decodeRow(int i2, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader
    public BarcodeFormat getBarcodeFormat() {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader, com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.UPCEANReader, com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
    }
}
