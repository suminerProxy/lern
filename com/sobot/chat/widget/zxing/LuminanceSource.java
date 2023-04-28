package com.sobot.chat.widget.zxing;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    public LuminanceSource(int i2, int i3) {
    }

    public LuminanceSource crop(int i2, int i3, int i4, int i5) {
    }

    public final int getHeight() {
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i2, byte[] bArr);

    public final int getWidth() {
    }

    public LuminanceSource invert() {
    }

    public boolean isCropSupported() {
    }

    public boolean isRotateSupported() {
    }

    public LuminanceSource rotateCounterClockwise() {
    }

    public LuminanceSource rotateCounterClockwise45() {
    }

    public final String toString() {
    }
}
