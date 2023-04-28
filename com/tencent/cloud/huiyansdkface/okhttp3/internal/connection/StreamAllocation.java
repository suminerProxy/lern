package com.tencent.cloud.huiyansdkface.okhttp3.internal.connection;

import com.tencent.cloud.huiyansdkface.okhttp3.Address;
import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.ConnectionPool;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.okhttp3.Route;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RouteSelector;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class StreamAllocation {

    /* renamed from: o  reason: collision with root package name */
    private static /* synthetic */ boolean f10918o = true;

    /* renamed from: a  reason: collision with root package name */
    public final Call f10919a;
    public final EventListener b;
    private Address c;

    /* renamed from: d  reason: collision with root package name */
    private RouteSelector.Selection f10920d;

    /* renamed from: e  reason: collision with root package name */
    private Route f10921e;

    /* renamed from: f  reason: collision with root package name */
    private final ConnectionPool f10922f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f10923g;

    /* renamed from: h  reason: collision with root package name */
    private final RouteSelector f10924h;

    /* renamed from: i  reason: collision with root package name */
    private int f10925i;

    /* renamed from: j  reason: collision with root package name */
    private RealConnection f10926j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10927k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10928l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10929m;

    /* renamed from: n  reason: collision with root package name */
    private HttpCodec f10930n;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10931a;

        public StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
    }

    private RealConnection a(int i2, int i3, int i4, int i5, boolean z) throws IOException {
    }

    private RealConnection a(int i2, int i3, int i4, int i5, boolean z, boolean z2) throws IOException {
    }

    private RouteDatabase a() {
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
    }

    private void a(RealConnection realConnection) {
    }

    public final void acquire(RealConnection realConnection, boolean z) {
    }

    public final void cancel() {
    }

    public final HttpCodec codec() {
    }

    public final synchronized RealConnection connection() {
    }

    public final boolean hasMoreRoutes() {
    }

    public final HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
    }

    public final void noNewStreams() {
    }

    public final void release() {
    }

    public final Socket releaseAndAcquire(RealConnection realConnection) {
    }

    public final Route route() {
    }

    public final void streamFailed(IOException iOException) {
    }

    public final void streamFinished(boolean z, HttpCodec httpCodec, long j2, IOException iOException) {
    }

    public final String toString() {
    }
}
