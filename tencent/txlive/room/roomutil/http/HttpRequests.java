package tencent.txlive.room.roomutil.http;

import androidx.annotation.Nullable;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import tencent.txlive.room.roomutil.http.HttpResponse;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HttpRequests {
    private static final MediaType MEDIA_JSON = null;
    private final String domain;
    private HeartBeatCallback heartBeatCallback;
    private final OkHttpClient okHttpClient;
    private String token;
    private String userID;

    /* renamed from: tencent.txlive.room.roomutil.http.HttpRequests$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ HttpRequests this$0;

        public AnonymousClass1(HttpRequests httpRequests) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: tencent.txlive.room.roomutil.http.HttpRequests$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 implements Callback {
        public final /* synthetic */ HttpRequests this$0;
        public final /* synthetic */ OnResponseCallback val$callback;
        public final /* synthetic */ Class val$rClass;

        public AnonymousClass2(HttpRequests httpRequests, OnResponseCallback onResponseCallback, Class cls) {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface HeartBeatCallback {
        void onHeartBeatResponse(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class JsonBuilder {
        private JSONObject obj;
        public final /* synthetic */ HttpRequests this$0;

        public JsonBuilder(HttpRequests httpRequests) {
        }

        public String build() {
        }

        public JsonBuilder put(String str, int i2) throws JSONException {
        }

        public JsonBuilder put(String str, long j2) throws JSONException {
        }

        public JsonBuilder put(String str, double d2) throws JSONException {
        }

        public JsonBuilder put(String str, String str2) throws JSONException {
        }

        public JsonBuilder put(String str, JSONObject jSONObject) throws JSONException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface OnResponseCallback<T> {
        void onResponse(int i2, @Nullable String str, @Nullable T t);
    }

    public HttpRequests(String str) {
    }

    private /* synthetic */ void a(OnResponseCallback onResponseCallback, int i2, String str, HttpResponse.LoginResponse loginResponse) {
    }

    public static /* synthetic */ OkHttpClient access$000(HttpRequests httpRequests) {
    }

    private String getRequestUrl(String str) {
    }

    private <R extends HttpResponse> void request(Request request, Class<R> cls, OnResponseCallback<R> onResponseCallback) {
    }

    public void addAudience(String str, String str2, String str3, OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public void addPusher(String str, String str2, String str3, String str4, String str5, OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public /* synthetic */ void b(OnResponseCallback onResponseCallback, int i2, String str, HttpResponse.LoginResponse loginResponse) {
    }

    public void cancelAllRequests() {
    }

    public void createRoom(String str, String str2, String str3, String str4, String str5, OnResponseCallback<HttpResponse.CreateRoom> onResponseCallback) {
    }

    public void delAudience(String str, String str2, OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public void delPusher(String str, String str2, OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public void destroyRoom(String str, String str2, OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public void getAudienceList(String str, OnResponseCallback<HttpResponse.AudienceList> onResponseCallback) {
    }

    public void getCustomInfo(String str, OnResponseCallback<HttpResponse.GetCustomInfoResponse> onResponseCallback) {
    }

    public void getPushUrl(String str, String str2, OnResponseCallback<HttpResponse.PushUrl> onResponseCallback) {
    }

    public void getPushers(String str, OnResponseCallback<HttpResponse.PusherList> onResponseCallback) {
    }

    public void getRoomList(int i2, int i3, OnResponseCallback<HttpResponse.RoomList> onResponseCallback) {
    }

    public boolean heartBeat(String str, String str2, int i2) {
    }

    public void login(long j2, String str, String str2, String str3, OnResponseCallback<HttpResponse.LoginResponse> onResponseCallback) {
    }

    public void logout(OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public void mergeStream(String str, String str2, JSONObject jSONObject, OnResponseCallback<HttpResponse.MergeStream> onResponseCallback) {
    }

    public void setCustomInfo(String str, String str2, String str3, Object obj, OnResponseCallback<HttpResponse> onResponseCallback) {
    }

    public void setHeartBeatCallback(HeartBeatCallback heartBeatCallback) {
    }

    public void setToken(String str) {
    }

    public void setUserID(String str) {
    }

    public void createRoom(String str, String str2, String str3, OnResponseCallback<HttpResponse.CreateRoom> onResponseCallback) {
    }
}
