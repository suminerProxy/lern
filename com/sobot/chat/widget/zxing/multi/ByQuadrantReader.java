package com.sobot.chat.widget.zxing.multi;

import com.sobot.chat.widget.zxing.BinaryBitmap;
import com.sobot.chat.widget.zxing.ChecksumException;
import com.sobot.chat.widget.zxing.DecodeHintType;
import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.NotFoundException;
import com.sobot.chat.widget.zxing.Reader;
import com.sobot.chat.widget.zxing.Result;
import com.sobot.chat.widget.zxing.ResultPoint;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ByQuadrantReader implements Reader {
    private final Reader delegate;

    public ByQuadrantReader(Reader reader) {
    }

    private static void makeAbsolute(ResultPoint[] resultPointArr, int i2, int i3) {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public void reset() {
    }

    @Override // com.sobot.chat.widget.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
    }
}
