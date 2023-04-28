package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractCompositeHashFunction extends AbstractHashFunction {
    private static final long serialVersionUID = 0;
    public final HashFunction[] functions;

    /* renamed from: com.google.common.hash.AbstractCompositeHashFunction$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Hasher {
        public final /* synthetic */ AbstractCompositeHashFunction this$0;
        public final /* synthetic */ Hasher[] val$hashers;

        public AnonymousClass1(AbstractCompositeHashFunction abstractCompositeHashFunction, Hasher[] hasherArr) {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putBoolean(boolean z) {
        }

        @Override // com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putByte(byte b) {
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
        public Hasher putBoolean(boolean z) {
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b) {
        }

        @Override // com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr) {
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c) {
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putDouble(double d2) {
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putFloat(float f2) {
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

    public AbstractCompositeHashFunction(HashFunction... hashFunctionArr) {
    }

    private Hasher fromHashers(Hasher[] hasherArr) {
    }

    public abstract HashCode makeHash(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i2) {
    }
}
