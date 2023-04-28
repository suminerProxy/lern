package com.tencent.cloud.huiyansdkface.okhttp3.internal.ws;

import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class WebSocketReader {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11121a;
    private BufferedSource b;
    private FrameCallback c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11122d;

    /* renamed from: e  reason: collision with root package name */
    private int f11123e;

    /* renamed from: f  reason: collision with root package name */
    private long f11124f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11125g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11126h;

    /* renamed from: i  reason: collision with root package name */
    private final Buffer f11127i;

    /* renamed from: j  reason: collision with root package name */
    private final Buffer f11128j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f11129k;

    /* renamed from: l  reason: collision with root package name */
    private final Buffer.UnsafeCursor f11130l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface FrameCallback {
        void onReadClose(int i2, String str);

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z, BufferedSource bufferedSource, FrameCallback frameCallback) {
    }

    private void b() throws IOException {
    }

    private void c() throws IOException {
    }

    private void d() throws IOException {
    }

    private void e() throws IOException {
    }

    public final void a() throws IOException {
    }
}
