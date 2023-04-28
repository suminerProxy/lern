package h.u.a.t;

import android.text.TextUtils;
import com.tencent.qcloud.tuicore.util.SPUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChannelUtil.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/showstartfans/activity/utils/ChannelUtil;", "", "()V", "Channel_Default", "", "getChannel_Default", "()Ljava/lang/String;", "Channel_OnlineTest", "Channel_dev", "Channel_pd", "Channel_pro", "buglyChannel", "getBuglyChannel", "buglyChannel$delegate", "Lkotlin/Lazy;", "isTestChannel", "", "isTestChannel$annotations", "()Z", "getCurrentChanel", "isEqualToChannel", "channel", "iscontainsToChannel", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class i1 {
    @NotNull
    private static final String c = "EnvPd";
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final String f24486d = "EnvDev";
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final String f24487e = "EnvPre";
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final String f24488f = "OnlineTest";
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f24485a = new i1();
    @NotNull
    private static final String b = h.u.a.b.f17877f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private static final Lazy f24489g = LazyKt__LazyJVMKt.lazy(a.INSTANCE);

    /* compiled from: ChannelUtil.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<String> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            i1 i1Var = i1.f24485a;
            String c = i1Var.c();
            switch (c.hashCode()) {
                case 67115937:
                    if (c.equals(i1.c)) {
                        return c;
                    }
                    break;
                case 1592453541:
                    if (c.equals(i1.f24488f)) {
                        return c;
                    }
                    break;
                case 2080582664:
                    if (c.equals(i1.f24486d)) {
                        return c;
                    }
                    break;
                case 2080594582:
                    if (c.equals(i1.f24487e)) {
                        return c;
                    }
                    break;
            }
            return i1Var.b();
        }
    }

    private i1() {
    }

    public static final boolean e() {
        i1 i1Var = f24485a;
        return i1Var.g(f24486d) || i1Var.g(f24487e) || i1Var.g(f24488f) || i1Var.g(c);
    }

    @JvmStatic
    public static /* synthetic */ void f() {
    }

    @NotNull
    public final String a() {
        return (String) f24489g.getValue();
    }

    @NotNull
    public final String b() {
        return b;
    }

    @NotNull
    public final String c() {
        String str;
        try {
            str = SPUtils.getInstance().getString("EnvMode");
            Intrinsics.checkNotNullExpressionValue(str, "getInstance().getString(\"EnvMode\")");
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
        if (!h.y.a.f.k.s || TextUtils.isEmpty(str)) {
            String channel = h.p.a.b.b.d(h.y.a.f.k.b());
            if (TextUtils.isEmpty(channel)) {
                h.y.a.n.i0.b("ChannelUtil", "渠道注入获取为空，使用BuildConfig.ServerEnv=Xiudong");
                return h.u.a.b.f17877f;
            }
            h.y.a.n.i0.b("ChannelUtil", Intrinsics.stringPlus("获取注入的渠道信息为：", channel));
            Intrinsics.checkNotNullExpressionValue(channel, "channel");
            return channel;
        }
        return str;
    }

    public final boolean d(@NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return StringsKt__StringsJVMKt.equals(c(), channel, true);
    }

    public final boolean g(@NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return StringsKt__StringsKt.contains$default((CharSequence) c(), (CharSequence) channel, false, 2, (Object) null);
    }
}
