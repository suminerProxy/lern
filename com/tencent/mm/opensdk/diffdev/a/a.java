package com.tencent.mm.opensdk.diffdev.a;

import android.os.Handler;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a implements IDiffDevOAuth {

    /* renamed from: a  reason: collision with root package name */
    private Handler f12871a;
    private List<OAuthListener> b;
    private b c;

    /* renamed from: d  reason: collision with root package name */
    private OAuthListener f12872d;

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class C0208a implements OAuthListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12873a;

        /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC0209a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ C0208a f12874a;

            public RunnableC0209a(C0208a c0208a) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public C0208a(a aVar) {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
        }
    }

    public static /* synthetic */ b a(a aVar, b bVar) {
    }

    public static /* synthetic */ List a(a aVar) {
    }

    public static /* synthetic */ Handler b(a aVar) {
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
    }
}
