package com.tencent.cloud.huiyansdkface.facelight.process;

import android.content.Context;
import android.os.Bundle;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyLoginListener;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyResultListener;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbFaceVerifyInitCusSdkCallback;
import com.tencent.cloud.huiyansdkface.facelight.config.cdn.WbUiTips;
import com.tencent.cloud.huiyansdkface.facelight.net.LoginRequest;
import com.tencent.cloud.huiyansdkface.wehttp2.WeOkHttp;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f10337a;
    private WbCloudFaceVerifyResultListener b;
    private WbCloudFaceVerifyLoginListener c;

    /* renamed from: d  reason: collision with root package name */
    private WbFaceVerifyInitCusSdkCallback f10338d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10339e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10340f;

    /* renamed from: g  reason: collision with root package name */
    private String f10341g;

    /* renamed from: h  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.facelight.config.cdn.c f10342h;

    /* renamed from: i  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.facelight.config.cdn.b f10343i;

    /* renamed from: j  reason: collision with root package name */
    private com.tencent.cloud.huiyansdkface.facelight.config.a.a f10344j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10345k;

    /* renamed from: l  reason: collision with root package name */
    private int f10346l;

    /* renamed from: m  reason: collision with root package name */
    private int f10347m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10348n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10349o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10350p;
    private boolean q;
    private int r;
    private String s;
    private boolean t;
    private boolean u;
    private com.tencent.cloud.huiyansdkface.facelight.b.b.b v;
    private com.tencent.cloud.huiyansdkface.facelight.b.c w;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.d$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements WeReq.Callback<LoginRequest.LoginResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10351a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f10352d;

        public AnonymousClass1(d dVar, Context context, String str, String str2) {
        }

        public void a(WeReq weReq, LoginRequest.LoginResponse loginResponse) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFailed(WeReq weReq, WeReq.ErrType errType, int i2, String str, IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onFinish() {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public void onStart(WeReq weReq) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeReq.Callback, com.tencent.cloud.huiyansdkface.wehttp2.WeReq.InnerCallback
        public /* synthetic */ void onSuccess(WeReq weReq, Object obj) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.d$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends com.tencent.cloud.huiyansdkface.facelight.b.b.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10353a;
        public final /* synthetic */ d b;

        public AnonymousClass2(d dVar, long j2, long j3, Context context) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.b.b.b
        public void a(long j2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.process.d$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements com.tencent.cloud.huiyansdkface.facelight.config.cdn.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10354a;
        public final /* synthetic */ d b;

        public AnonymousClass3(d dVar, Context context) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.config.cdn.a
        public void a() {
        }
    }

    private void A() {
    }

    private void B() {
    }

    private void C() {
    }

    private String D() {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.config.cdn.b a(d dVar, com.tencent.cloud.huiyansdkface.facelight.config.cdn.b bVar) {
    }

    private void a(Context context, long j2) {
    }

    private void a(Context context, String str) {
    }

    private void a(Context context, String str, String str2) {
    }

    private void a(Context context, String str, String str2, String str3) {
    }

    private void a(Context context, String str, String str2, String str3, boolean z) {
    }

    private void a(Context context, boolean z, Bundle bundle, WbFaceVerifyInitCusSdkCallback wbFaceVerifyInitCusSdkCallback, WbCloudFaceVerifyLoginListener wbCloudFaceVerifyLoginListener) {
    }

    public static /* synthetic */ void a(d dVar, Context context) {
    }

    public static /* synthetic */ void a(d dVar, Context context, long j2) {
    }

    public static /* synthetic */ void a(d dVar, Context context, String str, String str2) {
    }

    private boolean a(Context context) {
    }

    private boolean a(Context context, Map<String, Object> map) {
    }

    public static /* synthetic */ boolean a(d dVar) {
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.config.a.a b(d dVar) {
    }

    private void b(Context context, String str, String str2, String str3) {
    }

    private boolean b(Context context) {
    }

    public static /* synthetic */ boolean b(d dVar, boolean z) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.b.c c(d dVar) {
    }

    private void c(Context context) {
    }

    public static /* synthetic */ boolean c(d dVar, boolean z) {
    }

    private void d(Context context) {
    }

    public static /* synthetic */ boolean d(d dVar) {
    }

    public static /* synthetic */ boolean d(d dVar, boolean z) {
    }

    private void e(Context context) {
    }

    public static /* synthetic */ boolean e(d dVar) {
    }

    public static /* synthetic */ WbCloudFaceVerifyLoginListener f(d dVar) {
    }

    public static /* synthetic */ com.tencent.cloud.huiyansdkface.facelight.config.cdn.c g(d dVar) {
    }

    public static d y() {
    }

    public WeOkHttp a() {
    }

    public void a(int i2) {
    }

    public void a(Context context, Bundle bundle, WbCloudFaceVerifyLoginListener wbCloudFaceVerifyLoginListener) {
    }

    public void a(Context context, Bundle bundle, WbFaceVerifyInitCusSdkCallback wbFaceVerifyInitCusSdkCallback) {
    }

    public void a(Context context, WbCloudFaceVerifyResultListener wbCloudFaceVerifyResultListener) {
    }

    public void a(Context context, String str, Properties properties) {
    }

    public void a(Context context, Map<String, Object> map, WbCloudFaceVerifyResultListener wbCloudFaceVerifyResultListener) {
    }

    public void a(boolean z) {
    }

    public void b(Context context, Bundle bundle, WbCloudFaceVerifyLoginListener wbCloudFaceVerifyLoginListener) {
    }

    public void b(boolean z) {
    }

    public boolean b() {
    }

    public com.tencent.cloud.huiyansdkface.facelight.config.cdn.b c() {
    }

    public void c(boolean z) {
    }

    public WbUiTips d() {
    }

    public boolean e() {
    }

    public void f() {
    }

    public int g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public String k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public boolean o() {
    }

    public int p() {
    }

    public int q() {
    }

    public void r() {
    }

    public boolean s() {
    }

    public boolean t() {
    }

    public boolean u() {
    }

    public String v() {
    }

    public com.tencent.cloud.huiyansdkface.facelight.config.a.a w() {
    }

    public WbCloudFaceVerifyResultListener x() {
    }

    public void z() {
    }
}
