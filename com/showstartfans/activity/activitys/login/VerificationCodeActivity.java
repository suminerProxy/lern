package com.showstartfans.activity.activitys.login;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.showstartfans.activity.base.BaseThirdLoginActivity;
import com.showstartfans.activity.model.UserInfoBean;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.widget.Toolbar;
import h.y.a.m.n;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VerificationCodeActivity extends BaseThirdLoginActivity implements TextWatcher {
    public static final String x = "third_bean";

    /* renamed from: o  reason: collision with root package name */
    private LoadImageView f5728o;

    /* renamed from: p  reason: collision with root package name */
    private Toolbar f5729p;
    private EditText q;
    private UserInfoBean r;
    private boolean s;
    private String t;
    private int u;
    private int v;
    private File w;

    private void c0(String str) {
    }

    private void d0() {
    }

    private void e0(UserInfoBean userInfoBean) {
    }

    private /* synthetic */ void f0(n nVar) {
    }

    private /* synthetic */ void h0(View view) {
    }

    private /* synthetic */ void j0(n nVar) {
    }

    private void l0(String str) {
    }

    private void n0(File file) {
    }

    @Override // com.showstartfans.activity.base.BaseSendCodeActivity
    public void I() {
    }

    @Override // com.showstartfans.activity.base.BaseSendCodeActivity
    public void K(boolean z) {
    }

    public void OnBindClick(View view) {
    }

    @Override // com.showstartfans.activity.base.BaseThirdLoginActivity
    public void X(String str, String str2, int i2, String str3, UserInfoBean userInfoBean) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public /* synthetic */ void g0(n nVar) {
    }

    public /* synthetic */ void i0(View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.showstartfans.activity.base.BaseSendCodeActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    public /* synthetic */ void k0(n nVar) {
    }

    public void m0(String str) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
