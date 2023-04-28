package com.sobot.chat.core;

import com.sobot.network.http.callback.StringCallback;
import com.sobot.network.http.download.SobotDownloadTask;
import com.sobot.network.http.request.RequestCall;
import com.sobot.network.http.upload.SobotUploadTask;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HttpUtils {
    private static HttpUtils client;

    /* renamed from: com.sobot.chat.core.HttpUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends StringCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7611a;
        public final /* synthetic */ a b;
        public final /* synthetic */ HttpUtils c;

        public AnonymousClass1(HttpUtils httpUtils, String str, a aVar) {
        }

        public void a(String str) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* synthetic */ void onResponse(String str) {
        }
    }

    /* renamed from: com.sobot.chat.core.HttpUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends com.sobot.network.http.callback.FileCallBack {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FileCallBack f7612a;
        public final /* synthetic */ HttpUtils b;

        public AnonymousClass2(HttpUtils httpUtils, String str, FileCallBack fileCallBack) {
        }

        public void a(File file) {
        }

        @Override // com.sobot.network.http.callback.FileCallBack
        public void inProgress(float f2, long j2) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* synthetic */ void onResponse(File file) {
        }
    }

    /* renamed from: com.sobot.chat.core.HttpUtils$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends StringCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f7613a;
        public final /* synthetic */ HttpUtils b;

        public AnonymousClass3(HttpUtils httpUtils, a aVar) {
        }

        public void a(String str) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void inProgress(float f2) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* synthetic */ void onResponse(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface FileCallBack {
        void inProgress(int i2);

        void onError(Exception exc, String str, int i2);

        void onResponse(File file);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(int i2);

        void a(Exception exc, String str, int i2);

        void a(String str);
    }

    private HttpUtils() {
    }

    public static String encode(String str) {
    }

    public static HttpUtils getInstance() {
    }

    private void printLog(String str, Map<String, String> map) {
    }

    public SobotDownloadTask addDownloadFileTask(String str, String str2, String str3, Map<String, String> map) {
    }

    public SobotUploadTask addUploadFileTask(String str, String str2, Map<String, String> map, String str3, String str4) {
    }

    public void cancelTag(Object obj) {
    }

    public void doPost(Object obj, String str, Map<String, String> map, a aVar) {
    }

    public Response doPostSync(Object obj, String str, Map<String, String> map) throws IOException {
    }

    public void download(String str, File file, Map<String, String> map, FileCallBack fileCallBack) {
    }

    public RequestCall obtainGetRequest(String str, Map<String, String> map) {
    }

    public void uploadFile(Object obj, String str, Map<String, String> map, String str2, a aVar) {
    }
}
