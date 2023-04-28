package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final ImmutableSupplier<? extends Checksum> checksumSupplier;
    private final String toString;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ChecksumHasher extends AbstractByteHasher {
        private final Checksum checksum;
        public final /* synthetic */ ChecksumHashFunction this$0;

        public /* synthetic */ ChecksumHasher(ChecksumHashFunction checksumHashFunction, Checksum checksum, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b) {
        }

        private ChecksumHasher(ChecksumHashFunction checksumHashFunction, Checksum checksum) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i2, int i3) {
        }
    }

    public ChecksumHashFunction(ImmutableSupplier<? extends Checksum> immutableSupplier, int i2, String str) {
    }

    public static /* synthetic */ int access$100(ChecksumHashFunction checksumHashFunction) {
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
