package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ParsableByteArray {
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    public int bytesLeft() {
    }

    public int capacity() {
    }

    public void ensureCapacity(int requiredCapacity) {
    }

    public byte[] getData() {
    }

    public int getPosition() {
    }

    public int limit() {
    }

    public char peekChar() {
    }

    public int peekUnsignedByte() {
    }

    public void readBytes(ParsableBitArray bitArray, int length) {
    }

    @Nullable
    public String readDelimiterTerminatedString(char delimiter) {
    }

    public double readDouble() {
    }

    public float readFloat() {
    }

    public int readInt() {
    }

    public int readInt24() {
    }

    @Nullable
    public String readLine() {
    }

    public int readLittleEndianInt() {
    }

    public int readLittleEndianInt24() {
    }

    public long readLittleEndianLong() {
    }

    public short readLittleEndianShort() {
    }

    public long readLittleEndianUnsignedInt() {
    }

    public int readLittleEndianUnsignedInt24() {
    }

    public int readLittleEndianUnsignedIntToInt() {
    }

    public int readLittleEndianUnsignedShort() {
    }

    public long readLong() {
    }

    public String readNullTerminatedString(int length) {
    }

    public short readShort() {
    }

    public String readString(int length) {
    }

    public int readSynchSafeInt() {
    }

    public int readUnsignedByte() {
    }

    public int readUnsignedFixedPoint1616() {
    }

    public long readUnsignedInt() {
    }

    public int readUnsignedInt24() {
    }

    public int readUnsignedIntToInt() {
    }

    public long readUnsignedLongToLong() {
    }

    public int readUnsignedShort() {
    }

    public long readUtf8EncodedLong() {
    }

    public void reset(int limit) {
    }

    public void setLimit(int limit) {
    }

    public void setPosition(int position) {
    }

    public void skipBytes(int bytes) {
    }

    public String readString(int length, Charset charset) {
    }

    public void reset(byte[] data) {
    }

    public ParsableByteArray(int limit) {
    }

    public void readBytes(byte[] buffer, int offset, int length) {
    }

    public void reset(byte[] data, int limit) {
    }

    public void readBytes(ByteBuffer buffer, int length) {
    }

    @Nullable
    public String readNullTerminatedString() {
    }

    public ParsableByteArray(byte[] data) {
    }

    public ParsableByteArray(byte[] data, int limit) {
    }
}
