package com.sobot.chat.widget.zxing.qrcode.decoder;

import com.sobot.chat.widget.zxing.FormatException;
import com.sobot.chat.widget.zxing.common.BitMatrix;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class BitMatrixParser {
    private final BitMatrix bitMatrix;
    private boolean mirror;
    private FormatInformation parsedFormatInfo;
    private Version parsedVersion;

    public BitMatrixParser(BitMatrix bitMatrix) throws FormatException {
    }

    private int copyBit(int i2, int i3, int i4) {
    }

    public void mirror() {
    }

    public byte[] readCodewords() throws FormatException {
    }

    public FormatInformation readFormatInformation() throws FormatException {
    }

    public Version readVersion() throws FormatException {
    }

    public void remask() {
    }

    public void setMirror(boolean z) {
    }
}
