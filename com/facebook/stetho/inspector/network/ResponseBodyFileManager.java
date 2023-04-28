package com.facebook.stetho.inspector.network;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ResponseBodyFileManager {
    private static final String FILENAME_PREFIX = "network-response-body-";
    private static final int PRETTY_PRINT_TIMEOUT_SEC = 10;
    private static final String TAG = "ResponseBodyFileManager";
    private final Context mContext;
    private final Map<String, AsyncPrettyPrinter> mRequestIdMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AsyncPrettyPrintingCallable implements Callable<String> {
        private final AsyncPrettyPrinter mAsyncPrettyPrinter;
        private final InputStream mInputStream;
        public final /* synthetic */ ResponseBodyFileManager this$0;

        public AsyncPrettyPrintingCallable(ResponseBodyFileManager responseBodyFileManager, InputStream inputStream, AsyncPrettyPrinter asyncPrettyPrinter) {
        }

        private String prettyPrintContent(InputStream inputStream, AsyncPrettyPrinter asyncPrettyPrinter) throws IOException {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ String call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call  reason: avoid collision after fix types in other method */
        public String call2() throws IOException {
        }
    }

    public ResponseBodyFileManager(Context context) {
    }

    private static String getFilename(String str) {
    }

    private String prettyPrintContentWithTimeOut(AsyncPrettyPrinter asyncPrettyPrinter, InputStream inputStream) throws IOException {
    }

    public void associateAsyncPrettyPrinterWithId(String str, AsyncPrettyPrinter asyncPrettyPrinter) {
    }

    public void cleanupFiles() {
    }

    public OutputStream openResponseBodyFile(String str, boolean z) throws IOException {
    }

    public ResponseBodyData readFile(String str) throws IOException {
    }
}
