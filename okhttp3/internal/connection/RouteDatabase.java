package okhttp3.internal.connection;

import com.alipay.sdk.util.e;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* compiled from: RouteDatabase.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "Lokhttp3/Route;", "failedRoute", "", e.f791a, "(Lokhttp3/Route;)V", "route", "connected", "", "shouldPostpone", "(Lokhttp3/Route;)Z", "", "failedRoutes", "Ljava/util/Set;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@NotNull Route route) {
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        return this.failedRoutes.contains(route);
    }
}
