package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Envelope {
    private static final String dummyID1 = "1234567890987654321";
    private static final String dummyID2 = "02:00:00:00:00:00";
    private final int CODEX_ENCRYPT;
    private final int CODEX_NORMAL;
    private final byte[] SEED;
    private boolean encrypt;
    private byte[] identity;
    private String mAddress;
    private byte[] mChecksum;
    private byte[] mEntity;
    private byte[] mGuid;
    private int mLength;
    private int mSerialNo;
    private byte[] mSignature;
    private int mTimestamp;
    private String mVersion;

    private Envelope(byte[] bArr, String str, byte[] bArr2) throws Exception {
    }

    private byte[] genCheckSum() {
    }

    public static Envelope genEncryptEnvelope(Context context, String str, byte[] bArr) {
    }

    public static Envelope genEnvelope(Context context, String str, byte[] bArr) {
    }

    private byte[] genGuid(byte[] bArr, int i2) {
    }

    private byte[] genSignature() {
    }

    public static String getSignature(Context context) {
    }

    public void export(Context context) {
    }

    public void seal() {
    }

    public void setEncrypt(boolean z) {
    }

    public void setSerialNumber(int i2) {
    }

    public void setSignature(String str) {
    }

    public byte[] toBinary() {
    }

    public String toString() {
    }

    public String getSignature() {
    }
}
