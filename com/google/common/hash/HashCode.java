package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class HashCode {
    private static final char[] hexDigits = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        public final byte[] bytes;

        public BytesHashCode(byte[] bArr) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] getBytesInternal() {
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        public final int hash;

        public IntHashCode(int i2) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        public final long hash;

        public LongHashCode(long j2) {
        }

        @Override // com.google.common.hash.HashCode
        public byte[] asBytes() {
        }

        @Override // com.google.common.hash.HashCode
        public int asInt() {
        }

        @Override // com.google.common.hash.HashCode
        public long asLong() {
        }

        @Override // com.google.common.hash.HashCode
        public int bits() {
        }

        @Override // com.google.common.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
        }

        @Override // com.google.common.hash.HashCode
        public long padToLong() {
        }

        @Override // com.google.common.hash.HashCode
        public void writeBytesToImpl(byte[] bArr, int i2, int i3) {
        }
    }

    private static int decode(char c) {
    }

    public static HashCode fromBytes(byte[] bArr) {
    }

    public static HashCode fromBytesNoCopy(byte[] bArr) {
    }

    public static HashCode fromInt(int i2) {
    }

    public static HashCode fromLong(long j2) {
    }

    public static HashCode fromString(String str) {
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(@NullableDecl Object obj) {
    }

    public abstract boolean equalsSameBits(HashCode hashCode);

    public byte[] getBytesInternal() {
    }

    public final int hashCode() {
    }

    public abstract long padToLong();

    public final String toString() {
    }

    @CanIgnoreReturnValue
    public int writeBytesTo(byte[] bArr, int i2, int i3) {
    }

    public abstract void writeBytesToImpl(byte[] bArr, int i2, int i3);
}
