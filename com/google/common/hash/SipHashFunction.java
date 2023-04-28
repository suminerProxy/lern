package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SipHashFunction extends AbstractHashFunction implements Serializable {
    public static final HashFunction SIP_HASH_24 = null;
    private static final long serialVersionUID = 0;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3366d;
    private final long k0;
    private final long k1;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;
        private long b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3367d;
        private long finalM;
        private long v0;
        private long v1;
        private long v2;
        private long v3;

        public SipHasher(int i2, int i3, long j2, long j3) {
        }

        private void processM(long j2) {
        }

        private void sipRound(int i2) {
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

    public SipHashFunction(int i2, int i3, long j2, long j3) {
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
