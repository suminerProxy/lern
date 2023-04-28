package com.showstartfans.activity.activitys.crowd;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.model.CrowdDetailBean;
import com.showstartfans.activity.view.AnnouncementView;
import com.showstartfans.activity.view.VideoFullView;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.widget.Toolbar;
import h.u.a.c.k0.e2;
import h.u.a.w.c0.r2;
import h.u.a.w.d0.w2;
import h.y.a.m.n;
import h.y.a.p.q;
import java.util.List;
import kotlin.Unit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CrowdDetailActivity extends BaseNoToolBarActivity implements w2, View.OnClickListener, SceneRestorable {
    private VideoFullView A;
    private RelativeLayout B;
    private FrameLayout C;
    private Toolbar D;
    private LinearLayout E;
    private String F;
    private CrowdDetailBean G;
    private r2 H;
    private int I;
    private TextView b;
    private LoadImageView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f5398d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f5399e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f5400f;

    /* renamed from: g  reason: collision with root package name */
    private ProgressBar f5401g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f5402h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f5403i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f5404j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f5405k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f5406l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f5407m;

    /* renamed from: n  reason: collision with root package name */
    private LoadImageView f5408n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f5409o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f5410p;
    private TextView q;
    private BridgeWebView r;
    private NestedScrollView s;
    private View t;
    private RelativeLayout u;
    private View v;
    private View w;
    private AnnouncementView x;
    private ImageView y;
    private ImageView z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CrowdDetailActivity f5411a;

        public a(CrowdDetailActivity crowdDetailActivity) {
        }

        private /* synthetic */ void a() {
        }

        public /* synthetic */ void b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b extends q {
        public final /* synthetic */ CrowdDetailActivity b;

        public b(CrowdDetailActivity crowdDetailActivity, Drawable drawable) {
        }

        @Override // h.y.a.p.q
        public void a(View view) {
        }
    }

    private void A() {
    }

    private void B() {
    }

    private /* synthetic */ Unit C(Boolean bool) {
    }

    private /* synthetic */ void E(n nVar) {
    }

    private /* synthetic */ void G(int i2, View view) {
    }

    private /* synthetic */ void I(View view) {
    }

    private /* synthetic */ void K(View view, int i2, int i3, int i4, int i5) {
    }

    private /* synthetic */ Unit M() {
    }

    private /* synthetic */ void O(e2 e2Var, List list, TextView textView, View view) {
    }

    public static void Q(Context context, String str) {
    }

    public static void R(Context context, String str, int i2) {
    }

    private void S() {
    }

    private void T() {
    }

    private void U() {
    }

    private void V() {
    }

    private void W() {
    }

    private void X() {
    }

    public static /* synthetic */ View w(CrowdDetailActivity crowdDetailActivity) {
    }

    public static /* synthetic */ NestedScrollView x(CrowdDetailActivity crowdDetailActivity) {
    }

    public static /* synthetic */ int y(CrowdDetailActivity crowdDetailActivity) {
    }

    public static /* synthetic */ int z(CrowdDetailActivity crowdDetailActivity, int i2) {
    }

    public /* synthetic */ Unit D(Boolean bool) {
    }

    public /* synthetic */ void F(n nVar) {
    }

    public /* synthetic */ void H(int i2, View view) {
    }

    public /* synthetic */ void J(View view) {
    }

    public /* synthetic */ void L(View view, int i2, int i3, int i4, int i5) {
    }

    public /* synthetic */ Unit N() {
    }

    public /* synthetic */ void P(e2 e2Var, List list, TextView textView, View view) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(View view, String str, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
