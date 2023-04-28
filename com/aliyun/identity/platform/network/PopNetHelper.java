package com.aliyun.identity.platform.network;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PopNetHelper {
    public static String HOST = "";
    private static final int MAX_TIME_OUT_CONNECT = 20;
    private static final int MAX_TIME_OUT_READ = 20;
    private static final int MAX_TIME_OUT_WRITE = 20;
    public static final int NET_EXCEPTION_CODE = -1;
    public static final int NET_RESPONSE_INVALID = -2;
    public static String appKey = "";

    /* renamed from: com.aliyun.identity.platform.network.PopNetHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Callback {
        public final /* synthetic */ Object val$param;
        public final /* synthetic */ PopNetCallback val$popNetCallback;

        public AnonymousClass1(PopNetCallback popNetCallback, Object obj) {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
        }
    }

    public static String computeSignature(Map<String, String> map, String str) throws Exception {
    }

    private static String encode(String str, String str2) throws UnsupportedEncodingException {
    }

    private static String formatIso8601Date(Date date) {
    }

    private static void httpPost(String str, Map<String, String> map, Object obj, PopNetCallback popNetCallback) {
    }

    public static void sendAsynRequest(String str, String str2, String str3, Map<String, String> map, Object obj, PopNetCallback popNetCallback) {
    }
}
