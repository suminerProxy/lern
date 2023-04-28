package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Mac;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MacHashFunction extends AbstractHashFunction {
    private final int bits;
    private final Key key;
    private final Mac prototype;
    private final boolean supportsClone;
    private final String toString;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MacHasher extends AbstractByteHasher {
        private boolean done;
        private final Mac mac;

        public /* synthetic */ MacHasher(Mac mac, AnonymousClass1 anonymousClass1) {
        }

        private void checkNotDone() {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b) {
        }

        private MacHasher(Mac mac) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i2, int i3) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(ByteBuffer byteBuffer) {
        }
    }

    public MacHashFunction(String str, Key key, String str2) {
    }

    private static Mac getMac(String str, Key key) {
    }

    private static boolean supportsClone(Mac mac) {
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
