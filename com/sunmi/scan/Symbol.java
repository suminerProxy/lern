package com.sunmi.scan;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Symbol {
    public static final int AZTEC = 65;
    public static final int CODABAR = 18;
    public static final int CODE11 = 11;
    public static final int CODE128 = 16;
    public static final int CODE39 = 19;
    public static final int CODE93 = 20;
    public static final int CONFIG128 = 17;
    public static final int DATABAR = 34;
    public static final int DATABAR_EXP = 35;
    public static final int DataMatrix = 70;
    public static final int EAN13 = 13;
    public static final int EAN8 = 8;
    public static final int I25 = 15;
    public static final int ISBN10 = 10;
    public static final int ISBN13 = 14;
    public static final int NONE = 0;
    public static final int PARTIAL = 1;
    public static final int PDF417 = 57;
    public static final int QRCODE = 64;
    public static final int UPCA = 12;
    public static final int UPCE = 9;
    private long peer;
    private int type;

    public Symbol(long j2) {
    }

    private native void destroy(long j2);

    private native long getComponents(long j2);

    private native int getLocationSize(long j2);

    private native int getLocationX(long j2, int i2);

    private native int getLocationY(long j2, int i2);

    private native int getType(long j2);

    private static native void init();

    public synchronized void destroy() {
    }

    public void finalize() {
    }

    public int[] getBounds() {
    }

    public byte[] getBytes() {
    }

    public SymbolSet getComponents() {
    }

    public native int getConfigMask();

    public native int getCount();

    public native String getData();

    public native byte[] getDataBytes();

    public native int getDataLength();

    public int[] getLocationPoint(int i2) {
    }

    public native int getModifierMask();

    public native int getOrientation();

    public native int getQuality();

    public String getResult() {
    }

    public native String getSymbolName();

    public int getType() {
    }

    public native long next();
}
