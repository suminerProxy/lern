package org.jsoup;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface Connection {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface Base<T extends Base> {
        T addHeader(String str, String str2);

        String cookie(String str);

        T cookie(String str, String str2);

        Map<String, String> cookies();

        boolean hasCookie(String str);

        boolean hasHeader(String str);

        boolean hasHeaderWithValue(String str, String str2);

        String header(String str);

        T header(String str, String str2);

        List<String> headers(String str);

        Map<String, String> headers();

        T method(Method method);

        Method method();

        Map<String, List<String>> multiHeaders();

        T removeCookie(String str);

        T removeHeader(String str);

        URL url();

        T url(URL url);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface KeyVal {
        String contentType();

        KeyVal contentType(String str);

        boolean hasInputStream();

        InputStream inputStream();

        KeyVal inputStream(InputStream inputStream);

        String key();

        KeyVal key(String str);

        String value();

        KeyVal value(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Method {
        private static final /* synthetic */ Method[] $VALUES = null;
        public static final Method DELETE = null;
        public static final Method GET = null;
        public static final Method HEAD = null;
        public static final Method OPTIONS = null;
        public static final Method PATCH = null;
        public static final Method POST = null;
        public static final Method PUT = null;
        public static final Method TRACE = null;
        private final boolean hasBody;

        private Method(String str, int i2, boolean z) {
        }

        public static Method valueOf(String str) {
        }

        public static Method[] values() {
        }

        public final boolean hasBody() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface Request extends Base<Request> {
        Collection<KeyVal> data();

        Request data(KeyVal keyVal);

        Request followRedirects(boolean z);

        boolean followRedirects();

        Request ignoreContentType(boolean z);

        boolean ignoreContentType();

        Request ignoreHttpErrors(boolean z);

        boolean ignoreHttpErrors();

        int maxBodySize();

        Request maxBodySize(int i2);

        Request parser(Parser parser);

        Parser parser();

        String postDataCharset();

        Request postDataCharset(String str);

        Proxy proxy();

        Request proxy(String str, int i2);

        Request proxy(Proxy proxy);

        String requestBody();

        Request requestBody(String str);

        SSLSocketFactory sslSocketFactory();

        void sslSocketFactory(SSLSocketFactory sSLSocketFactory);

        int timeout();

        Request timeout(int i2);

        void validateTLSCertificates(boolean z);

        boolean validateTLSCertificates();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface Response extends Base<Response> {
        String body();

        byte[] bodyAsBytes();

        BufferedInputStream bodyStream();

        Response bufferUp();

        String charset();

        Response charset(String str);

        String contentType();

        Document parse() throws IOException;

        int statusCode();

        String statusMessage();
    }

    Connection cookie(String str, String str2);

    Connection cookies(Map<String, String> map);

    KeyVal data(String str);

    Connection data(String str, String str2);

    Connection data(String str, String str2, InputStream inputStream);

    Connection data(String str, String str2, InputStream inputStream, String str3);

    Connection data(Collection<KeyVal> collection);

    Connection data(Map<String, String> map);

    Connection data(String... strArr);

    Response execute() throws IOException;

    Connection followRedirects(boolean z);

    Document get() throws IOException;

    Connection header(String str, String str2);

    Connection headers(Map<String, String> map);

    Connection ignoreContentType(boolean z);

    Connection ignoreHttpErrors(boolean z);

    Connection maxBodySize(int i2);

    Connection method(Method method);

    Connection parser(Parser parser);

    Document post() throws IOException;

    Connection postDataCharset(String str);

    Connection proxy(String str, int i2);

    Connection proxy(Proxy proxy);

    Connection referrer(String str);

    Request request();

    Connection request(Request request);

    Connection requestBody(String str);

    Response response();

    Connection response(Response response);

    Connection sslSocketFactory(SSLSocketFactory sSLSocketFactory);

    Connection timeout(int i2);

    Connection url(String str);

    Connection url(URL url);

    Connection userAgent(String str);

    Connection validateTLSCertificates(boolean z);
}
