package com.sunmi.scan;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Image {
    private Object data;
    private long peer;

    public Image() {
    }

    private native long convert(long j2, String str);

    private native long create();

    private native void destroy(long j2);

    private native long getSymbols(long j2);

    private static native void init();

    public Image convert(String str) {
    }

    public synchronized void destroy() {
    }

    public void finalize() {
    }

    public native int[] getCrop();

    public native byte[] getData();

    public native String getFormat();

    public native int getHeight();

    public native int getSequence();

    public native int[] getSize();

    public SymbolSet getSymbols() {
    }

    public native int getWidth();

    public native void setCrop(int i2, int i3, int i4, int i5);

    public native void setCrop(int[] iArr);

    public native void setData(byte[] bArr);

    public native void setData(int[] iArr);

    public native void setFormat(String str);

    public native void setSequence(int i2);

    public native void setSize(int i2, int i3);

    public native void setSize(int[] iArr);

    public Image(int i2, int i3) {
    }

    public Image(int i2, int i3, String str) {
    }

    public Image(String str) {
    }

    public Image(long j2) {
    }
}
