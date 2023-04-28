package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeByte(int i2) throws IOException {
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeChar(int i2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeInt(int i2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeLong(long j2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeShort(int i2) throws IOException {
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
    }
}
