package com.tencent.cloud.huiyansdkface.facelight.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.cloud.huiyansdkface.facelight.b.b.e;
import com.tencent.cloud.huiyansdkface.facelight.net.AuthUploadRequest;
import com.tencent.cloud.huiyansdkface.facelight.process.d;
import com.tencent.cloud.huiyansdkface.facelight.ui.widget.c;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FaceGuideActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static int f10355a;
    private d b;
    private e c;

    /* renamed from: d  reason: collision with root package name */
    private c f10356d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f10357e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f10358f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f10359g;

    /* renamed from: h  reason: collision with root package name */
    private CheckBox f10360h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f10361i;

    /* renamed from: j  reason: collision with root package name */
    private RelativeLayout f10362j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f10363k;

    /* renamed from: l  reason: collision with root package name */
    private LinearLayout f10364l;

    /* renamed from: m  reason: collision with root package name */
    private LinearLayout f10365m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f10366n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f10367o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f10368p;
    private TextView q;
    private int r;
    private CountDownTimer s;
    private String t;
    private boolean u;
    private boolean v;
    private View.OnClickListener w;

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10369a;

        public AnonymousClass1(FaceGuideActivity faceGuideActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10370a;

        public AnonymousClass2(FaceGuideActivity faceGuideActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10371a;

        public AnonymousClass3(FaceGuideActivity faceGuideActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10372a;

        public AnonymousClass4(FaceGuideActivity faceGuideActivity) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10373a;

        public AnonymousClass5(FaceGuideActivity faceGuideActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10374a;

        public AnonymousClass6(FaceGuideActivity faceGuideActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements WeReq.Callback<AuthUploadRequest.AuthUploadResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10375a;

        public AnonymousClass7(FaceGuideActivity faceGuideActivity) {
        }

        public void a(WeReq weReq, AuthUploadRequest.AuthUploadResponse authUploadResponse) {
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

    /* renamed from: com.tencent.cloud.huiyansdkface.facelight.ui.FaceGuideActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FaceGuideActivity f10376a;

        public AnonymousClass8(FaceGuideActivity faceGuideActivity, long j2, long j3) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private d f10377a;
        private Activity b;

        public a(d dVar, Activity activity) {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.c.b
        public void a() {
        }

        @Override // com.tencent.cloud.huiyansdkface.facelight.ui.widget.c.b
        public void b() {
        }
    }

    private void a() {
    }

    public static /* synthetic */ boolean a(FaceGuideActivity faceGuideActivity) {
    }

    public static /* synthetic */ boolean a(FaceGuideActivity faceGuideActivity, boolean z) {
    }

    public static /* synthetic */ d b(FaceGuideActivity faceGuideActivity) {
    }

    private void b() {
    }

    public static /* synthetic */ boolean b(FaceGuideActivity faceGuideActivity, boolean z) {
    }

    private void c() {
    }

    public static /* synthetic */ void c(FaceGuideActivity faceGuideActivity) {
    }

    public static /* synthetic */ TextView d(FaceGuideActivity faceGuideActivity) {
    }

    private void d() {
    }

    private void e() {
    }

    public static /* synthetic */ void e(FaceGuideActivity faceGuideActivity) {
    }

    private void f() {
    }

    public static /* synthetic */ void f(FaceGuideActivity faceGuideActivity) {
    }

    public static /* synthetic */ CheckBox g(FaceGuideActivity faceGuideActivity) {
    }

    public static /* synthetic */ int h(FaceGuideActivity faceGuideActivity) {
    }

    public static /* synthetic */ int i(FaceGuideActivity faceGuideActivity) {
    }

    public static /* synthetic */ LinearLayout j(FaceGuideActivity faceGuideActivity) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    @Override // android.app.Activity
    public void onStart() {
    }

    @Override // android.app.Activity
    public void onStop() {
    }
}
