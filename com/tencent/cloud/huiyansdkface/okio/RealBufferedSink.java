package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer buffer;
    public boolean closed;
    public final Sink sink;

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.RealBufferedSink$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends OutputStream {
        public final /* synthetic */ RealBufferedSink this$0;

        public AnonymousClass1(RealBufferedSink realBufferedSink) {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
        }

        public String toString() {
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    public RealBufferedSink(Sink sink) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink, com.tencent.cloud.huiyansdkface.okio.BufferedSource
    public final Buffer buffer() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink emit() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink emitCompleteSegments() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink, com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final OutputStream outputStream() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public final Timeout timeout() {
    }

    public final String toString() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink write(ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink write(Source source, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink write(byte[] bArr) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink write(byte[] bArr, int i2, int i3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public final void write(Buffer buffer, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final long writeAll(Source source) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeByte(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeDecimalLong(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeHexadecimalUnsignedLong(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeInt(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeIntLe(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeLong(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeLongLe(long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeShort(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeShortLe(int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeString(String str, int i2, int i3, Charset charset) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeString(String str, Charset charset) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeUtf8(String str) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeUtf8(String str, int i2, int i3) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.BufferedSink
    public final BufferedSink writeUtf8CodePoint(int i2) throws IOException {
    }
}
