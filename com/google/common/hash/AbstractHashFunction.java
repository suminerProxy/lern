package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractHashFunction implements HashFunction {
    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr) {
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashInt(int i2) {
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashLong(long j2) {
    }

    @Override // com.google.common.hash.HashFunction
    public <T> HashCode hashObject(T t, Funnel<? super T> funnel) {
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher(int i2) {
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i2, int i3) {
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(ByteBuffer byteBuffer) {
    }
}
