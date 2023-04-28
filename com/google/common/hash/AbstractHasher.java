package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@CanIgnoreReturnValue
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractHasher implements Hasher {
    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putBoolean(boolean z) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putBytes(ByteBuffer byteBuffer) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putChar(char c) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putDouble(double d2) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putFloat(float f2) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putInt(int i2) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putLong(long j2) {
    }

    @Override // com.google.common.hash.Hasher
    public <T> Hasher putObject(T t, Funnel<? super T> funnel) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putShort(short s) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putString(CharSequence charSequence, Charset charset) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putUnencodedChars(CharSequence charSequence) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBoolean(boolean z) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putDouble(double d2) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putFloat(float f2) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i2) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long j2) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putString(CharSequence charSequence, Charset charset) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putUnencodedChars(CharSequence charSequence) {
    }

    @Override // com.google.common.hash.PrimitiveSink
    public /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr, int i2, int i3) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr, int i2, int i3) {
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer byteBuffer) {
    }
}
