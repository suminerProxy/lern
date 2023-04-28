package h.u.a.t;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import cn.sharesdk.loopshare.RestoreSceneListener;
import cn.sharesdk.loopshare.Scene;
import com.baidu.mapapi.SDKInitializer;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mob.MobSDK;
import com.mob.moblink.MobLink;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.rtmp.TXLiveBase;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.TCGlobalConfig;

/* compiled from: ThirdUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/utils/ThirdUtils;", "", "()V", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "isInited", "", "isTcIMed", "isUminited", com.alipay.sdk.widget.j.f854o, "", "init", "initBugly", "initMobLink", "initTXLive", "initTencent", "initUmeng", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class e3 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final e3 f24462a = new e3();
    @Nullable
    private static Application b;
    private static boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f24463d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f24464e;

    /* compiled from: ThirdUtils.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/utils/ThirdUtils$initMobLink$1", "Lcn/sharesdk/loopshare/RestoreSceneListener;", "completeRestore", "", "p0", "Lcn/sharesdk/loopshare/Scene;", "notFoundScene", "willRestoreScene", "Ljava/lang/Class;", "Landroid/app/Activity;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements RestoreSceneListener {
        @Override // cn.sharesdk.loopshare.RestoreSceneListener
        public void completeRestore(@Nullable Scene scene) {
        }

        @Override // cn.sharesdk.loopshare.RestoreSceneListener
        public void notFoundScene(@Nullable Scene scene) {
        }

        @Override // cn.sharesdk.loopshare.RestoreSceneListener
        @NotNull
        public Class<? extends Activity> willRestoreScene(@Nullable Scene scene) {
        }
    }

    private e3() {
    }

    private final void c() {
        try {
            CrashReport.UserStrategy userStrategy = new CrashReport.UserStrategy(b);
            String j2 = h.y.a.n.m0.j(b);
            Application application = b;
            userStrategy.setUploadProcess(Intrinsics.areEqual(j2, application == null ? null : application.getPackageName()));
            CrashReport.initCrashReport(b, x1.a(w1.BUGLY_APPID), h.y.a.f.k.s, userStrategy);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void d() {
        MobSDK.init(b, "12de8ed9d7f0e", "0d62954b6f23d44fb250e8ac26bb8b65");
        MobSDK.submitPolicyGrantResult(true);
        MobLink.setRestoreSceneListener(new h.u.a.l.f());
        cn.sharesdk.loopshare.MobLink.setRestoreSceneListener(new a());
    }

    private final void e() {
        TXLiveBase.getInstance().setLicence(h.y.a.f.k.b(), TCGlobalConfig.LICENCE_URL, TCGlobalConfig.LICENCE_KEY);
    }

    private final void g() {
        try {
            UMConfigure.setLogEnabled(h.y.a.f.k.s);
            Application application = b;
            Context applicationContext = application == null ? null : application.getApplicationContext();
            w1 w1Var = w1.UMENG_KEY;
            String a2 = x1.a(w1Var);
            i1 i1Var = i1.f24485a;
            UMConfigure.preInit(applicationContext, a2, i1Var.c());
            if (h.y.a.n.u0.L().A0()) {
                Application application2 = b;
                UMConfigure.init(application2 == null ? null : application2.getApplicationContext(), x1.a(w1Var), i1Var.c(), 1, null);
                MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
            }
            c = true;
        } catch (Exception unused) {
        }
    }

    public final void a() {
        f24464e = false;
        if (c) {
            try {
                MobclickAgent.onKillProcess(b);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b(@Nullable Application application) {
        if (f24464e) {
            return;
        }
        b = application;
        if (h.y.a.n.u0.L().A0()) {
            f24464e = true;
            f();
            c();
            g3.a(application);
            SDKInitializer.initialize(application);
            g();
            e();
            h.y.a.j.g.j(application);
            h.y.a.j.g e2 = h.y.a.j.g.e();
            e2.a(new h.y.a.i.b()).q();
            e2.b();
            d();
        }
    }

    public final void f() {
    }
}
