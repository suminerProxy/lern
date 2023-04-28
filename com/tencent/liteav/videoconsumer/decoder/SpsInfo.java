package com.tencent.liteav.videoconsumer.decoder;

import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SpsInfo {
    public Integer colourPrimaries;
    public int height;
    public Integer matrixCoefficients;
    public Integer transferCharacteristics;
    public Integer videoFormat;
    public Integer videoFullRangeFlag;
    public int width;

    public static native SpsInfo nativeDecodeSps(boolean z, ByteBuffer byteBuffer);

    public boolean equals(Object obj) {
    }

    public void set(SpsInfo spsInfo) {
    }

    @CalledByNative
    public void setColourPrimaries(int i2) {
    }

    @CalledByNative
    public void setHeight(int i2) {
    }

    @CalledByNative
    public void setMatrixCoefficients(int i2) {
    }

    @CalledByNative
    public void setTransferCharacteristics(int i2) {
    }

    @CalledByNative
    public void setVideoFormat(int i2) {
    }

    @CalledByNative
    public void setVideoFullRangeFlag(int i2) {
    }

    @CalledByNative
    public void setWidth(int i2) {
    }

    @NonNull
    public String toString() {
    }
}
