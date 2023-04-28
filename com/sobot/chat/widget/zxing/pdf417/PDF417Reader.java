package com.sobot.chat.widget.zxing.pdf417;

import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Reader;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PDF417Reader implements Reader, MultipleBarcodeReader {
    private static final Result[] EMPTY_RESULT_ARRAY = null;

    private static int getMaxCodewordWidth(ResultPoint[] resultPointArr) {
    }

    private static int getMaxWidth(ResultPoint resultPoint, ResultPoint resultPoint2) {
    }

    private static int getMinCodewordWidth(ResultPoint[] resultPointArr) {
    }

    private static int getMinWidth(ResultPoint resultPoint, ResultPoint resultPoint2) {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException, ChecksumException {
    }

    @Override // com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
    }

    @Override // com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
    }

    private static Result[] decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException, FormatException, ChecksumException {
    }
}
