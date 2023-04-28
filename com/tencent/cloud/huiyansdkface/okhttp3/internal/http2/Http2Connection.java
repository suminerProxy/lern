package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Http2Connection implements Closeable {

    /* renamed from: o  reason: collision with root package name */
    private static final ExecutorService f11002o = null;
    private static /* synthetic */ boolean v;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11003a;
    public final Listener b;
    public final Map<Integer, Http2Stream> c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11004d;

    /* renamed from: e  reason: collision with root package name */
    public int f11005e;

    /* renamed from: f  reason: collision with root package name */
    public int f11006f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11007g;

    /* renamed from: h  reason: collision with root package name */
    public final PushObserver f11008h;

    /* renamed from: i  reason: collision with root package name */
    public long f11009i;

    /* renamed from: j  reason: collision with root package name */
    public Settings f11010j;

    /* renamed from: k  reason: collision with root package name */
    public final Settings f11011k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11012l;

    /* renamed from: m  reason: collision with root package name */
    public final Http2Writer f11013m;

    /* renamed from: n  reason: collision with root package name */
    public final Set<Integer> f11014n;

    /* renamed from: p  reason: collision with root package name */
    private final ScheduledExecutorService f11015p;
    private final ExecutorService q;
    private boolean r;
    private long s;
    private Socket t;
    private ReaderRunnable u;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11016a;
        private /* synthetic */ ErrorCode b;
        private /* synthetic */ Http2Connection c;

        public AnonymousClass1(Http2Connection http2Connection, String str, Object[] objArr, int i2, ErrorCode errorCode) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11017a;
        private /* synthetic */ long b;
        private /* synthetic */ Http2Connection c;

        public AnonymousClass2(Http2Connection http2Connection, String str, Object[] objArr, int i2, long j2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11018a;
        private /* synthetic */ List b;
        private /* synthetic */ Http2Connection c;

        public AnonymousClass3(Http2Connection http2Connection, String str, Object[] objArr, int i2, List list) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11019a;
        private /* synthetic */ List b;
        private /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Http2Connection f11020d;

        public AnonymousClass4(Http2Connection http2Connection, String str, Object[] objArr, int i2, List list, boolean z) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11021a;
        private /* synthetic */ Buffer b;
        private /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ boolean f11022d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Http2Connection f11023e;

        public AnonymousClass5(Http2Connection http2Connection, String str, Object[] objArr, int i2, Buffer buffer, int i3, boolean z) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f11024a;
        private /* synthetic */ ErrorCode b;
        private /* synthetic */ Http2Connection c;

        public AnonymousClass6(Http2Connection http2Connection, String str, Object[] objArr, int i2, ErrorCode errorCode) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Socket f11025a;
        public String b;
        public BufferedSource c;

        /* renamed from: d  reason: collision with root package name */
        public BufferedSink f11026d;

        /* renamed from: e  reason: collision with root package name */
        public Listener f11027e;

        /* renamed from: f  reason: collision with root package name */
        public PushObserver f11028f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11029g;

        /* renamed from: h  reason: collision with root package name */
        public int f11030h;

        public Builder(boolean z) {
        }

        public Http2Connection build() {
        }

        public Builder listener(Listener listener) {
        }

        public Builder pingIntervalMillis(int i2) {
        }

        public Builder pushObserver(PushObserver pushObserver) {
        }

        public Builder socket(Socket socket) throws IOException {
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class Listener {

        /* renamed from: e  reason: collision with root package name */
        public static final Listener f11031e = null;

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$Listener$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class AnonymousClass1 extends Listener {
            @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection.Listener
            public final void onStream(Http2Stream http2Stream) throws IOException {
            }
        }

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class PingRunnable extends NamedRunnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11032a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Http2Connection f11033d;

        public PingRunnable(Http2Connection http2Connection, boolean z, int i2, int i3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public final void execute() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Http2Connection f11034a;
        private Http2Reader b;

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$ReaderRunnable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends NamedRunnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ Http2Stream f11035a;
            private /* synthetic */ ReaderRunnable b;

            public AnonymousClass1(ReaderRunnable readerRunnable, String str, Object[] objArr, Http2Stream http2Stream) {
            }

            @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
            public void execute() {
            }
        }

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$ReaderRunnable$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 extends NamedRunnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ ReaderRunnable f11036a;

            public AnonymousClass2(ReaderRunnable readerRunnable, String str, Object... objArr) {
            }

            @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
            public void execute() {
            }
        }

        /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection$ReaderRunnable$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass3 extends NamedRunnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ Settings f11037a;
            private /* synthetic */ ReaderRunnable b;

            public AnonymousClass3(ReaderRunnable readerRunnable, String str, Object[] objArr, Settings settings) {
            }

            @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
            public void execute() {
            }
        }

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i2, String str, ByteString byteString, String str2, int i3, long j2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i2, BufferedSource bufferedSource, int i3) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.NamedRunnable
        public void execute() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i2, ErrorCode errorCode, ByteString byteString) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i2, int i3, List<Header> list) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i2, int i3) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i2, int i3, int i4, boolean z) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i2, int i3, List<Header> list) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i2, ErrorCode errorCode) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z, Settings settings) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i2, long j2) {
        }
    }

    public Http2Connection(Builder builder) {
    }

    public static /* synthetic */ ExecutorService a() {
    }

    private synchronized void a(NamedRunnable namedRunnable) {
    }

    public static /* synthetic */ void a(Http2Connection http2Connection) {
    }

    public static /* synthetic */ boolean a(Http2Connection http2Connection, boolean z) {
    }

    private Http2Stream b(int i2, List<Header> list, boolean z) throws IOException {
    }

    public static /* synthetic */ ScheduledExecutorService b(Http2Connection http2Connection) {
    }

    private void b() {
    }

    public static boolean c(int i2) {
    }

    public final synchronized Http2Stream a(int i2) {
    }

    public final void a(int i2, long j2) {
    }

    public final void a(int i2, ErrorCode errorCode) {
    }

    public final void a(int i2, BufferedSource bufferedSource, int i3, boolean z) throws IOException {
    }

    public final void a(int i2, List<Header> list) {
    }

    public final void a(int i2, List<Header> list, boolean z) {
    }

    public final synchronized void a(long j2) {
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
    }

    public final void a(boolean z, int i2, int i3) {
    }

    public final synchronized Http2Stream b(int i2) {
    }

    public final void b(int i2, ErrorCode errorCode) throws IOException {
    }

    public final void c(int i2, ErrorCode errorCode) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final void flush() throws IOException {
    }

    public final Protocol getProtocol() {
    }

    public final synchronized boolean isShutdown() {
    }

    public final synchronized int maxConcurrentStreams() {
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
    }

    public final synchronized int openStreamCount() {
    }

    public final Http2Stream pushStream(int i2, List<Header> list, boolean z) throws IOException {
    }

    public final void setSettings(Settings settings) throws IOException {
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
    }

    public final void start() throws IOException {
    }

    public final void writeData(int i2, boolean z, Buffer buffer, long j2) throws IOException {
    }
}
