package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInput;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    public LittleEndianDataInputStream(InputStream inputStream) {
    }

    private byte readAndCheckByte() throws IOException, EOFException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public boolean readBoolean() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public byte readByte() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public char readChar() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public double readDouble() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public float readFloat() throws IOException {
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readInt() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public String readLine() {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public long readLong() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public short readShort() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public String readUTF() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedByte() throws IOException {
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedShort() throws IOException {
    }

    @Override // java.io.DataInput
    public int skipBytes(int i2) throws IOException {
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
    }
}
