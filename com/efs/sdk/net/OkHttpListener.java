package com.efs.sdk.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OkHttpListener extends EventListener {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f3194a;
    private String b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private List f3195d;

    /* renamed from: com.efs.sdk.net.OkHttpListener$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements EventListener.Factory {
        @Override // okhttp3.EventListener.Factory
        @NotNull
        public final EventListener create(@NotNull Call call) {
        }
    }

    private void a(String str) {
    }

    private void b() {
    }

    public static EventListener.Factory get() {
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String str) {
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long j2) {
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long j2) {
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
    }

    private void a() {
    }
}
