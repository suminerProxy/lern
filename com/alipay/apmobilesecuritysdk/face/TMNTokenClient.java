package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TMNTokenClient {

    /* renamed from: a  reason: collision with root package name */
    private static TMNTokenClient f574a;
    private Context b;

    /* renamed from: com.alipay.apmobilesecuritysdk.face.TMNTokenClient$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f575a;
        public final /* synthetic */ InitResultListener b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TMNTokenClient f576d;

        public AnonymousClass1(TMNTokenClient tMNTokenClient, Map map, InitResultListener initResultListener, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InitResultListener {
        void onResult(String str, int i2);
    }

    private TMNTokenClient(Context context) {
    }

    public static /* synthetic */ Context a(TMNTokenClient tMNTokenClient) {
    }

    public static TMNTokenClient getInstance(Context context) {
    }

    public void intiToken(String str, String str2, String str3, InitResultListener initResultListener) {
    }
}
