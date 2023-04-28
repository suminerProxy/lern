package com.sobot.chat.widget.zxing;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MultiFormatReader implements Reader {
    private static final Reader[] EMPTY_READER_ARRAY = null;
    private Map<DecodeHintType, ?> hints;
    private Reader[] readers;

    private Result decodeInternal(BinaryBitmap binaryBitmap) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException {
    }

    public Result decodeWithState(BinaryBitmap binaryBitmap) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }

    public void setHints(Map<DecodeHintType, ?> map) {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
    }
}
