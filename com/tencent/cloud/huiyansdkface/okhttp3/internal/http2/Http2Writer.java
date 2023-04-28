package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Hpack;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Http2Writer implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f11065a = null;
    private final BufferedSink b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final Buffer f11066d;

    /* renamed from: e  reason: collision with root package name */
    private int f11067e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11068f;

    /* renamed from: g  reason: collision with root package name */
    private Hpack.Writer f11069g;

    public Http2Writer(BufferedSink bufferedSink, boolean z) {
    }

    private void a(int i2, long j2) throws IOException {
    }

    private void a(boolean z, int i2, List<Header> list) throws IOException {
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
    }

    public final synchronized void connectionPreface() throws IOException {
    }

    public final synchronized void data(boolean z, int i2, Buffer buffer, int i3) throws IOException {
    }

    public final synchronized void flush() throws IOException {
    }

    public final void frameHeader(int i2, int i3, byte b, byte b2) throws IOException {
    }

    public final synchronized void goAway(int i2, ErrorCode errorCode, byte[] bArr) throws IOException {
    }

    public final synchronized void headers(int i2, List<Header> list) throws IOException {
    }

    public final int maxDataLength() {
    }

    public final synchronized void ping(boolean z, int i2, int i3) throws IOException {
    }

    public final synchronized void pushPromise(int i2, int i3, List<Header> list) throws IOException {
    }

    public final synchronized void rstStream(int i2, ErrorCode errorCode) throws IOException {
    }

    public final synchronized void settings(Settings settings) throws IOException {
    }

    public final synchronized void synReply(boolean z, int i2, List<Header> list) throws IOException {
    }

    public final synchronized void synStream(boolean z, int i2, int i3, List<Header> list) throws IOException {
    }

    public final synchronized void windowUpdate(int i2, long j2) throws IOException {
    }
}
