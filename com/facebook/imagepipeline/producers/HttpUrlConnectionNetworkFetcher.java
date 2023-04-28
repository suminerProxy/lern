package com.facebook.imagepipeline.producers;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Objects;
import com.facebook.common.time.MonotonicClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class HttpUrlConnectionNetworkFetcher extends BaseNetworkFetcher<HttpUrlConnectionNetworkFetchState> {
    private static final String FETCH_TIME = "fetch_time";
    public static final int HTTP_DEFAULT_TIMEOUT = 30000;
    public static final int HTTP_PERMANENT_REDIRECT = 308;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;
    private static final String IMAGE_SIZE = "image_size";
    private static final int MAX_REDIRECTS = 5;
    private static final int NUM_NETWORK_THREADS = 3;
    private static final String QUEUE_TIME = "queue_time";
    private static final String TOTAL_TIME = "total_time";
    private final ExecutorService mExecutorService;
    private int mHttpConnectionTimeout;
    private final MonotonicClock mMonotonicClock;
    @Nullable
    private final Map<String, String> mRequestHeaders;
    @Nullable
    private String mUserAgent;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class HttpUrlConnectionNetworkFetchState extends FetchState {
        private long fetchCompleteTime;
        private long responseTime;
        private long submitTime;

        public HttpUrlConnectionNetworkFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        }

        public static /* synthetic */ long access$000(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState) {
        }

        public static /* synthetic */ long access$002(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState, long j2) {
        }

        public static /* synthetic */ long access$100(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState) {
        }

        public static /* synthetic */ long access$102(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState, long j2) {
        }

        public static /* synthetic */ long access$200(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState) {
        }

        public static /* synthetic */ long access$202(HttpUrlConnectionNetworkFetchState httpUrlConnectionNetworkFetchState, long j2) {
        }
    }

    public HttpUrlConnectionNetworkFetcher() {
        this((String) null, (Map<String, String>) null, RealtimeSinceBootClock.get());
    }

    private HttpURLConnection downloadFrom(Uri uri, int maxRedirects) throws IOException {
        HttpURLConnection openConnectionTo = openConnectionTo(uri);
        String str = this.mUserAgent;
        if (str != null) {
            openConnectionTo.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.mRequestHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                openConnectionTo.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        openConnectionTo.setConnectTimeout(this.mHttpConnectionTimeout);
        int responseCode = openConnectionTo.getResponseCode();
        if (isHttpSuccess(responseCode)) {
            return openConnectionTo;
        }
        if (isHttpRedirect(responseCode)) {
            String headerField = openConnectionTo.getHeaderField("Location");
            openConnectionTo.disconnect();
            Uri parse = headerField == null ? null : Uri.parse(headerField);
            String scheme = uri.getScheme();
            if (maxRedirects > 0 && parse != null && !Objects.equal(parse.getScheme(), scheme)) {
                return downloadFrom(parse, maxRedirects - 1);
            }
            throw new IOException(maxRedirects == 0 ? error("URL %s follows too many redirects", uri.toString()) : error("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        openConnectionTo.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    private static String error(String format, Object... args) {
        return String.format(Locale.getDefault(), format, args);
    }

    private static boolean isHttpRedirect(int responseCode) {
        if (responseCode == 307 || responseCode == 308) {
            return true;
        }
        switch (responseCode) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean isHttpSuccess(int responseCode) {
        return responseCode >= 200 && responseCode < 300;
    }

    @VisibleForTesting
    public static HttpURLConnection openConnectionTo(Uri uri) throws IOException {
        return (HttpURLConnection) UriUtil.uriToUrl(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ FetchState createFetchState(Consumer consumer, ProducerContext context) {
        return createFetchState((Consumer<EncodedImage>) consumer, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void fetchSync(com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.HttpUrlConnectionNetworkFetchState r5, com.facebook.imagepipeline.producers.NetworkFetcher.Callback r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.getUri()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r2 = 5
            java.net.HttpURLConnection r1 = r4.downloadFrom(r1, r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            com.facebook.common.time.MonotonicClock r2 = r4.mMonotonicClock     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            long r2 = r2.now()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.HttpUrlConnectionNetworkFetchState.access$102(r5, r2)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            if (r1 == 0) goto L1d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            r5 = -1
            r6.onResponse(r0, r5)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
        L1d:
            if (r0 == 0) goto L22
            r0.close()     // Catch: java.io.IOException -> L22
        L22:
            if (r1 == 0) goto L39
            goto L36
        L25:
            r5 = move-exception
            goto L2c
        L27:
            r5 = move-exception
            r1 = r0
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
        L2c:
            r6.onFailure(r5)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.io.IOException -> L34
        L34:
            if (r1 == 0) goto L39
        L36:
            r1.disconnect()
        L39:
            return
        L3a:
            r5 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.io.IOException -> L40
        L40:
            if (r1 == 0) goto L45
            r1.disconnect()
        L45:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.fetchSync(com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher$HttpUrlConnectionNetworkFetchState, com.facebook.imagepipeline.producers.NetworkFetcher$Callback):void");
    }

    public HttpUrlConnectionNetworkFetcher(int httpConnectionTimeout) {
        this((String) null, (Map<String, String>) null, RealtimeSinceBootClock.get());
        this.mHttpConnectionTimeout = httpConnectionTimeout;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public HttpUrlConnectionNetworkFetchState createFetchState(Consumer<EncodedImage> consumer, ProducerContext context) {
        return new HttpUrlConnectionNetworkFetchState(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(final HttpUrlConnectionNetworkFetchState fetchState, final NetworkFetcher.Callback callback) {
        HttpUrlConnectionNetworkFetchState.access$002(fetchState, this.mMonotonicClock.now());
        fetchState.getContext().addCallbacks(new BaseProducerContextCallbacks(this, this.mExecutorService.submit(new Runnable(this, fetchState, callback) { // from class: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.1
            public final /* synthetic */ HttpUrlConnectionNetworkFetcher this$0;
            public final /* synthetic */ NetworkFetcher.Callback val$callback;
            public final /* synthetic */ HttpUrlConnectionNetworkFetchState val$fetchState;

            @Override // java.lang.Runnable
            public void run() {
            }
        }), callback) { // from class: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.2
            public final /* synthetic */ HttpUrlConnectionNetworkFetcher this$0;
            public final /* synthetic */ NetworkFetcher.Callback val$callback;
            public final /* synthetic */ Future val$future;

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
            }
        });
    }

    @Override // com.facebook.imagepipeline.producers.BaseNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public Map<String, String> getExtraMap(HttpUrlConnectionNetworkFetchState fetchState, int byteSize) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(QUEUE_TIME, Long.toString(HttpUrlConnectionNetworkFetchState.access$100(fetchState) - HttpUrlConnectionNetworkFetchState.access$000(fetchState)));
        hashMap.put(FETCH_TIME, Long.toString(HttpUrlConnectionNetworkFetchState.access$200(fetchState) - HttpUrlConnectionNetworkFetchState.access$100(fetchState)));
        hashMap.put(TOTAL_TIME, Long.toString(HttpUrlConnectionNetworkFetchState.access$200(fetchState) - HttpUrlConnectionNetworkFetchState.access$000(fetchState)));
        hashMap.put(IMAGE_SIZE, Integer.toString(byteSize));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.BaseNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(HttpUrlConnectionNetworkFetchState fetchState, int byteSize) {
        HttpUrlConnectionNetworkFetchState.access$202(fetchState, this.mMonotonicClock.now());
    }

    public HttpUrlConnectionNetworkFetcher(String userAgent, int httpConnectionTimeout) {
        this(userAgent, (Map<String, String>) null, RealtimeSinceBootClock.get());
        this.mHttpConnectionTimeout = httpConnectionTimeout;
    }

    public HttpUrlConnectionNetworkFetcher(String userAgent, @Nullable Map<String, String> requestHeaders, int httpConnectionTimeout) {
        this(userAgent, requestHeaders, RealtimeSinceBootClock.get());
        this.mHttpConnectionTimeout = httpConnectionTimeout;
    }

    @VisibleForTesting
    public HttpUrlConnectionNetworkFetcher(@Nullable String userAgent, @Nullable Map<String, String> requestHeaders, MonotonicClock monotonicClock) {
        this.mExecutorService = Executors.newFixedThreadPool(3);
        this.mMonotonicClock = monotonicClock;
        this.mRequestHeaders = requestHeaders;
        this.mUserAgent = userAgent;
    }
}
