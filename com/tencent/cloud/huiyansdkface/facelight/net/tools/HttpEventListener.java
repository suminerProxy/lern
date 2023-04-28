package com.tencent.cloud.huiyansdkface.facelight.net.tools;

import androidx.annotation.Nullable;
import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.Connection;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Handshake;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class HttpEventListener extends EventListener {
    public static final EventListener.Factory FACTORY = null;
    private static final String TAG = "HttpEventListener";
    private final long callId;
    private final long callStartNanos;
    private boolean isNeedRecord;
    private StringBuilder sbLog;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.net.tools.HttpEventListener$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements EventListener.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicLong f10281a;

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener.Factory
        public EventListener create(Call call) {
        }
    }

    public HttpEventListener(boolean z, long j2, HttpUrl httpUrl, long j3) {
    }

    private void recordEventLog(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void callEnd(Call call) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void callStart(Call call) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void dnsStart(Call call, String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void requestBodyEnd(Call call, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void requestBodyStart(Call call) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void requestHeadersStart(Call call) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void responseBodyEnd(Call call, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void responseBodyStart(Call call) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void responseHeadersStart(Call call) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void secureConnectEnd(Call call, @Nullable Handshake handshake) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.EventListener
    public void secureConnectStart(Call call) {
    }
}
