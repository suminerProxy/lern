package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DownloadingAsyncPrettyPrinterFactory implements AsyncPrettyPrinterFactory {

    /* renamed from: com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements AsyncPrettyPrinter {
        public final /* synthetic */ DownloadingAsyncPrettyPrinterFactory this$0;
        public final /* synthetic */ Future val$response;
        public final /* synthetic */ MatchResult val$result;

        public AnonymousClass1(DownloadingAsyncPrettyPrinterFactory downloadingAsyncPrettyPrinterFactory, Future future, MatchResult matchResult) {
        }

        @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
        public PrettyPrinterDisplayType getPrettifiedType() {
        }

        @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
        public void printTo(PrintWriter printWriter, InputStream inputStream) throws IOException {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.network.DownloadingAsyncPrettyPrinterFactory$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements AsyncPrettyPrinter {
        public final /* synthetic */ String val$headerName;
        public final /* synthetic */ String val$headerValue;

        public AnonymousClass2(String str, String str2) {
        }

        @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
        public PrettyPrinterDisplayType getPrettifiedType() {
        }

        @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinter
        public void printTo(PrintWriter printWriter, InputStream inputStream) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MatchResult {
        private final PrettyPrinterDisplayType mDisplayType;
        private final String mSchemaUri;
        public final /* synthetic */ DownloadingAsyncPrettyPrinterFactory this$0;

        public MatchResult(DownloadingAsyncPrettyPrinterFactory downloadingAsyncPrettyPrinterFactory, String str, PrettyPrinterDisplayType prettyPrinterDisplayType) {
        }

        public PrettyPrinterDisplayType getDisplayType() {
        }

        public String getSchemaUri() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Request implements Callable<String> {
        private URL url;

        public Request(URL url) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ String call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call  reason: avoid collision after fix types in other method */
        public String call2() throws IOException {
        }
    }

    public static /* synthetic */ void access$000(PrintWriter printWriter, InputStream inputStream, String str) throws IOException {
    }

    private static void doErrorPrint(PrintWriter printWriter, InputStream inputStream, String str) throws IOException {
    }

    private static AsyncPrettyPrinter getErrorAsyncPrettyPrinter(String str, String str2) {
    }

    @Nullable
    private static URL parseURL(String str) {
    }

    public abstract void doPrint(PrintWriter printWriter, InputStream inputStream, String str) throws IOException;

    @Override // com.facebook.stetho.inspector.network.AsyncPrettyPrinterFactory
    public AsyncPrettyPrinter getInstance(String str, String str2) {
    }

    @Nullable
    public abstract MatchResult matchAndParseHeader(String str, String str2);
}
