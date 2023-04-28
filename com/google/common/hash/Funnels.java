package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Funnels {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ByteArrayFunnel implements Funnel<byte[]> {
        private static final /* synthetic */ ByteArrayFunnel[] $VALUES = null;
        public static final ByteArrayFunnel INSTANCE = null;

        private ByteArrayFunnel(String str, int i2) {
        }

        public static ByteArrayFunnel valueOf(String str) {
        }

        public static ByteArrayFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(byte[] bArr, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel  reason: avoid collision after fix types in other method */
        public void funnel2(byte[] bArr, PrimitiveSink primitiveSink) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IntegerFunnel implements Funnel<Integer> {
        private static final /* synthetic */ IntegerFunnel[] $VALUES = null;
        public static final IntegerFunnel INSTANCE = null;

        private IntegerFunnel(String str, int i2) {
        }

        public static IntegerFunnel valueOf(String str) {
        }

        public static IntegerFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Integer num, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel  reason: avoid collision after fix types in other method */
        public void funnel2(Integer num, PrimitiveSink primitiveSink) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LongFunnel implements Funnel<Long> {
        private static final /* synthetic */ LongFunnel[] $VALUES = null;
        public static final LongFunnel INSTANCE = null;

        private LongFunnel(String str, int i2) {
        }

        public static LongFunnel valueOf(String str) {
        }

        public static LongFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Long l2, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel  reason: avoid collision after fix types in other method */
        public void funnel2(Long l2, PrimitiveSink primitiveSink) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        private final Funnel<E> elementFunnel;

        public SequentialFunnel(Funnel<E> funnel) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Object obj, PrimitiveSink primitiveSink) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public void funnel(Iterable<? extends E> iterable, PrimitiveSink primitiveSink) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SinkAsStream extends OutputStream {
        public final PrimitiveSink sink;

        public SinkAsStream(PrimitiveSink primitiveSink) {
        }

        public String toString() {
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
        private final Charset charset;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;
            private final String charsetCanonicalName;

            public SerializedForm(Charset charset) {
            }

            private Object readResolve() {
            }
        }

        public StringCharsetFunnel(Charset charset) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public Object writeReplace() {
        }

        /* renamed from: funnel  reason: avoid collision after fix types in other method */
        public void funnel2(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnencodedCharsFunnel implements Funnel<CharSequence> {
        private static final /* synthetic */ UnencodedCharsFunnel[] $VALUES = null;
        public static final UnencodedCharsFunnel INSTANCE = null;

        private UnencodedCharsFunnel(String str, int i2) {
        }

        public static UnencodedCharsFunnel valueOf(String str) {
        }

        public static UnencodedCharsFunnel[] values() {
        }

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        /* renamed from: funnel  reason: avoid collision after fix types in other method */
        public void funnel2(CharSequence charSequence, PrimitiveSink primitiveSink) {
        }
    }

    private Funnels() {
    }

    public static OutputStream asOutputStream(PrimitiveSink primitiveSink) {
    }

    public static Funnel<byte[]> byteArrayFunnel() {
    }

    public static Funnel<Integer> integerFunnel() {
    }

    public static Funnel<Long> longFunnel() {
    }

    public static <E> Funnel<Iterable<? extends E>> sequentialFunnel(Funnel<E> funnel) {
    }

    public static Funnel<CharSequence> stringFunnel(Charset charset) {
    }

    public static Funnel<CharSequence> unencodedCharsFunnel() {
    }
}
