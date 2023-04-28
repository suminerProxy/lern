package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i2);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i2, int i3);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z);

    @Override // java.io.DataOutput
    void writeByte(int i2);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i2);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d2);

    @Override // java.io.DataOutput
    void writeFloat(float f2);

    @Override // java.io.DataOutput
    void writeInt(int i2);

    @Override // java.io.DataOutput
    void writeLong(long j2);

    @Override // java.io.DataOutput
    void writeShort(int i2);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
