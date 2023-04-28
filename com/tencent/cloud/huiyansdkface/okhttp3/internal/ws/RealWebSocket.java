package com.tencent.cloud.huiyansdkface.okhttp3.internal.ws;

import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.Callback;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.WebSocket;
import com.tencent.cloud.huiyansdkface.okhttp3.WebSocketListener;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.WebSocketReader;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final List<Protocol> b = null;
    private static /* synthetic */ boolean y = true;

    /* renamed from: a  reason: collision with root package name */
    public final WebSocketListener f11100a;
    private final Request c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f11101d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11102e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11103f;

    /* renamed from: g  reason: collision with root package name */
    private Call f11104g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f11105h;

    /* renamed from: i  reason: collision with root package name */
    private WebSocketReader f11106i;

    /* renamed from: j  reason: collision with root package name */
    private WebSocketWriter f11107j;

    /* renamed from: k  reason: collision with root package name */
    private ScheduledExecutorService f11108k;

    /* renamed from: l  reason: collision with root package name */
    private Streams f11109l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<ByteString> f11110m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<Object> f11111n;

    /* renamed from: o  reason: collision with root package name */
    private long f11112o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11113p;
    private ScheduledFuture<?> q;
    private int r;
    private String s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private boolean x;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.RealWebSocket$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ RealWebSocket f11114a;

        public AnonymousClass1(RealWebSocket realWebSocket) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.RealWebSocket$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Request f11115a;
        private /* synthetic */ RealWebSocket b;

        public AnonymousClass2(RealWebSocket realWebSocket, Request request) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.Callback
        public void onResponse(Call call, Response response) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class CancelRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ RealWebSocket f11116a;

        public CancelRunnable(RealWebSocket realWebSocket) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Close {

        /* renamed from: a  reason: collision with root package name */
        public final int f11117a;
        public final ByteString b;
        public final long c;

        public Close(int i2, ByteString byteString, long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Message {

        /* renamed from: a  reason: collision with root package name */
        public final int f11118a;
        public final ByteString b;

        public Message(int i2, ByteString byteString) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class PingRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ RealWebSocket f11119a;

        public PingRunnable(RealWebSocket realWebSocket) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class Streams implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11120a;
        public final BufferedSource b;
        public final BufferedSink c;

        public Streams(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j2) {
    }

    private synchronized boolean a(int i2, String str, long j2) {
    }

    private synchronized boolean a(ByteString byteString, int i2) {
    }

    private void c() {
    }

    public final void a(Response response) throws ProtocolException {
    }

    public final boolean a() throws IOException {
    }

    public final void b() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket
    public final void cancel() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket
    public final boolean close(int i2, String str) {
    }

    public final void connect(OkHttpClient okHttpClient) {
    }

    public final void failWebSocket(Exception exc, Response response) {
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
    }

    public final void loopReader() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadClose(int i2, String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(ByteString byteString) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(String str) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void onReadPing(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void onReadPong(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket
    public final synchronized long queueSize() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket
    public final Request request() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket
    public final boolean send(ByteString byteString) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket
    public final boolean send(String str) {
    }
}
