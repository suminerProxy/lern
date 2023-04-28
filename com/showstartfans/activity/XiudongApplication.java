package com.showstartfans.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.showstartfans.activity.XiudongApplication;
import com.showstartfans.activity.activitys.maintab.newmain.MainNewActivity;
import com.taihebase.activity.base.BaseApplication;
import d.b;
import h.u.a.t.h2;
import h.u.a.t.i1;
import h.u.a.t.j1;
import h.y.a.f.k;
import h.y.a.m.g;
import h.y.a.m.h;
import h.y.a.m.n;
import h.y.a.n.u0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: XiudongApplication.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003J\u0018\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/XiudongApplication;", "Lcom/taihebase/activity/base/BaseApplication;", "()V", "beforeLaunch", "", "createShortcutInfo", "Landroid/content/pm/ShortcutInfo;", "id", "", "title", "icon", "", "intent", "Landroid/content/Intent;", "getCommonUserEFAT", "type", "callBack", "Lcom/taihebase/activity/network/ApiCallBack;", "initForMainProcess", "initShortcuts", "jumpLogin", "context", "Landroid/content/Context;", "onActivityRestart", "a", "Landroid/app/Activity;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class XiudongApplication extends BaseApplication {
    @NotNull
    public static final a b = new a(null);
    private static long c = 600000;

    /* renamed from: d */
    private static long f5252d;

    /* compiled from: XiudongApplication.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/XiudongApplication$Companion;", "", "()V", "GETAES_TIME_OFFSET", "", "getGETAES_TIME_OFFSET", "()J", "setGETAES_TIME_OFFSET", "(J)V", "LAST_GETAES_TIME", "getLAST_GETAES_TIME", "setLAST_GETAES_TIME", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return XiudongApplication.c;
        }

        public final long b() {
            return XiudongApplication.f5252d;
        }

        public final void c(long j2) {
            XiudongApplication.c = j2;
        }

        public final void d(long j2) {
            XiudongApplication.f5252d = j2;
        }
    }

    @RequiresApi(25)
    private final ShortcutInfo o(String str, String str2, int i2, Intent intent) {
        ShortcutInfo build = new ShortcutInfo.Builder(this, str).setShortLabel(str2).setLongLabel(str2).setIcon(Icon.createWithResource(this, i2)).setIntent(intent).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(this, id)\n      …ent)\n            .build()");
        return build;
    }

    public static /* synthetic */ void q(XiudongApplication xiudongApplication, int i2, g gVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        xiudongApplication.p(i2, gVar);
    }

    public static final void r(g callBack, n nVar) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        if (nVar.f() && !TextUtils.isEmpty(nVar.c())) {
            JSONObject parseObject = JSON.parseObject(nVar.c());
            if (parseObject.containsKey("usersk")) {
                u0.L().k1(parseObject.getString("usersk"));
            }
            u0 L = u0.L();
            String string = parseObject.getString("userit");
            if (string == null) {
                string = "";
            }
            String string2 = parseObject.getString("userid");
            if (string2 == null) {
                string2 = "";
            }
            L.c2(string, string2);
            u0 L2 = u0.L();
            String string3 = parseObject.getString("userat");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = parseObject.getString("useref");
            L2.W1(string3, string4 != null ? string4 : "");
        }
        callBack.a(nVar);
    }

    private final void s() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT < 25 || (shortcutManager = (ShortcutManager) ContextCompat.getSystemService(this, ShortcutManager.class)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, MainNewActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.setFlags(32768);
        intent.putExtra("ShortcutType", 1);
        String string = getString(R.string.shortcut_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.shortcut_1)");
        arrayList.add(o("staticId_1", string, R.drawable.ic_shortcut_1, intent));
        Intent intent2 = new Intent(this, MainNewActivity.class);
        intent2.setAction("android.intent.action.MAIN");
        intent2.setFlags(32768);
        intent2.putExtra("ShortcutType", 2);
        String string2 = getString(R.string.shortcut_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.shortcut_2)");
        arrayList.add(o("staticId_2", string2, R.drawable.ic_shortcut_2, intent2));
        Intent intent3 = new Intent(this, MainNewActivity.class);
        intent3.setAction("android.intent.action.MAIN");
        intent3.setFlags(32768);
        intent3.putExtra("ShortcutType", 3);
        String string3 = getString(R.string.shortcut_3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.shortcut_3)");
        arrayList.add(o("staticId_3", string3, R.drawable.ic_shortcut_3, intent3));
        Intent intent4 = new Intent(this, MainNewActivity.class);
        intent4.setAction("android.intent.action.MAIN");
        intent4.setFlags(32768);
        intent4.putExtra("ShortcutType", 4);
        String string4 = getString(R.string.shortcut_4);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.shortcut_4)");
        arrayList.add(o("staticId_4", string4, R.drawable.ic_shortcut_4, intent4));
        shortcutManager.setDynamicShortcuts(arrayList);
    }

    public static /* synthetic */ void t(g gVar, n nVar) {
        r(gVar, nVar);
    }

    @Override // com.taihebase.activity.base.BaseApplication
    public void a() {
        k.d(Boolean.valueOf(i1.e()));
        k.a(i1.f24485a.c());
        h.B(new h.u.a.j.a(this));
    }

    @Override // com.taihebase.activity.base.BaseApplication
    public void c() {
        super.c();
        b.b(this);
        s();
    }

    @Override // com.taihebase.activity.base.BaseApplication
    public void f(@Nullable Context context) {
        if (context == null) {
            return;
        }
        h2.f24479a.a(this, null);
    }

    @Override // com.taihebase.activity.base.BaseApplication
    public void h(@Nullable Activity activity) {
        j1.f24501a.a(activity);
    }

    public final void p(int i2, @NotNull final g callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        f5252d = System.currentTimeMillis();
        h.i(getApplicationContext(), Intrinsics.stringPlus("/common/userefat?type=", Integer.valueOf(i2)), null, new g() { // from class: h.u.a.a
            @Override // h.y.a.m.g
            public final void a(n nVar) {
                XiudongApplication.t(g.this, nVar);
            }
        });
    }
}
