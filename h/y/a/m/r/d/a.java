package h.y.a.m.r.d;

import com.tencent.android.tpns.mqtt.internal.security.SSLSocketFactoryFactory;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: HttpsUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a {

    /* compiled from: HttpsUtils.java */
    /* renamed from: h.y.a.m.r.d.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class C0419a implements X509TrustManager {

        /* renamed from: a  reason: collision with root package name */
        private X509TrustManager f26259a;
        private X509TrustManager b;

        public C0419a(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyStoreException {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            this.f26259a = a.b(trustManagerFactory.getTrustManagers());
            this.b = x509TrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            try {
                this.f26259a.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException unused) {
                this.b.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* compiled from: HttpsUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public SSLSocketFactory f26260a;
        public X509TrustManager b;
    }

    /* compiled from: HttpsUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f26261a;

        private c(a aVar) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    /* compiled from: HttpsUtils.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static X509TrustManager b(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static b c(InputStream[] inputStreamArr, InputStream inputStream, String str) {
        X509TrustManager dVar;
        b bVar = new b();
        try {
            TrustManager[] e2 = e(inputStreamArr);
            KeyManager[] d2 = d(inputStream, str);
            SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactoryFactory.DEFAULT_PROTOCOL);
            if (e2 != null) {
                dVar = new C0419a(b(e2));
            } else {
                dVar = new d();
            }
            sSLContext.init(d2, new TrustManager[]{dVar}, null);
            bVar.f26260a = sSLContext.getSocketFactory();
            bVar.b = dVar;
            return bVar;
        } catch (KeyManagementException e3) {
            throw new AssertionError(e3);
        } catch (KeyStoreException e4) {
            throw new AssertionError(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }

    private static KeyManager[] d(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (KeyStoreException e3) {
                e3.printStackTrace();
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
            } catch (UnrecoverableKeyException e5) {
                e5.printStackTrace();
            } catch (CertificateException e6) {
                e6.printStackTrace();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        return null;
    }

    private static TrustManager[] e(InputStream... inputStreamArr) {
        if (inputStreamArr != null && inputStreamArr.length > 0) {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                int length = inputStreamArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    InputStream inputStream = inputStreamArr[i2];
                    int i4 = i3 + 1;
                    keyStore.setCertificateEntry(Integer.toString(i3), certificateFactory.generateCertificate(inputStream));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    i2++;
                    i3 = i4;
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (KeyStoreException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            } catch (CertificateException e4) {
                e4.printStackTrace();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }
}
