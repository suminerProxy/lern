package org.jsoup.helper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HttpConnection implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final String DEFAULT_UA = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    private static final String DefaultUploadType = "application/octet-stream";
    private static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    private static final int HTTP_TEMP_REDIR = 307;
    private static final String MULTIPART_FORM_DATA = "multipart/form-data";
    private static final String USER_AGENT = "User-Agent";
    private Connection.Request req;
    private Connection.Response res;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class Base<T extends Connection.Base> implements Connection.Base<T> {
        public Map<String, String> cookies;
        public Map<String, List<String>> headers;
        public Connection.Method method;
        public URL url;

        public /* synthetic */ Base(AnonymousClass1 anonymousClass1) {
        }

        private static String fixHeaderEncoding(String str) {
        }

        private List<String> getHeadersCaseInsensitive(String str) {
        }

        private static boolean looksLikeUtf8(byte[] bArr) {
        }

        private Map.Entry<String, List<String>> scanHeaders(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public T addHeader(String str, String str2) {
        }

        @Override // org.jsoup.Connection.Base
        public String cookie(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> cookies() {
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasCookie(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasHeader(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public boolean hasHeaderWithValue(String str, String str2) {
        }

        @Override // org.jsoup.Connection.Base
        public String header(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public List<String> headers(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public Connection.Method method() {
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, List<String>> multiHeaders() {
        }

        @Override // org.jsoup.Connection.Base
        public T removeCookie(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public T removeHeader(String str) {
        }

        @Override // org.jsoup.Connection.Base
        public URL url() {
        }

        private Base() {
        }

        @Override // org.jsoup.Connection.Base
        public T method(Connection.Method method) {
        }

        @Override // org.jsoup.Connection.Base
        public T url(URL url) {
        }

        @Override // org.jsoup.Connection.Base
        public T cookie(String str, String str2) {
        }

        @Override // org.jsoup.Connection.Base
        public Map<String, String> headers() {
        }

        @Override // org.jsoup.Connection.Base
        public T header(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class KeyVal implements Connection.KeyVal {
        private String contentType;
        private String key;
        private InputStream stream;
        private String value;

        private KeyVal() {
        }

        public static KeyVal create(String str, String str2) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public Connection.KeyVal contentType(String str) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public boolean hasInputStream() {
        }

        @Override // org.jsoup.Connection.KeyVal
        public /* bridge */ /* synthetic */ Connection.KeyVal inputStream(InputStream inputStream) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public /* bridge */ /* synthetic */ Connection.KeyVal key(String str) {
        }

        public String toString() {
        }

        @Override // org.jsoup.Connection.KeyVal
        public /* bridge */ /* synthetic */ Connection.KeyVal value(String str) {
        }

        public static KeyVal create(String str, String str2, InputStream inputStream) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal inputStream(InputStream inputStream) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal key(String str) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public KeyVal value(String str) {
        }

        @Override // org.jsoup.Connection.KeyVal
        public String contentType() {
        }

        @Override // org.jsoup.Connection.KeyVal
        public InputStream inputStream() {
        }

        @Override // org.jsoup.Connection.KeyVal
        public String key() {
        }

        @Override // org.jsoup.Connection.KeyVal
        public String value() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Request extends Base<Connection.Request> implements Connection.Request {
        private String body;
        private Collection<Connection.KeyVal> data;
        private boolean followRedirects;
        private boolean ignoreContentType;
        private boolean ignoreHttpErrors;
        private int maxBodySizeBytes;
        private Parser parser;
        private boolean parserDefined;
        private String postDataCharset;
        private Proxy proxy;
        private SSLSocketFactory sslSocketFactory;
        private int timeoutMilliseconds;
        private boolean validateTSLCertificates;

        public static /* synthetic */ boolean access$100(Request request) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String cookie(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map cookies() {
        }

        @Override // org.jsoup.Connection.Request
        public /* bridge */ /* synthetic */ Connection.Request data(Connection.KeyVal keyVal) {
        }

        @Override // org.jsoup.Connection.Request
        public boolean followRedirects() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String header(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ List headers(String str) {
        }

        @Override // org.jsoup.Connection.Request
        public boolean ignoreContentType() {
        }

        @Override // org.jsoup.Connection.Request
        public boolean ignoreHttpErrors() {
        }

        @Override // org.jsoup.Connection.Request
        public int maxBodySize() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map multiHeaders() {
        }

        @Override // org.jsoup.Connection.Request
        public /* bridge */ /* synthetic */ Connection.Request parser(Parser parser) {
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request postDataCharset(String str) {
        }

        @Override // org.jsoup.Connection.Request
        public /* bridge */ /* synthetic */ Connection.Request proxy(String str, int i2) {
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request requestBody(String str) {
        }

        @Override // org.jsoup.Connection.Request
        public SSLSocketFactory sslSocketFactory() {
        }

        @Override // org.jsoup.Connection.Request
        public /* bridge */ /* synthetic */ Connection.Request timeout(int i2) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL url() {
        }

        @Override // org.jsoup.Connection.Request
        public boolean validateTLSCertificates() {
        }

        @Override // org.jsoup.Connection.Request
        public Request data(Connection.KeyVal keyVal) {
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request followRedirects(boolean z) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map headers() {
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request ignoreContentType(boolean z) {
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request ignoreHttpErrors(boolean z) {
        }

        @Override // org.jsoup.Connection.Request
        public Connection.Request maxBodySize(int i2) {
        }

        @Override // org.jsoup.Connection.Request
        public Request parser(Parser parser) {
        }

        @Override // org.jsoup.Connection.Request
        public /* bridge */ /* synthetic */ Connection.Request proxy(Proxy proxy) {
        }

        @Override // org.jsoup.Connection.Request
        public String requestBody() {
        }

        @Override // org.jsoup.Connection.Request
        public void sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        }

        @Override // org.jsoup.Connection.Request
        public int timeout() {
        }

        @Override // org.jsoup.Connection.Request
        public void validateTLSCertificates(boolean z) {
        }

        @Override // org.jsoup.Connection.Request
        public Proxy proxy() {
        }

        @Override // org.jsoup.Connection.Request
        public Request timeout(int i2) {
        }

        @Override // org.jsoup.Connection.Request
        public Collection<Connection.KeyVal> data() {
        }

        @Override // org.jsoup.Connection.Request
        public Parser parser() {
        }

        @Override // org.jsoup.Connection.Request
        public Request proxy(Proxy proxy) {
        }

        @Override // org.jsoup.Connection.Request
        public String postDataCharset() {
        }

        @Override // org.jsoup.Connection.Request
        public Request proxy(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Response extends Base<Connection.Response> implements Connection.Response {
        private static final String LOCATION = "Location";
        private static final int MAX_REDIRECTS = 20;
        private static SSLSocketFactory sslSocketFactory;
        private static final Pattern xmlContentTypeRxp = null;
        private InputStream bodyStream;
        private ByteBuffer byteData;
        private String charset;
        private String contentType;
        private boolean executed;
        private boolean inputStreamRead;
        private int numRedirects;
        private Connection.Request req;
        private int statusCode;
        private String statusMessage;

        /* renamed from: org.jsoup.helper.HttpConnection$Response$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class AnonymousClass1 implements HostnameVerifier {
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
            }
        }

        /* renamed from: org.jsoup.helper.HttpConnection$Response$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public class AnonymousClass2 implements X509TrustManager {
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
            }
        }

        public Response() {
        }

        private static HttpURLConnection createConnection(Connection.Request request) throws IOException {
        }

        private static LinkedHashMap<String, List<String>> createHeaderMap(HttpURLConnection httpURLConnection) {
        }

        public static Response execute(Connection.Request request) throws IOException {
        }

        private static HostnameVerifier getInsecureVerifier() {
        }

        private static String getRequestCookieString(Connection.Request request) {
        }

        private static synchronized void initUnSecureTSL() throws IOException {
        }

        private void prepareByteData() {
        }

        private void safeClose() {
        }

        private static void serialiseRequestUrl(Connection.Request request) throws IOException {
        }

        private static String setOutputContentType(Connection.Request request) {
        }

        private void setupFromConnection(HttpURLConnection httpURLConnection, Connection.Response response) throws IOException {
        }

        private static void writePost(Connection.Request request, OutputStream outputStream, String str) throws IOException {
        }

        @Override // org.jsoup.Connection.Response
        public String body() {
        }

        @Override // org.jsoup.Connection.Response
        public byte[] bodyAsBytes() {
        }

        @Override // org.jsoup.Connection.Response
        public BufferedInputStream bodyStream() {
        }

        @Override // org.jsoup.Connection.Response
        public Connection.Response bufferUp() {
        }

        @Override // org.jsoup.Connection.Response
        public /* bridge */ /* synthetic */ Connection.Response charset(String str) {
        }

        @Override // org.jsoup.Connection.Response
        public String contentType() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String cookie(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map cookies() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ String header(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ List headers(String str) {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Connection.Method method() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map multiHeaders() {
        }

        @Override // org.jsoup.Connection.Response
        public Document parse() throws IOException {
        }

        public void processResponseHeaders(Map<String, List<String>> map) {
        }

        @Override // org.jsoup.Connection.Response
        public int statusCode() {
        }

        @Override // org.jsoup.Connection.Response
        public String statusMessage() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ URL url() {
        }

        public static Response execute(Connection.Request request, Response response) throws IOException {
        }

        @Override // org.jsoup.Connection.Response
        public String charset() {
        }

        @Override // org.jsoup.helper.HttpConnection.Base, org.jsoup.Connection.Base
        public /* bridge */ /* synthetic */ Map headers() {
        }

        @Override // org.jsoup.Connection.Response
        public Response charset(String str) {
        }

        private Response(Response response) throws IOException {
        }
    }

    private HttpConnection() {
    }

    public static /* synthetic */ boolean access$200(Connection.Request request) {
    }

    public static /* synthetic */ String access$300(String str) {
    }

    public static Connection connect(String str) {
    }

    private static String encodeMimeName(String str) {
    }

    private static String encodeUrl(String str) {
    }

    private static boolean needsMultipart(Connection.Request request) {
    }

    @Override // org.jsoup.Connection
    public Connection cookie(String str, String str2) {
    }

    @Override // org.jsoup.Connection
    public Connection cookies(Map<String, String> map) {
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2) {
    }

    @Override // org.jsoup.Connection
    public Connection.Response execute() throws IOException {
    }

    @Override // org.jsoup.Connection
    public Connection followRedirects(boolean z) {
    }

    @Override // org.jsoup.Connection
    public Document get() throws IOException {
    }

    @Override // org.jsoup.Connection
    public Connection header(String str, String str2) {
    }

    @Override // org.jsoup.Connection
    public Connection headers(Map<String, String> map) {
    }

    @Override // org.jsoup.Connection
    public Connection ignoreContentType(boolean z) {
    }

    @Override // org.jsoup.Connection
    public Connection ignoreHttpErrors(boolean z) {
    }

    @Override // org.jsoup.Connection
    public Connection maxBodySize(int i2) {
    }

    @Override // org.jsoup.Connection
    public Connection method(Connection.Method method) {
    }

    @Override // org.jsoup.Connection
    public Connection parser(Parser parser) {
    }

    @Override // org.jsoup.Connection
    public Document post() throws IOException {
    }

    @Override // org.jsoup.Connection
    public Connection postDataCharset(String str) {
    }

    @Override // org.jsoup.Connection
    public Connection proxy(Proxy proxy) {
    }

    @Override // org.jsoup.Connection
    public Connection referrer(String str) {
    }

    @Override // org.jsoup.Connection
    public Connection.Request request() {
    }

    @Override // org.jsoup.Connection
    public Connection requestBody(String str) {
    }

    @Override // org.jsoup.Connection
    public Connection.Response response() {
    }

    @Override // org.jsoup.Connection
    public Connection sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    @Override // org.jsoup.Connection
    public Connection timeout(int i2) {
    }

    @Override // org.jsoup.Connection
    public Connection url(URL url) {
    }

    @Override // org.jsoup.Connection
    public Connection userAgent(String str) {
    }

    @Override // org.jsoup.Connection
    public Connection validateTLSCertificates(boolean z) {
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2, InputStream inputStream) {
    }

    @Override // org.jsoup.Connection
    public Connection proxy(String str, int i2) {
    }

    @Override // org.jsoup.Connection
    public Connection request(Connection.Request request) {
    }

    @Override // org.jsoup.Connection
    public Connection response(Connection.Response response) {
    }

    @Override // org.jsoup.Connection
    public Connection url(String str) {
    }

    public static Connection connect(URL url) {
    }

    public static URL encodeUrl(URL url) {
    }

    @Override // org.jsoup.Connection
    public Connection data(String str, String str2, InputStream inputStream, String str3) {
    }

    @Override // org.jsoup.Connection
    public Connection data(Map<String, String> map) {
    }

    @Override // org.jsoup.Connection
    public Connection data(String... strArr) {
    }

    @Override // org.jsoup.Connection
    public Connection data(Collection<Connection.KeyVal> collection) {
    }

    @Override // org.jsoup.Connection
    public Connection.KeyVal data(String str) {
    }
}
