package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer;
    public boolean closed;
    public final Source source;

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.RealBufferedSource$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends InputStream {
        public final /* synthetic */ RealBufferedSource this$0;

        public AnonymousClass1(RealBufferedSource realBufferedSource) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }

        public String toString() {
        }
    }

    public RealBufferedSource(Source source) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final Buffer buffer() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean exhausted() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(byte b) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(byte b, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(byte b, long j2, long j3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOf(ByteString byteString, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOfElement(ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long indexOfElement(ByteString byteString, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final InputStream inputStream() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean rangeEquals(long j2, ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean rangeEquals(long j2, ByteString byteString, int i2, int i3) throws IOException {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int read(byte[] bArr) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final long read(Buffer buffer, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final byte readByte() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final byte[] readByteArray() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final byte[] readByteArray(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final ByteString readByteString() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final ByteString readByteString(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readDecimalLong() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void readFully(Buffer buffer, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void readFully(byte[] bArr) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readHexadecimalUnsignedLong() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int readInt() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int readIntLe() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readLong() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final long readLongLe() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final short readShort() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final short readShortLe() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readString(long j2, Charset charset) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readString(Charset charset) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int readUtf8CodePoint() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8Line() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8LineStrict() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final String readUtf8LineStrict(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final boolean request(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void require(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final int select(Options options) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final void skip(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final Timeout timeout() {
    }

    public final String toString() {
    }
}
