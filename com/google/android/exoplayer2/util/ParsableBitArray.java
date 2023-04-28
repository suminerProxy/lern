package com.google.android.exoplayer2.util;

import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
    }

    private void assertValidOffset() {
    }

    public int bitsLeft() {
    }

    public void byteAlign() {
    }

    public int getBytePosition() {
    }

    public int getPosition() {
    }

    public void putInt(int value, int numBits) {
    }

    public boolean readBit() {
    }

    public int readBits(int numBits) {
    }

    public long readBitsToLong(int numBits) {
    }

    public void readBytes(byte[] buffer, int offset, int length) {
    }

    public String readBytesAsString(int length) {
    }

    public void reset(byte[] data) {
    }

    public void setPosition(int position) {
    }

    public void skipBit() {
    }

    public void skipBits(int numBits) {
    }

    public void skipBytes(int length) {
    }

    public String readBytesAsString(int length, Charset charset) {
    }

    public void reset(ParsableByteArray parsableByteArray) {
    }

    public ParsableBitArray(byte[] data) {
    }

    public ParsableBitArray(byte[] data, int limit) {
    }

    public void reset(byte[] data, int limit) {
    }

    public void readBits(byte[] buffer, int offset, int numBits) {
    }
}
