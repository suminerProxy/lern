package com.showstartfans.activity.threepartysupport.baidumap;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapPoi;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.model.LatLng;
import com.showstartfans.activity.model.actdes.SiteBean;
import h.u.a.q.b.o;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BaiduRoutePlanActivity extends BaiduLocationActivity implements BaiduMap.OnMapClickListener, BaiduMap.OnMarkerClickListener {
    private TextView c;

    /* renamed from: d  reason: collision with root package name */
    private MapView f6558d;

    /* renamed from: e  reason: collision with root package name */
    private BaiduMap f6559e;

    /* renamed from: f  reason: collision with root package name */
    private o f6560f;

    /* renamed from: g  reason: collision with root package name */
    private float f6561g;

    /* renamed from: h  reason: collision with root package name */
    private BDLocation f6562h;

    /* renamed from: i  reason: collision with root package name */
    private int f6563i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f6564j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f6565k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f6566l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f6567m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f6568n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f6569o;

    /* renamed from: p  reason: collision with root package name */
    private FrameLayout f6570p;
    private SiteBean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;

    private Marker E(SiteBean siteBean) {
    }

    private double[] F(double d2, double d3) {
    }

    private void G() {
    }

    private void H() {
    }

    private boolean I(String str) {
    }

    private /* synthetic */ void J(float f2) {
    }

    private /* synthetic */ void L(View view) {
    }

    private /* synthetic */ void N(View view) {
    }

    private /* synthetic */ void P(double d2, double d3, String str, View view, String str2, int i2) {
    }

    private void R(LatLng latLng) {
    }

    private void S(SiteBean siteBean) {
    }

    private void T() {
    }

    private void U(SiteBean siteBean) {
    }

    private void V() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity
    public void C(BDLocation bDLocation, boolean z) {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity
    public void D(boolean z) {
    }

    public /* synthetic */ void K(float f2) {
    }

    public /* synthetic */ void M(View view) {
    }

    public /* synthetic */ void O(View view) {
    }

    public /* synthetic */ void Q(double d2, double d3, String str, View view, String str2, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity, com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapClickListener
    public void onMapClick(LatLng latLng) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMapClickListener
    public void onMapPoiClick(MapPoi mapPoi) {
    }

    @Override // com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    @Override // com.showstartfans.activity.threepartysupport.baidumap.BaiduLocationActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
