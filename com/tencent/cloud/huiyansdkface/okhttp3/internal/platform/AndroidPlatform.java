package com.tencent.cloud.huiyansdkface.okhttp3.internal.platform;

import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.CertificateChainCleaner;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.TrustRootIndex;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AndroidPlatform extends Platform {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f11077a;
    private final OptionalMethod<Socket> b;
    private final OptionalMethod<Socket> c;

    /* renamed from: d  reason: collision with root package name */
    private final OptionalMethod<Socket> f11078d;

    /* renamed from: e  reason: collision with root package name */
    private final OptionalMethod<Socket> f11079e;

    /* renamed from: f  reason: collision with root package name */
    private final CloseGuard f11080f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

        /* renamed from: a  reason: collision with root package name */
        private final Object f11081a;
        private final Method b;

        public AndroidCertificateChainCleaner(Object obj, Method method) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.CertificateChainCleaner
        public final List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        }

        public final boolean equals(Object obj) {
        }

        public final int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class AndroidTrustRootIndex implements TrustRootIndex {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f11082a;
        private final Method b;

        public AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
        }

        public final boolean equals(Object obj) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        }

        public final int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class CloseGuard {

        /* renamed from: a  reason: collision with root package name */
        private final Method f11083a;
        private final Method b;
        private final Method c;

        private CloseGuard(Method method, Method method2, Method method3) {
        }

        public static CloseGuard a() {
        }

        public final Object a(String str) {
        }

        public final boolean a(Object obj) {
        }
    }

    private AndroidPlatform(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
    }

    private static boolean a() {
    }

    private boolean a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
    }

    private boolean b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
    }

    public static Platform buildIfSupported() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public SSLContext getSSLContext() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public void log(int i2, String str, Throwable th) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
    }
}
