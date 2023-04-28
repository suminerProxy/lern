package com.sobot.network.http.request;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Sink;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CountingRequestBody extends RequestBody {
    public CountingSink countingSink;
    public RequestBody delegate;
    public Listener listener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class CountingSink extends ForwardingSink {
        private long bytesWritten;
        public final /* synthetic */ CountingRequestBody this$0;

        public CountingSink(CountingRequestBody countingRequestBody, Sink sink) {
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface Listener {
        void onRequestProgress(long j2, long j3);
    }

    public CountingRequestBody(RequestBody requestBody, Listener listener) {
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
    }
}
