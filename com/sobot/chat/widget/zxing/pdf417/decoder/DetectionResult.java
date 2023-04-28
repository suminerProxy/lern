package com.sobot.chat.widget.zxing.pdf417.decoder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn[] detectionResultColumns;

    public DetectionResult(BarcodeMetadata barcodeMetadata, BoundingBox boundingBox) {
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionResultColumn) {
    }

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword2) {
    }

    private static int adjustRowNumberIfValid(int i2, int i3, Codeword codeword) {
    }

    private int adjustRowNumbers() {
    }

    private int adjustRowNumbersByRow() {
    }

    private void adjustRowNumbersFromBothRI() {
    }

    private int adjustRowNumbersFromLRI() {
    }

    private int adjustRowNumbersFromRRI() {
    }

    public int getBarcodeColumnCount() {
    }

    public int getBarcodeECLevel() {
    }

    public int getBarcodeRowCount() {
    }

    public BoundingBox getBoundingBox() {
    }

    public DetectionResultColumn getDetectionResultColumn(int i2) {
    }

    public DetectionResultColumn[] getDetectionResultColumns() {
    }

    public void setBoundingBox(BoundingBox boundingBox) {
    }

    public void setDetectionResultColumn(int i2, DetectionResultColumn detectionResultColumn) {
    }

    public String toString() {
    }

    private void adjustRowNumbers(int i2, int i3, Codeword[] codewordArr) {
    }
}
