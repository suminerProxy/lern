package com.showstartfans.activity.activitys.usercenter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.showstartfans.activity.model.City;
import com.showstartfans.activity.model.PSSTagRequestBean;
import com.showstartfans.activity.model.UserHomePagerInfoBean;
import com.showstartfans.activity.view.ViewHindScrollView;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.widget.Toolbar;
import h.u.a.w.c0.q1;
import h.u.a.w.c0.x2;
import h.y.a.m.n;
import h.y.a.p.w.j;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class UserInfoEditActivity extends BaseNoToolBarActivity implements View.OnClickListener {
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6424d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6425e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6426f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6427g;

    /* renamed from: h  reason: collision with root package name */
    private LoadImageView f6428h;

    /* renamed from: i  reason: collision with root package name */
    private LoadImageView f6429i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f6430j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f6431k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f6432l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f6433m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f6434n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f6435o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f6436p;
    private ViewHindScrollView q;
    private Toolbar r;
    private File s;
    private UserHomePagerInfoBean t;
    private q1 u;
    private long v;
    public Handler w;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements x2.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x2 f6437a;
        public final /* synthetic */ UserInfoEditActivity b;

        public a(UserInfoEditActivity userInfoEditActivity, x2 x2Var) {
        }

        @Override // h.u.a.w.c0.x2.a
        public void a(int i2, int i3, int i4, int i5) {
        }

        @Override // h.u.a.w.c0.x2.a
        public void b(View view, long j2, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements Handler.Callback {
        public final /* synthetic */ UserInfoEditActivity b;

        public b(UserInfoEditActivity userInfoEditActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Function1<Uri, Unit> {
        public final /* synthetic */ UserInfoEditActivity b;

        public c(UserInfoEditActivity userInfoEditActivity) {
        }

        private /* synthetic */ void b(File file) {
        }

        public Unit a(Uri uri) {
        }

        public /* synthetic */ void c(File file) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void onSuccess();
    }

    public static /* synthetic */ q1 A(UserInfoEditActivity userInfoEditActivity) {
    }

    public static /* synthetic */ UserHomePagerInfoBean B(UserInfoEditActivity userInfoEditActivity) {
    }

    public static /* synthetic */ void C(UserInfoEditActivity userInfoEditActivity, File file, boolean z, d dVar) {
    }

    public static /* synthetic */ LoadImageView D(UserInfoEditActivity userInfoEditActivity) {
    }

    private void E() {
    }

    private void F() {
    }

    private void G() {
    }

    private void H() {
    }

    private void I() {
    }

    private String J() {
    }

    private List<PSSTagRequestBean> K() {
    }

    private void L() {
    }

    private void M(File file, Function1<Uri, Unit> function1) {
    }

    private /* synthetic */ void N(j jVar, int i2) {
    }

    private /* synthetic */ void P() throws Exception {
    }

    private /* synthetic */ Unit R(UserHomePagerInfoBean userHomePagerInfoBean) {
    }

    private /* synthetic */ void T(Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    private /* synthetic */ void V(City city, String str, String str2, String str3, String str4) {
    }

    private /* synthetic */ void X(String str) {
    }

    private /* synthetic */ Unit Z(String str, String str2, int i2, d dVar, Boolean bool) {
    }

    private /* synthetic */ void b0(boolean z, d dVar, n nVar) {
    }

    private void d0() {
    }

    private void e0(View view) {
    }

    private void f0(View view) {
    }

    private void g0(String str, String str2, long j2, int i2, List<PSSTagRequestBean> list, String str3, String str4, String str5, d dVar) {
    }

    private void h0(File file, boolean z, d dVar) {
    }

    public static /* synthetic */ long w(UserInfoEditActivity userInfoEditActivity) {
    }

    public static /* synthetic */ long x(UserInfoEditActivity userInfoEditActivity, long j2) {
    }

    public static /* synthetic */ TextView y(UserInfoEditActivity userInfoEditActivity) {
    }

    public static /* synthetic */ void z(UserInfoEditActivity userInfoEditActivity, String str, String str2, long j2, int i2, List list, String str3, String str4, String str5, d dVar) {
    }

    public /* synthetic */ void O(j jVar, int i2) {
    }

    public /* synthetic */ void Q() {
    }

    public /* synthetic */ Unit S(UserHomePagerInfoBean userHomePagerInfoBean) {
    }

    public /* synthetic */ void U(Toolbar toolbar, float f2, int i2, int i3, int i4, int i5) {
    }

    public /* synthetic */ void W(City city, String str, String str2, String str3, String str4) {
    }

    public /* synthetic */ void Y(String str) {
    }

    public /* synthetic */ Unit a0(String str, String str2, int i2, d dVar, Boolean bool) {
    }

    public /* synthetic */ void c0(boolean z, d dVar, n nVar) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
