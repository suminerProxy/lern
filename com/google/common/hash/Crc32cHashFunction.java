package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Crc32cHashFunction extends AbstractHashFunction {
    public static final HashFunction CRC_32_C = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Crc32cHasher extends AbstractByteHasher {
        public static final int[] CRC_TABLE = null;
        private int crc;

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b) {
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }
}
