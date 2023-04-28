package com.mobile.auth.gatewayauth;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import java.util.LinkedHashMap;
import java.util.List;

@Keep
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LoginAuthActivity extends Activity {
    public static final String EXIST = "exist";
    public static final String STOP_LOADING = "stop_loading";
    private String mAccessCode;
    private RelativeLayout mBodyDYVRL;
    private RelativeLayout mBodyRL;
    private boolean mIsDialog;
    private RelativeLayout mLoginRL;
    private TextView mLoginTV;
    private ImageView mLogoIV;
    private RelativeLayout mMainRelativeLayout;
    private TextView mMaskNumberTV;
    private RelativeLayout mNumberDYVRL;
    private String mNumberPhone;
    private RelativeLayout mNumberRL;
    private com.mobile.auth.s.a mPnsLogger;
    private com.mobile.auth.ac.a mProgressDialog;
    private String mProtocol;
    private List<com.mobile.auth.gatewayauth.ui.b> mProtocolConfigs;
    private RelativeLayout mProtocolRL;
    private CheckBox mProtocolSelectCB;
    private TextView mProtocolTV;
    private String mSlogan;
    private TextView mSloganTV;
    private TextView mSwitchTV;
    private RelativeLayout mTitleDYVRL;
    private RelativeLayout mTitleRL;
    private AuthUIConfig mUIConfig;
    private d mUIManager;
    private int mUIManagerID;
    private String mVendor;
    private String mVendorClick;
    private String mVendorProtocol;
    private long startTime;

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4834a;

        public AnonymousClass1(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f4835a;
        public final /* synthetic */ String b;
        public final /* synthetic */ LoginAuthActivity c;

        public AnonymousClass2(LoginAuthActivity loginAuthActivity, LinkedHashMap linkedHashMap, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f4836a;
        public final /* synthetic */ String b;
        public final /* synthetic */ LoginAuthActivity c;

        public AnonymousClass3(LoginAuthActivity loginAuthActivity, LinkedHashMap linkedHashMap, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4837a;

        public AnonymousClass4(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4838a;

        public AnonymousClass5(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4839a;

        public AnonymousClass6(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4840a;

        public AnonymousClass7(LoginAuthActivity loginAuthActivity) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass8 extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4841a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4842d;

        public AnonymousClass8(LoginAuthActivity loginAuthActivity, String str, String str2, int i2) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.mobile.auth.gatewayauth.LoginAuthActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass9 extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4843a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LoginAuthActivity f4844d;

        public AnonymousClass9(LoginAuthActivity loginAuthActivity, String str, String str2, int i2) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public static /* synthetic */ RelativeLayout access$000(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ d access$100(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ void access$200(LoginAuthActivity loginAuthActivity, boolean z, String str, String str2) {
    }

    public static /* synthetic */ boolean access$300(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ AuthUIConfig access$400(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ CheckBox access$500(LoginAuthActivity loginAuthActivity) {
    }

    public static /* synthetic */ com.mobile.auth.s.a access$600(LoginAuthActivity loginAuthActivity) {
    }

    private boolean checkAuthPageUILegal() {
    }

    private SpannableString dealProtocol(String str, List<com.mobile.auth.gatewayauth.ui.b> list) {
    }

    private void finishAuthPage(boolean z, String str, String str2) {
    }

    private native ClickableSpan getProtocol(String str, String str2, int i2);

    private ClickableSpan getVendorProtocol(String str, String str2, int i2) {
    }

    @SafeProtector
    private native void init();

    @SafeProtector
    private native RelativeLayout initBodyView();

    @SafeProtector
    private native void initDynamicView();

    @SafeProtector
    private native RelativeLayout initLoginRL();

    @SafeProtector
    private native ImageView initLogoView();

    @SafeProtector
    private native void initMaskNumberDynamicView();

    @SafeProtector
    private native RelativeLayout initNumberView();

    @SafeProtector
    private native RelativeLayout initProtocolView();

    @SafeProtector
    private native TextView initSloganView();

    @SafeProtector
    private native TextView initSwitchView();

    @SafeProtector
    private native RelativeLayout initTitleView();

    @SafeProtector
    private native void initView();

    @SafeProtector
    private native void initXMLDynamicView();

    @SafeProtector
    private native void removeDynamicView();

    @SafeProtector
    private native void removeNumberView();

    private void setDialogBackGroundAlpha(float f2) {
    }

    private void xmlLoadErrorCB() {
    }

    public int getUIManagerID() {
    }

    public void hideLoadingDialog() {
    }

    @Override // android.app.Activity
    @SafeProtector
    public native void onActivityResult(int i2, int i3, Intent intent);

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    @SafeProtector
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    public void showLoadingDialog() {
    }
}
