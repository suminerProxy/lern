package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    public static final HashFunction GOOD_FAST_HASH_128 = null;
    public static final HashFunction MURMUR3_128 = null;
    private static final long serialVersionUID = 0;
    private final int seed;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;
        private long h1;
        private long h2;
        private int length;

        public Murmur3_128Hasher(int i2) {
        }

        private void bmix64(long j2, long j3) {
        }

        private static long fmix64(long j2) {
        }

        private static long mixK1(long j2) {
        }

        private static long mixK2(long j2) {
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
        }
    }

    public Murmur3_128HashFunction(int i2) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }
}
