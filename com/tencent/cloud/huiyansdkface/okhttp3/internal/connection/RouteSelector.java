package com.tencent.cloud.huiyansdkface.okhttp3.internal.connection;

import com.tencent.cloud.huiyansdkface.okhttp3.Address;
import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Route;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RouteSelector {

    /* renamed from: a  reason: collision with root package name */
    private final Address f10911a;
    private final RouteDatabase b;
    private final Call c;

    /* renamed from: d  reason: collision with root package name */
    private final EventListener f10912d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f10913e;

    /* renamed from: f  reason: collision with root package name */
    private int f10914f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f10915g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Route> f10916h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Selection {

        /* renamed from: a  reason: collision with root package name */
        private final List<Route> f10917a;
        private int b;

        public Selection(List<Route> list) {
        }

        public final List<Route> getAll() {
        }

        public final boolean hasNext() {
        }

        public final Route next() {
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
    }

    private void a(Proxy proxy) throws IOException {
    }

    private boolean a() {
    }

    public final void connectFailed(Route route, IOException iOException) {
    }

    public final boolean hasNext() {
    }

    public final Selection next() throws IOException {
    }
}
