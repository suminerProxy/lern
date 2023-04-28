package com.tencent.cloud.huiyansdkface.okio;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Buffer implements BufferedSink, BufferedSource, Cloneable, ByteChannel {
    private static final byte[] DIGITS = null;
    public static final int REPLACEMENT_CHARACTER = 65533;
    public Segment head;
    public long size;

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Buffer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends OutputStream {
        public final /* synthetic */ Buffer this$0;

        public AnonymousClass1(Buffer buffer) {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Buffer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends InputStream {
        public final /* synthetic */ Buffer this$0;

        public AnonymousClass2(Buffer buffer) {
        }

        @Override // java.io.InputStream
        public int available() {
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public int end;
        public long offset;
        public boolean readWrite;
        private Segment segment;
        public int start;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public final long expandBuffer(int i2) {
        }

        public final int next() {
        }

        public final long resizeBuffer(long j2) {
        }

        public final int seek(long j2) {
        }
    }

    private ByteString digest(String str) {
    }

    private ByteString hmac(String str, ByteString byteString) {
    }

    private boolean rangeEquals(Segment segment, int i2, ByteString byteString, int i3, int i4) {
    }

    private void readFrom(InputStream inputStream, long j2, boolean z) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink, com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final Buffer buffer() {
    }

    public final void clear() {
    }

    public final Buffer clone() {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m34clone() throws CloneNotSupportedException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final long completeSegmentByteCount() {
    }

    public final Buffer copyTo(Buffer buffer, long j2, long j3) {
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
    }

    public final Buffer copyTo(OutputStream outputStream, long j2, long j3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink emit() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer emitCompleteSegments() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink emitCompleteSegments() throws IOException {
    }

    public final boolean equals(Object obj) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean exhausted() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink, com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
    public final void flush() {
    }

    public final byte getByte(long j2) {
    }

    public final int hashCode() {
    }

    public final ByteString hmacSha1(ByteString byteString) {
    }

    public final ByteString hmacSha256(ByteString byteString) {
    }

    public final ByteString hmacSha512(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(byte b) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(byte b, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(byte b, long j2, long j3) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(ByteString byteString, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOfElement(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOfElement(ByteString byteString, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final InputStream inputStream() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
    }

    public final ByteString md5() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final OutputStream outputStream() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean rangeEquals(long j2, ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean rangeEquals(long j2, ByteString byteString, int i2, int i3) {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int read(byte[] bArr) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int read(byte[] bArr, int i2, int i3) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final long read(Buffer buffer, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
    }

    public final UnsafeCursor readAndWriteUnsafe() {
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final byte readByte() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final byte[] readByteArray() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final byte[] readByteArray(long j2) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final ByteString readByteString() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final ByteString readByteString(long j2) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readDecimalLong() {
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
    }

    public final Buffer readFrom(InputStream inputStream, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void readFully(Buffer buffer, long j2) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void readFully(byte[] bArr) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readHexadecimalUnsignedLong() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int readInt() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int readIntLe() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readLong() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readLongLe() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final short readShort() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final short readShortLe() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readString(long j2, Charset charset) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readString(Charset charset) {
    }

    public final UnsafeCursor readUnsafe() {
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8(long j2) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int readUtf8CodePoint() throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8Line() throws EOFException {
    }

    public final String readUtf8Line(long j2) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8LineStrict() throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8LineStrict(long j2) throws EOFException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean request(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void require(long j2) throws EOFException {
    }

    public final List<Integer> segmentSizes() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int select(Options options) {
    }

    public final int selectPrefix(Options options, boolean z) {
    }

    public final ByteString sha1() {
    }

    public final ByteString sha256() {
    }

    public final ByteString sha512() {
    }

    public final long size() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void skip(long j2) throws EOFException {
    }

    public final ByteString snapshot() {
    }

    public final ByteString snapshot(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public final Timeout timeout() {
    }

    public final String toString() {
    }

    public final Segment writableSegment(int i2) {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer write(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer write(byte[] bArr) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer write(byte[] bArr, int i2, int i3) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink write(Source source, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public final void write(Buffer buffer, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final long writeAll(Source source) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeByte(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeDecimalLong(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeDecimalLong(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeHexadecimalUnsignedLong(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeHexadecimalUnsignedLong(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeInt(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeIntLe(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeIntLe(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeLong(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeLong(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeLongLe(long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeLongLe(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeShort(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeShortLe(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShortLe(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeString(String str, int i2, int i3, Charset charset) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeString(String str, Charset charset) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeString(String str, int i2, int i3, Charset charset) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeString(String str, Charset charset) throws IOException {
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
    }

    public final Buffer writeTo(OutputStream outputStream, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeUtf8(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeUtf8(String str, int i2, int i3) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(String str) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(String str, int i2, int i3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final Buffer writeUtf8CodePoint(int i2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8CodePoint(int i2) throws IOException {
    }
}
