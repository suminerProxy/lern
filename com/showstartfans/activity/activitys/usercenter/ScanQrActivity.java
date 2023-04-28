package com.showstartfans.activity.activitys.usercenter;

import android.content.Intent;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sunmi.scan.Image;
import com.sunmi.scan.ImageScanner;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.c.n0.j9;
import h.u.a.g.m4;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ScanQrActivity extends BaseNewActivity implements SurfaceHolder.Callback {
    private m4 b;
    private Camera c;

    /* renamed from: d  reason: collision with root package name */
    private SurfaceHolder f6374d;

    /* renamed from: e  reason: collision with root package name */
    private ImageScanner f6375e;

    /* renamed from: f  reason: collision with root package name */
    private j9 f6376f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6377g;

    /* renamed from: h  reason: collision with root package name */
    private int f6378h;

    /* renamed from: i  reason: collision with root package name */
    private Image f6379i;

    /* renamed from: j  reason: collision with root package name */
    private final StringBuilder f6380j;

    /* renamed from: k  reason: collision with root package name */
    private final Camera.PreviewCallback f6381k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScanQrActivity f6382a;

        public a(ScanQrActivity scanQrActivity) {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    public static /* synthetic */ void A(ScanQrActivity scanQrActivity) {
    }

    public static /* synthetic */ void B(ScanQrActivity scanQrActivity, String str) {
    }

    public static /* synthetic */ m4 C(ScanQrActivity scanQrActivity) {
    }

    private static byte[] D(int[] iArr, int i2, int i3) {
    }

    private void E() {
    }

    private /* synthetic */ void F(View view) {
    }

    private /* synthetic */ void H(View view) {
    }

    private /* synthetic */ void J(View view) {
    }

    private /* synthetic */ void L(View view) {
    }

    private void N() {
    }

    private void O() {
    }

    private void P(byte[] bArr, int i2, int i3) {
    }

    private void Q(String str) {
    }

    private void R() {
    }

    private void init() {
    }

    public static /* synthetic */ Image w(ScanQrActivity scanQrActivity) {
    }

    public static /* synthetic */ ImageScanner x(ScanQrActivity scanQrActivity) {
    }

    public static /* synthetic */ int y(ScanQrActivity scanQrActivity) {
    }

    public static /* synthetic */ StringBuilder z(ScanQrActivity scanQrActivity) {
    }

    public /* synthetic */ void G(View view) {
    }

    public /* synthetic */ void I(View view) {
    }

    public /* synthetic */ void K(View view) {
    }

    public /* synthetic */ void M(View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NonNull
    public View setContentViewResByViewBind() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
