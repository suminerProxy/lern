package h.u.a.j;

import android.content.Context;
import com.alipay.sdk.util.l;
import h.y.a.m.h;
import h.y.a.m.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApiInterceptResultImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/http/ApiInterceptResultImpl;", "Lcom/taihebase/activity/network/ApiHelper$OnInterceptResult;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCtx", "()Landroid/content/Context;", "onResult", "", l.c, "Lcom/taihebase/activity/network/Result;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class a implements h.c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Context f24346a;

    public a(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.f24346a = ctx;
    }

    @Override // h.y.a.m.h.c
    public void a(@Nullable n nVar) {
        if (nVar == null) {
        }
    }

    @NotNull
    public final Context b() {
        return this.f24346a;
    }
}
