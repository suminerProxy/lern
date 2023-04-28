package com.tencent.captchasdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.tencent.captchasdk.e;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TCaptchaDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f9999a;
    private String b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private b f10000d;

    /* renamed from: e  reason: collision with root package name */
    private String f10001e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f10002f;

    /* renamed from: g  reason: collision with root package name */
    private TCaptchaVerifyListener f10003g;

    /* renamed from: h  reason: collision with root package name */
    private e f10004h;

    /* renamed from: i  reason: collision with root package name */
    private e.a f10005i;

    /* renamed from: com.tencent.captchasdk.TCaptchaDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TCaptchaDialog f10006a;

        public AnonymousClass1(TCaptchaDialog tCaptchaDialog) {
        }

        @Override // com.tencent.captchasdk.e.a
        public void a(int i2, int i3) {
        }

        @Override // com.tencent.captchasdk.e.a
        public void a(int i2, String str) {
        }

        @Override // com.tencent.captchasdk.e.a
        public void a(String str) {
        }
    }

    public TCaptchaDialog(@NonNull Context context, int i2, String str, TCaptchaVerifyListener tCaptchaVerifyListener, String str2) {
    }

    public TCaptchaDialog(@NonNull Context context, String str, TCaptchaVerifyListener tCaptchaVerifyListener, String str2) {
    }

    public TCaptchaDialog(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener, String str, TCaptchaVerifyListener tCaptchaVerifyListener, String str2) {
    }

    public static /* synthetic */ TCaptchaVerifyListener a(TCaptchaDialog tCaptchaDialog) {
    }

    private void a(@NonNull Context context, String str, TCaptchaVerifyListener tCaptchaVerifyListener, String str2) {
    }

    public static /* synthetic */ b b(TCaptchaDialog tCaptchaDialog) {
    }

    public static /* synthetic */ float c(TCaptchaDialog tCaptchaDialog) {
    }

    public static /* synthetic */ RelativeLayout d(TCaptchaDialog tCaptchaDialog) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }
}
