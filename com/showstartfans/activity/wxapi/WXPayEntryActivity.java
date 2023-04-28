package com.showstartfans.activity.wxapi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import h.y.a.h.e;
import h.y.a.m.n;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WXPayEntryActivity extends BaseFixOTranslucentActivity implements IWXAPIEventHandler {

    /* renamed from: d  reason: collision with root package name */
    public static e f7516d;

    /* renamed from: e  reason: collision with root package name */
    public static String f7517e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f7518f;

    /* renamed from: g  reason: collision with root package name */
    public static String f7519g;

    /* renamed from: h  reason: collision with root package name */
    public static double f7520h;

    /* renamed from: i  reason: collision with root package name */
    public static int f7521i;
    private IWXAPI b;
    private a c;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WXPayEntryActivity f7522a;

        public a(WXPayEntryActivity wXPayEntryActivity) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static /* synthetic */ void w(WXPayEntryActivity wXPayEntryActivity) {
    }

    public static /* synthetic */ void x(n nVar) {
    }

    private void y() {
    }

    @Override // com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
    }
}
