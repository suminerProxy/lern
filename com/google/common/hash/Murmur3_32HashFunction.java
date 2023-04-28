package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    public static final HashFunction GOOD_FAST_HASH_32 = null;
    public static final HashFunction MURMUR3_32 = null;
    private static final long serialVersionUID = 0;
    private final int seed;

    @CanIgnoreReturnValue
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Murmur3_32Hasher extends AbstractHasher {
        private long buffer;
        private int h1;
        private boolean isDone;
        private int length;
        private int shift;

        public Murmur3_32Hasher(int i2) {
        }

        private void update(int i2, long j2) {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putByte(byte b) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putBytes(ByteBuffer byteBuffer) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putChar(char c) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putInt(int i2) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putLong(long j2) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putString(CharSequence charSequence, Charset charset) {
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.PrimitiveSink
        public /* bridge */ /* synthetic */ PrimitiveSink putBytes(byte[] bArr, int i2, int i3) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i2) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putLong(long j2) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence charSequence, Charset charset) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i2, int i3) {
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
        }
    }

    public Murmur3_32HashFunction(int i2) {
    }

    public static /* synthetic */ int access$000(int i2) {
    }

    public static /* synthetic */ int access$100(int i2, int i3) {
    }

    public static /* synthetic */ int access$200(byte[] bArr, int i2) {
    }

    public static /* synthetic */ long access$300(char c) {
    }

    public static /* synthetic */ long access$400(char c) {
    }

    public static /* synthetic */ long access$500(int i2) {
    }

    public static /* synthetic */ HashCode access$600(int i2, int i3) {
    }

    private static long charToThreeUtf8Bytes(char c) {
    }

    private static long charToTwoUtf8Bytes(char c) {
    }

    private static long codePointToFourUtf8Bytes(int i2) {
    }

    private static HashCode fmix(int i2, int i3) {
    }

    private static int getIntLittleEndian(byte[] bArr, int i2) {
    }

    private static int mixH1(int i2, int i3) {
    }

    private static int mixK1(int i2) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i2, int i3) {
    }

    public int hashCode() {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i2) {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j2) {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }
}
