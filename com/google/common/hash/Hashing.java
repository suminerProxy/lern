package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.security.Key;
import java.util.zip.Checksum;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Hashing {
    public static final int GOOD_FAST_HASH_SEED = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Immutable
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ChecksumType implements ImmutableSupplier<Checksum> {
        private static final /* synthetic */ ChecksumType[] $VALUES = null;
        public static final ChecksumType ADLER_32 = null;
        public static final ChecksumType CRC_32 = null;
        public final HashFunction hashFunction;

        /* renamed from: com.google.common.hash.Hashing$ChecksumType$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends ChecksumType {
            public AnonymousClass1(String str, int i2, String str2) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ Object get() {
            }

            @Override // com.google.common.base.Supplier
            public Checksum get() {
            }
        }

        /* renamed from: com.google.common.hash.Hashing$ChecksumType$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends ChecksumType {
            public AnonymousClass2(String str, int i2, String str2) {
            }

            @Override // com.google.common.base.Supplier
            public /* bridge */ /* synthetic */ Object get() {
            }

            @Override // com.google.common.base.Supplier
            public Checksum get() {
            }
        }

        public /* synthetic */ ChecksumType(String str, int i2, String str2, AnonymousClass1 anonymousClass1) {
        }

        public static ChecksumType valueOf(String str) {
        }

        public static ChecksumType[] values() {
        }

        private ChecksumType(String str, int i2, String str2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        public /* synthetic */ ConcatenatedHashFunction(HashFunction[] hashFunctionArr, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.hash.HashFunction
        public int bits() {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.common.hash.AbstractCompositeHashFunction
        public HashCode makeHash(Hasher[] hasherArr) {
        }

        private ConcatenatedHashFunction(HashFunction... hashFunctionArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LinearCongruentialGenerator {
        private long state;

        public LinearCongruentialGenerator(long j2) {
        }

        public double nextDouble() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Md5Holder {
        public static final HashFunction MD5 = null;

        private Md5Holder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Sha1Holder {
        public static final HashFunction SHA_1 = null;

        private Sha1Holder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Sha256Holder {
        public static final HashFunction SHA_256 = null;

        private Sha256Holder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Sha384Holder {
        public static final HashFunction SHA_384 = null;

        private Sha384Holder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Sha512Holder {
        public static final HashFunction SHA_512 = null;

        private Sha512Holder() {
        }
    }

    private Hashing() {
    }

    public static HashFunction adler32() {
    }

    public static int checkPositiveAndMakeMultipleOf32(int i2) {
    }

    public static HashCode combineOrdered(Iterable<HashCode> iterable) {
    }

    public static HashCode combineUnordered(Iterable<HashCode> iterable) {
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunction2, HashFunction... hashFunctionArr) {
    }

    public static int consistentHash(HashCode hashCode, int i2) {
    }

    public static HashFunction crc32() {
    }

    public static HashFunction crc32c() {
    }

    public static HashFunction farmHashFingerprint64() {
    }

    public static HashFunction goodFastHash(int i2) {
    }

    public static HashFunction hmacMd5(Key key) {
    }

    public static HashFunction hmacSha1(Key key) {
    }

    public static HashFunction hmacSha256(Key key) {
    }

    public static HashFunction hmacSha512(Key key) {
    }

    private static String hmacToString(String str, Key key) {
    }

    @Deprecated
    public static HashFunction md5() {
    }

    public static HashFunction murmur3_128(int i2) {
    }

    public static HashFunction murmur3_32(int i2) {
    }

    @Deprecated
    public static HashFunction sha1() {
    }

    public static HashFunction sha256() {
    }

    public static HashFunction sha384() {
    }

    public static HashFunction sha512() {
    }

    public static HashFunction sipHash24() {
    }

    public static int consistentHash(long j2, int i2) {
    }

    public static HashFunction hmacMd5(byte[] bArr) {
    }

    public static HashFunction hmacSha1(byte[] bArr) {
    }

    public static HashFunction hmacSha256(byte[] bArr) {
    }

    public static HashFunction hmacSha512(byte[] bArr) {
    }

    public static HashFunction murmur3_128() {
    }

    public static HashFunction murmur3_32() {
    }

    public static HashFunction sipHash24(long j2, long j3) {
    }

    public static HashFunction concatenating(Iterable<HashFunction> iterable) {
    }
}
