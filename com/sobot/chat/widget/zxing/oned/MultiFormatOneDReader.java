package com.sobot.chat.widget.zxing.oned;

import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.common.BitArray;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MultiFormatOneDReader extends OneDReader {
    private static final OneDReader[] EMPTY_ONED_ARRAY = null;
    private final OneDReader[] readers;

    public MultiFormatOneDReader(Map<DecodeHintType, ?> map) {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader
    public Result decodeRow(int i2, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
    }

    @Override // com.sobot.chat.widget.zxing.oned.OneDReader, com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }
}
