package com.sobot.network.apiUtils;

import android.content.Context;
import com.sobot.network.http.HttpUtils;
import java.io.IOException;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotHttpUtils {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotRequestCallBack {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public static void doGet(Object obj, String str, Map<String, String> map, HttpUtils.StringCallBack stringCallBack) {
    }

    public static void doPost(Object obj, String str, Map<String, String> map, HttpUtils.StringCallBack stringCallBack) {
    }

    public static void doPostByJsonString(Object obj, String str, Map<String, String> map, Map<String, String> map2, HttpUtils.StringCallBack stringCallBack) {
    }

    public static void doPostByString(Object obj, String str, Map<String, String> map, Map<String, String> map2, MediaType mediaType, HttpUtils.StringCallBack stringCallBack) {
    }

    public static Response doPostSync(Object obj, String str, Map<String, String> map, Map<String, String> map2) throws IOException {
    }

    public static void init(Context context) {
    }

    public static void uploadFile(Object obj, String str, Map<String, String> map, Map<String, String> map2, String str2, HttpUtils.StringCallBack stringCallBack) {
    }

    public static void doGet(Object obj, String str, Map<String, String> map, Map<String, String> map2, HttpUtils.StringCallBack stringCallBack) {
    }

    public static void doPost(Object obj, String str, Map<String, String> map, Map<String, String> map2, HttpUtils.StringCallBack stringCallBack) {
    }
}
