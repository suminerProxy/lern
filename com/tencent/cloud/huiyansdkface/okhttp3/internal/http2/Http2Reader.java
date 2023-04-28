package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Hpack;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import com.tencent.cloud.huiyansdkface.okio.Source;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f11038a = null;
    private final BufferedSource b;
    private final ContinuationSource c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11039d;

    /* renamed from: e  reason: collision with root package name */
    private Hpack.Reader f11040e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class ContinuationSource implements Source {

        /* renamed from: a  reason: collision with root package name */
        public int f11041a;
        public byte b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f11042d;

        /* renamed from: e  reason: collision with root package name */
        public short f11043e;

        /* renamed from: f  reason: collision with root package name */
        private final BufferedSource f11044f;

        public ContinuationSource(BufferedSource bufferedSource) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public final long read(Buffer buffer, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public final Timeout timeout() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i2, String str, ByteString byteString, String str2, int i3, long j2);

        void data(boolean z, int i2, BufferedSource bufferedSource, int i3) throws IOException;

        void goAway(int i2, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z, int i2, int i3, List<Header> list);

        void ping(boolean z, int i2, int i3);

        void priority(int i2, int i3, int i4, boolean z);

        void pushPromise(int i2, int i3, List<Header> list) throws IOException;

        void rstStream(int i2, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i2, long j2);
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z) {
    }

    private static int a(int i2, byte b, short s) throws IOException {
    }

    public static int a(BufferedSource bufferedSource) throws IOException {
    }

    private List<Header> a(int i2, short s, byte b, int i3) throws IOException {
    }

    private void a(Handler handler, int i2) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
    }
}
