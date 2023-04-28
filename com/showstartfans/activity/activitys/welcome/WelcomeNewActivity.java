package com.showstartfans.activity.activitys.welcome;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import cn.sharesdk.framework.InnerShareParams;
import com.showstartfans.activity.R;
import com.showstartfans.activity.XiudongApplication;
import com.showstartfans.activity.activitys.maintab.newmain.MainNewActivity;
import com.showstartfans.activity.activitys.welcome.WelcomeNewActivity;
import h.u.a.t.e3;
import h.u.a.t.f3;
import h.u.a.t.m1;
import h.u.a.t.m3;
import h.y.a.f.k;
import h.y.a.m.g;
import h.y.a.m.h;
import h.y.a.m.i;
import h.y.a.m.n;
import h.y.a.m.o;
import h.y.a.n.f1;
import h.y.a.n.j1;
import h.y.a.n.u0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.content.res.SkinCompatResources;

/* compiled from: WelcomeNewActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\nH\u0014J\u001c\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0014J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/showstartfans/activity/activitys/welcome/WelcomeNewActivity;", "Lcom/showstartfans/activity/activitys/welcome/TripartiteSDKActivity;", "Lcom/taihebase/activity/listener/OnHandlerListener;", "()V", "handler", "Lcom/taihebase/activity/utils/WeakHandler;", "showCal", "", "showPrivacyPolicy", "getAESKey", "", "getUrlRule", "jumpAction", "msgLoginSaveLog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onHandlerMessage", "activity", "Landroid/app/Activity;", "msg", "Landroid/os/Message;", "onResume", "showFailureAlert", "content", "", "okText", "showPrivacyPolicyDialog", "showPrivacyPolicyExit", "takeIntoAction", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class WelcomeNewActivity extends TripartiteSDKActivity implements h.y.a.k.f {
    @NotNull

    /* renamed from: g */
    public static final a f6478g = new a(null);

    /* renamed from: h */
    private static boolean f6479h;
    @NotNull
    public Map<Integer, View> c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f6480d;

    /* renamed from: e */
    private boolean f6481e;
    @Nullable

    /* renamed from: f */
    private j1 f6482f;

    /* compiled from: WelcomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/welcome/WelcomeNewActivity$Companion;", "", "()V", "isRuned", "", "isRuned$annotations", "()Z", "setRuned", "(Z)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void b() {
        }

        public final boolean a() {
            return WelcomeNewActivity.f6479h;
        }

        public final void c(boolean z) {
            WelcomeNewActivity.f6479h = z;
        }
    }

    /* compiled from: WelcomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            WelcomeNewActivity.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            WelcomeNewActivity.this.U();
            e3.f24462a.b(WelcomeNewActivity.this.getApplication());
        }
    }

    /* compiled from: WelcomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/welcome/WelcomeNewActivity$showPrivacyPolicyDialog$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends ClickableSpan {
        public c() {
            WelcomeNewActivity.this = r1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            m3.i(WelcomeNewActivity.this, Intrinsics.stringPlus(k.v, "app/help/entry?menuId=7&share=disable"));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(-65536);
            ds.setUnderlineText(false);
        }
    }

    /* compiled from: WelcomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/welcome/WelcomeNewActivity$showPrivacyPolicyDialog$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends ClickableSpan {
        public d() {
            WelcomeNewActivity.this = r1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            m3.i(WelcomeNewActivity.this, Intrinsics.stringPlus(k.v, "app/help/entry?menuId=12&share=disable"));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(-65536);
            ds.setUnderlineText(false);
        }
    }

    /* compiled from: WelcomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/welcome/WelcomeNewActivity$showPrivacyPolicyDialog$3", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends ClickableSpan {
        public e() {
            WelcomeNewActivity.this = r1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            m3.i(WelcomeNewActivity.this, Intrinsics.stringPlus(k.v, "app/help/entry?menuId=7&share=disable"));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(-65536);
            ds.setUnderlineText(false);
        }
    }

    /* compiled from: WelcomeNewActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/welcome/WelcomeNewActivity$showPrivacyPolicyDialog$4", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends ClickableSpan {
        public f() {
            WelcomeNewActivity.this = r1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            m3.i(WelcomeNewActivity.this, Intrinsics.stringPlus(k.v, "app/help/entry?menuId=12&share=disable"));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(-65536);
            ds.setUnderlineText(false);
        }
    }

    public static final void A(WelcomeNewActivity this$0, n nVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (nVar.f() && !TextUtils.isEmpty(nVar.c())) {
            m1.f24538a.a(this$0, new b());
        } else if (nVar.a() == o.NETWORK_TROBLE) {
            e3.f24462a.b(this$0.getApplication());
            this$0.E();
        } else if (nVar.a() == o.ServiceErr) {
            this$0.O("程序哥哥正在维护秀动", "重新尝试");
        } else {
            String string = this$0.getString(R.string.tips_seckey_fail);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.tips_seckey_fail)");
            this$0.O(string, "重新请求");
        }
    }

    private final void B() {
        h.e(getApplicationContext(), "/app/home/urlRuleV2", null, new g() { // from class: h.u.a.c.o0.l
            @Override // h.y.a.m.g
            public final void a(h.y.a.m.n nVar) {
                WelcomeNewActivity.J(nVar);
            }
        });
    }

    public static final void C(n nVar) {
        if (!nVar.f() || TextUtils.isEmpty(nVar.c())) {
            return;
        }
        f1.d(nVar.c());
    }

    public static final boolean D() {
        return f6478g.a();
    }

    private final void E() {
        try {
            if (u0.L().r() > System.currentTimeMillis() && !TextUtils.isEmpty(u0.L().e1(u0.L().s()))) {
                startActivity(new Intent(this, AdvertActivity.class));
            } else {
                startActivity(new Intent(this, MainNewActivity.class));
            }
            overridePendingTransition(R.anim.anima_alpha_share_in, R.anim.anima_alpha_share_out);
            finish();
        } catch (Exception unused) {
            startActivity(new Intent(this, MainNewActivity.class));
            finish();
        }
    }

    public static /* synthetic */ void F(h.y.a.p.w.b bVar, WelcomeNewActivity welcomeNewActivity, View view) {
        R(bVar, welcomeNewActivity, view);
    }

    public static /* synthetic */ void G(h.y.a.p.w.a aVar, WelcomeNewActivity welcomeNewActivity, View view) {
        P(aVar, welcomeNewActivity, view);
    }

    public static /* synthetic */ void H(WelcomeNewActivity welcomeNewActivity, n nVar) {
        A(welcomeNewActivity, nVar);
    }

    public static /* synthetic */ void I(WelcomeNewActivity welcomeNewActivity, n nVar) {
        M(welcomeNewActivity, nVar);
    }

    public static /* synthetic */ void J(n nVar) {
        C(nVar);
    }

    public static /* synthetic */ void K(h.y.a.p.w.a aVar, WelcomeNewActivity welcomeNewActivity, View view) {
        T(aVar, welcomeNewActivity, view);
    }

    private final void L() {
        String D0 = u0.L().D0();
        i iVar = new i();
        iVar.put(InnerShareParams.LATITUDE, Double.valueOf(u0.L().I0()));
        iVar.put(InnerShareParams.LONGITUDE, Double.valueOf(u0.L().L0()));
        iVar.put("cityCode", D0);
        iVar.put("deviceInfo", f3.a(this));
        h.k(getApplicationContext(), "/app/user/loginrecord", iVar, new g() { // from class: h.u.a.c.o0.k
            @Override // h.y.a.m.g
            public final void a(h.y.a.m.n nVar) {
                WelcomeNewActivity.I(WelcomeNewActivity.this, nVar);
            }
        });
    }

    public static final void M(WelcomeNewActivity this$0, n nVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    public static final void N(boolean z) {
        f6478g.c(z);
    }

    private final void O(String str, String str2) {
        final h.y.a.p.w.a aVar = new h.y.a.p.w.a(this);
        if (!TextUtils.isEmpty(str)) {
            aVar.n(str);
        }
        aVar.a();
        aVar.j(false);
        aVar.h(str2);
        aVar.q(new h.y.a.p.w.d() { // from class: h.u.a.c.o0.i
            @Override // h.y.a.p.w.d
            public final void onChlidViewClick(View view) {
                WelcomeNewActivity.G(h.y.a.p.w.a.this, this, view);
            }
        });
        aVar.show();
    }

    public static final void P(h.y.a.p.w.a dialog, WelcomeNewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.z();
    }

    private final void Q() {
        this.f6481e = false;
        final h.y.a.p.w.b bVar = new h.y.a.p.w.b(this);
        SpannableString spannableString = new SpannableString(getString(R.string.pp_des));
        spannableString.setSpan(new c(), 40, 48, 17);
        spannableString.setSpan(new d(), 48, 56, 17);
        spannableString.setSpan(new e(), 112, 120, 17);
        spannableString.setSpan(new f(), 120, 128, 17);
        bVar.l(spannableString);
        bVar.n(SkinCompatResources.getColor(this, 2131099684));
        bVar.g(SkinCompatResources.getColor(this, 2131099668));
        bVar.i(SkinCompatResources.getColor(this, 2131100274));
        bVar.f(getString(R.string.pp_no));
        bVar.h(getString(R.string.pp_yes));
        bVar.q(getString(R.string.pp_title));
        bVar.p(new h.y.a.p.w.d() { // from class: h.u.a.c.o0.h
            @Override // h.y.a.p.w.d
            public final void onChlidViewClick(View view) {
                WelcomeNewActivity.F(h.y.a.p.w.b.this, this, view);
            }
        });
        if (isFinishing()) {
            return;
        }
        bVar.show();
    }

    public static final void R(h.y.a.p.w.b dialog, WelcomeNewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        if (view.getId() == 2131362129) {
            u0.L().X1(true);
            this$0.z();
        } else if (view.getId() == 2131362116) {
            u0.L().X1(false);
            this$0.S();
        }
    }

    private final void S() {
        final h.y.a.p.w.a aVar = new h.y.a.p.w.a(this);
        aVar.n(Html.fromHtml(getString(R.string.pp_two_des)));
        aVar.o(SkinCompatResources.getColor(this, 2131099684));
        aVar.g(SkinCompatResources.getColor(this, 2131099668));
        aVar.i(SkinCompatResources.getColor(this, 2131100274));
        aVar.f(getString(R.string.pp_exit));
        aVar.h(getString(R.string.pp_see));
        aVar.r(getString(R.string.pp_title_two));
        aVar.q(new h.y.a.p.w.d() { // from class: h.u.a.c.o0.m
            @Override // h.y.a.p.w.d
            public final void onChlidViewClick(View view) {
                WelcomeNewActivity.K(h.y.a.p.w.a.this, this, view);
            }
        });
        if (isFinishing()) {
            return;
        }
        aVar.show();
    }

    public static final void T(h.y.a.p.w.a dialog, WelcomeNewActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        if (view.getId() == 2131362129) {
            m3.i(this$0, Intrinsics.stringPlus(k.v, "app/help/entry?menuId=12&share=disable"));
            this$0.f6481e = true;
        } else if (view.getId() == 2131362116) {
            this$0.finish();
        }
    }

    public final void U() {
        u0 L = u0.L();
        if (!TextUtils.isEmpty(L.W0()) && !TextUtils.isEmpty(L.Q0())) {
            j1 j1Var = this.f6482f;
            if (j1Var == null) {
                return;
            }
            j1Var.sendEmptyMessageDelayed(1003, 500L);
            return;
        }
        L.f2(false);
        E();
    }

    private final void z() {
        Application application = getApplication();
        XiudongApplication xiudongApplication = application instanceof XiudongApplication ? (XiudongApplication) application : null;
        if (xiudongApplication == null) {
            return;
        }
        xiudongApplication.p(1, new g() { // from class: h.u.a.c.o0.j
            @Override // h.y.a.m.g
            public final void a(h.y.a.m.n nVar) {
                WelcomeNewActivity.H(WelcomeNewActivity.this, nVar);
            }
        });
    }

    @Override // com.showstartfans.activity.activitys.welcome.TripartiteSDKActivity
    public void _$_clearFindViewByIdCache() {
        this.c.clear();
    }

    @Override // com.showstartfans.activity.activitys.welcome.TripartiteSDKActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this.c;
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

    @Override // com.showstartfans.activity.activitys.welcome.TripartiteSDKActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        f6479h = true;
        j1 j1Var = new j1(this);
        this.f6482f = j1Var;
        if (j1Var != null) {
            j1Var.setOnHandlerListener(this);
        }
        if (u0.L().A0()) {
            z();
        } else if (this.f6480d) {
        } else {
            this.f6480d = true;
            Q();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        j1 j1Var = this.f6482f;
        if (j1Var != null && j1Var != null) {
            j1Var.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // h.y.a.k.f
    public void onHandlerMessage(@Nullable Activity activity, @Nullable Message message) {
        Integer valueOf = message == null ? null : Integer.valueOf(message.what);
        if (valueOf != null && valueOf.intValue() == 1002) {
            z();
        } else if (valueOf != null && valueOf.intValue() == 1003) {
            L();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f6481e) {
            Q();
        }
    }
}
