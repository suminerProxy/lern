package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private Reader f10808a;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ MediaType f10809a;
        private /* synthetic */ long b;
        private /* synthetic */ BufferedSource c;

        public AnonymousClass1(MediaType mediaType, long j2, BufferedSource bufferedSource) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody
        public final long contentLength() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody
        public final MediaType contentType() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody
        public final BufferedSource source() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class BomAwareReader extends Reader {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedSource f10810a;
        private final Charset b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private Reader f10811d;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) throws IOException {
        }
    }

    private Charset a() {
    }

    public static ResponseBody create(MediaType mediaType, long j2, BufferedSource bufferedSource) {
    }

    public static ResponseBody create(MediaType mediaType, ByteString byteString) {
    }

    public static ResponseBody create(MediaType mediaType, String str) {
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
    }

    public final InputStream byteStream() {
    }

    public final byte[] bytes() throws IOException {
    }

    public final Reader charStream() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
    }
}
