package org.libpag;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGTextLayer extends PAGLayer {
    public PAGTextLayer(long j2) {
    }

    private static native void nativeInit();

    private native void setFont(String str, String str2);

    public native int fillColor();

    public native PAGFont font();

    public native float fontSize();

    public native void reset();

    public native void setFillColor(int i2);

    public void setFont(PAGFont pAGFont) {
    }

    public native void setFontSize(float f2);

    public native void setStrokeColor(int i2);

    public native void setText(String str);

    public native int strokeColor();

    public native String text();
}
