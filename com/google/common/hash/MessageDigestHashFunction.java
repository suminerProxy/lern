package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

@Immutable
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MessageDigestHasher extends AbstractByteHasher {
        private final int bytes;
        private final MessageDigest digest;
        private boolean done;

        public /* synthetic */ MessageDigestHasher(MessageDigest messageDigest, int i2, AnonymousClass1 anonymousClass1) {
        }

        private void checkNotDone() {
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte b) {
        }

        private MessageDigestHasher(MessageDigest messageDigest, int i2) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(byte[] bArr, int i2, int i3) {
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public void update(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        public /* synthetic */ SerializedForm(String str, int i2, String str2, AnonymousClass1 anonymousClass1) {
        }

        private Object readResolve() {
        }

        private SerializedForm(String str, int i2, String str2) {
        }
    }

    public MessageDigestHashFunction(String str, String str2) {
    }

    private static MessageDigest getMessageDigest(String str) {
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
    }

    public String toString() {
    }

    public Object writeReplace() {
    }

    public MessageDigestHashFunction(String str, int i2, String str2) {
    }
}
