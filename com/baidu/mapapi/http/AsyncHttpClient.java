package com.baidu.mapapi.http;

import com.baidu.mapapi.http.HttpClient;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AsyncHttpClient {

    /* renamed from: a  reason: collision with root package name */
    private int f1502a;
    private int b;
    private ExecutorService c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class a implements Runnable {
        private a() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ a(com.baidu.mapapi.http.a aVar) {
        }
    }

    public static /* synthetic */ int a(AsyncHttpClient asyncHttpClient) {
    }

    public static /* synthetic */ int b(AsyncHttpClient asyncHttpClient) {
    }

    public void get(String str, HttpClient.ProtoResultCallback protoResultCallback) {
    }

    public boolean isAuthorized() {
    }
}
