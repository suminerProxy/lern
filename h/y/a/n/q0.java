package h.y.a.n;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProcessNames.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/taihebase/activity/utils/ProcessNames;", "", "()V", "JpusCoreProcess", "", "getJpusCoreProcess", "()Ljava/lang/String;", "MainProcess", "kotlin.jvm.PlatformType", "getMainProcess", "MainProcess$delegate", "Lkotlin/Lazy;", "NimCoreProcess", "getNimCoreProcess", "getCurrentProcessName", "ctx", "Landroid/content/Context;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class q0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final q0 f26355a;
    @NotNull
    private static final Lazy b;
    @NotNull
    private static final String c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final String f26356d;

    /* compiled from: ProcessNames.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<String> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return h.y.a.f.k.b().getPackageName();
        }
    }

    static {
        q0 q0Var = new q0();
        f26355a = q0Var;
        b = LazyKt__LazyJVMKt.lazy(a.INSTANCE);
        c = Intrinsics.stringPlus(q0Var.d(), ":core");
        f26356d = Intrinsics.stringPlus(q0Var.d(), ":pushcore");
    }

    private q0() {
    }

    public static /* synthetic */ String b(q0 q0Var, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = h.y.a.f.k.b();
            Intrinsics.checkNotNullExpressionValue(context, "getContext()");
        }
        return q0Var.a(context);
    }

    @NotNull
    public final String a(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        int myPid = Process.myPid();
        Object systemService = ctx.getSystemService("activity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
            if (myPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                Intrinsics.checkNotNullExpressionValue(str, "info.processName");
                return str;
            }
        }
        return "";
    }

    @NotNull
    public final String c() {
        return f26356d;
    }

    public final String d() {
        return (String) b.getValue();
    }

    @NotNull
    public final String e() {
        return c;
    }
}
