package com.tencent.android.tpush.common;

import android.content.Context;
import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.tpns.baseapi.core.net.HttpRequestCallback;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a {

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.common.a$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements HttpRequestCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ XGIOperateCallback f8659a;

        public AnonymousClass1(XGIOperateCallback xGIOperateCallback) {
        }

        @Override // com.tencent.tpns.baseapi.core.net.HttpRequestCallback
        public void onFailure(int i2, String str) {
        }

        @Override // com.tencent.tpns.baseapi.core.net.HttpRequestCallback
        public void onSuccess(String str) {
        }
    }

    public static String a(String str) {
    }

    public static void a(Context context, String str, long j2, int i2, XGIOperateCallback xGIOperateCallback) {
    }

    private static JSONObject a(Context context, String str, long j2, int i2) {
    }
}
