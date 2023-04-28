package com.showstartfans.activity.activitys.other;

import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.showstartfans.activity.eventmodel.RefreshSearchEvent;
import com.showstartfans.activity.model.SearchTagBean;
import com.showstartfans.activity.widget.citylist.HeadSearchView;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.u.a.c.h0.n4;
import h.y.a.m.n;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SearchListActivity extends BaseNoToolBarActivity {
    public HeadSearchView b;
    private View c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f6010d;

    /* renamed from: e  reason: collision with root package name */
    private String f6011e;

    /* renamed from: f  reason: collision with root package name */
    private String f6012f;

    /* renamed from: g  reason: collision with root package name */
    private n4 f6013g;

    /* renamed from: h  reason: collision with root package name */
    private int f6014h;

    private void A() {
    }

    private void B() {
    }

    private /* synthetic */ void C(n4 n4Var, String str, AdapterView adapterView, View view, int i2, long j2) {
    }

    private /* synthetic */ void E(n nVar) {
    }

    private /* synthetic */ void G() {
    }

    private /* synthetic */ void I() {
    }

    private /* synthetic */ boolean K(View view, int i2, KeyEvent keyEvent) {
    }

    private /* synthetic */ void M(CharSequence charSequence) {
    }

    private /* synthetic */ void O(View view, View view2) {
    }

    private void w(n nVar) {
    }

    private AdapterView.OnItemClickListener z(String str, n4 n4Var) {
    }

    public /* synthetic */ void D(n4 n4Var, String str, AdapterView adapterView, View view, int i2, long j2) {
    }

    public /* synthetic */ void F(n nVar) {
    }

    public /* synthetic */ void H() {
    }

    public /* synthetic */ void J() {
    }

    public /* synthetic */ boolean L(View view, int i2, KeyEvent keyEvent) {
    }

    public /* synthetic */ void N(CharSequence charSequence) {
    }

    public /* synthetic */ void P(View view, View view2) {
    }

    public void Q() {
    }

    public void R() {
    }

    public void S(String str) {
    }

    public void T(String str) {
    }

    public void U(String str, String str2, boolean z) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(RefreshSearchEvent refreshSearchEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public void x() {
    }

    public List<SearchTagBean> y() {
    }
}
