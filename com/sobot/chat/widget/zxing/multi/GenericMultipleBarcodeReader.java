package com.sobot.chat.widget.zxing.multi;

import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Reader;
import com.sobot.chat.widget.zxing.Result;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    public static final Result[] EMPTY_RESULT_ARRAY = null;
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i2, int i3, int i4) {
    }

    private static Result translateResultPoints(Result result, int i2, int i3) {
    }

    @Override // com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
    }
}
