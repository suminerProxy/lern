package com.alipay.zoloz.toyger.algorithm;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TGFrame {
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH = 7;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IRIS = 6;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public static final int TYPE_DARK = 1;
    public static final int TYPE_DEPTH = 2;
    public static final int TYPE_IR = 3;
    public static final int TYPE_LIGHT = 0;
    public static final int TYPE_NANO = 4;
    public ByteBuffer byteBuffer;
    public byte[] data;
    public int frameMode;
    public int frameType;
    public int height;
    public int rotation;
    public int width;

    public TGFrame() {
    }

    public TGFrame deepCopy() {
    }

    public void recycle() {
    }

    public String toString() {
    }

    public TGFrame(byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
    }

    public TGFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, int i6) {
    }

    public TGFrame(TGFrame tGFrame) {
    }
}
