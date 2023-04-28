package com.google.common.hash;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LittleEndianByteArray {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final LittleEndianBytes byteArray = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class JavaLittleEndianBytes implements LittleEndianBytes {
        private static final /* synthetic */ JavaLittleEndianBytes[] $VALUES = null;
        public static final JavaLittleEndianBytes INSTANCE = null;

        /* renamed from: com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends JavaLittleEndianBytes {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i2) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i2, long j2) {
            }
        }

        private JavaLittleEndianBytes(String str, int i2) {
        }

        public static JavaLittleEndianBytes valueOf(String str) {
        }

        public static JavaLittleEndianBytes[] values() {
        }

        public /* synthetic */ JavaLittleEndianBytes(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface LittleEndianBytes {
        long getLongLittleEndian(byte[] bArr, int i2);

        void putLongLittleEndian(byte[] bArr, int i2, long j2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class UnsafeByteArray implements LittleEndianBytes {
        private static final /* synthetic */ UnsafeByteArray[] $VALUES = null;
        private static final int BYTE_ARRAY_BASE_OFFSET = 0;
        public static final UnsafeByteArray UNSAFE_BIG_ENDIAN = null;
        public static final UnsafeByteArray UNSAFE_LITTLE_ENDIAN = null;
        private static final Unsafe theUnsafe = null;

        /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends UnsafeByteArray {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i2) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i2, long j2) {
            }
        }

        /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends UnsafeByteArray {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public long getLongLittleEndian(byte[] bArr, int i2) {
            }

            @Override // com.google.common.hash.LittleEndianByteArray.LittleEndianBytes
            public void putLongLittleEndian(byte[] bArr, int i2, long j2) {
            }
        }

        /* renamed from: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass3 implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: run  reason: avoid collision after fix types in other method */
            public Unsafe run2() throws Exception {
            }
        }

        private UnsafeByteArray(String str, int i2) {
        }

        public static /* synthetic */ int access$100() {
        }

        public static /* synthetic */ Unsafe access$200() {
        }

        private static Unsafe getUnsafe() {
        }

        public static UnsafeByteArray valueOf(String str) {
        }

        public static UnsafeByteArray[] values() {
        }

        public /* synthetic */ UnsafeByteArray(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    private LittleEndianByteArray() {
    }

    public static int load32(byte[] bArr, int i2) {
    }

    public static long load64(byte[] bArr, int i2) {
    }

    public static long load64Safely(byte[] bArr, int i2, int i3) {
    }

    public static void store64(byte[] bArr, int i2, long j2) {
    }

    public static boolean usingUnsafe() {
    }
}
