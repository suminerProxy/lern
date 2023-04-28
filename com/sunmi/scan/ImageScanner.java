package com.sunmi.scan;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ImageScanner {
    private long peer;

    private native long create();

    private native void destroy(long j2);

    public static native String getLibsunmiscanVersion();

    private native long getResults(long j2);

    private static native void init();

    public synchronized void destroy() {
    }

    public native void enableCache(boolean z);

    public void finalize() {
    }

    public SymbolSet getResults() {
    }

    public native void parseConfig(String str);

    public native int scanImage(Image image);

    public native void setConfig(int i2, int i3, int i4) throws IllegalArgumentException;
}
