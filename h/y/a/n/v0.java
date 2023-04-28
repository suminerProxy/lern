package h.y.a.n;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SecurityUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0004J\u001c\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/taihebase/activity/utils/SecurityUtil;", "", "()V", "haveShowVpnDialog", "", "getHaveShowVpnDialog", "()Z", "setHaveShowVpnDialog", "(Z)V", "needCapturePacket", "getNeedCapturePacket$annotations", "getNeedCapturePacket", "setNeedCapturePacket", "checkIfHaveProxy", "checkIfHaveVPN", "dealNetSecurityCheck", "doSomething", "", com.alipay.sdk.widget.j.f854o, "hasVpnTransport", "network", "Landroid/net/Network;", "connectivityManager", "Landroid/net/ConnectivityManager;", "openVPNSettings", "removeProxyBeforeRequest", "showVpnCloseDialog", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final v0 f26378a = new v0();
    private static boolean b = h.y.a.f.k.s;
    private static boolean c;

    private v0() {
    }

    private final boolean a() {
        String property = System.getProperty("http.proxyHost", "");
        String property2 = System.getProperty("http.proxyPort", "-1");
        String property3 = System.getProperty("https.proxyHost", "");
        String property4 = System.getProperty("https.proxyPort", "-1");
        i0.a("手机代理情况：http->" + ((Object) property) + ':' + ((Object) property2) + "   https->" + ((Object) property3) + ':' + ((Object) property4));
        return (TextUtils.isEmpty(property) && Intrinsics.areEqual(property2, "-1") && TextUtils.isEmpty(property3) && Intrinsics.areEqual(property4, "-1")) ? false : true;
    }

    private final boolean b() {
        Object systemService = h.y.a.f.k.b().getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return i(connectivityManager.getActiveNetwork(), connectivityManager);
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (allNetworks == null) {
            return false;
        }
        int length = allNetworks.length;
        int i2 = 0;
        while (i2 < length) {
            Network network = allNetworks[i2];
            i2++;
            if (i(network, connectivityManager)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean c() {
        v0 v0Var = f26378a;
        if (b || !v0Var.b()) {
            return false;
        }
        v0Var.n();
        return true;
    }

    public static /* synthetic */ void e(v0 v0Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        v0Var.d(z);
    }

    public static final boolean g() {
        return b;
    }

    @JvmStatic
    public static /* synthetic */ void h() {
    }

    private final boolean i(Network network, ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        return (network == null || connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null || !networkCapabilities.hasTransport(4)) ? false : true;
    }

    private final void j() {
        try {
            h.y.a.f.k.b().startActivity(new Intent(Build.VERSION.SDK_INT >= 24 ? "android.settings.VPN_SETTINGS" : "android.net.vpn.SETTINGS").setFlags(268435456));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void k() {
        System.getProperties().remove("http.proxyHost");
        System.getProperties().remove("http.proxyPort");
        System.getProperties().remove("https.proxyHost");
        System.getProperties().remove("https.proxyPort");
    }

    public static final void m(boolean z) {
        b = z;
    }

    private final void n() {
    }

    public final void d(boolean z) {
        b = !b;
        if (z) {
            b = false;
        }
        h.y.a.m.m.k();
        h.y.a.m.l.h();
    }

    public final boolean f() {
        return c;
    }

    public final void l(boolean z) {
        c = z;
    }
}
