package com.google.android.exoplayer2.util;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] data, int offset, int limit) {
    }

    private void assertValidOffset() {
    }

    private int readExpGolombCodeNum() {
    }

    private boolean shouldSkipByte(int offset) {
    }

    public boolean canReadBits(int numBits) {
    }

    public boolean canReadExpGolombCodedNum() {
    }

    public boolean readBit() {
    }

    public int readBits(int numBits) {
    }

    public int readSignedExpGolombCodedInt() {
    }

    public int readUnsignedExpGolombCodedInt() {
    }

    public void reset(byte[] data, int offset, int limit) {
    }

    public void skipBit() {
    }

    public void skipBits(int numBits) {
    }
}
