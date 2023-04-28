package com.sobot.network.http;

import com.sobot.network.http.callback.StringCallback;
import com.sobot.network.http.download.SobotDownloadTask;
import com.sobot.network.http.request.RequestCall;
import com.sobot.network.http.upload.SobotUploadTask;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HttpUtils {
    private static HttpUtils client;

    /* renamed from: com.sobot.network.http.HttpUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends StringCallback {
        public final /* synthetic */ HttpUtils this$0;
        public final /* synthetic */ StringCallBack val$callback;
        public final /* synthetic */ String val$url_str;

        public AnonymousClass1(HttpUtils httpUtils, String str, StringCallBack stringCallBack) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* bridge */ /* synthetic */ void onResponse(String str) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(String str) {
        }
    }

    /* renamed from: com.sobot.network.http.HttpUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends StringCallback {
        public final /* synthetic */ HttpUtils this$0;
        public final /* synthetic */ StringCallBack val$callback;
        public final /* synthetic */ String val$url_str;

        public AnonymousClass2(HttpUtils httpUtils, String str, StringCallBack stringCallBack) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* bridge */ /* synthetic */ void onResponse(String str) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(String str) {
        }
    }

    /* renamed from: com.sobot.network.http.HttpUtils$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends StringCallback {
        public final /* synthetic */ HttpUtils this$0;
        public final /* synthetic */ StringCallBack val$callback;
        public final /* synthetic */ String val$url_str;

        public AnonymousClass3(HttpUtils httpUtils, String str, StringCallBack stringCallBack) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* bridge */ /* synthetic */ void onResponse(String str) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(String str) {
        }
    }

    /* renamed from: com.sobot.network.http.HttpUtils$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends com.sobot.network.http.callback.FileCallBack {
        public final /* synthetic */ HttpUtils this$0;
        public final /* synthetic */ FileCallBack val$callback;

        public AnonymousClass4(HttpUtils httpUtils, String str, FileCallBack fileCallBack) {
        }

        @Override // com.sobot.network.http.callback.FileCallBack
        public void inProgress(float f2, long j2) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* bridge */ /* synthetic */ void onResponse(File file) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(File file) {
        }
    }

    /* renamed from: com.sobot.network.http.HttpUtils$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 extends StringCallback {
        public final /* synthetic */ HttpUtils this$0;
        public final /* synthetic */ StringCallBack val$callback;

        public AnonymousClass5(HttpUtils httpUtils, StringCallBack stringCallBack) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void inProgress(float f2) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public void onError(Call call, Exception exc) {
        }

        @Override // com.sobot.network.http.callback.Callback
        public /* bridge */ /* synthetic */ void onResponse(String str) {
        }

        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
        public void onResponse2(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface FileCallBack {
        void inProgress(int i2);

        void onError(Exception exc, String str, int i2);

        void onResponse(File file);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface StringCallBack {
        void inProgress(int i2);

        void onError(Exception exc, String str, int i2);

        void onResponse(String str);
    }

    private HttpUtils() {
    }

    public static HttpUtils getInstance() {
    }

    public static String map2Json(Map<String, String> map) {
    }

    private void printLog(String str, Map<String, String> map) {
    }

    public SobotDownloadTask addDownloadFileTask(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
    }

    public SobotUploadTask addUploadFileTask(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, String str4) {
    }

    public void doGet(Object obj, String str, Map<String, String> map, Map<String, String> map2, StringCallBack stringCallBack) {
    }

    public void doPost(Object obj, String str, Map<String, String> map, Map<String, String> map2, StringCallBack stringCallBack) {
    }

    public void doPostByJsonString(Object obj, String str, Map<String, String> map, Map<String, String> map2, StringCallBack stringCallBack) {
    }

    public void doPostByString(Object obj, String str, Map<String, String> map, Map<String, String> map2, MediaType mediaType, StringCallBack stringCallBack) {
    }

    public Response doPostSync(Object obj, String str, Map<String, String> map, Map<String, String> map2) throws IOException {
    }

    public void download(String str, File file, FileCallBack fileCallBack) {
    }

    public RequestCall obtainGetRequest(String str, Map<String, String> map, Map<String, String> map2) {
    }

    public void uploadFile(Object obj, String str, Map<String, String> map, Map<String, String> map2, String str2, StringCallBack stringCallBack) {
    }
}
