package com.sobot.chat.widget.zxing.datamatrix.encoder;

import com.sobot.chat.widget.zxing.Dimension;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SymbolInfo {
    public static final SymbolInfo[] PROD_SYMBOLS = null;
    private static SymbolInfo[] symbols;
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private final int rsBlockData;
    private final int rsBlockError;

    public SymbolInfo(boolean z, int i2, int i3, int i4, int i5, int i6) {
    }

    private int getHorizontalDataRegions() {
    }

    private int getVerticalDataRegions() {
    }

    public static SymbolInfo lookup(int i2) {
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
    }

    public int getCodewordCount() {
    }

    public final int getDataCapacity() {
    }

    public int getDataLengthForInterleavedBlock(int i2) {
    }

    public final int getErrorCodewords() {
    }

    public final int getErrorLengthForInterleavedBlock(int i2) {
    }

    public int getInterleavedBlockCount() {
    }

    public final int getSymbolDataHeight() {
    }

    public final int getSymbolDataWidth() {
    }

    public final int getSymbolHeight() {
    }

    public final int getSymbolWidth() {
    }

    public final String toString() {
    }

    public SymbolInfo(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static SymbolInfo lookup(int i2, SymbolShapeHint symbolShapeHint) {
    }

    public static SymbolInfo lookup(int i2, boolean z, boolean z2) {
    }

    private static SymbolInfo lookup(int i2, SymbolShapeHint symbolShapeHint, boolean z) {
    }

    public static SymbolInfo lookup(int i2, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z) {
    }
}
