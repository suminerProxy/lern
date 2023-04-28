package com.tencent.cloud.huiyansdkface.okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Logger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Okio {
    public static final Logger logger = null;

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Okio$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements Sink {
        public final /* synthetic */ OutputStream val$out;
        public final /* synthetic */ Timeout val$timeout;

        public AnonymousClass1(Timeout timeout, OutputStream outputStream) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final Timeout timeout() {
        }

        public final String toString() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final void write(Buffer buffer, long j2) throws IOException {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Okio$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass2 implements Source {
        public final /* synthetic */ InputStream val$in;
        public final /* synthetic */ Timeout val$timeout;

        public AnonymousClass2(Timeout timeout, InputStream inputStream) {
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

        public final String toString() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Okio$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass3 implements Sink {
        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final Timeout timeout() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final void write(Buffer buffer, long j2) throws IOException {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.Okio$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass4 extends AsyncTimeout {
        public final /* synthetic */ Socket val$socket;

        public AnonymousClass4(Socket socket) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.AsyncTimeout
        public final IOException newTimeoutException(IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.AsyncTimeout
        public final void timedOut() {
        }
    }

    private Okio() {
    }

    public static Sink appendingSink(File file) throws FileNotFoundException {
    }

    public static Sink blackhole() {
    }

    public static BufferedSink buffer(Sink sink) {
    }

    public static BufferedSource buffer(Source source) {
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
    }

    public static Sink sink(File file) throws FileNotFoundException {
    }

    public static Sink sink(OutputStream outputStream) {
    }

    private static Sink sink(OutputStream outputStream, Timeout timeout) {
    }

    public static Sink sink(Socket socket) throws IOException {
    }

    public static Sink sink(Path path, OpenOption... openOptionArr) throws IOException {
    }

    public static Source source(File file) throws FileNotFoundException {
    }

    public static Source source(InputStream inputStream) {
    }

    private static Source source(InputStream inputStream, Timeout timeout) {
    }

    public static Source source(Socket socket) throws IOException {
    }

    public static Source source(Path path, OpenOption... openOptionArr) throws IOException {
    }

    private static AsyncTimeout timeout(Socket socket) {
    }
}
