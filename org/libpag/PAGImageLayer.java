package org.libpag;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGImageLayer extends PAGLayer {
    public PAGImageLayer(long j2) {
    }

    public static PAGImageLayer Make(int i2, int i3, long j2) {
    }

    private static native void nativeInit();

    private static native long nativeMake(int i2, int i3, long j2);

    private native void replaceImage(long j2);

    private native void setImage(long j2);

    public native long contentDuration();

    public native PAGVideoRange[] getVideoRanges();

    public native ByteBuffer imageBytes();

    public void replaceImage(PAGImage pAGImage) {
    }

    public void setImage(PAGImage pAGImage) {
    }
}
