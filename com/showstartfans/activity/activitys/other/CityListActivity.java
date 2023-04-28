package com.showstartfans.activity.activitys.other;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewTreeObserver;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.showstartfans.activity.model.CityListItem;
import com.showstartfans.activity.model.CityLocalChildBean;
import com.showstartfans.activity.widget.citylist.HeadSearchView;
import com.showstartfans.activity.widget.citylist.PinnedSectionListView;
import com.showstartfans.activity.widget.citylist.QuickAlphabeticBar;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.u.a.c.h0.j4;
import h.u.a.c.h0.x4;
import h.u.a.l.h;
import h.y.a.m.n;
import i.a.d0;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CityListActivity extends BaseNoToolBarActivity implements h.u.a.l.a, x4 {

    /* renamed from: o  reason: collision with root package name */
    public static final String f5984o = "formId";
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private PinnedSectionListView f5985d;

    /* renamed from: e  reason: collision with root package name */
    private QuickAlphabeticBar f5986e;

    /* renamed from: f  reason: collision with root package name */
    private HeadSearchView f5987f;

    /* renamed from: g  reason: collision with root package name */
    private LocationClient f5988g;

    /* renamed from: h  reason: collision with root package name */
    private h f5989h;

    /* renamed from: i  reason: collision with root package name */
    private CityListItem f5990i;

    /* renamed from: j  reason: collision with root package name */
    private j4 f5991j;

    /* renamed from: k  reason: collision with root package name */
    private List<CityListItem> f5992k;

    /* renamed from: l  reason: collision with root package name */
    private List<CityListItem> f5993l;

    /* renamed from: m  reason: collision with root package name */
    private List<CityListItem> f5994m;

    /* renamed from: n  reason: collision with root package name */
    private List<CityLocalChildBean> f5995n;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ CityListActivity b;

        public a(CityListActivity cityListActivity) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    private List<CityListItem> A(String str) {
    }

    private void B() {
    }

    private void C() {
    }

    public static /* synthetic */ void D(CityListActivity cityListActivity) {
    }

    private /* synthetic */ void E(Boolean bool) throws Exception {
    }

    private /* synthetic */ void G(n nVar, d0 d0Var) throws Exception {
    }

    private /* synthetic */ void I(List list) throws Exception {
    }

    public static /* synthetic */ int K(CityListItem cityListItem, CityListItem cityListItem2) {
    }

    private /* synthetic */ void L(n nVar) {
    }

    private /* synthetic */ void N() {
    }

    private /* synthetic */ void P() {
    }

    private /* synthetic */ void R(CharSequence charSequence) {
    }

    private /* synthetic */ void T() throws Exception {
    }

    private /* synthetic */ Unit V() {
    }

    private /* synthetic */ Unit X(Boolean bool) {
    }

    private /* synthetic */ void Z(d0 d0Var) throws Exception {
    }

    private /* synthetic */ void b0(h.y.a.p.w.a aVar, View view) {
    }

    private void d0() {
    }

    private void f0() {
    }

    private void g0(CharSequence charSequence) {
    }

    private void h0() {
    }

    private void i0() {
    }

    public static /* synthetic */ QuickAlphabeticBar w(CityListActivity cityListActivity) {
    }

    @SuppressLint({"CheckResult"})
    private void x() {
    }

    private void y(List<CityListItem> list) {
    }

    @SuppressLint({"CheckResult"})
    private void z(n nVar) {
    }

    public /* synthetic */ void F(Boolean bool) {
    }

    public /* synthetic */ void H(n nVar, d0 d0Var) {
    }

    public /* synthetic */ void J(List list) {
    }

    public /* synthetic */ void M(n nVar) {
    }

    public /* synthetic */ void O() {
    }

    public /* synthetic */ void Q() {
    }

    public /* synthetic */ void S(CharSequence charSequence) {
    }

    public /* synthetic */ void U() {
    }

    public /* synthetic */ Unit W() {
    }

    public /* synthetic */ Unit Y(Boolean bool) {
    }

    @Override // h.u.a.c.h0.x4
    public void a(boolean z) {
    }

    public /* synthetic */ void a0(d0 d0Var) {
    }

    public /* synthetic */ void c0(h.y.a.p.w.a aVar, View view) {
    }

    public List<CityLocalChildBean> e0() {
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

    @Override // com.taihebase.activity.base.BaseNoToolBarActivity, com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // h.u.a.l.a
    public void onReceiveLocation(@Nullable BDLocation bDLocation) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
