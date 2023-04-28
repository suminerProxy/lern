package com.showstartfans.activity.threepartysupport.baidumap;

import android.annotation.SuppressLint;
import android.view.View;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.taihebase.activity.base.BaseNewActivity;
import h.y.a.p.w.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaiduLocationActivity extends BaseNewActivity implements BDLocationListener {
    public LocationClient b;

    private /* synthetic */ void A(Boolean bool) throws Exception {
    }

    @SuppressLint({"CheckResult"})
    private void w() {
    }

    private void x() {
    }

    private /* synthetic */ void y(a aVar, View view) {
    }

    public /* synthetic */ void B(Boolean bool) {
    }

    public abstract void C(BDLocation bDLocation, boolean z);

    public abstract void D(boolean z);

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.baidu.location.BDLocationListener
    public void onReceiveLocation(BDLocation bDLocation) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    public /* synthetic */ void z(a aVar, View view) {
    }
}
