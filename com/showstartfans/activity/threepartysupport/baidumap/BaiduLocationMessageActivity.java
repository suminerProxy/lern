package com.showstartfans.activity.threepartysupport.baidumap;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.c.h0.p4;
import java.util.List;
import kotlin.Unit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BaiduLocationMessageActivity extends BaseNewActivity {
    public List<PoiInfo> b;
    public PoiInfo c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6544d;

    /* renamed from: e  reason: collision with root package name */
    private MapView f6545e;

    /* renamed from: f  reason: collision with root package name */
    private BaiduMap f6546f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f6547g;

    /* renamed from: h  reason: collision with root package name */
    private double f6548h;

    /* renamed from: i  reason: collision with root package name */
    private double f6549i;

    /* renamed from: j  reason: collision with root package name */
    private LatLng f6550j;

    /* renamed from: k  reason: collision with root package name */
    private String f6551k;

    /* renamed from: l  reason: collision with root package name */
    private LocationClient f6552l;

    /* renamed from: m  reason: collision with root package name */
    private Point f6553m;

    /* renamed from: n  reason: collision with root package name */
    private GeoCoder f6554n;

    /* renamed from: o  reason: collision with root package name */
    public BDLocationListener f6555o;

    /* renamed from: p  reason: collision with root package name */
    private ListView f6556p;
    private p4 q;
    public OnGetGeoCoderResultListener r;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements BDLocationListener {
        public final /* synthetic */ BaiduLocationMessageActivity b;

        public a(BaiduLocationMessageActivity baiduLocationMessageActivity) {
        }

        @Override // com.baidu.location.BDLocationListener
        public void onReceiveLocation(BDLocation bDLocation) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements OnGetGeoCoderResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaiduLocationMessageActivity f6557a;

        public b(BaiduLocationMessageActivity baiduLocationMessageActivity) {
        }

        @Override // com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener
        public void onGetGeoCodeResult(GeoCodeResult geoCodeResult) {
        }

        @Override // com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener
        public void onGetReverseGeoCodeResult(ReverseGeoCodeResult reverseGeoCodeResult) {
        }
    }

    public static /* synthetic */ double A(BaiduLocationMessageActivity baiduLocationMessageActivity, double d2) {
    }

    public static /* synthetic */ String B(BaiduLocationMessageActivity baiduLocationMessageActivity, String str) {
    }

    public static /* synthetic */ BaiduMap C(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ LatLng D(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ LatLng E(BaiduLocationMessageActivity baiduLocationMessageActivity, LatLng latLng) {
    }

    public static /* synthetic */ Point F(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ GeoCoder G(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ LocationClient H(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    @SuppressLint({"CheckResult"})
    private void I() {
    }

    private void J() {
    }

    private /* synthetic */ void K(Boolean bool) throws Exception {
    }

    private /* synthetic */ void M(AdapterView adapterView, View view, int i2, long j2) {
    }

    private /* synthetic */ Unit O() {
    }

    private /* synthetic */ void Q(int i2, View view) {
    }

    private /* synthetic */ Unit S() {
    }

    private /* synthetic */ void U(MotionEvent motionEvent) {
    }

    private void W() {
    }

    private void X() {
    }

    public static /* synthetic */ MapView w(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ ListView x(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ p4 y(BaiduLocationMessageActivity baiduLocationMessageActivity) {
    }

    public static /* synthetic */ double z(BaiduLocationMessageActivity baiduLocationMessageActivity, double d2) {
    }

    public /* synthetic */ void L(Boolean bool) {
    }

    public /* synthetic */ void N(AdapterView adapterView, View view, int i2, long j2) {
    }

    public /* synthetic */ Unit P() {
    }

    public /* synthetic */ void R(int i2, View view) {
    }

    public /* synthetic */ Unit T() {
    }

    public /* synthetic */ void V(MotionEvent motionEvent) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
