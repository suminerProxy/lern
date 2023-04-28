package com.umeng.commonsdk.stateless;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMSLEnvelopeBuild {
    private static final String TAG = "UMSLEnvelopeBuild";
    private static boolean isEncryptEnabled;
    public static Context mContext;
    public static String module;

    /* renamed from: com.umeng.commonsdk.stateless.UMSLEnvelopeBuild$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15243a;
        public final /* synthetic */ UMSLEnvelopeBuild b;

        public AnonymousClass1(UMSLEnvelopeBuild uMSLEnvelopeBuild, Context context) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
    }

    public static void setEncryptEnabled(boolean z) {
    }

    public JSONObject buildSLBaseHeader(Context context) {
    }

    public JSONObject buildSLEnvelope(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
    }
}
