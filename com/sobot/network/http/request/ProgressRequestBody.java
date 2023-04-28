package com.sobot.network.http.request;

import com.sobot.network.http.callback.Callback;
import com.sobot.network.http.model.SobotProgress;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Sink;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ProgressRequestBody extends RequestBody {
    private Callback callback;
    private UploadInterceptor interceptor;
    private RequestBody requestBody;

    /* renamed from: com.sobot.network.http.request.ProgressRequestBody$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ProgressRequestBody this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass1(ProgressRequestBody progressRequestBody, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class CountingSink extends ForwardingSink {
        private SobotProgress progress;
        public final /* synthetic */ ProgressRequestBody this$0;

        /* renamed from: com.sobot.network.http.request.ProgressRequestBody$CountingSink$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements SobotProgress.Action {
            public final /* synthetic */ CountingSink this$1;

            public AnonymousClass1(CountingSink countingSink) {
            }

            @Override // com.sobot.network.http.model.SobotProgress.Action
            public void call(SobotProgress sobotProgress) {
            }
        }

        public CountingSink(ProgressRequestBody progressRequestBody, Sink sink) {
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface UploadInterceptor {
        void uploadProgress(SobotProgress sobotProgress);
    }

    public ProgressRequestBody(RequestBody requestBody, Callback callback) {
    }

    public static /* synthetic */ UploadInterceptor access$000(ProgressRequestBody progressRequestBody) {
    }

    public static /* synthetic */ void access$100(ProgressRequestBody progressRequestBody, SobotProgress sobotProgress) {
    }

    public static /* synthetic */ Callback access$200(ProgressRequestBody progressRequestBody) {
    }

    private void onProgress(SobotProgress sobotProgress) {
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
    }

    public void setInterceptor(UploadInterceptor uploadInterceptor) {
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
    }
}
