package com.sobot.chat.widget.zxing.pdf417.encoder;

import com.sobot.chat.widget.zxing.WriterException;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PDF417 {
    private static final int[][] CODEWORD_TABLE = null;
    private static final float DEFAULT_MODULE_WIDTH = 0.357f;
    private static final float HEIGHT = 2.0f;
    private static final float PREFERRED_RATIO = 3.0f;
    private static final int START_PATTERN = 130728;
    private static final int STOP_PATTERN = 260649;
    private BarcodeMatrix barcodeMatrix;
    private boolean compact;
    private Compaction compaction;
    private Charset encoding;
    private int maxCols;
    private int maxRows;
    private int minCols;
    private int minRows;

    public PDF417() {
    }

    private static int calculateNumberOfRows(int i2, int i3, int i4) {
    }

    private int[] determineDimensions(int i2, int i3) throws WriterException {
    }

    private static void encodeChar(int i2, int i3, BarcodeRow barcodeRow) {
    }

    private void encodeLowLevel(CharSequence charSequence, int i2, int i3, int i4, BarcodeMatrix barcodeMatrix) {
    }

    private static int getNumberOfPadCodewords(int i2, int i3, int i4, int i5) {
    }

    public void generateBarcodeLogic(String str, int i2) throws WriterException {
    }

    public BarcodeMatrix getBarcodeMatrix() {
    }

    public void setCompact(boolean z) {
    }

    public void setCompaction(Compaction compaction) {
    }

    public void setDimensions(int i2, int i3, int i4, int i5) {
    }

    public void setEncoding(Charset charset) {
    }

    public PDF417(boolean z) {
    }
}
