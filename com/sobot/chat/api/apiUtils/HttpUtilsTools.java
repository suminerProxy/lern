package com.sobot.chat.api.apiUtils;

import com.sobot.chat.core.HttpUtils;
import java.io.IOException;
import java.util.Map;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HttpUtilsTools {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotRequestCallBack {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public static void doPost(String str, Map<String, String> map, HttpUtils.a aVar) {
    }

    public static Response doPostSync(Object obj, String str, Map<String, String> map) throws IOException {
    }

    public static void uploadFile(Object obj, String str, Map<String, String> map, String str2, HttpUtils.a aVar) {
    }

    public static void doPost(Object obj, String str, Map<String, String> map, HttpUtils.a aVar) {
    }
}
