package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseEncoding {
    private static final BaseEncoding BASE16 = null;
    private static final BaseEncoding BASE32 = null;
    private static final BaseEncoding BASE32_HEX = null;
    private static final BaseEncoding BASE64 = null;
    private static final BaseEncoding BASE64_URL = null;

    /* renamed from: com.google.common.io.BaseEncoding$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ByteSink {
        public final /* synthetic */ BaseEncoding this$0;
        public final /* synthetic */ CharSink val$encodedSink;

        public AnonymousClass1(BaseEncoding baseEncoding, CharSink charSink) {
        }

        @Override // com.google.common.io.ByteSink
        public OutputStream openStream() throws IOException {
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ByteSource {
        public final /* synthetic */ BaseEncoding this$0;
        public final /* synthetic */ CharSource val$encodedSource;

        public AnonymousClass2(BaseEncoding baseEncoding, CharSource charSource) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5 extends Writer {
        public final /* synthetic */ Writer val$delegate;
        public final /* synthetic */ Appendable val$seperatingAppendable;

        public AnonymousClass5(Appendable appendable, Writer writer) {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Alphabet {
        public final int bitsPerChar;
        public final int bytesPerChunk;
        private final char[] chars;
        public final int charsPerChunk;
        private final byte[] decodabet;
        public final int mask;
        private final String name;
        private final boolean[] validPadding;

        public Alphabet(String str, char[] cArr) {
        }

        public static /* synthetic */ char[] access$000(Alphabet alphabet) {
        }

        private boolean hasLowerCase() {
        }

        private boolean hasUpperCase() {
        }

        public boolean canDecode(char c) {
        }

        public int decode(char c) throws DecodingException {
        }

        public char encode(int i2) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public boolean isValidPaddingStartPosition(int i2) {
        }

        public Alphabet lowerCase() {
        }

        public boolean matches(char c) {
        }

        public String toString() {
        }

        public Alphabet upperCase() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Base16Encoding extends StandardBaseEncoding {
        public final char[] encoding;

        public Base16Encoding(String str, String str2) {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, @NullableDecl Character ch) {
        }

        private Base16Encoding(Alphabet alphabet) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2, @NullableDecl Character ch) {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, @NullableDecl Character ch) {
        }

        private Base64Encoding(Alphabet alphabet, @NullableDecl Character ch) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
        }

        public DecodingException(Throwable th) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        public SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i2) {
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxDecodedSize(int i2) {
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxEncodedSize(int i2) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
        }

        public String toString() {
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StandardBaseEncoding extends BaseEncoding {
        public final Alphabet alphabet;
        @MonotonicNonNullDecl
        private transient BaseEncoding lowerCase;
        @NullableDecl
        public final Character paddingChar;
        @MonotonicNonNullDecl
        private transient BaseEncoding upperCase;

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends OutputStream {
            public int bitBuffer;
            public int bitBufferLength;
            public final /* synthetic */ StandardBaseEncoding this$0;
            public final /* synthetic */ Writer val$out;
            public int writtenChars;

            public AnonymousClass1(StandardBaseEncoding standardBaseEncoding, Writer writer) {
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
            }

            @Override // java.io.OutputStream
            public void write(int i2) throws IOException {
            }
        }

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends InputStream {
            public int bitBuffer;
            public int bitBufferLength;
            public boolean hitPadding;
            public int readChars;
            public final /* synthetic */ StandardBaseEncoding this$0;
            public final /* synthetic */ Reader val$reader;

            public AnonymousClass2(StandardBaseEncoding standardBaseEncoding, Reader reader) {
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
            }
        }

        public StandardBaseEncoding(String str, String str2, @NullableDecl Character ch) {
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
        }

        public void encodeChunkTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxDecodedSize(int i2) {
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxEncodedSize(int i2) {
        }

        public BaseEncoding newInstance(Alphabet alphabet, @NullableDecl Character ch) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
        }

        public String toString() {
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i2) {
        }

        public StandardBaseEncoding(Alphabet alphabet, @NullableDecl Character ch) {
        }
    }

    public static BaseEncoding base16() {
    }

    public static BaseEncoding base32() {
    }

    public static BaseEncoding base32Hex() {
    }

    public static BaseEncoding base64() {
    }

    public static BaseEncoding base64Url() {
    }

    private static byte[] extract(byte[] bArr, int i2) {
    }

    @GwtIncompatible
    public static Reader ignoringReader(Reader reader, String str) {
    }

    public static Appendable separatingAppendable(Appendable appendable, String str, int i2) {
    }

    @GwtIncompatible
    public static Writer separatingWriter(Writer writer, String str, int i2) {
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
    }

    public final byte[] decodeChecked(CharSequence charSequence) throws DecodingException {
    }

    public abstract int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @GwtIncompatible
    public final ByteSource decodingSource(CharSource charSource) {
    }

    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
    }

    public abstract void encodeTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    @GwtIncompatible
    public final ByteSink encodingSink(CharSink charSink) {
    }

    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int i2);

    public abstract int maxEncodedSize(int i2);

    public abstract BaseEncoding omitPadding();

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c);

    public abstract BaseEncoding withSeparator(String str, int i2);

    /* renamed from: com.google.common.io.BaseEncoding$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 extends Reader {
        public final /* synthetic */ Reader val$delegate;
        public final /* synthetic */ String val$toIgnore;

        public AnonymousClass3(Reader reader, String str) {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Reader
        public int read() throws IOException {
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
        }
    }

    public final String encode(byte[] bArr, int i2, int i3) {
    }

    /* renamed from: com.google.common.io.BaseEncoding$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4 implements Appendable {
        public int charsUntilSeparator;
        public final /* synthetic */ int val$afterEveryChars;
        public final /* synthetic */ Appendable val$delegate;
        public final /* synthetic */ String val$separator;

        public AnonymousClass4(int i2, Appendable appendable, String str) {
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
        }

        @Override // java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence) throws IOException {
        }
    }
}
