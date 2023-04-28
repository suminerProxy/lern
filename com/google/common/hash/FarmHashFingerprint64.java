package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    public static final HashFunction FARMHASH_FINGERPRINT_64 = null;
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i2, int i3) {
    }

    private static long hashLength0to16(byte[] bArr, int i2, int i3) {
    }

    private static long hashLength16(long j2, long j3, long j4) {
    }

    private static long hashLength17to32(byte[] bArr, int i2, int i3) {
    }

    private static long hashLength33To64(byte[] bArr, int i2, int i3) {
    }

    private static long hashLength65Plus(byte[] bArr, int i2, int i3) {
    }

    private static long shiftMix(long j2) {
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i2, long j2, long j3, long[] jArr) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i2, int i3) {
    }

    public String toString() {
    }
}
