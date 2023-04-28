package com.tencent.mm.opensdk.openapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import com.tencent.mm.opensdk.utils.ILog;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BaseWXApiImplV10 implements IWXAPI {
    public static final String TAG = "MicroMsg.SDK.WXApiImplV10";
    private static String wxappPayEntryClassname;
    public String appId;
    public boolean checkSignature;
    public Context context;
    public boolean detached;
    private int launchMode;
    private int wxSdkVersion;

    /* renamed from: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ BaseWXApiImplV10 this$0;
        public final /* synthetic */ CountDownLatch val$countDownWait;

        public AnonymousClass1(BaseWXApiImplV10 baseWXApiImplV10, CountDownLatch countDownLatch) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements PendingIntent.OnFinished {
        public final /* synthetic */ BaseWXApiImplV10 this$0;

        public AnonymousClass2(BaseWXApiImplV10 baseWXApiImplV10) {
        }

        @Override // android.app.PendingIntent.OnFinished
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i2, String str, Bundle bundle) {
        }
    }

    public BaseWXApiImplV10(Context context, String str, boolean z, int i2) {
    }

    public static /* synthetic */ int access$002(BaseWXApiImplV10 baseWXApiImplV10, int i2) {
    }

    private boolean checkSumConsistent(byte[] bArr, byte[] bArr2) {
    }

    private boolean createChatroom(Context context, Bundle bundle) {
    }

    private String finderShareVideoJumpInfoToString(IWXChannelJumpInfo iWXChannelJumpInfo) {
    }

    private String getTokenFromWX(Context context) {
    }

    private boolean handleWxInternalRespType(String str, IWXAPIEventHandler iWXAPIEventHandler) {
    }

    private boolean joinChatroom(Context context, Bundle bundle) {
    }

    private void launchWXIfNeed() {
    }

    private void launchWXUsingPendingIntent() {
    }

    private boolean sendAddCardToWX(Context context, Bundle bundle) {
    }

    private boolean sendChooseCardFromWX(Context context, Bundle bundle) {
    }

    private boolean sendFinderOpenFeed(Context context, BaseReq baseReq) {
    }

    private boolean sendFinderOpenLive(Context context, BaseReq baseReq) {
    }

    private boolean sendFinderOpenProfile(Context context, BaseReq baseReq) {
    }

    private boolean sendFinderShareVideo(Context context, BaseReq baseReq) {
    }

    private boolean sendHandleScanResult(Context context, Bundle bundle) {
    }

    private boolean sendInvoiceAuthInsert(Context context, BaseReq baseReq) {
    }

    private boolean sendJumpToOfflinePayReq(Context context, Bundle bundle) {
    }

    private boolean sendLaunchWXMiniprogram(Context context, BaseReq baseReq) {
    }

    private boolean sendLaunchWXMiniprogramWithToken(Context context, BaseReq baseReq) {
    }

    private boolean sendNonTaxPay(Context context, BaseReq baseReq) {
    }

    private boolean sendOpenBusiLuckyMoney(Context context, Bundle bundle) {
    }

    private boolean sendOpenBusinessView(Context context, BaseReq baseReq) {
    }

    private boolean sendOpenBusinessWebview(Context context, BaseReq baseReq) {
    }

    private boolean sendOpenCustomerServiceChat(Context context, BaseReq baseReq) {
    }

    private boolean sendOpenRankListReq(Context context, Bundle bundle) {
    }

    private boolean sendOpenWebview(Context context, Bundle bundle) {
    }

    private boolean sendPayInSurance(Context context, BaseReq baseReq) {
    }

    private boolean sendPayReq(Context context, Bundle bundle) {
    }

    private boolean sendPreloadWXMiniProgramEnvironment(Context context, BaseReq baseReq) {
    }

    private boolean sendPreloadWXMiniprogram(Context context, BaseReq baseReq) {
    }

    private boolean sendQRCodePayReq(Context context, BaseReq baseReq) {
    }

    private boolean sendSubscribeMessage(Context context, BaseReq baseReq) {
    }

    private boolean sendSubscribeMiniProgramMsg(Context context, BaseReq baseReq) {
    }

    private boolean sendToWxaRedirectingPage(Context context, BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void detach() {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public int getWXAppSupportAPI() {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean isWXAppInstalled() {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean openWXApp() {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean registerApp(String str) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean registerApp(String str, long j2) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendReq(BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendResp(BaseResp baseResp) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void setLogImpl(ILog iLog) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void unregisterApp() {
    }
}
