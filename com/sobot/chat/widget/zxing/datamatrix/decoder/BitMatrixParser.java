package com.sobot.chat.widget.zxing.datamatrix.decoder;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
    }

    private BitMatrix extractDataRegion(BitMatrix bitMatrix) {
    }

    private int readCorner1(int i2, int i3) {
    }

    private int readCorner2(int i2, int i3) {
    }

    private int readCorner3(int i2, int i3) {
    }

    private int readCorner4(int i2, int i3) {
    }

    private boolean readModule(int i2, int i3, int i4, int i5) {
    }

    private int readUtah(int i2, int i3, int i4, int i5) {
    }

    private static Version readVersion(BitMatrix bitMatrix) throws FormatException {
    }

    public Version getVersion() {
    }

    public byte[] readCodewords() throws FormatException {
    }
}
