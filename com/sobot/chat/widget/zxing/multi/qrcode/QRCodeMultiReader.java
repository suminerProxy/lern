package com.sobot.chat.widget.zxing.multi.qrcode;

import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.ResultPoint;
import com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader;
import com.sobot.chat.widget.zxing.qrcode.QRCodeReader;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class QRCodeMultiReader extends QRCodeReader implements MultipleBarcodeReader {
    private static final Result[] EMPTY_RESULT_ARRAY = null;
    private static final ResultPoint[] NO_POINTS = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class SAComparator implements Comparator<Result>, Serializable {
        private SAComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Result result, Result result2) {
        }

        public /* synthetic */ SAComparator(AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Result result, Result result2) {
        }
    }

    public static List<Result> processStructuredAppend(List<Result> list) {
    }

    @Override // com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
    }
}
