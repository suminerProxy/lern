package com.tencent.cloud.huiyansdkface.okhttp3.internal.platform;

import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.CertificateChainCleaner;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.TrustRootIndex;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Platform {

    /* renamed from: a  reason: collision with root package name */
    private static final Platform f11085a = null;
    private static final Logger b = null;

    public static <T> T a(Object obj, Class<T> cls, String str) {
    }

    public static List<String> alpnProtocolNames(List<Protocol> list) {
    }

    public static Platform get() {
    }

    public static boolean isConscryptPreferred() {
    }

    public X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner buildCertificateChainCleaner(SSLSocketFactory sSLSocketFactory) {
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
    }

    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
    }

    public String getPrefix() {
    }

    public SSLContext getSSLContext() {
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
    }

    public Object getStackTraceForCloseable(String str) {
    }

    public boolean isCleartextTrafficPermitted(String str) {
    }

    public void log(int i2, String str, Throwable th) {
    }

    public void logCloseableLeak(String str, Object obj) {
    }

    public String toString() {
    }
}
