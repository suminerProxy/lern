package com.tencent.cloud.huiyansdkface.okhttp3.internal.connection;

import com.tencent.cloud.huiyansdkface.okhttp3.ConnectionSpec;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a  reason: collision with root package name */
    private final List<ConnectionSpec> f10894a;
    private int b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10895d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
    }

    private boolean a(SSLSocket sSLSocket) {
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
    }

    public final boolean connectionFailed(IOException iOException) {
    }
}
