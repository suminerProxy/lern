package com.showstartfans.activity.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.showstartfans.activity.base.BaseMainTabActivity;
import com.showstartfans.activity.eventmodel.BackVideoPlayFullScreenEvent;
import com.showstartfans.activity.model.JumpActivityBean;
import com.showstartfans.activity.receiver.SobotNotificationClickReceiver;
import com.showstartfans.activity.view.videocut.VideoTrimmerView;
import com.sobot.chat.utils.ZhiChiConstant;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.tencent.bugly.crashreport.CrashReport;
import h.u.a.t.a3;
import h.u.a.t.b3;
import h.u.a.t.g3;
import h.u.a.t.h2;
import h.u.a.t.i1;
import h.u.a.t.k1;
import h.u.a.t.y2;
import h.y.a.f.k;
import h.y.a.m.g;
import h.y.a.m.h;
import h.y.a.m.n;
import h.y.a.n.f1;
import h.y.a.n.i0;
import h.y.a.n.m0;
import h.y.a.n.r;
import h.y.a.n.t0;
import h.y.a.n.u0;
import h.y.a.n.v0;
import h.y.a.p.w.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.content.res.SkinCompatResources;
import tencent.im.TencentIMControl;

/* compiled from: BaseMainTabActivity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 J\b\u0010!\u001a\u00020\u0017H\u0014J\b\u0010\"\u001a\u00020\u0017H\u0014J\b\u0010#\u001a\u00020\u0017H$J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0006\u0010'\u001a\u00020\u0017J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020\u0017H\u0014J\u0006\u0010+\u001a\u00020\u0017J\u001a\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0006\u00100\u001a\u00020\u0017J\u0006\u00101\u001a\u00020\u0017J\u0006\u00102\u001a\u00020\u0017J\b\u00103\u001a\u00020\u0017H\u0002J\u001a\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010&H\u0002J\b\u00108\u001a\u00020\u0017H\u0007J\b\u00109\u001a\u00020\u0017H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006:"}, d2 = {"Lcom/showstartfans/activity/base/BaseMainTabActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "canReturn", "", "getCanReturn", "()Z", "setCanReturn", "(Z)V", "loginImSuccessed", "getLoginImSuccessed", "setLoginImSuccessed", "nClickReceiver", "Lcom/showstartfans/activity/receiver/SobotNotificationClickReceiver;", "pressTime", "", "spUtil", "Lcom/taihebase/activity/utils/SPUtileBiz;", "getSpUtil", "()Lcom/taihebase/activity/utils/SPUtileBiz;", "spUtil$delegate", "Lkotlin/Lazy;", "buglyInfoSet", "", "checkUpdate", "dataLanuch", "doMainPost", "exitDoSomething", "getCityAreaCode", "goADV", "goMobLink", "intent", "Landroid/content/Intent;", "initData", "initView", "loginImSuccess", "loginTXIm", "imToken", "", "loginTencentIm", "looperQueueFree", "needTopToolbar", "onDestroy", "onDestroySobot", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "openJPush", "registerSobotService", "registerTXIMEventListener", "showLoginAgain", "showLoginOther", "ctx", "Landroid/content/Context;", "resultObjStr", "showRequestLocDialog", "upCityInfo", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseMainTabActivity extends BaseNoToolBarActivity {
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private SobotNotificationClickReceiver f6483d;

    /* renamed from: e  reason: collision with root package name */
    private int f6484e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6485f;
    @NotNull
    public Map<Integer, View> b = new LinkedHashMap();
    private boolean c = true;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f6486g = LazyKt__LazyJVMKt.lazy(c.INSTANCE);

    /* compiled from: BaseMainTabActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ BaseMainTabActivity this$0;

        public a(BaseMainTabActivity baseMainTabActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Boolean bool) {
        }
    }

    /* compiled from: BaseMainTabActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/base/BaseMainTabActivity$onKeyDown$1$1", "Ljava/util/TimerTask;", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends TimerTask {
        public final /* synthetic */ BaseMainTabActivity b;

        public b(BaseMainTabActivity baseMainTabActivity) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: BaseMainTabActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/taihebase/activity/utils/SPUtileBiz;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<u0> {
        public static final c INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ u0 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final u0 invoke() {
        }
    }

    private final void A() {
        t0.h(new i.a.x0.a(this) { // from class: h.u.a.e.b
            public final /* synthetic */ BaseMainTabActivity b;

            @Override // i.a.x0.a
            public final void run() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(BaseMainTabActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a0();
        this$0.Y();
        this$0.j0();
        this$0.E();
    }

    private final void C() {
        v0.f26378a.d(true);
        r.e().j();
        onBackPressed();
    }

    private final void E() {
        if (TextUtils.isEmpty(H().C())) {
            h.e(getCtx().getApplicationContext(), "/app/city/areaCode", null, new g(this) { // from class: h.u.a.e.e

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ BaseMainTabActivity f20352a;

                @Override // h.y.a.m.g
                public final void a(h.y.a.m.n nVar) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(BaseMainTabActivity this$0, n nVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!nVar.f() || TextUtils.isEmpty(nVar.c())) {
            return;
        }
        this$0.H().m1(nVar.c());
    }

    private final void I() {
        if (getIntent().getBooleanExtra("fromHomeAdvert", false)) {
            y2.f(getCtx(), b3.g());
        }
        J(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(BaseMainTabActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z();
        return false;
    }

    private final void T(String str) {
        String F0 = u0.L().F0();
        int Z0 = u0.L().Z0();
        if (TextUtils.isEmpty(F0) || TextUtils.isEmpty(str)) {
            return;
        }
        TencentIMControl tencentIMControl = TencentIMControl.INSTANCE;
        Application application = getCtx().getApplication();
        tencentIMControl.loginIm(application, F0 + '_' + Z0, str, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(BaseMainTabActivity this$0, n nVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (nVar.f()) {
            u0.L().x2(nVar.c());
            this$0.T(nVar.c());
            return;
        }
        i0.c("登录腾讯IM失败: token is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(BaseMainTabActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        g3.a(this$0);
    }

    private final void e0() {
        try {
            Activity f2 = r.e().f();
            if (f2 != null) {
                f0(f2, "登录已过期,请重新登录");
            }
        } catch (Exception unused) {
        }
    }

    private final void f0(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            h.y.a.p.w.a aVar = new h.y.a.p.w.a(context);
            aVar.q(new d(context) { // from class: h.u.a.e.c
                public final /* synthetic */ Context b;

                @Override // h.y.a.p.w.d
                public final void onChlidViewClick(View view) {
                }
            });
            aVar.n(str);
            aVar.a();
            aVar.h("确定");
            aVar.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(Context ctx, View view) {
        Intrinsics.checkNotNullParameter(ctx, "$ctx");
        if (view.getId() == 2131362129) {
            k1.f24512a.q(ctx, new String[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(h.y.a.p.w.a dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void j0() {
    }

    private final void x() {
        try {
            if (H().h1()) {
                CrashReport.setUserId(H().F0());
            }
            CrashReport.setAppChannel(getCtx(), i1.f24485a.a());
            CrashReport.setAppVersion(getCtx(), m0.J(getCtx().getApplicationContext()));
            if (k.b) {
                CrashReport.putUserData(getCtx(), "initFresco", "failure");
            }
        } catch (Exception unused) {
        }
    }

    private final void y() {
        new h.u.a.s.d(getCtx()).k();
    }

    private final void z() {
        W();
        A();
    }

    public final boolean D() {
        return this.c;
    }

    public final boolean G() {
        return this.f6485f;
    }

    @NotNull
    public final u0 H() {
        return (u0) this.f6486g.getValue();
    }

    public final void J(@Nullable Intent intent) {
        if (intent != null && intent.hasExtra("loginJumpBean")) {
            try {
                JumpActivityBean jumpActivityBean = (JumpActivityBean) intent.getParcelableExtra("loginJumpBean");
                if (jumpActivityBean != null && !TextUtils.isEmpty(jumpActivityBean.jumpClass)) {
                    if (jumpActivityBean.isNeedLogin) {
                        h2.f24479a.a(getCtx(), jumpActivityBean);
                    } else {
                        Intrinsics.stringPlus("jumpRealActivity: 接受 ac2", jumpActivityBean.parameter);
                        h2.f24479a.c(getCtx(), jumpActivityBean);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public abstract void S();

    public final void U() {
        if (u0.L().h1()) {
            String l0 = u0.L().l0();
            if (!TextUtils.isEmpty(l0)) {
                T(l0);
            } else {
                h.k(getCtx().getApplicationContext(), "/app/common/im/token", null, new g(this) { // from class: h.u.a.e.g

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ BaseMainTabActivity f20353a;

                    @Override // h.y.a.m.g
                    public final void a(h.y.a.m.n nVar) {
                    }
                });
            }
        }
    }

    public void W() {
    }

    public final void X() {
        try {
            SobotNotificationClickReceiver sobotNotificationClickReceiver = this.f6483d;
            if (sobotNotificationClickReceiver != null) {
                unregisterReceiver(sobotNotificationClickReceiver);
            }
        } catch (Exception unused) {
        }
    }

    public final void Y() {
        try {
            t0.h(new i.a.x0.a(this) { // from class: h.u.a.e.f
                public final /* synthetic */ BaseMainTabActivity b;

                @Override // i.a.x0.a
                public final void run() {
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
        this.b.clear();
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this.b;
        View view = map.get(Integer.valueOf(i2));
        if (view == null) {
            View findViewById = findViewById(i2);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i2), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void a0() {
        try {
            if (u0.L().h1()) {
                IntentFilter intentFilter = new IntentFilter();
                if (this.f6483d == null) {
                    this.f6483d = new SobotNotificationClickReceiver();
                }
                intentFilter.addAction(ZhiChiConstant.SOBOT_NOTIFICATION_CLICK);
                registerReceiver(this.f6483d, intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    public final void b0() {
    }

    public final void c0(boolean z) {
        this.c = z;
    }

    public final void d0(boolean z) {
        this.f6485f = z;
    }

    @SuppressLint({"CheckResult"})
    public final void h0() {
        Spanned fromHtml;
        h.y.a.p.w.a aVar = new h.y.a.p.w.a(getCtx());
        aVar.g(SkinCompatResources.getColor(getCtx(), 2131099668));
        aVar.i(SkinCompatResources.getColor(getCtx(), 2131100189));
        aVar.o(SkinCompatResources.getColor(getCtx(), 2131099684));
        aVar.h("我知道了");
        aVar.a();
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(getString(2131887111, new Object[]{u0.L().T0()}), 0);
        } else {
            fromHtml = Html.fromHtml(getString(2131887111, new Object[]{u0.L().T0()}));
        }
        aVar.n(fromHtml);
        aVar.r(getString(2131887114));
        aVar.q(new d(aVar) { // from class: h.u.a.e.a
            public final /* synthetic */ h.y.a.p.w.a b;

            @Override // h.y.a.p.w.d
            public final void onChlidViewClick(View view) {
            }
        });
        if (isFinishing()) {
            return;
        }
        aVar.show();
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
        U();
        I();
        y();
        b0();
        x();
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) { // from class: h.u.a.e.d
            public final /* synthetic */ BaseMainTabActivity b;

            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
            }
        });
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNoToolBarActivity, com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
        return false;
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        a3.q();
        X();
        super.onDestroy();
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @Nullable KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            if (D()) {
                int i3 = this.f6484e;
                this.f6484e = i3 + 1;
                if (i3 == 0) {
                    f1.d("再按一次退出程序");
                    new Timer().schedule(new b(this), VideoTrimmerView.J);
                    return true;
                } else if (i3 == 1) {
                    C();
                    return true;
                }
            } else {
                EventBus.getDefault().post(new BackVideoPlayFullScreenEvent());
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }
}
